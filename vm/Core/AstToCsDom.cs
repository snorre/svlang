using System;
using System.CodeDom;
using System.Collections.Generic;
using System.Linq;
using Castle.Core.Internal;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Core
{
    internal class AstToCsDom
    {
        // TODO Move?
        internal const string EntryNamespace = "SvlCompilation";
        internal const string EntryTypeName = "SvlEntryType";
        internal const string EntryMethodName = "SvlEntryMethod";

        private readonly Expr _code;
        private readonly Dictionary<string, IBuiltIn> _builtins;

        internal AstToCsDom(Expr code, Dictionary<string, IBuiltIn> builtins)
        {
            _code = code;
            _builtins = builtins;
        }

        internal CodeCompileUnit BuildDom()
        {
            var compilationUnit = new CodeCompileUnit();
            CodeMemberMethod entryMethod = AddEverythingDownToEntryMethod(compilationUnit);

            var codeObjects = BuildCode(_code);
            foreach (var co in codeObjects)
            {
                var ce = co as CodeExpression;
                var cs = co as CodeStatement;

                if (ce != null)
                {
                    entryMethod.Statements.Add(ce);
                }
                else if (cs != null)
                {
                    entryMethod.Statements.Add(cs);
                }
                else
                {
                    throw Error.Panic("Built unexpected CodeObject type: " + co.GetType());
                }
            }

            return compilationUnit;
        }

        private CodeObject[] BuildCode(Expr code)
        {
            if (IsFunctionCall(code))
            {
                var cf = (CallFunction)code;
                if (IsCallToBuiltin(cf))
                {
                    var b = _builtins[cf.Name];
                    return new CodeObject[] { BuildBuiltinMethodCall(b, cf) };
                }

                return 
                    new CodeObject[]
                    {
                        new CodeVariableReferenceExpression(cf.Name) // TODO
                    };
            }

            if (code is Codeblock)
            {
                var cb = (Codeblock)code;
                var csLines = cb.Codelines.ConvertAll(l => BuildCode(l).Single()).ToArray();
                if (csLines.Any())
                {
                    csLines[csLines.Length - 1] = TurnIntoReturnStatement((CodeExpression)csLines.Last());
                }
                return csLines;
            }

            if (code is ValueSingle)
            {
                var vs = (ValueSingle)code;
                return new CodeObject[] { new CodePrimitiveExpression(vs.RawValue()) };
            }

            if (code is DefineFunction)
            {
                var df = (DefineFunction)code;

                if (df.ParameterNames.Any())
                {
                    throw new NotImplementedException();
                }
                return 
                    new CodeObject[]
                    {
                        new CodeVariableDeclarationStatement(
                            type: new CodeTypeReference(typeof(Func<object>)), 
                            name: df.Name,
                            initExpression: new CodeDelegateCreateExpression(new CodeTypeReference(typeof(Func<object>)), new CodeThisReferenceExpression(), "hei")
                        )
                    };
            }

            return new CodeObject[0];
        }

        private bool IsFunctionCall(Expr code)
        {
            return code is CallFunction;
        }

        private bool IsCallToBuiltin(CallFunction cf)
        {
            return _builtins.ContainsKey(cf.Name);
        }

        private CodeMemberMethod AddEverythingDownToEntryMethod(CodeCompileUnit compilationUnit)
        {
            var entryMethod =
                new CodeMemberMethod
                {
                    Name = EntryMethodName,
                    Attributes = MemberAttributes.Public,
                    ReturnType = new CodeTypeReference(typeof(object))
                };

            var entryClass = new CodeTypeDeclaration(EntryTypeName);
            entryClass.Members.Add(entryMethod);

            var ns = new CodeNamespace(EntryNamespace);
            ns.Types.Add(entryClass);
            AddImports(ns);

            compilationUnit.Namespaces.Add(ns);

            return entryMethod;
        }

        private void AddImports(CodeNamespace ns)
        {
            ns.Imports.Add(new CodeNamespaceImport("System"));
            
            _builtins
                .Select(b => b.Value.GetType().Namespace)
                .Distinct()
                .ToList()
                .ForEach(tns => ns.Imports.Add(new CodeNamespaceImport(tns)));
        }

        //private void AddHelloWorld(CodeMemberMethod entryMethod)
        //{
        //    var helloWorld = new CodePrimitiveExpression("Hello world!");

        //    entryMethod.Statements.Add(
        //        new CodeMethodInvokeExpression(
        //            targetObject: new CodeTypeReferenceExpression("System.Console"),
        //            methodName: "WriteLine",
        //            parameters: helloWorld
        //        )
        //    );

        //    entryMethod.Statements.Add(new CodeMethodReturnStatement(helloWorld));
        //}

        private CodeMethodReturnStatement TurnIntoReturnStatement(CodeExpression ce)
        {
            return new CodeMethodReturnStatement(ce);
        }

        private CodeMethodInvokeExpression BuildBuiltinMethodCall(IBuiltIn builtin, CallFunction cf)
        {
            var t = builtin.GetType();
            return 
                new CodeMethodInvokeExpression(
                    targetObject: new CodeObjectCreateExpression(t), 
                    methodName: "Call",
                    parameters: cf.Parameters.Select(p => BuildCode(p).Single()).Cast<CodeExpression>().ToArray()
                );
        }
    }
}

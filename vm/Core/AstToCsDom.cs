using System.CodeDom;
using System.Collections.Generic;
using System.Linq;
using Castle.Components.DictionaryAdapter;
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

            var statements = BuildCode(_code);
            statements.ForEach(s => entryMethod.Statements.Add(s));

            AddHelloWorld(entryMethod); // TODO Remove

            return compilationUnit;
        }

        private CodeExpression[] BuildCode(Expr expr)
        {
            if (IsCallToBuiltin(expr))
            {
                var bcf = (CallFunction)expr;
                var b = _builtins[bcf.Name];

                return new CodeExpression[] { BuildMethodCall(b, bcf) };
            }

            if (expr is Codeblock)
            {
                var cb = expr as Codeblock;
                return cb.Codelines.ConvertAll(l => BuildCode(l).Single());
            }

            if (expr is ValueSingle)
            {
                var vs = expr as ValueSingle;
                return new CodeExpression[] { new CodePrimitiveExpression(vs.RawValue()) };
            }

            return new CodeExpression[0];
        }

        private bool IsCallToBuiltin(Expr code)
        {
            var cf = code as CallFunction;
            return
                cf != null &&
                _builtins.ContainsKey(cf.Name);
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
                .ForEach(tns => ns.Imports.Add(new CodeNamespaceImport(tns)));
        }

        private void AddHelloWorld(CodeMemberMethod entryMethod)
        {
            var helloWorld = new CodePrimitiveExpression("Hello world!");

            entryMethod.Statements.Add(
                new CodeMethodInvokeExpression(
                    targetObject: new CodeTypeReferenceExpression("System.Console"),
                    methodName: "WriteLine",
                    parameters: helloWorld
                )
            );

            entryMethod.Statements.Add(new CodeMethodReturnStatement(helloWorld));
        }

        private CodeMethodInvokeExpression BuildMethodCall(IBuiltIn builtin, CallFunction cf)
        {
            var t = builtin.GetType();
            return 
                new CodeMethodInvokeExpression(
                    targetObject: new CodeObjectCreateExpression(t), 
                    methodName: "Call",
                    parameters: cf.Parameters.ConvertAll(p => BuildCode(p).Single())
                );
        }
    }
}

using System;
using System.CodeDom;
using System.Collections.Generic;
using Castle.Core.Internal;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Core
{
    internal class AstToCsDom
    {
        private const string AssemblyName = "SvlAssembly";
        private const string EntryTypeName = "SvlEntryType";
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
            string output = "Hello world!";

            CodeCompileUnit compilationUnit = new CodeCompileUnit();
            CodeNamespace samples = new CodeNamespace("Samples");
            samples.Imports.Add(new CodeNamespaceImport("System"));
            compilationUnit.Namespaces.Add(samples);
            CodeTypeDeclaration class1 = new CodeTypeDeclaration("Class1");
            samples.Types.Add(class1);

            CodeMemberMethod entryMethod =
                new CodeMemberMethod
                {
                    Name = EntryMethodName,
                    Attributes = MemberAttributes.Public,
                    ReturnType = new CodeTypeReference(typeof(object))
                };

            var builtinOrNull = GetBuiltinOrNull(_code);
            if (builtinOrNull != null)
            {
                entryMethod.Statements.Add(BuildMethodCall(builtinOrNull, _code as CallFunction));
            }
            else
            {
                entryMethod.Statements.Add(
                    new CodeMethodInvokeExpression(
                        targetObject: new CodeTypeReferenceExpression("System.Console"),
                        methodName: "WriteLine",
                        parameters: new CodePrimitiveExpression(output)
                    )
                );
                entryMethod.Statements.Add(
                    new CodeMethodReturnStatement(new CodePrimitiveExpression(output))
                );
            }

            class1.Members.Add(entryMethod);

            return compilationUnit;
        }

        private IBuiltIn GetBuiltinOrNull(Expr code)
        {
            var cf = _code as CallFunction;
            if (cf != null && _builtins.ContainsKey(cf.Name))
            {
                return _builtins[cf.Name];
            }
            return null;
        }

        private bool IsCallToBuiltin()
        {
            var cf = _code as CallFunction;
            return
                cf != null &&
                _builtins.ContainsKey(cf.Name);
        }

        private CodeMethodInvokeExpression BuildMethodCall(IBuiltIn builtin, CallFunction cf)
        {
            var t = builtin.GetType();
            return 
                new CodeMethodInvokeExpression(
                    targetObject: new CodeTypeReferenceExpression(t), 
                    methodName: "Call",
                    parameters: new CodePrimitiveExpression(cf.Parameters)
                );
        }

    }
}

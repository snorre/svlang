using System;
using System.CodeDom;
using SVLang.Basics.AST;

namespace SVLang.Core
{
    internal class AstToCsDom
    {
        private const string AssemblyName = "SvlAssembly";
        private const string EntryTypeName = "SvlEntryType";
        internal const string EntryMethodName = "SvlEntryMethod";

        internal CodeCompileUnit BuildDom(Expr code)
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

            class1.Members.Add(entryMethod);

            return compilationUnit;
        }
    }
}

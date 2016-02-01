using System;
using System.CodeDom;
using System.CodeDom.Compiler;
using System.IO;
using System.Reflection;
using System.Reflection.Emit;
using Microsoft.CSharp;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SVLang.Test
{
    [TestClass]
    public class IlLearning
    {
        [TestMethod]
        public void msil_directly()
        {
            const string name = "IlLearningTest";
            const string exeName = name + ".exe";

            var assemblyName = new AssemblyName { Name = name };
            AssemblyBuilder assemblyBuilder = AppDomain.CurrentDomain.DefineDynamicAssembly(assemblyName, AssemblyBuilderAccess.Run);
            ModuleBuilder module = assemblyBuilder.DefineDynamicModule(exeName);
            TypeBuilder typeBuilder = module.DefineType("FooBar", TypeAttributes.Public | TypeAttributes.Class);
            MethodBuilder methodbuilder = typeBuilder.DefineMethod("Main", MethodAttributes.HideBySig | MethodAttributes.Static | MethodAttributes.Public, typeof(int), new [] { typeof(string[]) });

            ILGenerator ilGenerator = methodbuilder.GetILGenerator();

            ilGenerator.Emit(OpCodes.Ldstr, "Hello world!");
            ilGenerator.Emit(OpCodes.Call, typeof(Console).GetMethod("WriteLine", new []{ typeof(string) }));
            //ilGenerator.EmitWriteLine("hello, world");

            ilGenerator.Emit(OpCodes.Ldc_I4_3);
            ilGenerator.Emit(OpCodes.Ret);

            Type t = typeBuilder.CreateType();

            var r = t.GetMethod("Main").Invoke(null, new string[] { null });
            Console.WriteLine("Result: " + r);

            //assemblyBuilder.SetEntryPoint(methodbuilder, PEFileKinds.ConsoleApplication);
            //assemblyBuilder.Save(exeName);
        }

        [TestMethod]
        public void via_cs()
        {

            CodeCompileUnit compilationUnit = new CodeCompileUnit();
            CodeNamespace samples = new CodeNamespace("Samples");
            samples.Imports.Add(new CodeNamespaceImport("System"));
            compilationUnit.Namespaces.Add(samples);
            CodeTypeDeclaration class1 = new CodeTypeDeclaration("Class1");
            samples.Types.Add(class1);

            CodeEntryPointMethod start = new CodeEntryPointMethod();
            CodeMethodInvokeExpression cs1 = new CodeMethodInvokeExpression(
                new CodeTypeReferenceExpression("System.Console"),
                "WriteLine", new CodePrimitiveExpression("Hello World!"));
            start.Statements.Add(cs1);

            class1.Members.Add(start);



            CSharpCodeProvider provider = new CSharpCodeProvider();
            CompilerParameters cp = new CompilerParameters();
            cp.ReferencedAssemblies.Add("System.dll");
            cp.GenerateExecutable = false;
            cp.GenerateInMemory = true;
            CompilerResults cr = provider.CompileAssemblyFromDom(cp, compilationUnit);

            if (cr.Errors.Count > 0)
            {
                // Display compilation errors.
                Console.WriteLine("Errors building {0} into {1}", compilationUnit, cr.PathToAssembly);
                foreach (CompilerError ce in cr.Errors)
                {
                    Console.WriteLine("  {0}", ce);
                    Console.WriteLine();
                }
            }
            else
            {
                Console.WriteLine("Source {0} built into {1} successfully.", compilationUnit, cr.PathToAssembly);
            }

            Assembly asm = cr.CompiledAssembly;
            var t = asm.GetType("Samples.Class1");
            var m = t.GetMethod("Main");
            var r = m.Invoke(null, new object[0]);
            Console.WriteLine("Result: " + r);
        }
    }
}

using System;
using System.CodeDom;
using System.CodeDom.Compiler;
using System.Reflection;
using Microsoft.CSharp;

namespace SVLang.Core
{
    internal class CsCompiler
    {
        internal Type BuildType(CodeCompileUnit compilationUnit)
        {
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
            return t;
        }
    }
}

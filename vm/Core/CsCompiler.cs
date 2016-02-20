using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.IO;
using System.Reflection;
using Microsoft.CSharp;

namespace SVLang.Core
{
    internal class CsCompiler
    {
        internal Type BuildType(List<FileInfo> dllsToReference, string csCode)
        {
            var provider = new CSharpCodeProvider();

            Console.WriteLine("=== Generated source ===");
            Console.WriteLine(csCode);
            Console.WriteLine("------------------------");
            Console.WriteLine();

            CompilerParameters cp = 
                new CompilerParameters
                {
                    GenerateExecutable = false,
                    GenerateInMemory = true
                };
            cp.ReferencedAssemblies.Add("System.dll");
            cp.ReferencedAssemblies.Add("SVLang.Basics.dll");

            dllsToReference.ForEach(dll => cp.ReferencedAssemblies.Add(dll.Name));

            CompilerResults cr = provider.CompileAssemblyFromSource(cp, csCode);

            if (cr.Errors.Count > 0)
            {
                // Display compilation errors.
                Console.WriteLine("=== Errors building ===");
                foreach (CompilerError ce in cr.Errors)
                {
                    Console.WriteLine("  {0}", ce);
                    Console.WriteLine();
                }
            }
            else
            {
                Console.WriteLine("Source built OK.");
            }

            Console.WriteLine();

            Assembly asm = cr.CompiledAssembly;
            var t = asm.GetType(AstToCsDom.EntryNamespace + "." + AstToCsDom.EntryTypeName);
            return t;
        }
    }
}

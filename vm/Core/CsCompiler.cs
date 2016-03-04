using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Text;
using Microsoft.CSharp;
using SVLang.Basics;

namespace SVLang.Core
{
    internal class CsCompiler
    {
        internal Type BuildType(List<FileInfo> dllsToReference, string csCode)
        {
            var provider = new CSharpCodeProvider();
            var cp = CreateCompilerParameters(dllsToReference);
            var cr = Compile(csCode, provider, cp);
            CheckErrors(cr);
            return CreateType(cr);
        }

        private static CompilerParameters CreateCompilerParameters(List<FileInfo> dllsToReference)
        {
            CompilerParameters cp =
                new CompilerParameters
                {
                    GenerateExecutable = false,
                    GenerateInMemory = true
                };
            cp.ReferencedAssemblies.Add("System.dll");
            cp.ReferencedAssemblies.Add("System.Core.dll");
            cp.ReferencedAssemblies.Add("Microsoft.CSharp.dll");
            cp.ReferencedAssemblies.Add("SVLang.Basics.dll");

            dllsToReference.ForEach(dll => cp.ReferencedAssemblies.Add(dll.Name));
            return cp;
        }

        private static CompilerResults Compile(string csCode, CSharpCodeProvider provider, CompilerParameters cp)
        {
            CompilerResults cr = provider.CompileAssemblyFromSource(cp, csCode);
            return cr;
        }

        private void CheckErrors(CompilerResults cr)
        {
            if (cr.Errors.Count > 0)
            {
                var sb = new StringBuilder();
                sb.AppendLine("Compilation errors:");

                var uniqueErrorsPrLine =
                    cr.Errors
                        .Cast<CompilerError>() // trick to access this as a list
                        .Select(ce => new { ce.Line, ce.ErrorText })
                        .Distinct() // only unique errors pr line
                        .Select(x => x.ErrorText)
                        .ToList();

                uniqueErrorsPrLine.ForEach(s => sb.AppendLine($"    * {s}"));
                
                throw Error.Panic(sb.ToString());
            }
        }

        private static Type CreateType(CompilerResults cr)
        {
            Assembly asm = cr.CompiledAssembly;
            var t = asm.GetType(CsGenerator.EntryNamespace + "." + CsGenerator.EntryTypeName);
            return t;
        }
    }
}

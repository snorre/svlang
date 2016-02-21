using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.IO;
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
                var sb = new StringBuilder();
                sb.AppendLine("Compilation errors:");
                foreach (CompilerError ce in cr.Errors)
                {
                    sb.AppendLine($"    * {ce.ErrorText}");
                }
                throw Error.Panic(sb.ToString());
            }

            Assembly asm = cr.CompiledAssembly;
            var t = asm.GetType(AstToCs.EntryNamespace + "." + AstToCs.EntryTypeName);
            return t;
        }
    }
}

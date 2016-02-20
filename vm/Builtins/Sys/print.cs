using System;
using System.IO;
using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Print : IBuiltIn
    {
        public static TextWriter Output = Console.Out;

        public string Name => "print";

        public object Call(params Func<object>[] parameterFuncs)
        {
            var str = string.Join(" ", parameterFuncs.ToList().ConvertAll(pv => pv()));
            Output.Write(str + Environment.NewLine);
            return str;
        }
    }
}

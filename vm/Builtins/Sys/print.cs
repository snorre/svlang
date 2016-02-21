using System;
using System.IO;
using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Print : BuiltinBase
    {
        public static TextWriter Output = Console.Out;

        public override string Name => "print";

        public override object Call(params Func<dynamic>[] parameterFuncs)
        {
            var str = string.Join(" ", parameterFuncs.ToList().ConvertAll(pv => pv()));
            Output.Write(str + Environment.NewLine);
            return str;
        }
    }
}

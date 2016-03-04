using System;
using System.Collections.Generic;
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
            var strings = new List<string>();
            foreach (var parameterFunc in parameterFuncs)
            {
                var parameterValue = parameterFunc();
                if (IsList(parameterValue))
                {
                    List<object> list = AsList(parameterValue);
                    strings.AddRange(
                        list.Select(p => p.ToString())
                    );
                }
                else
                {
                    strings.Add(parameterValue);
                }
            }

            var str = string.Join(" ", strings);
            Output.Write(str + Environment.NewLine);
            return str;
        }
    }
}

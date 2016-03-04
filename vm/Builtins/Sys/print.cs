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

        public override object Call(params object[] parameterFuncs)
        {
            var values = ReduceListToValues<object>(parameterFuncs);

            var strings = new List<string>();
            foreach (var value in values)
            {
                if (IsList(value))
                {
                    List<object> list = AsList(value);
                    strings.AddRange(
                        list.Select(p => p.ToString())
                    );
                }
                else
                {
                    strings.Add(value.ToString());
                }
            }

            var str = string.Join(" ", strings);
            Output.Write(str + Environment.NewLine);
            return str;
        }
    }
}

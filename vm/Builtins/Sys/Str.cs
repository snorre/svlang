using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Str : BuiltinBase
    {
        public override string Name => "str";

        public override object Call(params Func<dynamic>[] parameterFuncs)
        {
            var parameterValues = parameterFuncs.Select(pf => pf()).ToList();
            return BuildStringFromList(parameterValues);
        }

        private string BuildStringFromList(List<dynamic> values)
        {
            var sb = new StringBuilder();
            foreach (var value in values)
            {
                sb.Append(
                    IsList(value) 
                        ? BuildStringFromList(AsList(value)) 
                        : value
                );
            }

            return sb.ToString();
        }
    }
}

using System.Collections.Generic;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Range : BuiltinBase
    {
        public override string Name => "range";

        public override object Call(params object[] parameterFuncs)
        {
            if (parameterFuncs.Length != 2) // TODO Move to base?
            {
                throw Error.Panic($"Builtin function '{Name}' must have 2 parameter. Got " + parameterFuncs.Length);
            }

            var from = ReduceToValue<int>(parameterFuncs[0]);
            var to = ReduceToValue<int>(parameterFuncs[1]);

            if (to < from)
            {
                throw Error.Panic($"Builtin function '{Name}' failed. First parameter must be lower than second. Got from={from}, to={to}");
            }

            var result = new List<dynamic>();
            for (int i = from; i <= to; i++)
            {
                result.Add(i);
            }
            return result;
        }
    }
}

using System.Collections.Generic;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Range : BuiltinBase
    {
        public override string Name => "range";

        public override object Call(params object[] parameterFuncs)
        {
            ValidateHasExactlyNumberOfParameters(parameterFuncs, 2);

            var from = ReduceToValue<int>(parameterFuncs[0]);
            var to = ReduceToValue<int>(parameterFuncs[1]);

            if (to < from)
            {
                throw Error.Panic($"{GetBaseErrorMessage()} failed. First parameter must be lower than second. Got from={from}, to={to}");
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

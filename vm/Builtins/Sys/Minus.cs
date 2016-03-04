using System;
using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Minus : BuiltinBase
    {
        public override string Name => "minus";

        public override object Call(params Func<dynamic>[] parameterFuncs)
        {
            if (parameterFuncs.Length <= 1)
            {
                throw Error.Panic($"Builtin function '{Name}' must have more than one parameter. Got " + parameterFuncs.Length);
            }

            int startValue = ReduceToValue<int>(parameterFuncs.First());
            int reduceWith = parameterFuncs.Skip(1).Sum(pf => ReduceToValue<int>(pf));

            return startValue - reduceWith;
        }
    }
}

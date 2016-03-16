using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Minus : BuiltinBase
    {
        public override string Name => "minus";

        public override object Call(params object[] parameterFuncs)
        {
            ValidateHasAtLeastNumberOfParameters(parameterFuncs, 2);

            int startValue = ReduceToValue<int>(parameterFuncs.First());
            int reduceWith = parameterFuncs.Skip(1).Sum(pf => ReduceToValue<int>(pf));

            return startValue - reduceWith;
        }
    }
}

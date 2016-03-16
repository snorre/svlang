using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Plus : BuiltinBase
    {
        public override string Name => "plus";

        public override object Call(params object[] parameterFuncs)
        {
            ValidateHasAtLeastNumberOfParameters(parameterFuncs, 2);

            return parameterFuncs.Sum(pf => ReduceToValue<int>(pf));
        }
    }
}

using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Eq : BuiltinBase
    {
        public override string Name => "eq";

        public override object Call(params object[] parameterFuncs)
        {
            ValidateHasAtLeastNumberOfParameters(parameterFuncs, 2);

            var values = ReduceListToValues<object>(parameterFuncs);
            var firstValue = values.First();
            bool result = values.All(v => v.Equals(firstValue));
            return result;
        }
    }
}

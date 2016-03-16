using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Count : BuiltinBase
    {
        public override string Name => "count";

        public override object Call(params object[] parameterFuncs)
        {
            ValidateHasExactlyNumberOfParameters(parameterFuncs, 1);
            var list = ReduceToValueList(parameterFuncs.Single());
            return list.Count;
        }
    }
}

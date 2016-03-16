using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Tail : BuiltinBase
    {
        public override string Name => "tail";

        public override object Call(params object[] parameterFuncs)
        {
            ValidateHasExactlyNumberOfParameters(parameterFuncs, 1);

            var list = ReduceToValueList(parameterFuncs.Single());
            if (list.Count < 2)
            {
                throw Error.Panic($"{GetBaseErrorMessage()} failed: Parameter list contains less than 2 elements: {list.Count}.");
            }

            var result = list.Skip(1).ToList();
            return result;
        }
    }
}

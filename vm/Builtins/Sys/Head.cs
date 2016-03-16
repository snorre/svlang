using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class Head : BuiltinBase
    {
        public override string Name => "head";

        public override object Call(params object[] parameterFuncs)
        {
            ValidateHasExactlyNumberOfParameters(parameterFuncs, 1);

            var list = ReduceToValueList(parameterFuncs.Single());
            return list.FirstOrDefault() ?? Value.Void;
        }
    }
}

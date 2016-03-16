using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Mod : BuiltinBase
    {
        public override string Name => "mod";

        public override object Call(params object[] parameterFuncs)
        {
            ValidateHasExactlyNumberOfParameters(parameterFuncs, 2);

            var modNum = ReduceToValue<int>(parameterFuncs[0]);
            var num = ReduceToValue<int>(parameterFuncs[1]);

            return num % modNum;
        }
    }
}

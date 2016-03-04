using System;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Mod : BuiltinBase
    {
        public override string Name => "mod";

        public override object Call(params object[] parameterFuncs)
        {
            if (parameterFuncs.Length != 2)
            {
                throw Error.Panic($"Builtin function '{Name}' must have 2 parameter. Got " + parameterFuncs.Length);
            }

            var modNum = ReduceToValue<int>(parameterFuncs[0]);
            var num = ReduceToValue<int>(parameterFuncs[1]);

            return num % modNum;
        }
    }
}

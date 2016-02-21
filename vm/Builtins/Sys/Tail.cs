using System;
using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Tail : BuiltinBase
    {
        public override string Name => "tail";

        public override object Call(params Func<dynamic>[] parameterFuncs)
        {
            if (parameterFuncs.Length != 1)
            {
                throw Error.Panic($"Builtin function '{Name}' can only take 1 parameter.");
            }

            var list = ReduceToValues(parameterFuncs.Single());
            if (list.Count() < 2)
            {
                throw Error.Panic($"Builtin function '{Name}' failed: List contains less than 2 elements.");
            }

            var result = list.Skip(1).ToList();
            return result;
        }
    }
}

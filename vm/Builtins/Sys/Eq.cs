﻿using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Eq : BuiltinBase
    {
        public override string Name => "eq";

        public override object Call(params object[] parameterFuncs)
        {
            if (parameterFuncs.Length < 2)
            {
                throw Error.Panic("Builtin function 'eq' must have more than one parameter. Got " + parameterFuncs.Length);
            }

            var values = ReduceListToValues<object>(parameterFuncs);
            var firstValue = values.First();
            bool result = values.All(v => v.Equals(firstValue));
            return result;
        }
    }
}

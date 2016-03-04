﻿using System;
using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Plus : BuiltinBase
    {
        public override string Name => "plus";

        public override object Call(params object[] parameterFuncs)
        {
            if (parameterFuncs.Length <= 1)
            {
                throw Error.Panic($"Builtin function '{Name}' must have more than one parameter. Got " + parameterFuncs.Length);
            }

            return parameterFuncs.Sum(pf => ReduceToValue<int>(pf));
        }
    }
}

﻿using System;
using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class HasTail : BuiltinBase
    {
        public override string Name => "hastail";

        public override object Call(params Func<dynamic>[] parameterFuncs)
        {
            if (parameterFuncs.Length != 1)
            {
                throw Error.Panic($"Builtin function '{Name}' can only take 1 parameter.");
            }

            var list = ReduceToValues(parameterFuncs.Single());
            return list.Count > 1;
        }
    }
}

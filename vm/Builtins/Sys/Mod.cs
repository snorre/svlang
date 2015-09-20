using System;
using System.Collections.Generic;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class Mod : BuiltinFunction
    {
        protected override List<Type> RawTypesSupported => OnlyInts;

        public Mod() : base("mod", "modulus", "num")
        {
        }

        protected override Value ExecuteImpl(Value[] parameterValues)
        {
            var modulus = (int)(parameterValues[0].RawValue());
            var num = (int)(parameterValues[1].RawValue());
            var retval = num % modulus;
            return new ValueSingle(num % modulus);
        }
    }
}

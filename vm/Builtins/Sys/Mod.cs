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

        protected override Expr ExecuteImpl(Expr[] parameterValues)
        {
            var valueParams = GetParametersAs<ValueSingle>(parameterValues);
            var modulus = (int)(valueParams[0].RawValue());
            var num = (int)(valueParams[1].RawValue());
            return new ValueSingle(num % modulus);
        }
    }
}

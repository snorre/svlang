using System;
using System.Collections.Generic;
using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.sys
{
    public class Plus : BuiltinFunction
    {
        protected override List<Type> RawTypesSupported => OnlyInts;

        public Plus() : base("plus", "i1", "i2")
        {
        }

        protected override Expr ExecuteImpl(Expr[] parameterValues)
        {
            var valueParams = GetParametersAs<ValueSingle>(parameterValues);
            var result = valueParams.Select(pv => (int)pv.RawValue()).Sum();
            return new ValueSingle(result);
        }
    }
}

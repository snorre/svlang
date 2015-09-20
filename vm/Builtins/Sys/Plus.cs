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

        protected override Value ExecuteImpl(Value[] parameterValues)
        {
            var result = parameterValues.Select(pv => (int)pv.RawValue()).Sum();
            return new ValueSingle(result);
        }
    }
}

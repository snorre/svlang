using System;
using System.Collections.Generic;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.sys
{
    public class Minus : BuiltinFunction
    {
        protected override List<Type> RawTypesSupported => OnlyInts;

        public Minus() : base("minus", "i1", "i2")
        {
        }

        protected override Value ExecuteImpl(Value[] parameterValues)
        {
            var p1 = (int)parameterValues[0].RawValue();
            var p2 = (int)parameterValues[1].RawValue();
            return new ValueSingle(p1 - p2);
        }
    }
}

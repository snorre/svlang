using System;
using System.Collections.Generic;
using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.sys
{
    public class Minus : BuiltinFunction
    {
        private static readonly List<Type> Integer = new List<Type> { typeof(int) };

        protected override List<Type> RawTypesSupported => Integer;

        public Minus() : base("-", "i1", "i2")
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

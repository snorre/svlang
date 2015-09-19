using System;
using System.Collections.Generic;
using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.sys
{
    public class Plus : BuiltinFunction
    {
        private static readonly List<Type> Ints = new List<Type> { typeof(int) };

        protected override List<Type> RawTypesSupported => Ints;

        public Plus() : base("+", "i1", "i2")
        {
        }

        protected override Value ExecuteImpl(Value[] parameterValues)
        {
            var result = parameterValues.Select(pv => (int)pv.RawValue()).Sum();
            return new ValueSingle(result);
        }
    }
}

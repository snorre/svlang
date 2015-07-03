using System;
using System.Linq;
using SVLang.AST;

namespace SVLang.Builtins.sys
{
    public class Plus : BuiltinFunction
    {
        public Plus() : base("+", "i1", "i2")
        {
        }

        public override Value Execute(Value[] parameterValues)
        {
            if (!parameterValues.All(pv => pv.RawValue() is int))
            {
                throw new InvalidOperationException(Name + " only supports integers.");
            }

            var result = parameterValues.Select(pv => (int)pv.RawValue()).Sum();
            return new Value(result);
        }
    }
}

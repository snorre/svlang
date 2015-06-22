using System;
using System.Linq;
using SVLang.Core.AST;

namespace SVLang.Core.Builtins.sys
{
    public class Minus : BuiltinFunction
    {
        public Minus() : base("-", "i1", "i2")
        {
        }

        public override Value Execute(Value[] parameterValues)
        {
            if (!parameterValues.All(pv => pv.RawValue() is int))
            {
                throw new InvalidOperationException(Name + " only supports integers.");
            }

            if (parameterValues.Length != 2)
            {
                throw new InvalidOperationException(Name + " only supports 2 parameters.");
            }

            var p1 = (int)parameterValues[0].RawValue();
            var p2 = (int)parameterValues[1].RawValue();
            return new Value(p1 - p2);
        }
    }
}

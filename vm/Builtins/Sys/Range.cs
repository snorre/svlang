using System;
using System.Collections.Generic;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class Range : BuiltinFunction
    {
        protected override List<Type> RawTypesSupported => OnlyInts;

        public Range() : base("range", "from", "to")
        {
        }

        protected override Expr ExecuteImpl(Expr[] parameterValues)
        {
            var valueParams = GetParametersAs<ValueSingle>(parameterValues);
            var from = (int)valueParams[0].RawValue();
            var to = (int)valueParams[1].RawValue();

            if (to < from)
            {
                throw Error.Panic($"To parameter must be bigger than from parameter. " + ParameterString(from, to));
            }

            if (from < 0 || to < 0)
            {
                throw Error.Panic($"Parameters must be positive. " + ParameterString(from, to));
            }

            var generated = new List<ValueSingle>();
            for (int i = from; i <= to; i++)
            {
                generated.Add(new ValueSingle(i));
            }

            return new ValueList(generated.ToArray());
        }

        private string ParameterString(int from, int to)
        {
            return $"From was {from}, to was {to}.";
        }
    }
}

using System;
using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Plus : IBuiltIn
    {
        public string Name => "plus";

        public object Call(params Func<object>[] parameterFuncs)
        {
            if (parameterFuncs.Length <= 1)
            {
                throw Error.Panic("Builtin function 'plus' must have more than one parameter. Got " + parameterFuncs.Length);
            }

            var values = parameterFuncs.ToList().ConvertAll(pf => pf());

            if (!values.All(p => p is int))
            {
                throw Error.Panic("Builtin function 'plus' can only handle int-type parameters");
            }

            var intParams = values.Cast<int>();

            return intParams.Sum();
        }
    }
}

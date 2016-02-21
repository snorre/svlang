using System;
using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Eq : IBuiltIn
    {
        public string Name => "eq";

        public object Call(params Func<object>[] parameterFuncs)
        {
            if (parameterFuncs.Length < 2)
            {
                throw Error.Panic("Builtin function 'eq' must have more than one parameter. Got " + parameterFuncs.Length);
            }

            var values = parameterFuncs.ToList().ConvertAll(pf => pf());
            var firstValue = values.First();
            bool result = values.All(v => v.Equals(firstValue));
            return result;
        }
    }
}

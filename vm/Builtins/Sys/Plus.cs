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

            return parameterFuncs.Sum(pf => GetInt(pf));
        }

        private int GetInt(object o)
        {
            if (o is int)
            {
                return (int) o;
            }

            if (o is Func<object>)
            {
                var r = ((Func<object>)o)();
                return GetInt(r);
            }

            throw Error.Panic("Builtin function 'plus' can only handle int-type og functionref parameters");
        }
    }
}

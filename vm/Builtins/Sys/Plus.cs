using System.Linq;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Plus : IBuiltIn
    {
        public string Name => "plus";

        public object Call(params object[] parameterValues)
        {
            if (parameterValues.Length <= 1)
            {
                throw Error.Panic("Builtin function 'plus' must have more than one parameter. Got " + parameterValues.Length);
            }

            if (!parameterValues.All(p => p is int))
            {
                throw Error.Panic("Builtin function 'plus' can only handle int-type parameters");
            }

            var intParams = parameterValues.Cast<int>();

            return intParams.Sum();
        }
    }
}

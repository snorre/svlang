using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.sys
{
    public class Concat : BuiltinFunction
    {
        public Concat() : base("concat", "p1", "p2")
        {
        }

        public override Value Execute(Value[] parameterValues)
        {
            if (!parameterValues.All(pv => pv.RawValue() is string))
            {
                throw Error.Panic(Name + " only supports strings.");
            }

            var str = string.Join("", parameterValues.Select(pv => pv.RawValue()));
            return new Value(str);
        }
    }
}

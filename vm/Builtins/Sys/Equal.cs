using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class Equal : BuiltinFunction
    {
        public Equal() : base("=", "p1", "p2")
        {
        }

        public override Value Execute(Value[] parameterValues)
        {
            if (parameterValues.Length != 2)
            {
                throw Error.Panic(Name + " only supports 2 parameters.");
            }

            var p1 = parameterValues[0].RawValue();
            var p2 = parameterValues[1].RawValue();
            return new Value(p1.Equals(p2));
        }
    }
}

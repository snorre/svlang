using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class Equal : BuiltinFunction
    {
        public Equal() : base("=", "p1", "p2")
        {
        }

        protected override Value ExecuteImpl(Value[] parameterValues)
        {
            var p1 = parameterValues[0].RawValue();
            var p2 = parameterValues[1].RawValue();
            return new ValueSingle(p1.Equals(p2));
        }
    }
}

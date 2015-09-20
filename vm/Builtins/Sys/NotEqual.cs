using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class NotEqual : BuiltinFunction
    {
        public NotEqual() : base("noteq", "p1", "p2")
        {
        }

        protected override Expr ExecuteImpl(Expr[] parameterValues)
        {
            var valueParams = GetParametersAs<ValueSingle>(parameterValues);
            var p1 = valueParams[0].RawValue();
            var p2 = valueParams[1].RawValue();
            return new ValueSingle(!p1.Equals(p2));
        }
    }
}

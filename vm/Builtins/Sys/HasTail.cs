using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class HasTail : BuiltinFunction
    {
        public HasTail() : base("hastail", "list")
        {
        }

        protected override Expr ExecuteImpl(Expr[] parameterValues)
        {
            var list = GetSingleParameter(GetParametersAs<ValueList>(parameterValues));
            return new ValueSingle(list.Values.Length >= 2);
        }
    }
}

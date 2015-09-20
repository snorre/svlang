using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class Count : BuiltinFunction
    {
        public Count() : base("count", "list")
        {
        }

        protected override Expr ExecuteImpl(Expr[] parameterValues)
        {
            var list = GetSingleParameter(GetParametersAs<ValueList>(parameterValues));
            return new ValueSingle(list.Values.Length);
        }
    }
}

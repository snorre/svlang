using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class Head : BuiltinFunction
    {
        public Head() : base("head", "list")
        {
        }

        protected override Expr ExecuteImpl(Expr[] parameterValues)
        {
            var list = GetSingleParameter(GetParametersAs<ValueList>(parameterValues));
            return list.Values.FirstOrDefault() ?? Value.Void;
        }
    }
}

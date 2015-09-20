using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class Tail : BuiltinFunction
    {
        public Tail() : base("tail", "list")
        {
        }

        protected override Expr ExecuteImpl(Expr[] parameterValues)
        {
            var list = GetSingleParameter(GetParametersAs<ValueList>(parameterValues));

            if (list.Values.Length < 2)
            {
                throw Error.Panic("List contains less than 2 elements.");
            }

            return new ValueList(list.Values.Skip(1).ToArray());
        }
    }
}

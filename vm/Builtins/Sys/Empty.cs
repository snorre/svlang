using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class Empty : BuiltinFunction
    {
        public Empty() : base("empty", "list")
        {
        }

        protected override Expr ExecuteImpl(Expr[] parameterValues)
        {
            var pv = parameterValues.Single();
            if (pv is ValueList)
            {
                return new ValueSingle(((ValueList)pv).Values.Length == 0);
            }
            
            return new ValueSingle(false);
        }
    }
}

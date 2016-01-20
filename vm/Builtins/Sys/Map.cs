using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class Map : BuiltinFunction
    {
        private const string ListParam = "list";
        private const string FuncParam = "func";

        public Map() : base("map", ListParam, FuncParam)
        {
        }

        protected override Expr ExecuteImpl(Expr[] parameterValues)
        {
            var list = GetNamedParameterAs<ValueList>(parameterValues, ListParam);
            var func = GetNamedParameterAs<FunctionRef>(parameterValues, FuncParam);
            
            var resultValues =
                list.Values
                    .Select(v => Execution.EvalFunctionRefFromBuiltin(func, list.Values))
                    .ToArray();

            return new ValueList(resultValues);
        }
    }
}

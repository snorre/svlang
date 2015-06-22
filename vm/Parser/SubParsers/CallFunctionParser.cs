using System.Linq;
using Sprache;
using SVLang.Core.AST;

namespace SVLang.Parser.SubParsers
{
    public static class CallFunctionParser
    {
        private static readonly Parser<Expr> Parameter =
            from s in Parse.Char(' ')
            from p in ValueParser.Single
            select p;

        private static readonly Parser<CallFunction> WithParams =
            from b1 in Parse.Char('(').Once()
            from name in BasicParser.FunctionName
            from parameters in Parameter.Many()
            from b2 in Parse.Char(')').Once()
            select new CallFunction(name, parameters.ToArray());

        public static Parser<Expr> Single = WithParams; // NoParams.Or(WithParams);
    }
}

using System.Linq;
using Sprache;
using SVLang.Core.AST;

namespace SVLang.Parser.SubParsers
{
    public static class CallFunctionParser
    {
        private static readonly Parser<CallFunction> NoParams =
            from name in Parse.Letter.AtLeastOnce().Text()
            from b1 in Parse.Char('(').Once()
            from b2 in Parse.Char(')').Once()
            select new CallFunction(name);

        // TODO use for both no params and any params
        private static readonly Parser<CallFunction> WithParams =
            from name in Parse.Letter.AtLeastOnce().Text()
            from b1 in Parse.Char('(').Once()
            from p in ValueParser.All.Once()
            from b2 in Parse.Char(')').Once()
            select new CallFunction(name, p.Single());

        public static Parser<Expr> All = NoParams.Or(WithParams);
    }
}

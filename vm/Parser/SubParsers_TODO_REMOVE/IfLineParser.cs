using Sprache;
using SVLang.Basics.AST;

namespace SVLang.Parser.SubParsers
{
    public class IfLineParser
    {
        public static readonly Parser<Expr> Single =
            from indent in BasicParser.Indent.Optional()
            from condition in CallFunctionParser.Single
            from arrow in Parse.String(" -> ")
            from action in ExprParser.Single
            from bl in BasicParser.BlankLine.Many().Optional()
            select new IfLine(condition, action);
    }
}

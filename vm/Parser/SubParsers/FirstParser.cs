using System.Linq;
using Sprache;
using SVLang.AST;

namespace SVLang.Parser.SubParsers
{
    public class FirstParser
    {
        public static readonly Parser<Expr> Single =
            from indent in BasicParser.Indent
            from first in Parse.String("first")
            from start in BasicParser.Start
            from ifLines in IfLineParser.Single.Many()
            from indent2 in BasicParser.Indent
            from elseExpr in ExprParser.Single.Optional()
            from end in BasicParser.End
            select
                new First(
                    ifLines
                        .Cast<IfLine>()
                        .Concat(
                            elseExpr.IsEmpty
                                ? new IfLine[0]
                                : new[] { new IfLine(new Value(true), elseExpr.Get())}
                        )
                        .ToArray()
                );
    }
}

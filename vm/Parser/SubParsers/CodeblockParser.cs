using System;
using System.Linq;
using SVLang.Core.AST;
using Sprache;

namespace SVLang.Parser.SubParsers
{
    public class CodeblockParser
    {
        private static readonly Parser<Expr> Line =
            from i in BasicParser.Indent
            from line in ExprParser.SingleExceptCodeblock
            from nl in Parse.String(Environment.NewLine).AtLeastOnce()
            select line;

        public static readonly Parser<Expr> Single =
            from s in BasicParser.Start
            from lines in Line.AtLeastOnce()
            from e in BasicParser.End
            select new Codeblock(lines.ToArray());
    }
}

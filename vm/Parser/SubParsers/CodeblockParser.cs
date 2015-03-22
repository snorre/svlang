using System;
using System.Collections.Generic;
using System.Linq;
using SVLang.Core.AST;
using Sprache;

namespace SVLang.Parser.SubParsers
{
    public class CodeblockParser
    {
        private static readonly Parser<IEnumerable<char>> Indent =
            Parse.Chars(new[] { '\t', ' ' }).Many();

        private static readonly Parser<string> BlankLine =
            from i in Indent
            from nl in Parse.String(Environment.NewLine)
            select "";

        private static readonly Parser<char> Start =
            from i in Indent
            from br in Parse.Char('{')
            from bl in BlankLine.Optional()
            select br;

        private static readonly Parser<char> End =
            from bl in BlankLine.Optional()
            from i in Indent
            from br in Parse.Char('}')
            select br;

        private static readonly Parser<Expr> Line =
            from i in Indent
            from line in ExprParser.SingleExceptCodeblock
            from nl in Parse.String(Environment.NewLine).AtLeastOnce()
            select line;

        public static readonly Parser<Expr> Single =
            from s in Start
            from lines in Line.AtLeastOnce()
            from e in End
            select new Codeblock(lines.ToArray());
    }
}

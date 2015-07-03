using System;
using System.Collections.Generic;
using System.Linq;
using Sprache;

namespace SVLang.Parser.SubParsers
{
    public class BasicParser
    {
        public static readonly Parser<IEnumerable<char>> Indent =
            Parse.Chars(new[] { '\t', ' ' }).Many();

        public static readonly Parser<string> BlankLine =
            from i in Indent
            from nl in Parse.String(Environment.NewLine)
            select string.Empty;

        public static readonly Parser<char> Start =
            from i in Indent
            from br in Parse.Char('{')
            from bl in BlankLine.Optional()
            select br;

        public static readonly Parser<char> End =
            from bl in BlankLine.Optional()
            from i in Indent
            from br in Parse.Char('}')
            select br;

        public static readonly Parser<string> FunctionName =
            from l in Parse.Letter.AtLeastOnce()
            from ld in Parse.LetterOrDigit.Many().Optional()
            select new string(l.Concat(ld.GetOrDefault()).ToArray());
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Sprache;
using SVLang.AST;

namespace SVLang.Parser.SubParsers
{
    public class IfLineParser
    {
        public static readonly Parser<IfLine> Single =
            from condition in CallFunctionParser.Single
            from arrow in Parse.String(" -> ")
            from action in CallFunctionParser.Single
            select new IfLine(condition, action);
    }
}

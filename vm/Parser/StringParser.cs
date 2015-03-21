using Sprache;
using SVLang.Core.AST;
using SVLang.Parser.SubParsers;

namespace SVLang.Parser
{
    public class StringParser
    {
        private readonly string _code;

        public StringParser(string code)
        {
            _code = code;
        }

        public Expr Run()
        {
            return
                ValueParser.All.Or(CallFunctionParser.All).Parse(_code);
        }
    }
}

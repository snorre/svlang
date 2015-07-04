using Sprache;
using SVLang.Basics.AST;
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
            return ExprParser.Single.Parse(_code);
        }
    }
}

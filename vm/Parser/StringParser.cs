using System.IO;
using Antlr4.Runtime;
using SVLang.Basics.AST;
using SVLang.Parser.GeneratedParser;

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
            var sr = new StringReader(_code);
            var lexer = new SVLangLexer(new AntlrInputStream(sr));
            var tokenStream = new CommonTokenStream(lexer);
            var parser = new SVLangParser(tokenStream);
            var tree = parser.expr();
            return new ASTBuilder().Build(tree);
        }
    }
}

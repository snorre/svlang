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
            _code = code.Trim();
        }

        public Expr Run()
        {
            var sr = new StringReader(_code);
            var lexer = new SVLangLexer(new AntlrInputStream(sr));
            lexer.AddErrorListener(new ErrorListener());
            var tokenStream = new CommonTokenStream(lexer);
            var parser = new SVLangParser(tokenStream);
            parser.AddErrorListener(new ErrorListener());
            var tree = parser.expr();
            return new ASTBuilder().BuildExpr(tree);
        }
    }
}

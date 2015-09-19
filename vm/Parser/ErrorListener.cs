using System;
using Antlr4.Runtime;

namespace SVLang.Parser
{
    public class ErrorListener : IAntlrErrorListener<IToken>, IAntlrErrorListener<int>
    {
        public void SyntaxError(IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
        {
            throw 
                new InvalidOperationException(
                    $"Parser error at line {line} position {charPositionInLine}: {msg}.", 
                    e
                );
        }

        public void SyntaxError(IRecognizer recognizer, int offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
        {
            throw
                new InvalidOperationException(
                    $"Lexer error at symbol {offendingSymbol} line {line} position {charPositionInLine}: {msg}.",
                    e
                );
        }
    }
}

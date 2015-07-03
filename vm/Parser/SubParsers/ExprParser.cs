using Sprache;
using SVLang.AST;

namespace SVLang.Parser.SubParsers
{
    public class ExprParser
    {
        public static readonly Parser<Expr> SingleExceptCodeblock =
            FirstParser.Single
                .Or(IfLineParser.Single)
                .Or(CallFunctionParser.Single)
                .Or(DefineFunctionParser.Single)
                .Or(ValueParser.Single);
                

        public static readonly Parser<Expr> Single =
            SingleExceptCodeblock.Or(CodeblockParser.Single);
    }
}

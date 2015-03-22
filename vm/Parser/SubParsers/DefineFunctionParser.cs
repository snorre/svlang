using Sprache;
using SVLang.Core.AST;

namespace SVLang.Parser.SubParsers
{
    public class DefineFunctionParser
    {
        public static readonly Parser<DefineFunction> Single =
            from name in Parse.Letter.AtLeastOnce().Text()
            from eq in Parse.String(" = ")
            from body in ExprParser.Single
            select new DefineFunction(name, body);
    }
}

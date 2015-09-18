using Sprache;
using SVLang.Basics.AST;

namespace SVLang.Parser.SubParsers
{
    public class DefineFunctionParser
    {
        public static readonly Parser<DefineFunction> Single =
            from name in BasicParser.FunctionName
            from eq in Parse.String(" = ")
            from body in ExprParser.Single
            select new DefineFunction(name, body);
    }
}

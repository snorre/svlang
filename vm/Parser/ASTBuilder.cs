using System;
using SVLang.Basics.AST;
using SVLang.Parser.GeneratedParser;

namespace SVLang.Parser
{
    public class ASTBuilder
    {
        public Expr Build(SVLangParser.ExprContext expr)
        {
            var value = expr.value();
            if (value != null)
            {
                return BuildValue(value);
            }

            throw new InvalidOperationException("Cannot build expr, unknown type.");
        }

        private Value BuildValue(SVLangParser.ValueContext value)
        {
            var n = value.NUM();
            if (n != null)
            {
                return new Value(int.Parse(n.GetText()));
            }

            var b = value.BOOL();
            if (b != null)
            {
                return new Value(bool.Parse(b.GetText()));
            }

            var s = value.STRING();
            if (s != null)
            {
                var str = s.GetText();
                return new Value(str.Substring(1, str.Length - 2)); // trim leading and tailing "
            }

            throw new InvalidOperationException("Cannot build value, unknown type.", value.exception);
        }
    }
}

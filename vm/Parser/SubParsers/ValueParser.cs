using Sprache;
using SVLang.Core.AST;

namespace SVLang.Parser.SubParsers
{
    public static class ValueParser
    {
        private static readonly Parser<Value> ValueInt =
            from dash in Parse.Char('-').Optional()
            from n in Parse.Number.Select(int.Parse)
            select new Value(dash.IsDefined ? n * -1 : n);

        private static readonly Parser<Value> ValueString =
            (from startQuote in Parse.Char('"').Once()
             from str in Parse.CharExcept('"').Many().Text()
             from endQuote in Parse.Char('"').Once()
             select str).Select(s => new Value(s));

        private static readonly Parser<Value> ValueBool =
            Parse.String("true").Or(
                Parse.String("false")
            ).Text().Select(s => new Value(bool.Parse(s)));

        public static readonly Parser<Expr> Single = ValueInt.Or(ValueString).Or(ValueBool);
    }
}

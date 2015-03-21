using Sprache;
using SVLang.Core.AST;

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
            return new Value(Number.Parse(_code));
            //var r = Parse.Digit.Token().Parse(_code);
            //return new Value(2); // CallFunction("jalla");
        }

        public static readonly Parser<decimal> Number =
            from dash in Parse.Char('-').Optional()
            from n in Parse.Number.Token().Select(decimal.Parse)
            select (dash.IsDefined ? n*-1 : n);

        //public static readonly Parser<string> QuotedText =
        //    (
        //        from open in Parse.Char('"')
        //        from content in Parse.CharExcept('"').Many().Text()
        //        from close in Parse.Char('"')
        //        select content
        //    ).Token();

        //public static readonly Parser<Value> ValueParser =
        //    from id in Identifier
        //    from prompt in QuotedText
        //    select new Value(id, prompt);
    }
}

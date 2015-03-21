using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Core.AST;
using SVLang.Parser;

namespace SVLang.Test
{
    [TestClass]
    public class ParserTests
    {
        [TestMethod]
        public void value_int()
        {
            ParsesTo("1", new Value(1));
            ParsesTo("2", new Value(2));
            ParsesTo("123", new Value(123));
            ParsesTo("0", new Value(0));
            ParsesTo("-0", new Value(0));
            ParsesTo("-1", new Value(-1));
            ParsesTo("-123", new Value(-123));
        }

        [TestMethod]
        public void value_string()
        {
            ParsesTo("\"\"", new Value(""));
            ParsesTo("\"1\"", new Value("1"));
            ParsesTo("\"a\"", new Value("a"));
            ParsesTo("\"123\"", new Value("123"));
            ParsesTo("\"abc\"", new Value("abc"));
            ParsesTo("\"!¤#\"", new Value("!¤#"));
        }

        [TestMethod]
        public void value_bool()
        {
            ParsesTo("true", new Value(true));
            ParsesTo("false", new Value(false));
        }

        [TestMethod]
        public void callfunction_1()
        {
            ParsesTo("fun()", new CallFunction("fun"));
            ParsesTo("fun(1)", new CallFunction("fun", new Value(1)));

            Assert.Inconclusive("Add reference parameter, and more parameters.");
        }

        #region Helpers

        private void ParsesTo(string code, Expr expr)
        {
            var actual = new StringParser(code).Run();
            Assert.AreEqual(expr, actual);
        }

        #endregion
    }
}

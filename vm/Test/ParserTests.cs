using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Core.AST;
using SVLang.Parser;

namespace SVLang.Test
{
    [TestClass]
    public class ParserTests
    {
        [TestMethod]
        public void int_value()
        {
            ParsesTo("1", new Value(1m));
            ParsesTo("2", new Value(2m));
            ParsesTo("123", new Value(123m));
            ParsesTo("0", new Value(0m));
            ParsesTo("-0", new Value(0m));
            ParsesTo("-1", new Value(-1m));
            ParsesTo("-123", new Value(-123m));
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

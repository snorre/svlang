using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Core.AST;
using SVLang.Parser;

namespace SVLang.Test
{
    // ReSharper disable InconsistentNaming

    [TestClass]
    public class ParserTests : TestBase
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
        public void callfunction_no_params()
        {
            ParsesTo("(fun)", new CallFunction("fun"));
        }

        [TestMethod]
        public void callfunction_with_param()
        {
            ParsesTo("(fun 123)", new CallFunction("fun", V(123)));
        }

        [TestMethod]
        public void callfunction_with_two_params()
        {
            ParsesTo("(fun 123 456)", new CallFunction("fun", V(123), V(456)));
        }

        [TestMethod]
        public void definefunction_no_params()
        {
            ParsesTo("fun = 1", new DefineFunction("fun", V(1)));
        }

        [TestMethod]
        public void codeblock()
        {
            ParsesTo(
                @"{
                    1
                    ""abc""
                }",
                new Codeblock(V(1), V("abc"))
            );
        }

        [TestMethod]
        public void complex_1()
        {
            ParsesTo(
                @"{
                    fun = {
                        1
                        456
                    }
                    (fun)
                }",
                new Codeblock(
                    new DefineFunction("fun", 
                        new Codeblock(V(1), V(456))
                    ), 
                    new CallFunction("fun")
                )
            );
        }

        #region Helpers

        private void ParsesTo(string code, Expr expr)
        {
            var actual = new StringParser(code).Run();
            Assert.AreEqual(expr, actual);
        }

        #endregion
    }

    // ReSharper restore InconsistentNaming
}

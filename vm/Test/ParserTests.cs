using System;
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
            ParsesTo("1", V(1));
            ParsesTo("2", V(2));
            ParsesTo("123", V(123));
            ParsesTo("0", V(0));
            ParsesTo("-0", V(0));
            ParsesTo("-1", V(-1));
            ParsesTo("-123", V(-123));
        }

        [TestMethod]
        public void value_string()
        {
            ParsesTo("\"\"", V(""));
            ParsesTo("\"1\"", V("1"));
            ParsesTo("\"a\"", V("a"));
            ParsesTo("\"123\"", V("123"));
            ParsesTo("\"abc\"", V("abc"));
            ParsesTo("\"!¤#\"", V("!¤#"));
        }

        [TestMethod]
        public void value_bool()
        {
            ParsesTo("true", V(true));
            ParsesTo("false", V(false));
        }

        [TestMethod]
        public void callfunction_no_params()
        {
            ParsesTo("(fun)", CallF("fun"));
        }

        [TestMethod]
        public void callfunction_with_param()
        {
            ParsesTo("(fun 123)", CallF("fun", V(123)));
        }

        [TestMethod]
        public void callfunction_with_two_params()
        {
            ParsesTo("(fun 123 456)", CallF("fun", V(123), V(456)));
        }

        [TestMethod]
        public void definefunction_no_params()
        {
            ParsesTo("fun = 1", DefF("fun", V(1)));
        }

        [TestMethod]
        public void codeblock()
        {
            ParsesTo(
                @"{
                    1
                    ""abc""
                }",
                Cb(V(1), V("abc"))
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
                Cb(
                    DefF("fun", 
                        Cb(V(1), V(456))
                    ), 
                    CallF("fun")
                )
            );
        }

        [TestMethod]
        public void define_two_methods()
        {
            ParsesTo(
                @"{
                    funA = {
                        123
                    }

                    funB = {
                        456
                    }

                    (funB)
                }",
                Cb(
                    DefF("funA", Cb(V(123))),
                    DefF("funB", Cb(V(456))),
                    CallF("funB")
                )
            );
        }

        [TestMethod]
        public void define_methods_with_different_names()
        {
            Action<string> test = name => 
                ParsesTo(
                    name + @" = {
                            123
                        }
                        ",
                    DefF(name, Cb(V(123)))
                );

            test("fun");
            test("fA");
            test("f1");
            test("f");
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

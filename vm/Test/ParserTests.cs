﻿using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Basics.AST;
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
            ParsesTo("(fun 123 )", CallF("fun", V(123)));
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
        public void definefunction_with_codeblock()
        {
            ParsesTo(
                @"fun = {
                    1
                }",
                DefF("fun", Cb(V(1)))
            );
        }

        [TestMethod]
        public void definefunction_with_one_parameter()
        {
            ParsesTo(
                "fun p = 1",
                DefF("fun", V(1), "p")
            );
        }

        [TestMethod]
        public void definefunction_with_two_parameters()
        {
            ParsesTo(
                "fun p1 p2 = 1",
                DefF("fun", V(1), "p1", "p2")
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
        public void complex_2_with_blank_lines()
        {
            ParsesTo(
                @"

                {

                    fun = {

                        1

                        456

                    }

                    (fun)

                    1

                }

                ",
                Cb(
                    DefF("fun",
                        Cb(V(1), V(456))
                    ),
                    CallF("fun"),
                    V(1)
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

        [TestMethod]
        public void if_simple()
        {
            ParsesTo(
                "(sjekk 1 \"a b c\" 2) -> (print 123)",
                If(
                    CallF("sjekk", V(1), V("a b c"), V(2)), 
                    CallF("print", V(123))
                )
            );
        }

        [TestMethod]
        public void if_with_value_action()
        {
            ParsesTo(
                @"(sjekk 1 2) -> 3",
                If(
                    CallF("sjekk", V(1), V(2)),
                    V(3)
                )
            );
        }

        [TestMethod]
        public void first_simple()
        {
            ParsesTo(
                @"first {
                    (cond) -> (act)
                }",
                First(
                    If(CallF("cond"), CallF("act"))
                )
            );
        }

        [TestMethod]
        public void first_multiple()
        {
            ParsesTo(
                @"first {
                    (cond1) -> (act1)
                    (cond2) -> (act2)
                    (cond3) -> 3
                }",
                First(
                    If(CallF("cond1"), CallF("act1")),
                    If(CallF("cond2"), CallF("act2")),
                    If(CallF("cond3"), V(3))
                )
            );
        }

        [TestMethod]
        public void first_with_else()
        {
            ParsesTo(
                @"first {
                    (cond1) -> (act1)
                    (cond2) -> (act2)
                    false
                }",
                First(
                    If(CallF("cond1"), CallF("act1")),
                    If(CallF("cond2"), CallF("act2")),
                    If(V(true), V(false))
                )
            );
        }

        [TestMethod]
        public void first_with_else_as_callfunction()
        {
            ParsesTo(
                @"first {
                    (cond1) -> (act1)
                    (cond2) -> (act2)
                    (funElse)
                }",
                First(
                    If(CallF("cond1"), CallF("act1")),
                    If(CallF("cond2"), CallF("act2")),
                    If(V(true), CallF("funElse"))
                )
            );
        }

        [TestMethod]
        public void valuelist()
        {
            ParsesTo(
                "[1 true        \"abc\"  ]",
                VL(1, true, "abc")
            );
        }

        [TestMethod]
        public void valuelist_one_element()
        {
            ParsesTo(
                "[ 1]",
                VL(1)
            );
        }

        [TestMethod]
        public void valuelist_empty()
        {
            ParsesTo(
                "[]",
                VL()
            );
            ParsesTo(
                "[      ]",
                VL()
            );
        }

        [TestMethod]
        public void word_void()
        {
            ParsesTo(
                "void",
                Value.Void
            );
        }

        [TestMethod]
        public void definefunction_with_callfunction_body()
        {
            ParsesTo(
                "fun x = (call)",
                DefF("fun", CallF("call"), "x")
            );
        }

        [TestMethod]
        public void callfunction_with_functionref_as_parameter()
        {
            ParsesTo(
                @"{
                    inner x = (print (x))
                    outer fr = (fr 1)
                    (outer inner)
                }",
                Cb(
                    DefF("inner", CallF("print", CallF("x")), "x"),
                    DefF("outer", CallF("fr", V(1)) , "fr"),
                    CallF("outer", FR("inner"))
                )
            );
        }

        [TestMethod]
        public void codeblock_can_return_functionref()
        {
            ParsesTo(
                @"{
                    x
                }",
                Cb(FR("x"))
            );
        }

        [TestMethod]
        public void definefunction_can_have_first_as_body()
        {
            ParsesTo(
                @"
                    x = first {
                        (cond) -> (action)
                    }
                ",
                DefF("x", 
                    First(
                        If(CallF("cond"), CallF("action"))
                    )
                )
            );
        }

        [TestMethod]
        public void definefunction_can_have_ifline_as_body()
        {
            ParsesTo(
                "x = (cond) -> (action)",
                DefF("x", If(CallF("cond"), CallF("action")))
            );
        }

        [TestMethod]
        public void can_define_functions_with_hyphen_in_name()
        {
            Action<string> test = name => 
                ParsesTo(
                    name + " = 1",
                    DefF(name, V(1))
                );

            test("f-n");
            test("fu-n");
            test("f-un");
            test("f-u-n");
            test("fu-un-nn");
        }

        [TestMethod]
        public void cannot_define_functions_with_hyphen_first_in_name()
        {
            DoesntParse(
                "-fun = 1",
                "Lexer error at symbol 0 line 1 position 0: token recognition error at: '-f'."
            );
        }

        [TestMethod]
        public void cannot_define_functions_with_hyphen_last_in_name()
        {
            DoesntParse(
                "fun- = 1",
                "Lexer error at symbol 0 line 1 position 3: token recognition error at: '- '."
            );
        }

        [TestMethod]
        public void cannot_define_functions_with_underscore_in_name()
        {
            DoesntParse(
                "f_n = 1",
                "Lexer error at symbol 0 line 1 position 1: token recognition error at: '_'."
            );
        }

        #region Helpers

        private void ParsesTo(string code, Expr expr)
        {
            PrintSection("Code", code);

            var actual = new StringParser(code).Run();
            Assert.AreEqual(expr, actual);

            PrintSection("Parsed to", actual.ToString());
        }

        private void DoesntParse(string code, string expectedErrorMessage)
        {
            try
            {
                new StringParser(code).Run();
                throw new InvalidOperationException("Test emitted no exception.");
            }
            catch (Exception e)
            {
                AssertMessageIsEqualExceptFormatting(expectedErrorMessage, e.Message);
            }
        }

        #endregion
    }

    // ReSharper restore InconsistentNaming
}

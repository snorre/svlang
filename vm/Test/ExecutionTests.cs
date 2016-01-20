using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Basics;
using SVLang.Basics.AST;
using SVLang.Core;

namespace SVLang.Test
{
    // ReSharper disable InconsistentNaming

    [TestClass]
    public class ExecutionTests : TestBase
    {
        [TestMethod]
        public void value_returns_raw_values()
        {
            Action<object, Value> valueIs = (e, v) => Assert.AreEqual(e, v.RawValue());

            valueIs(123, V(123));
            valueIs(-123, V(-123));

            valueIs("hei", V("hei"));
            valueIs(string.Empty, V(string.Empty));

            valueIs(123.45m, V(123.45m));
            valueIs(-123.45m, V(-123.45m));

            valueIs(true, V(true));
            valueIs(false, V(false));
        }
        
        [TestMethod]
        public void call_function()
        {
            EvaluatesTo(
                123,
                DefF("name", V(123)),
                CallF("name")
            );
        }

        [TestMethod]
        public void call_function_twice()
        {
            EvaluatesTo(
                123,
                DefF("name", V(123)),
                CallF("name"),
                CallF("name")
            );
        }

        [TestMethod]
        public void define_function_twice_fails()
        {
            MustFail(
                "Cannot re-define: name",
                DefF("name", V(123)),
                DefF("name", V(456)),
                CallF("name")
            );
        }

        [TestMethod]
        public void call_function_with_parameter()
        {
            EvaluatesTo(
                123,
                DefF("name", CallF("a"), "a"),
                CallF("name", V(123))
            );
        }

        [TestMethod]
        public void call_function_with_parameter_twice()
        {
            EvaluatesTo(
                456,
                DefF("name", CallF("a"), "a"),
                CallF("name", V(123)),
                CallF("name", V(456))
            );
        }

        [TestMethod]
        public void define_function_with_parameter_twice_fails()
        {
            MustFail(
                "Cannot re-define: name",
                DefF("name", CallF("a"), "a"),
                DefF("name", CallF("a"), "a"),
                CallF("name", V(123))
            );
        }

        [TestMethod]
        public void call_function_in_outer_scope_fails()
        {
            MustFail(
                "Cannot get: fun",
                DefF(
                    "outer",
                    DefF("fun", V(123))
                ),
                CallF("outer"),
                CallF("fun")
            );
        }

        [TestMethod]
        public void can_overwrite_function_in_outer_scope()
        {
            EvaluatesTo(
                123,
                DefF("fun", V(123)),
                DefF(
                    "possibleOverwrite",
                    DefF("fun", V(456))
                ),
                CallF("possibleOverwrite"),
                CallF("fun")
            );
        }

        [TestMethod]
        public void can_define_function_in_inner_scope_many_times()
        {
            EvaluatesTo(
                123,
                DefF(
                    "fun", 
                    Cb(
                        DefF("inner", V(123)),
                        CallF("inner")
                    )
                ),
                CallF("fun"),
                CallF("fun")
            );
        }

        [TestMethod]
        public void codeblock_exit_removes_inner_declarations_fails()
        {
            MustFail(
                "Cannot get: fun",
                Cb(
                    DefF("fun", V(1))
                ),
                CallF("fun")
            );
        }

        [TestMethod]
        public void call_builtin_print_with_list()
        {
            const string s = "1 True abc";
            EvaluatesTo(
                s,
                CallF("print", VL(1, true, "abc"))
            );
            OutputMustBe(s);
        }

        [TestMethod]
        public void call_builtin_print_with_single_value()
        {
            const string s = "hello";
            EvaluatesTo(
                s,
                CallF("print", V("hello"))
            );
            OutputMustBe(s);
        }

        [TestMethod]
        public void call_builtin_str_with_list()
        {
            EvaluatesTo(
                "1TrueAbc",
                CallF("str", VL(1, true, "Abc"))
            );
        }

        [TestMethod]
        public void call_builtin_str_with_single_value_string()
        {
            EvaluatesTo(
                "hello",
                CallF("str", V("hello"))
            );
        }

        [TestMethod]
        public void call_builtin_str_with_single_value_bool()
        {
            EvaluatesTo(
                "True",
                CallF("str", V(true))
            );
        }

        [TestMethod]
        public void call_builtin_str_with_single_value_int()
        {
            EvaluatesTo(
                "3",
                CallF("str", V(3))
            );
        }

        [TestMethod]
        public void call_multiple_functions_with_same_parameter_name()
        {
            EvaluatesTo(
                123,
                DefF(
                    "fun1", 
                    CallF("p"), 
                    "p"
                ),
                DefF(
                    "fun2", 
                    CallF("fun1", CallF("p")), 
                    "p"
                ),
                CallF("fun2", V(123))
            );
        }

        [TestMethod]
        public void call_builtin_plus()
        {
            EvaluatesTo(
                V(3),
                CallF("plus", V(1), V(2))
            );
        }

        [TestMethod]
        public void if_not_called_returns_void()
        {
            EvaluatesTo(
                Value.Void,
                If(CallF("eq", V(1), V(2)), V(1))
            );
        }

        [TestMethod]
        public void if_called_returns_action_return_value()
        {
            EvaluatesTo(
                3,
                If(CallF("eq", V(1), V(1)), V(3))
            );
        }

        [TestMethod]
        public void call_builtin_minus()
        {
            EvaluatesTo(
                1,
                CallF("minus", V(3), V(2))
            );
        }

        [TestMethod]
        public void first_single()
        {
            EvaluatesTo(
                3,
                First(
                    If(CallF("eq", V(1), V(1)), V(3))
                )
            );
        }

        [TestMethod]
        public void first_multiple()
        {
            EvaluatesTo(
                5,
                First(
                    If(CallF("eq", V(1), V(2)), V(3)),
                    If(V(false), V(6)),
                    If(CallF("eq", V(4), V(4)), V(5))
                )
            );
        }

        [TestMethod]
        public void first_nothing_is_hit()
        {
            EvaluatesTo(
                Value.Void,
                First(
                    If(CallF("eq", V(1), V(2)), V(3)),
                    If(CallF("eq", V(4), V(5)), V(6))
                )
            );
        }

        [TestMethod]
        public void first_hit_is_void_is_still_treated_as_a_hit()
        {
            EvaluatesTo(
                Value.Void,
                DefF("test", Value.Void),
                First(
                    If(CallF("eq", V(1), V(1)), CallF("test")),
                    If(CallF("eq", V(1), V(1)), CallF("print", V(4))),
                    If(CallF("eq", V(4), V(4)), V(5))
                )
            );
            OutputMustBeEmpty();
        }

        [TestMethod]
        public void call_outer_fun_which_references_inner_fun()
        {
            MustFail(
                "Cannot get: inner",
                DefF("outer", CallF("inner")),
                DefF("call",
                    Cb(
                        DefF("inner", V(1)),
                        CallF("outer")
                    )
                ),
                CallF("call")
            );
        }

        [TestMethod]
        public void valuelist_tostring()
        {
            var vl = new ValueList(V(1), V(true), V("abc"));
            Assert.AreEqual("[1 true \"abc\"]", vl.ToString());
        }

        [TestMethod]
        public void valuelist_equals()
        {
            var vl1 = new ValueList(V(1), V(2));
            var vl2 = new ValueList(V(1), V(2));
            var vl3 = new ValueList(V(3), V(4));
            Assert.AreEqual(vl1.GetHashCode(), vl2.GetHashCode());
            Assert.AreEqual(vl1, vl2);
            Assert.AreNotEqual(vl2.GetHashCode(), vl3.GetHashCode());
            Assert.AreNotEqual(vl2, vl3);
        }

        [TestMethod]
        public void call_builtin_minus_with_invalid_parametertype()
        {
            MustFail(
                "Builtin function \"minus\" got invalid type in parameter. Type: System.String, ParameterName: i2. Supported types are: System.Int32",
                CallF("minus", V(1), V("wrong"))
            );
        }

        [TestMethod]
        public void call_builtin_head_with_list()
        {
            EvaluatesTo(
                "first",
                CallF("head", VL("first", "second", "third"))
            );
        }

        [TestMethod]
        public void call_builtin_head_with_list_with_one_element()
        {
            EvaluatesTo(
                "only",
                CallF("head", VL("only"))
            );
        }

        [TestMethod]
        public void call_builtin_head_with_list_with_no_element()
        {
            EvaluatesTo(
                Value.Void,
                CallF("head", VL())
            );
        }

        [TestMethod]
        public void call_builtin_head_with_single_element()
        {
            MustFail(
                "Builtin function \"head\" failed: Cannot get parameters as type SVLang.Basics.AST.ValueList",
                CallF("head", V("only"))
            );
        }

        [TestMethod]
        public void call_builtin_empty_with_list()
        {
            EvaluatesTo(
                false,
                CallF("empty", VL(1))
            );
        }

        [TestMethod]
        public void call_builtin_empty_with_empty_list()
        {
            EvaluatesTo(
                true,
                CallF("empty", VL())
            );
        }

        [TestMethod]
        public void call_builtin_empty_with_single_element()
        {
            EvaluatesTo(
                false,
                CallF("empty", V(1))
            );
        }

        [TestMethod]
        public void call_builtin_tail_with_list()
        {
            EvaluatesTo(
                VL(2, 3),
                CallF("tail", VL(1, 2, 3))
            );
        }

        [TestMethod]
        public void call_builtin_tail_with_single_element()
        {
            MustFail(
                "Builtin function \"tail\" failed: Cannot get parameters as type SVLang.Basics.AST.ValueList",
                CallF("tail", V(1))
            );
        }

        [TestMethod]
        public void call_builtin_tail_with_list_with_one_element()
        {
            MustFail(
                "Builtin function \"tail\" failed: List contains less than 2 elements.",
                CallF("tail", VL(1))
            );
        }

        [TestMethod]
        public void call_builtin_tail_with_empty_list()
        {
            MustFail(
                "Builtin function \"tail\" failed: List contains less than 2 elements.",
                CallF("tail", VL())
            );
        }

        [TestMethod]
        public void call_builtin_range_with_empty_range()
        {
            EvaluatesTo(
                VL(3),
                CallF("range", V(3), V(3))
            );
        }

        [TestMethod]
        public void call_builtin_range_with_negative_range()
        {
            MustFail(
                "Builtin function \"range\" failed: To parameter must be bigger than from parameter. From was 3, to was 2.",
                CallF("range", V(3), V(2))
            );
        }

        [TestMethod]
        public void call_builtin_range_with_negative_parameters()
        {
            MustFail(
                "Builtin function \"range\" failed: Parameters must be positive. From was -3, to was -2.",
                CallF("range", V(-3), V(-2))
            );
        }

        [TestMethod]
        public void call_builtin_count_with_empty_list()
        {
            EvaluatesTo(
                0,
                CallF("count", VL())
            );
        }

        [TestMethod]
        public void codeblock_with_no_content_returns_void()
        {
            EvaluatesTo(
                Value.Void,
                Cb()
            );
        }

        [TestMethod]
        public void codeblock_with_void_returns_void()
        {
            EvaluatesTo(
                Value.Void,
                Cb(Value.Void)
            );
        }

        [TestMethod]
        public void call_builtin_mod()
        {
            EvaluatesTo(
                V(3),
                CallF("mod", V(10), V(3))
            );
        }

        [TestMethod]
        public void call_builtin_has_tail_with_list()
        {
            EvaluatesTo(
                V(true),
                CallF("hastail", VL(1, 2))
            );
        }

        [TestMethod]
        public void call_builtin_has_tail_with_list_with_one_element()
        {
            EvaluatesTo(
                V(false),
                CallF("hastail", VL(1))
            );
        }

        [TestMethod]
        public void call_builtin_has_tail_with_empty_list()
        {
            EvaluatesTo(
                V(false),
                CallF("hastail", VL())
            );
        }

        [TestMethod]
        public void fizz_buzz()
        {
            EvaluatesTo(
                Value.Void,
                Cb(
                    DefF(
                        "fizzbuzz",
                        Cb(
                            DefF("num", Cb(CallF("head", CallF("numbers")))),
                            DefF("numIsMod", Cb(CallF("eq", V(0), CallF("mod", CallF("x"), CallF("num")))), "x"),
                            First(
                                If(CallF("numIsMod", V(15)), CallF("print", V("FizzBuzz"))),
                                If(CallF("numIsMod", V(3)), CallF("print", V("Fizz"))),
                                If(CallF("numIsMod", V(5)), CallF("print", V("Buzz"))),
                                If(V(true), CallF("print", CallF("num")))
                            ),
                            If(CallF("hastail", CallF("numbers")), CallF("fizzbuzz", CallF("tail", CallF("numbers"))))
                        ),
                        "numbers"
                    ),
                    CallF("fizzbuzz", CallF("range", V(1), V(15)))
                )
            );
            OutputMustBe(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"
            );
        }

        [TestMethod]
        public void ifline_can_return_something()
        {
            EvaluatesTo(
                V(1),
                First(
                    If(V(true), V(1))
                )
            );
        }

        [TestMethod]
        public void definefunction_can_have_first_as_body()
        {
            EvaluatesTo(
                V(1),
                DefF(
                    "fun",
                    First(
                        If(V(true), V(1))
                    )
                ),
                CallF("fun")
            );
        }

        [TestMethod]
        public void definefunction_can_have_ifline_as_body()
        {
            EvaluatesTo(
                V(1),
                DefF("fun", If(V(true), V(1))),
                CallF("fun")
            );
        }

        [TestMethod]
        public void callfunction_can_take_functionref_as_parameter()
        {
            EvaluatesTo(
                V(1),
                DefF("inner", CallF("x"), "x"),
                DefF("outer", CallF("fr", V(1)), "fr"),
                CallF("outer", FR("inner"))
            );
        }

        [TestMethod]
        public void call_builtin_evaluates_parameters_to_values()
        {
            EvaluatesTo(
                V(2),
                DefF("x", V(1)),
                CallF("plus", FR("x"), V(1))
            );
        }

        [TestMethod]
        public void two_functionrefs_to_same_function()
        {
            EvaluatesTo(
                V(2),
                DefF("x", V(1)),
                CallF("plus", FR("x"), FR("x"))
            );
        }

        [TestMethod]
        public void call_builtin_map_with_list_with_one_parameter()
        {
            EvaluatesTo(
                VL(3),
                DefF("add-one", CallF("plus", CallF("x"), V(1)), "x"),
                CallF("map", VL(2), FR("add-one"))
            );
        }

        #region Helpers

        private void EvaluatesTo(object expected, params Expr[] codelines)
        {
            if (expected is int || expected is bool || expected is string)
            {
                expected = V(expected);
            }

            if (expected is object[])
            {
                expected = VL(expected);
            }

            var result = Run(codelines);
            Assert.AreEqual(expected, result);
        }

        private void MustFail(string expectedMessage, params Expr[] codelines)
        {
            try
            {
                Run(codelines);
                Assert.Fail("Code emitted no exception.");
            }
            catch (Error.SvlException x)
            {
                Assert.AreEqual(expectedMessage, x.MessageBasic);
                Console.WriteLine(x);
            }
            catch (Exception x)
            {
                Assert.AreEqual(expectedMessage, x.Message);
                Console.WriteLine(x);
            }
        }

        private Expr Run(Expr[] codelines)
        {
            var cb = new Codeblock(codelines);
            PrintSection("Running", cb.ToString());
            var result = new Execution().Prepare().Run(cb);
            PrintSection("Return value", result.ToString());
            return result;
        }

        #endregion
    }

    // ReSharper restore InconsistentNaming
}

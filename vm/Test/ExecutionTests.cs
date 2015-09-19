using System;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
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
        public void dot_is_reserved_for_namespace_fails()
        {
            MustFail(
                "Function name cannot contain .: test.fun",
                DefF("test.fun", V(1))
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
        public void add_numbers()
        {
            EvaluatesTo(
                3,
                CallF("+", V(1), V(2))
            );
        }

        [TestMethod]
        public void if_not_called_returns_void()
        {
            EvaluatesTo(
                Value.Void,
                If(CallF("=", V(1), V(2)), V(1))
            );
        }

        [TestMethod]
        public void if_called_returns_action_return_value()
        {
            EvaluatesTo(
                3,
                If(CallF("=", V(1), V(1)), V(3))
            );
        }

        [TestMethod]
        public void subtract_numbers()
        {
            EvaluatesTo(
                1,
                CallF("-", V(3), V(2))
            );
        }

        [TestMethod]
        public void first_single()
        {
            EvaluatesTo(
                3,
                First(
                    If(CallF("=", V(1), V(1)), V(3))
                )
            );
        }

        [TestMethod]
        public void first_multiple()
        {
            EvaluatesTo(
                5,
                First(
                    If(CallF("=", V(1), V(2)), V(3)),
                    If(V(false), V(6)),
                    If(CallF("=", V(4), V(4)), V(5))
                )
            );
        }

        [TestMethod]
        public void first_nothing_is_hit()
        {
            EvaluatesTo(
                Value.Void,
                First(
                    If(CallF("=", V(1), V(2)), V(3)),
                    If(CallF("=", V(4), V(5)), V(6))
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
                    If(CallF("=", V(1), V(1)), CallF("test")),
                    If(CallF("=", V(1), V(1)), CallF("print", V(4))),
                    If(CallF("=", V(4), V(4)), V(5))
                )
            );
            OutputMustBe("");
        }

        [TestMethod, Ignore] // Fix later
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
        public void valuelist_eval()
        {
            EvaluatesTo(
                new object[] { 1, true, "abc" },
                VL(1, true, "abc")
            );
        }

        [TestMethod]
        public void call_builtin_minus_with_invalid_parametertype()
        {
            MustFail(
                "Builtin function \"-\" got invalid type in parameter. Type: System.String, ParameterName: i2. Supported types are: System.Int32",
                CallF("-", V(1), V("wrong"))
            );
        }

        #region Helpers

        private void EvaluatesTo(object expected, params Expr[] codelines)
        {
            var result = Run(codelines);

            if (expected is Value)
            {
                expected = (expected as Value).RawValue();
            }

            if (expected is object[])
            {
                Assert.IsTrue((expected as object[]).SequenceEqual((object[])result));
            }
            else
            {
                Assert.AreEqual(expected, result);
            }
        }

        private void MustFail(string expectedMessage, params Expr[] codelines)
        {
            try
            {
                Run(codelines);
                Assert.Fail("Code emitted no exception.");
            }
            catch (Exception x)
            {
                Assert.AreEqual(expectedMessage, x.Message);
                Console.WriteLine(x);
            }
        }

        private object Run(Expr[] codelines)
        {
            var cb = new Codeblock(codelines);
            PrintSection("Running", cb.ToString());
            var result = new Execution(cb).Run();
            PrintSection("Return value", result.ToString());
            return result;
        }

        #endregion
    }

    // ReSharper restore InconsistentNaming
}

﻿using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Basics.AST;

namespace SVLang.Test
{
    // ReSharper disable InconsistentNaming

    [TestClass]
    public class ExecutionTests : ExecutionTestBase
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
                "Compilation errors: * A local variable named 'name' is already defined in this scope",
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
                "Compilation errors: * A local variable named 'name' is already defined in this scope",
                DefF("name", CallF("a"), "a"),
                DefF("name", CallF("a"), "a"),
                CallF("name", V(123))
            );
        }

        [TestMethod]
        public void call_function_in_outer_scope_fails()
        {
            MustFail(
                "Compilation errors: * The name 'fun' does not exist in the current context",
                DefF(
                    "outer",
                    DefF("fun", V(123))
                ),
                CallF("outer"),
                CallF("fun")
            );
        }

        [TestMethod]
        public void cannot_overwrite_function_in_outer_scope()
        {
            MustFail(
                "Compilation errors: * A local variable named 'fun' cannot be declared in this scope because it would give a different meaning to 'fun', which is already used in a 'parent or current' scope to denote something else",
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
        public void can_call_function_in_inner_scope_many_times()
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
                "Compilation errors: * The name 'fun' does not exist in the current context",
                Cb(
                    DefF("fun", V(1))
                ),
                CallF("fun")
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
        public void first_works_when_no_return_values_is_used()
        {
            EvaluatesTo(
                V(14),
                First(
                    If(V(true), CallF("print", V("hello2")))
                ),
                V(14)
            );
            OutputMustBe("hello2");
        }

        [TestMethod]
        public void call_outer_fun_which_references_inner_fun()
        {
            MustFail(
                "Compilation errors: * The name 'inner' does not exist in the current context",
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
        public void fizz_buzz()
        {
            EvaluatesTo(
                Value.Void,
                Cb(
                    DefF(
                        "fizz-buzz",
                        Cb(
                            DefF("num", Cb(CallF("head", CallF("numbers")))),
                            DefF("numIsMod", Cb(CallF("eq", V(0), CallF("mod", CallF("x"), CallF("num")))), "x"),
                            First(
                                If(CallF("numIsMod", V(15)), CallF("print", V("FizzBuzz"))),
                                If(CallF("numIsMod", V(3)), CallF("print", V("Fizz"))),
                                If(CallF("numIsMod", V(5)), CallF("print", V("Buzz"))),
                                If(V(true), CallF("print", CallF("num")))
                            ),
                            If(CallF("hastail", CallF("numbers")), CallF("fizz-buzz", CallF("tail", CallF("numbers"))))
                        ),
                        "numbers"
                    ),
                    CallF("fizz-buzz", CallF("range", V(1), V(15)))
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
                If(V(true), V(1))
            );
        }

        [TestMethod]
        public void ifline_works_when_not_returning_anything()
        {
            EvaluatesTo(
                V(1),
                If(V(true), CallF("print", V("works!"))),
                V(1)
            );
            OutputMustBe("works!");
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
                DefF("outer", CallF("inr", V(1)), "inr"),
                CallF("outer", FR("inner"))
            );
        }

        [TestMethod]
        public void builtins_can_evaluate_functionref_to_value()
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
    }

    // ReSharper restore InconsistentNaming
}

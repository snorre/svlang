using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Core.AST;
using SVLang.Core.Evaluation;

namespace SVLang.Test
{
    // ReSharper disable InconsistentNaming

    [TestClass]
    public class LanguageTests : TestBase
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
        public void define_function_twice()
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
        public void define_function_with_parameter_twice()
        {
            MustFail(
                "Cannot re-define: name",
                DefF("name", CallF("a"), "a"),
                DefF("name", CallF("a"), "a"),
                CallF("name", V(123))
            );
        }

        [TestMethod]
        public void call_function_in_outer_scope()
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
        public void codeblock_exit_removes_inner_declarations()
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
        public void dot_is_reserved_for_namespace()
        {
            MustFail(
                "Function name cannot contain .: test.fun",
                DefF("test.fun", V(1))
            );
        }

        [TestMethod]
        public void can_call_builtin_print()
        {
            const string s = "Hello world!";
            EvaluatesTo(
                s,
                CallF("print", V(s))
            );
            OutputMustBe(s);
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
        public void can_import_namespace()
        {
            Assert.Inconclusive("TODO");
        }

        [TestMethod]
        public void sort_tests()
        {
            Assert.Inconclusive("TODO");
        }

        #region Helpers

        private void EvaluatesTo(object expected, params Expr[] codelines)
        {
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
            catch (Exception x)
            {
                Assert.AreEqual(expectedMessage, x.Message);
            }
        }

        private object Run(Expr[] codelines)
        {
            var cb = new Codeblock(codelines);
            return new Execution(cb).Run();
        }

        #endregion
    }

    // ReSharper restore InconsistentNaming
}

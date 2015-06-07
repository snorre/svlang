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

            valueIs(123, new Value(123));
            valueIs(-123, new Value(-123));

            valueIs("hei", new Value("hei"));
            valueIs(string.Empty, new Value(string.Empty));

            valueIs(123.45m, new Value(123.45m));
            valueIs(-123.45m, new Value(-123.45m));

            valueIs(true, new Value(true));
            valueIs(false, new Value(false));
        }
        
        [TestMethod]
        public void call_function()
        {
            EvaluatesTo(
                123,
                new DefineFunction("name", Val_123),
                new CallFunction("name")
            );
        }

        [TestMethod]
        public void call_function_twice()
        {
            EvaluatesTo(
                123,
                new DefineFunction("name", Val_123),
                new CallFunction("name"),
                new CallFunction("name")
            );
        }

        [TestMethod]
        public void define_function_twice()
        {
            MustFail(
                "Cannot re-define: name",
                new DefineFunction("name", Val_123),
                new DefineFunction("name", Val_456),
                new CallFunction("name")
            );
        }

        [TestMethod]
        public void call_function_with_parameter()
        {
            EvaluatesTo(
                123,
                new DefineFunction("name", new CallFunction("a"), "a"),
                new CallFunction("name", Val_123)
            );
        }

        [TestMethod]
        public void call_function_with_parameter_twice()
        {
            EvaluatesTo(
                456,
                new DefineFunction("name", new CallFunction("a"), "a"),
                new CallFunction("name", Val_123),
                new CallFunction("name", Val_456)
            );
        }

        [TestMethod]
        public void define_function_with_parameter_twice()
        {
            MustFail(
                "Cannot re-define: name",
                new DefineFunction("name", new CallFunction("a"), "a"),
                new DefineFunction("name", new CallFunction("a"), "a"),
                new CallFunction("name", Val_123)
            );
        }

        [TestMethod]
        public void call_function_in_outer_scope()
        {
            MustFail(
                "Cannot get: fun",
                new DefineFunction(
                    "outer",
                    new DefineFunction("fun", Val_123)
                ),
                new CallFunction("outer"),
                new CallFunction("fun")
            );
        }

        [TestMethod]
        public void cannot_overwrite_function_in_outer_scope()
        {
            MustFail(
                "Cannot re-define: fun",
                new DefineFunction("fun", Val_123),
                new DefineFunction(
                    "possibleOverwrite",
                    new DefineFunction("fun", Val_456)
                ),
                new CallFunction("possibleOverwrite"),
                new CallFunction("fun")
            );
        }

        [TestMethod]
        public void can_define_function_in_inner_scope_many_times()
        {
            EvaluatesTo(
                123,
                new DefineFunction(
                    "fun", 
                    new Codeblock(
                        new DefineFunction("inner", Val_123),
                        new CallFunction("inner")
                    )
                ),
                new CallFunction("fun"),
                new CallFunction("fun")
            );
        }

        [TestMethod]
        public void codeblock_exit_removes_inner_declarations()
        {
            MustFail(
                "Cannot get: fun",
                new Codeblock(
                    new DefineFunction("fun", Val_1)
                ),
                new CallFunction("fun")
            );
        }

        #region Helpers

        [TestInitialize]
        public void Reset()
        {
            Memory.Reset();
        }

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

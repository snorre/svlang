using System;
using Core;
using Core.AST;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Test
{
    // ReSharper disable InconsistentNaming

    [TestClass]
    public class LanguagTests
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
        public void set_symbol()
        {
            EvaluatesTo(
                123,
                new Symbol("name", Val_123)
            );
        }

        [TestMethod]
        public void set_symbol_twice()
        {
            EvaluatesTo(
                456,
                new Codeblock(
                    new Symbol("name", Val_123),
                    new Symbol("name", Val_456)
                )
            );
        }

        [TestMethod]
        public void reference_symbol()
        {
            EvaluatesTo(
                123,
                new Codeblock(
                    new Symbol("name", Val_123),
                    new Reference("name")
                )
            );
        }

        [TestMethod]
        public void call_function()
        {
            EvaluatesTo(
                123,
                new Codeblock(
                    new DefineFunction("name", Val_123),
                    new CallFunction("name")
                )
            );
        }

        [TestMethod]
        public void call_function_twice()
        {
            EvaluatesTo(
                123,
                new Codeblock(
                    new DefineFunction("name", Val_123),
                    new CallFunction("name"),
                    new CallFunction("name")
                )
            );
        }

        [TestMethod]
        public void call_function_with_parameter()
        {
            EvaluatesTo(
                123,
                new Codeblock(
                    new DefineFunction("name", new Reference("a"), "a"),
                    new CallFunction("name", Val_123)
                )
            );
        }

        [TestMethod]
        public void call_function_with_parameter_twice()
        {
            EvaluatesTo(
                456,
                new Codeblock(
                    new DefineFunction("name", new Reference("a"), "a"),
                    new CallFunction("name", Val_123),
                    new CallFunction("name", Val_456)
                )
            );
        }

        // TODO Scoping
        // TODO Dont overwrite in another scope
        // TODO Memory management?

        #region Helpers

        [TestInitialize]
        public void Reset()
        {
            Memory.Reset();
        }

        private static readonly Value Val_123 = new Value(123);
        private static readonly Value Val_456 = new Value(456);

        public void EvaluatesTo(object expected, Expr e)
        {
            var result = e.Eval().RawValue();
            Assert.AreEqual(expected, result);
        }

        #endregion
    }

    // ReSharper restore InconsistentNaming
}

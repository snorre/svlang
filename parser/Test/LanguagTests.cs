using System;
using Core;
using Core.AST;
using Core.Evaluation;
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
            EvaluatesTo(
                456,
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
                new DefineFunction("name", new ReferenceSymbol("a"), "a"),
                new CallFunction("name", Val_123)
            );
        }

        [TestMethod]
        public void call_function_with_parameter_twice()
        {
            EvaluatesTo(
                456,
                new DefineFunction("name", new ReferenceSymbol("a"), "a"),
                new CallFunction("name", Val_123),
                new CallFunction("name", Val_456)
            );
        }

        [TestMethod]
        public void define_function_with_parameter_twice()
        {
            EvaluatesTo(
                123,
                new DefineFunction("name", new ReferenceSymbol("a"), "a"),
                new DefineFunction("name", new ReferenceSymbol("a"), "a"),
                new CallFunction("name", Val_123)
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

        public void EvaluatesTo(object expected, params Expr[] codelines)
        {
            var cb = new Codeblock(codelines);
            var result = new Runner(cb).Run();
            Assert.AreEqual(expected, result);
        }

        #endregion
    }

    // ReSharper restore InconsistentNaming
}

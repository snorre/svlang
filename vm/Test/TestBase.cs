using System;
using System.IO;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Basics.AST;
using SVLang.Builtins.Sys;

namespace SVLang.Test
{
    // ReSharper disable InconsistentNaming
    [TestClass]
    public abstract class TestBase
    {
        protected StringWriter TestOutputStream;

        [TestInitialize]
        public void TestBase_Reset()
        {
            TestOutputStream = new StringWriter();
            Print.Output = TestOutputStream;
        }

        [TestCleanup]
        public void TestBase_PrintOutput()
        {
            PrintSection("Print output", TestOutputStream.ToString());
        }

        protected void PrintSection(string header, string content)
        {
            Console.WriteLine("=== " + header + " ===");
            Console.WriteLine(content);
            Console.WriteLine("");
            Console.WriteLine("");
        }

        protected void OutputMustBeEmpty()
        {
            Assert.IsTrue(TestOutputStream.ToString().Length == 0);
        }

        protected void OutputMustBe(params string[] expectedLines)
        {
            var allLines = string.Join(Environment.NewLine, expectedLines);

            string actual = TestOutputStream.ToString();
            Assert.AreEqual(allLines + Environment.NewLine, actual);
        }

        protected ValueSingle V(object rawValue)
        {
            return new ValueSingle(rawValue);
        }

        protected ValueList VL(params object[] rawValues)
        {
            return new ValueList(rawValues.Select(V).ToArray());
        }

        protected CallFunction CallF(string name, params Expr[] parameters)
        {
            return new CallFunction(name, parameters);
        }

        protected DefineFunction DefF(string name, Expr code, params string[] parameterNames)
        {
            return new DefineFunction(name, code, parameterNames);
        }

        protected Codeblock Cb(params Expr[] codelines)
        {
            return new Codeblock(codelines);
        }

        protected IfLine If(Expr condition, Expr action)
        {
            return new IfLine(condition, action);
        }

        protected First First(params IfLine[] ifLines)
        {
            return new First(ifLines);
        }

        protected FunctionRef FR(string name)
        {
            return new FunctionRef(name);
        }
    }
    // ReSharper restore InconsistentNaming
}

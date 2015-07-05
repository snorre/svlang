using System;
using System.IO;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Basics.AST;
using SVLang.Builtins.sys;
using SVLang.Core;

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
            Memory.Reset();
            TestOutputStream = new StringWriter();
            Print.Output = TestOutputStream;
        }

        [TestCleanup]
        public void TestBase_PrintOutput()
        {
            PrintSection("Output", TestOutputStream.ToString());
        }

        protected void PrintSection(string header, string content)
        {
            Console.WriteLine("=== " + header + " ========================");
            Console.WriteLine(content);
            Console.WriteLine("");
            Console.WriteLine("");
        }

        protected void OutputMustBe(string expected)
        {
            string actual = TestOutputStream.ToString();
            Assert.AreEqual(expected, actual);
        }

        protected Value V(object rawValue)
        {
            return new Value(rawValue);
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
    }
    // ReSharper restore InconsistentNaming
}

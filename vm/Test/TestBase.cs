using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.RegularExpressions;
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

        protected ValueList VL(params object[] values)
        {
            return 
                new ValueList(
                    values
                        .Select(v => 
                            v is ValueList || v is ValueSingle
                                ? (Value)v
                                : V(v)
                        )
                        .ToArray()
            );
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


        protected void AssertMessageIsEqualExceptFormatting(string expected, string actual)
        {
            Func<string, string> clean = str => Regex.Replace(str, @"\s+", " ").Trim();
            expected = clean(expected);
            actual = clean(actual);
            Assert.AreEqual(expected, actual);
        }
    }
    // ReSharper restore InconsistentNaming
}

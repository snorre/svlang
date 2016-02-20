using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Basics;
using SVLang.Basics.AST;
using SVLang.Core;

namespace SVLang.Test
{
    [TestClass]
    public abstract class ExecutionTestBase : TestBase
    {
        protected void EvaluatesTo(object expected, params Expr[] codelines)
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

        protected Expr Run(Expr[] codelines)
        {
            var cb = new Codeblock(codelines);
            PrintSection("Running", cb.ToString());
            var result = new Execution().Prepare().Run(cb);
            PrintSection("Return value", result?.ToString());
            return result;
        }

        protected void MustFail(string expectedMessage, params Expr[] codelines)
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
    }
}

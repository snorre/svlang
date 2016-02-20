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
            var exe = new Execution().Prepare();
            var code = new Codeblock(codelines);

            PrintSection("Running", code.ToString());

            var csCode = exe.GenerateCsCode(code);
            PrintSection("Generated cs source", csCode);

            var result = exe.Run(code);

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
                Assert.AreEqual(expectedMessage, x.MessageBasic.Trim());
                PrintSection("Errors building", x.ToString());
            }
            catch (Exception x)
            {
                Assert.AreEqual(expectedMessage, x.Message.Trim());
                Console.WriteLine(x);
            }
        }
    }
}

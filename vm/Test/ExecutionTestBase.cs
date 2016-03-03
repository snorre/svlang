using System;
using System.Linq;
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
            var onlyCodelineOrNull = codelines.Count() == 1 ? codelines.Single() : null;
            var code =
                onlyCodelineOrNull is Codeblock
                    ? onlyCodelineOrNull
                    : new Codeblock(codelines);

            PrintSection("Running", code.ToString());

            var exe = new Execution(code);
            var csCode = exe.GenerateCsCode();
            PrintSection("Generated cs source", csCode);

            var result = exe.Run();

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
                
                AssertMessageIsEqualExceptFormatting(expectedMessage, x.MessageBasic);
                PrintSection("Errors building", x.ToString());
            }
            catch (Exception x)
            {
                AssertMessageIsEqualExceptFormatting(expectedMessage, x.InnerException?.Message ?? x.Message);
                Console.WriteLine(x);
            }
        }
    }
}

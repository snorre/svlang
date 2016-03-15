using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class MinusTests : ExecutionTestBase
    {
        [TestMethod]
        public void call_builtin_minus()
        {
            EvaluatesTo(
                1,
                CallF("minus", V(3), V(2))
            );
        }

        [TestMethod]
        public void call_builtin_minus_with_many_parameters()
        {
            EvaluatesTo(
                -1,
                CallF("minus", V(8), V(4), V(3), V(2))
            );
        }

        [TestMethod]
        public void call_builtin_minus_with_invalid_parametertype()
        {
            MustFail(
                @"Builtin function 'minus' can only handle 'Int32'-type og functionref parameters. Got: System.String -",
                CallF("minus", V(1), V("wrong"))
            );
        }
    }
}

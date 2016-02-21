using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class Plus : ExecutionTestBase
    {
        [TestMethod]
        public void call_builtin_plus()
        {
            EvaluatesTo(
                V(3),
                CallF("plus", V(1), V(2))
            );
        }

        [TestMethod]
        public void call_builtin_plus_with_invalid_parameters()
        {
            MustFail(
                "Builtin function 'plus' can only handle 'Int32'-type og functionref parameters -",
                CallF("plus", V(1), V("a"))
            );
        }
    }
}

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
    }
}

using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class ModTests : ExecutionTestBase
    {
        [TestMethod]
        public void call_builtin_mod()
        {
            EvaluatesTo(
                V(3),
                CallF("mod", V(10), V(3))
            );
        }
    }
}

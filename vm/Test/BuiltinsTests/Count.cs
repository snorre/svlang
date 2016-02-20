using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class Count : ExecutionTestBase
    {
        [TestMethod]
        public void call_builtin_count_with_empty_list()
        {
            EvaluatesTo(
                0,
                CallF("count", VL())
            );
        }
    }
}

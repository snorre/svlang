using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class HasTail : ExecutionTestBase
    {
        [TestMethod]
        public void call_builtin_has_tail_with_list()
        {
            EvaluatesTo(
                V(true),
                CallF("hastail", VL(1, 2))
            );
        }

        [TestMethod]
        public void call_builtin_has_tail_with_list_with_one_element()
        {
            EvaluatesTo(
                V(false),
                CallF("hastail", VL(1))
            );
        }

        [TestMethod]
        public void call_builtin_has_tail_with_empty_list()
        {
            EvaluatesTo(
                V(false),
                CallF("hastail", VL())
            );
        }
    }
}

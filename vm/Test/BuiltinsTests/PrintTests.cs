using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class PrintTests : ExecutionTestBase
    {
        [TestMethod]
        public void call_builtin_print_with_list()
        {
            const string s = "1 True abc";
            EvaluatesTo(
                s,
                CallF("print", VL(1, true, "abc"))
            );
            OutputMustBe(s);
        }

        [TestMethod]
        public void call_builtin_print_with_single_value()
        {
            const string s = "hello";
            EvaluatesTo(
                s,
                CallF("print", V("hello"))
            );
            OutputMustBe(s);
        }
    }
}

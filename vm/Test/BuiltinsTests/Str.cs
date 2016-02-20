using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class Str : ExecutionTestBase
    {
        [TestMethod]
        public void call_builtin_str_with_list()
        {
            EvaluatesTo(
                "1TrueAbc",
                CallF("str", VL(1, true, "Abc"))
            );
        }

        [TestMethod]
        public void call_builtin_str_with_single_value_string()
        {
            EvaluatesTo(
                "hello",
                CallF("str", V("hello"))
            );
        }

        [TestMethod]
        public void call_builtin_str_with_single_value_bool()
        {
            EvaluatesTo(
                "True",
                CallF("str", V(true))
            );
        }

        [TestMethod]
        public void call_builtin_str_with_single_value_int()
        {
            EvaluatesTo(
                "3",
                CallF("str", V(3))
            );
        }
    }
}

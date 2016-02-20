using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Basics.AST;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class Head : ExecutionTestBase
    {
        [TestMethod]
        public void call_builtin_head_with_list()
        {
            EvaluatesTo(
                "first",
                CallF("head", VL("first", "second", "third"))
            );
        }

        [TestMethod]
        public void call_builtin_head_with_list_with_one_element()
        {
            EvaluatesTo(
                "only",
                CallF("head", VL("only"))
            );
        }

        [TestMethod]
        public void call_builtin_head_with_list_with_no_element()
        {
            EvaluatesTo(
                Value.Void,
                CallF("head", VL())
            );
        }

        [TestMethod]
        public void call_builtin_head_with_single_element()
        {
            MustFail(
                "Builtin function \"head\" failed: Cannot get parameters as type SVLang.Basics.AST.ValueList",
                CallF("head", V("only"))
            );
        }
    }
}

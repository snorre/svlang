using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Basics.AST;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class HeadTests : ExecutionTestBase
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
                "Builtin function 'head' can only handle 'List`1'-type og functionref parameters. Got: System.String -",
                CallF("head", V("only"))
            );
        }
    }
}

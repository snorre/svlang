using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class Range : ExecutionTestBase
    {
        [TestMethod]
        public void call_builtin_range()
        {
            EvaluatesTo(
                VL(2, 3, 4, 5),
                CallF("range", V(2), V(5))
            );
        }

        [TestMethod]
        public void call_builtin_range_with_empty_range()
        {
            EvaluatesTo(
                VL(3),
                CallF("range", V(3), V(3))
            );
        }

        [TestMethod]
        public void call_builtin_range_with_negative_range()
        {
            MustFail(
                "Builtin function 'range' failed. First parameter must be lower than second. Got from=3, to=2 -",
                CallF("range", V(3), V(2))
            );
        }

        [TestMethod]
        public void call_builtin_range_with_negative_parameters()
        {
            EvaluatesTo(
                VL(-3, -2, -1),
                CallF("range", V(-3), V(-1))
            );
        }
    }
}

using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class Range : ExecutionTestBase
    {
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
                "Builtin function \"range\" failed: To parameter must be bigger than from parameter. From was 3, to was 2.",
                CallF("range", V(3), V(2))
            );
        }

        [TestMethod]
        public void call_builtin_range_with_negative_parameters()
        {
            MustFail(
                "Builtin function \"range\" failed: Parameters must be positive. From was -3, to was -2.",
                CallF("range", V(-3), V(-2))
            );
        }
    }
}

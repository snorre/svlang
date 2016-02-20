using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class Minus : ExecutionTestBase
    {
        [TestMethod]
        public void call_builtin_minus()
        {
            EvaluatesTo(
                1,
                CallF("minus", V(3), V(2))
            );
        }

        [TestMethod]
        public void call_builtin_minus_with_invalid_parametertype()
        {
            MustFail(
                "Builtin function \"minus\" got invalid type in parameter. Type: System.String, ParameterName: i2. Supported types are: System.Int32",
                CallF("minus", V(1), V("wrong"))
            );
        }
    }
}

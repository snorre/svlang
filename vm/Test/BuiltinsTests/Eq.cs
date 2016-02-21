using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Basics.AST;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class Eq : ExecutionTestBase
    {
        [TestMethod]
        public void ints_are_equal()
        {
            AreEqual(2, 2);
            AreEqual(0, 0);
            AreEqual(-1, -1);
        }

        [TestMethod]
        public void ints_are_not_equal()
        {
            AreNotEqual(2, 1);
            AreNotEqual(0, 1);
            AreNotEqual(-1, 1);
        }

        [TestMethod]
        public void strings_are_equal()
        {
            AreEqual("", "");
            AreEqual("a", "a");
            AreEqual("1", "1");
            AreEqual("a1b", "a1b");
        }

        [TestMethod]
        public void string_are_not_equal()
        {
            AreNotEqual("", "1");
            AreNotEqual("1", "");
            AreNotEqual("a", "1");
            AreNotEqual("a1b", "A1B");
        }

        [TestMethod]
        public void bool_are_equal()
        {
            AreEqual(true, true);
            AreEqual(false, false);
        }

        [TestMethod]
        public void bool_are_not_equal()
        {
            AreNotEqual(true, false);
            AreNotEqual(false, true);
        }

        [TestMethod]
        public void void_is_equal()
        {
            AreEqual(Value.Void, Value.Void);
        }

        [TestMethod]
        public void cross_types_are_not_equal()
        {
            AreNotEqual(Value.Void, true);
            AreNotEqual(Value.Void, false);
            AreNotEqual(Value.Void, 1);
            AreNotEqual(Value.Void, "a");
            AreNotEqual(Value.Void, "");

            AreNotEqual("", true);
            AreNotEqual("", false);
            AreNotEqual("", 0);
            AreNotEqual("", -1);
            AreNotEqual("", 1);

            AreNotEqual("a", true);
            AreNotEqual("a", false);
            AreNotEqual("a", 0);
            AreNotEqual("a", -1);
            AreNotEqual("a", 1);

            AreNotEqual(0, true);
            AreNotEqual(0, false);
            AreNotEqual(0, "0");
            AreNotEqual(0, "-1");
            AreNotEqual(0, "1");

            AreNotEqual(1, true);
            AreNotEqual(1, false);
            AreNotEqual(1, "0");
            AreNotEqual(1, "-1");
            AreNotEqual(1, "1");

            AreNotEqual(-1, true);
            AreNotEqual(-1, false);
            AreNotEqual(-1, "0");
            AreNotEqual(-1, "-1");
            AreNotEqual(-1, "1");

            AreNotEqual(true, "true");
            AreNotEqual(true, "false");

            AreNotEqual(false, "true");
            AreNotEqual(false, "false");

            // Should there be more?
        }

        #region Helpers

        private void AreEqual(object o1, object o2)
        {
            Check(true, o1, o2);
        }

        private void AreNotEqual(object o1, object o2)
        {
            Check(false, o1, o2);
        }

        private void Check(bool expectedEquality, object o1, object o2)
        {
            Func<object, Expr> toExpr = o => o is Expr ? (Expr)o : V(o);
            EvaluatesTo(
                V(expectedEquality),
                CallF("eq", toExpr(o1), toExpr(o2))
            );
        }

        #endregion
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class Tail : ExecutionTestBase
    {
        [TestMethod]
        public void call_builtin_tail_with_list()
        {
            EvaluatesTo(
                VL(2, 3),
                CallF("tail", VL(1, 2, 3))
            );
        }

        [TestMethod]
        public void call_builtin_tail_with_single_element()
        {
            MustFail(
                "Builtin function \"tail\" failed: Cannot get parameters as type SVLang.Basics.AST.ValueList",
                CallF("tail", V(1))
            );
        }

        [TestMethod]
        public void call_builtin_tail_with_list_with_one_element()
        {
            MustFail(
                "Builtin function \"tail\" failed: List contains less than 2 elements.",
                CallF("tail", VL(1))
            );
        }

        [TestMethod]
        public void call_builtin_tail_with_empty_list()
        {
            MustFail(
                "Builtin function \"tail\" failed: List contains less than 2 elements.",
                CallF("tail", VL())
            );
        }
    }
}

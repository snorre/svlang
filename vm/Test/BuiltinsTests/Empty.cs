using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class Empty : ExecutionTestBase
    {
        [TestMethod]
        public void call_builtin_empty_with_list()
        {
            EvaluatesTo(
                false,
                CallF("empty", VL(1))
            );
        }

        [TestMethod]
        public void call_builtin_empty_with_empty_list()
        {
            EvaluatesTo(
                true,
                CallF("empty", VL())
            );
        }

        [TestMethod]
        public void call_builtin_empty_with_single_element()
        {
            EvaluatesTo(
                false,
                CallF("empty", V(1))
            );
        }
    }
}

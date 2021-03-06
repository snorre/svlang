﻿using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SVLang.Test.BuiltinsTests
{
    [TestClass]
    public class MapTests : ExecutionTestBase
    {
        [TestMethod]
        public void call_builtin_map_with_list_with_one_parameter()
        {
            EvaluatesTo(
                VL(3),
                DefF("add-one", CallF("plus", CallF("x"), V(1)), "x"),
                CallF("map", FR("add-one"), VL(2))
            );
        }
    }
}

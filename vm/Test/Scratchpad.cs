//using System;
//using System.Collections.Generic;
//using System.Linq;
//using Microsoft.VisualStudio.TestTools.UnitTesting;

//namespace SvlCompilation
//{
//    public static class svlang_constants_adad32cb_ec4a_41a4_843f_a2ec80f760fd
//    {
//        public static readonly SVLang.Basics.AST.Value Void = SVLang.Basics.AST.Value.Void;
//    }

//    [TestClass]
//    public class SvlEntryType
//    {
//        public object SvlEntryMethod()
//        {
//            {
//                Func<dynamic, dynamic> add_one = null; add_one = (x) => {
//                    return new SVLang.Builtins.Sys.Plus().Call((Func<dynamic>)(() => x()), (Func<dynamic>)(() => 1));
//                };

//                Func<dynamic, dynamic, dynamic, dynamic> test = null; test = (p1, p2, p3) => {
//                    return null;
//                };

//                return Call((Func<dynamic>)(() => new List<dynamic> { 2 }), test, add_one);
//            }
//        }
//        public object Call(params object[] parameterFuncs)
//        {
//            foreach (var pf in parameterFuncs)
//            {
//                var t = pf.GetType();
//                var numParams = t.GenericTypeArguments.Length;
//                Console.WriteLine($"params: {numParams}, type: {t}");
//            }

//            return null;
//        }

//        [TestMethod]
//        public void jalla()
//        {
//            SvlEntryMethod();
//        }
//    }
//}
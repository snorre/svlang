//using System;
//using Microsoft.VisualStudio.TestTools.UnitTesting;

//namespace SvlCompilation
//{

//    public static class ____Svlang____internals____LanguageConstants
//    {
//        public static readonly SVLang.Basics.AST.Value Void = SVLang.Basics.AST.Value.Void;
//    }
//    [TestClass]
//    public class SvlEntryType
//    {
//        [TestMethod]
//        public void SvlEntryMethod()
//        {
//            {
//                Func<dynamic, dynamic> fun1 = (p) => {
//                    return p();
//                };
//                Func<dynamic, dynamic> fun2 = (p) => {
//                    return fun1((Func<dynamic>)(() => p()));
//                };
//                var r = fun2((Func<dynamic>)(() => 123));
//                Console.WriteLine(r);
//            }
//        }
//    }
//}
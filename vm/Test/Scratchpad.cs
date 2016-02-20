//using System;
//using SVLang.Builtins.Sys;
//namespace SvlCompilation
//{
//    public class SvlEntryType
//    {
//        public object SvlEntryMethod()
//        {
//            {
//                Func<Func<object>, object> fun1 = (p) => {
//                    return p(); ;
//                };
//                Func<Func<object>, object> fun2 = (p) => {
//                return fun1(() => p();); ;
//            };
//            return fun2(() => 123); ;
//        }
//    }
//}
//}
//using System;
//using SVLang.Builtins.Sys;
//namespace SvlCompilation
//{
//    public class SvlEntryType
//    {
//        public object SvlEntryMethod()
//        {
//            {
//                Func<object> fun = () => {
//                    return 123;
//                };
//                Func<object> possibleOverwrite = () => {
//                    Func<object> fun2 = () => {
//                        return 456;
//                    };
//                    return fun;
//                };
//                possibleOverwrite();
//                return fun();
//            }
//        }
//    }
//}
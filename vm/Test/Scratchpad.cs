//using System;
//using System.Collections.Generic;
//namespace SvlCompilation
//{

//    public static class svlang_internal_b64e2321_7aea_466e_9752_0ed1d4db1337
//    {
//        public static readonly SVLang.Basics.AST.Value Void = SVLang.Basics.AST.Value.Void;
//    }
//    public class SvlEntryType
//    {
//        public object SvlEntryMethod()
//        {
//            {
//                Func < dynamic,dynamic > = null;
//                fizzbuzz = (numbers) => {
//                    Func < dynamic > = null; num = () => {
//                        return new SVLang.Builtins.Sys.Head().Call((Func<dynamic>)(() => numbers()));
//                    };
//                    Func < dynamic,dynamic > = null; numIsMod = (x) => {
//                        return new SVLang.Builtins.Sys.Eq().Call((Func<dynamic>)(() => 0), (Func<dynamic>)(() => new SVLang.Builtins.Sys.Mod().Call((Func<dynamic>)(() => x()), (Func<dynamic>)(() => num()))));
//                    };
//                    var svlang_internal_71393906_12e1_454c_bc1c_b96c289ce47d = (((bool)numIsMod((Func<dynamic>)(() => 15))) ? new SVLang.Builtins.Sys.Print().Call((Func<dynamic>)(() => "FizzBuzz")) :
//                    (((bool)numIsMod((Func<dynamic>)(() => 3))) ? new SVLang.Builtins.Sys.Print().Call((Func<dynamic>)(() => "Fizz")) :
//                    (((bool)numIsMod((Func<dynamic>)(() => 5))) ? new SVLang.Builtins.Sys.Print().Call((Func<dynamic>)(() => "Buzz")) :
//                    (((bool)true) ? new SVLang.Builtins.Sys.Print().Call((Func<dynamic>)(() => num())) :
//                    (object)svlang_internal_b64e2321_7aea_466e_9752_0ed1d4db1337.Void))));
//                    return ((bool)new SVLang.Builtins.Sys.HasTail().Call((Func<dynamic>)(() => numbers()))) ? fizzbuzz((Func<dynamic>)(() => new SVLang.Builtins.Sys.Tail().Call((Func<dynamic>)(() => numbers())))) : (object)svlang_internal_b64e2321_7aea_466e_9752_0ed1d4db1337.Void;
//                };
//                return fizzbuzz((Func<dynamic>)(() => new SVLang.Builtins.Sys.Range().Call((Func<dynamic>)(() => 1), (Func<dynamic>)(() => 15))));
//            }
//        }
//    }
//}
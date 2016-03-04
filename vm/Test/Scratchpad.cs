using System;
using System.Collections.Generic;

namespace SvlCompilation
{
    public static class svlang_constants_2c98effc_9eb9_41fe_a13f_75e12923a8c5
    {
        public static readonly SVLang.Basics.AST.Value Void = SVLang.Basics.AST.Value.Void;
    }

    public class SvlEntryType
    {
        public object SvlEntryMethod()
        {
            {
                Func<dynamic, dynamic> fizzbuzz = null; fizzbuzz = (numbers) => {
                    Func<dynamic> num = null; num = () => {
                        return new SVLang.Builtins.Sys.Head().Call((Func<dynamic>)(() => numbers()));
                    };
                    Func<dynamic, dynamic> numIsMod = null; numIsMod = (x) => {
                        return new SVLang.Builtins.Sys.Eq().Call((Func<dynamic>)(() => 0), (Func<dynamic>)(() => new SVLang.Builtins.Sys.Mod().Call((Func<dynamic>)(() => x()), (Func<dynamic>)(() => num()))));
                    };
                    var svlang_unused_c7b697b1_aade_40a6_b8c4_520c51972ded = (((bool)numIsMod((Func<dynamic>)(() => 15))) ? new SVLang.Builtins.Sys.Print().Call((Func<dynamic>)(() => "FizzBuzz")) :
                    (((bool)numIsMod((Func<dynamic>)(() => 3))) ? new SVLang.Builtins.Sys.Print().Call((Func<dynamic>)(() => "Fizz")) :
                    (((bool)numIsMod((Func<dynamic>)(() => 5))) ? new SVLang.Builtins.Sys.Print().Call((Func<dynamic>)(() => "Buzz")) :
                    (((bool)true) ? new SVLang.Builtins.Sys.Print().Call((Func<dynamic>)(() => num())) :
                    (object)svlang_constants_2c98effc_9eb9_41fe_a13f_75e12923a8c5.Void))));
                    return ((bool)new SVLang.Builtins.Sys.HasTail().Call((Func<dynamic>)(() => numbers()))) ? fizzbuzz((Func<dynamic>)(() => new SVLang.Builtins.Sys.Tail().Call((Func<dynamic>)(() => numbers())))) : (object)svlang_constants_2c98effc_9eb9_41fe_a13f_75e12923a8c5.Void;
                };
                return fizzbuzz((Func<dynamic>)(() => new SVLang.Builtins.Sys.Range().Call((Func<dynamic>)(() => 1), (Func<dynamic>)(() => 15))));
            }
        }
    }
}
using System;
using System.Collections.Generic;

namespace SvlCompilation
{
    public static class svlang_constants_39720491_f6ac_41c3_824d_7b9592286b8b
    {
        public static readonly SVLang.Basics.AST.Value Void = SVLang.Basics.AST.Value.Void;
    }

    public class SvlEntryType
    {
        public object SvlEntryMethod()
        {
            {
                Func<dynamic, dynamic> add_one = null; add_one = (x) =>
                {
                    return new SVLang.Builtins.Sys.Plus().Call((Func<dynamic>)(() => x()), (Func<dynamic>)(() => 1));
                };
                return new SVLang.Builtins.Sys.Map().Call((Func<dynamic>)(() => new List<dynamic> { 2 }), () => add_one);
            }
        }
    }
}
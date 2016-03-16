using System;
using System.Collections.Generic;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Map : BuiltinBase
    {
        public override string Name => "map";

        public override object Call(params object[] parameterFuncs)
        {
            var func = ValidateAndGetParameterInPositionAs<Func<dynamic, dynamic>>(parameterFuncs, 0);
            var list = ValidateAndGetParameterInPositionAs<List<object>>(parameterFuncs, 1);

            return list.ConvertAll(x => func(x));
        }
    }
}

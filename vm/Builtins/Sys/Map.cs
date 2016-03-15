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
            if (parameterFuncs.Length != 2) // TODO Move to base
            {
                throw Error.Panic($"Builtin function '{Name}' must have 2 parameter. Got " + parameterFuncs.Length);
            }

            var func = parameterFuncs[0] as Func<dynamic, dynamic>;
            var list = parameterFuncs[1] as List<object>;

            if (func == null)
            {
                throw Error.Panic($"Builtin function '{Name}' got an invalid first parameter. Only a function with one parameter is valid. Got: {parameterFuncs[0].GetType()}");
            }

            if (list == null)
            {
                throw Error.Panic($"Builtin function '{Name}' got an invalid second parameter. Only a list is valid. Got: {parameterFuncs[1].GetType()}.");
            }

            return list.ConvertAll(x => func(x));
        }
    }
}

using System;
using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class Head : BuiltinBase
    {
        public override string Name => "head";

        public override object Call(params Func<dynamic>[] parameterFuncs)
        {
            if (parameterFuncs.Length != 1)
            {
                throw Error.Panic("Builtin function '{Name}' can only take 1 parameter.");
            }

            var list = ReduceToValues(parameterFuncs.Single());
            return list.FirstOrDefault() ?? Value.Void;
        }
    }
}

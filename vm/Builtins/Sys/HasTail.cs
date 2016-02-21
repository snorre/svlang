using System;
using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class HasTail : BuiltinBase
    {
        public override string Name => "hastail";

        public override object Call(params Func<dynamic>[] parameterFuncs)
        {
            return (int)new Count().Call(parameterFuncs) > 1;
        }
    }
}

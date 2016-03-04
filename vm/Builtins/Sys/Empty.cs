using SVLang.Basics;

namespace SVLang.Builtins.Sys
{
    public class Empty : BuiltinBase
    {
        public override string Name => "empty";

        public override object Call(params object[] parameterFuncs)
        {
            return (int)new Count().Call(parameterFuncs) == 0;
        }
    }
}

using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class HasTail : BuiltinFunction
    {
        public HasTail() : base("hastail", "list")
        {
        }

        protected override Value ExecuteImpl(Value[] parameterValues)
        {
            var list = GetSingleParameterAsValueList(parameterValues);
            return new ValueSingle(list.Values.Length >= 2);
        }
    }
}

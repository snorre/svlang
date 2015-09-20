using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class Count : BuiltinFunction
    {
        public Count() : base("count", "list")
        {
        }

        protected override Value ExecuteImpl(Value[] parameterValues)
        {
            var list = GetSingleParameterAsValueList(parameterValues);
            return new ValueSingle(list.Values.Length);
        }
    }
}

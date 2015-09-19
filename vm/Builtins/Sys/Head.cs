using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class Head : BuiltinFunction
    {
        public Head() : base("head", "list")
        {
        }

        protected override Value ExecuteImpl(Value[] parameterValues)
        {
            var list = GetSingleParameterAsValueList(parameterValues);
            return list.Values.FirstOrDefault() ?? Value.Void;
        }
    }
}

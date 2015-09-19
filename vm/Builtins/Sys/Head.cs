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
            var pv = parameterValues.Single();
            if (pv is ValueList)
            {
                return ((ValueList)pv).Values.FirstOrDefault() ?? Value.Void;
            }

            return pv;
        }
    }
}

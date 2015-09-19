using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.sys
{
    public class Str : BuiltinFunction
    {
        public Str() : base("str", "values")
        {
        }

        protected override Value ExecuteImpl(Value[] parameterValues)
        {
            var pv = parameterValues.Single();
            string str;
            if (pv is ValueList)
            {
                str = string.Join(string.Empty, (pv as ValueList).Values.Select(v => v.RawValue()));
            }
            else
            {
                str = pv.RawValue().ToString();
            }
            return new ValueSingle(str);
        }
    }
}

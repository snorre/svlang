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

        protected override Expr ExecuteImpl(Expr[] parameterValues)
        {
            var pv = GetSingleParameter(parameterValues);
            string str;
            if (pv is ValueList)
            {
                str = string.Join(string.Empty, (pv as ValueList).Values.Select(v => v.RawValue()));
            }
            else if (pv is ValueSingle)
            {
                str = (pv as ValueSingle).RawValue().ToString();
            }
            else
            {
                throw Error.Panic("Takes only values as parameter.");
            }

            return new ValueSingle(str);
        }
    }
}

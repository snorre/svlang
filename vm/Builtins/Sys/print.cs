using System;
using System.IO;
using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.sys
{
    public class Print : BuiltinFunction
    {
        public static TextWriter Output = Console.Out;

        public Print() : base("print", "values")
        {
        }
        
        protected override Expr ExecuteImpl(Expr[] parameterValues)
        {
            var pv = GetSingleParameter(parameterValues);
            string str;
            if (pv is ValueList)
            {
                str = string.Join(" ", (pv as ValueList).Values.Select(v => v.RawValue()));
            }
            else if (pv is ValueSingle)
            {
                str = (pv as ValueSingle).RawValue().ToString();
            }
            else
            {
                throw Error.Panic("Takes only values as parameter.");
            }

            Output.Write(str + Environment.NewLine);
            return new ValueSingle(str);
        }
    }
}

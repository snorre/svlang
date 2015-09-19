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
        
        protected override Value ExecuteImpl(Value[] parameterValues)
        {
            var pv = GetSingleParameter(parameterValues);
            string str;
            if (pv is ValueList)
            {
                str = string.Join(" ", (pv as ValueList).Values.Select(v => v.RawValue()));
            }
            else
            {
                str = pv.RawValue().ToString();
            }

            Output.Write(str);
            return new ValueSingle(str);
        }
    }
}

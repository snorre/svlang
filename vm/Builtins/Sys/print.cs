using System;
using System.IO;
using System.Linq;
using SVLang.AST;

namespace SVLang.Builtins.sys
{
    public class Print : BuiltinFunction
    {
        public static TextWriter Output = Console.Out;

        public Print() : base("print", "message")
        {
        }
        
        public override Value Execute(Value[] parameterValues)
        {
            string s = string.Join(" ", parameterValues.Select(pv => pv.RawValue()));
            Output.Write(s);
            return new Value(s);
        }
    }
}

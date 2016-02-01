using System;
using System.IO;

namespace SVLang.Builtins.sys
{
    public class Print
    {
        public static TextWriter Output = Console.Out;

        protected object ExecuteImpl(object[] parameterValues)
        {
            var str = string.Join(" ", parameterValues);
            Output.Write(str + Environment.NewLine);
            return str;
        }
    }
}

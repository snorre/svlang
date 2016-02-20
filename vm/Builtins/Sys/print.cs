﻿using System;
using System.IO;
using SVLang.Basics;

namespace SVLang.Builtins.sys
{
    public class Print : IBuiltIn
    {
        public static TextWriter Output = Console.Out;

        public string Name => "print";

        public object Call(params object[] parameterValues)
        {
            var str = string.Join(" ", parameterValues);
            Output.Write(str + Environment.NewLine);
            return str;
        }
    }
}

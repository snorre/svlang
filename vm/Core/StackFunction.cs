using System;
using SVLang.Basics.AST;

namespace SVLang.Core
{
    public class StackFunction
    {
        public readonly string Name;
        public readonly string[] ParameterNames;
        public readonly Expr Code;
        public readonly Guid CreatedInMark;

        public StackFunction(Guid createdInMark)
        {
            CreatedInMark = createdInMark;
        }

        public StackFunction(string name, string[] parameterNames, Expr code, Guid createdInMark)
            : this(createdInMark)
        {
            Name = name;
            ParameterNames = parameterNames;
            Code = code;
        }
    }
}

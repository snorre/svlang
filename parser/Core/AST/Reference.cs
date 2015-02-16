using System;

namespace Core.AST
{
    public class Reference : Expr
    {
        private readonly string _symbolName;

        public Reference(string symbolName)
        {
            _symbolName = symbolName;
        }

        public override Value Eval()
        {
            return Memory.GetValue(_symbolName);
        }
    }
}

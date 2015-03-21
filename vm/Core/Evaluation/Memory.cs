using System.Collections.Generic;
using SVLang.Core.AST;

namespace SVLang.Core.Evaluation
{
    public static class Memory
    {
        private static Dictionary<string, Expr> _dict;

        static Memory()
        {
            Reset();
        }
        
        public static void AddExpr(string name, Expr value)
        {
            if (_dict.ContainsKey(name))
                _dict[name] = value;
            else
                _dict.Add(name, value);
        }

        public static Expr GetExpr(string name)
        {
            return _dict[name];
        }

        public static void Reset()
        {
            _dict = new Dictionary<string, Expr>();
        }
    }
}

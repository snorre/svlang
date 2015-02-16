using System.Collections.Generic;
using Core.AST;

namespace Core
{
    public static class Memory
    {
        private static Dictionary<string, Value> _dictValues;
        private static Dictionary<string, Expr> _dictExprs;

        static Memory()
        {
            Reset();
        }

        public static void AddValue(string name, Value value)
        {
            if (_dictValues.ContainsKey(name))
                _dictValues[name] = value;
            else
                _dictValues.Add(name, value);
        }

        public static void AddExpr(string name, Expr value)
        {
            if (_dictExprs.ContainsKey(name))
                _dictExprs[name] = value;
            else
                _dictExprs.Add(name, value);
        }

        public static Expr GetExpr(string name)
        {
            return _dictExprs[name];
        }

        public static void Reset()
        {
            _dictValues = new Dictionary<string, Value>();
            _dictExprs = new Dictionary<string, Expr>();
        }
    }
}

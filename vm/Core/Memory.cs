using System;
using System.Collections.Generic;
using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Core
{
    public static class Memory
    {
        private static Stack<Entry> _stack;
        private static Guid _activeMark;

        static Memory()
        {
            Reset();
        }
        
        public static void AddExpr(string name, Expr value)
        {
            var entryInSameScope = _stack.SingleOrDefault(e => e.Name == name && e.CreatedInMark == _activeMark);
            if (entryInSameScope != null)
            {
                throw Error.Panic("Cannot re-define: " + name, value);
            }

            _stack.Push(
                new Entry
                {
                    Name = name,
                    Expr = value,
                    CreatedInMark = _activeMark
                }
            );
        }

        public static Expr GetExpr(string name)
        {
            try
            {
                return _stack.First(e => e.Name == name).Expr;
            }
            catch (Exception e)
            {
                throw Error.Panic("Cannot get: " + name, innerException: e);
            }
        }

        public static void Reset()
        {
            _stack = new Stack<Entry>();
            _activeMark = Guid.Empty;
        }

        public static void Mark()
        {
            var m = Guid.NewGuid();
            _activeMark = m;
            _stack.Push(new Entry { CreatedInMark = m });
        }

        public static void RollbackMark()
        {
            while (_stack.Any() && _stack.Peek().CreatedInMark == _activeMark)
            {
                _stack.Pop();
            }

            _activeMark = 
                _stack.Any()
                    ? _stack.Peek().CreatedInMark
                    : Guid.Empty;
        }

        private class Entry
        {
            public string Name { get; set; }
            public Expr Expr { get; set; }
            public Guid CreatedInMark { get; set; }
        }
    }
}

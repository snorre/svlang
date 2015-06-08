using System;
using System.Collections.Generic;
using System.Linq;
using SVLang.Core.AST;

namespace SVLang.Core.Evaluation
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
                throw new InvalidOperationException("Cannot re-define: " + name);
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

        // TODO change from Expr to something more concrete? Maybe a Function class instead of putting DefineFunction on the stack..
        public static Expr GetExpr(string name)
        {
            try
            {
                return _stack.First(e => e.Name == name).Expr;
            }
            catch (Exception e)
            {
                throw new InvalidOperationException("Cannot get: " + name, e);
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
            _stack.Push(new Entry { CreatedInMark = m }); // TODO Something cleaner.. Every mark must be represented in stack
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

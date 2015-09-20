using System;
using System.Collections.Generic;
using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Core
{
    public static class Memory
    {
        private static Stack<StackFunction> _stack;
        private static Guid _activeMark;

        static Memory()
        {
            Reset();
        }
        
        public static void AddExpr(string name, string[] parameterNames, Expr code)
        {
            var entryInSameScope = _stack.SingleOrDefault(e => e.Name == name && e.CreatedInMark == _activeMark);
            if (entryInSameScope != null)
            {
                throw Error.Panic("Cannot re-define: " + name, code);
            }

            _stack.Push(
                new StackFunction(
                    name: name,
                    parameterNames: parameterNames,
                    code: code,
                    createdInMark: _activeMark
                )
            );
        }

        public static StackFunction GetExpr(string name)
        {
            try
            {
                return _stack.First(e => e.Name == name);
            }
            catch (Exception e)
            {
                throw Error.Panic("Cannot get: " + name, innerException: e);
            }
        }

        public static void Reset()
        {
            _stack = new Stack<StackFunction>();
            _activeMark = Guid.Empty;
        }

        public static void Mark()
        {
            var m = Guid.NewGuid();
            _activeMark = m;
            _stack.Push(new StackFunction(m));
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
    }
}

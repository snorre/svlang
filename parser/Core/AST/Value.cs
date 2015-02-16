﻿namespace Core.AST
{
    public class Value : Expr
    {
        private readonly object _rawValue;

        public Value(object rawValue)
        {
            _rawValue = rawValue;
        }

        public object RawValue()
        {
            return _rawValue;
        }

        public override int GetHashCode()
        {
            return _rawValue.GetHashCode();
        }

        public override bool Equals(object obj)
        {
            return
                obj is Value &&
                (obj as Value)._rawValue.Equals(_rawValue);
        }
    }
}

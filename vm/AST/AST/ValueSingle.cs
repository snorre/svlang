namespace SVLang.Basics.AST
{
    public class ValueSingle : Value
    {
        private readonly object _rawValue;

        public ValueSingle(object rawValue)
        {
            if (rawValue is Expr)
            {
                throw Error.Panic($"Value cannot be constructed with AST raw value: {rawValue.GetType()}");
            }

            _rawValue = rawValue;
        }

        public override object RawValue()
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
                obj is ValueSingle &&
                ((ValueSingle)obj)._rawValue.Equals(_rawValue);
        }

        public override string ToString(string indent)
        {
            return
                indent +
                (_rawValue is string
                    ? "\"" + _rawValue + "\""
                    : _rawValue.ToString().ToLower()
                );
        }

        public override bool IsTrue()
        {
            if (_rawValue is bool)
            {
                return (bool)_rawValue;
            }

            throw Error.Panic("Only booleans is supported in IsTrue() method.", this);
        }

        public override Expr[] GetChildExprs()
        {
            return new Expr[0];
        }
    }
}

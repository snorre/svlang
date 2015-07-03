namespace SVLang.AST
{
    public class Value : Expr
    {
        public static readonly Value Void = new Value(new RawVoid());

        public class RawVoid
        {
        }

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

        public override string ToString(string indent)
        {
            return
                indent +
                (_rawValue is string
                    ? "\"" + _rawValue + "\""
                    : _rawValue.ToString()
                );
            //return "Value(type=" + _rawValue.GetType() + ", value=" + _rawValue + ")";
        }
    }
}

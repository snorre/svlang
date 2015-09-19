namespace SVLang.Basics.AST
{
    public abstract class Expr
    {
        internal const string OneLevelIndent = "    ";

        public abstract string ToString(string indent);

        public abstract override bool Equals(object obj);

        public abstract override int GetHashCode();

        public override string ToString()
        {
            return ToString(string.Empty);
        }
    }
}

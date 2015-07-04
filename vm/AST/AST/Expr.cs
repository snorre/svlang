namespace SVLang.Basics.AST
{
    public abstract class Expr
    {
        protected const string OneLevelIndent = "    ";

        public abstract string ToString(string indent);

        public override string ToString()
        {
            return ToString(string.Empty);
        }
    }
}

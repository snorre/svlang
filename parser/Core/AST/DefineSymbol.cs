namespace Core.AST
{
    public class DefineSymbol : Expr
    {
        public readonly string Name;
        public readonly Value Value;

        public DefineSymbol(string name, Value value)
        {
            Name = name;
            Value = value;
        }
    }
}

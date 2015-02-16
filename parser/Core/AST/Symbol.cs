namespace Core.AST
{
    public class Symbol : Expr
    {
        private readonly string _name;

        public Symbol(string name, Value value)
        {
            _name = name;
            Memory.AddValue(name, value);
        }

        public override Value Eval()
        {
            return (Value)Memory.GetValue(_name); // TODO Return void?
        }
    }
}

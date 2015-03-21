namespace SVLang.Core.AST
{
    public class CallFunction : Expr
    {
        public readonly string Name;
        public readonly Expr[] Parameters;

        public CallFunction(string name, params Expr[] parameters)
        {
            Name = name;
            Parameters = parameters;
        }
    }
}

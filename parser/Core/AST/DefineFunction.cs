namespace Core.AST
{
    public class DefineFunction : Expr
    {
        public readonly Expr Code;
        public readonly string[] ParameterNames;

        public DefineFunction(string name, Expr code, params string[] parameterNames)
        {
            Code = code;
            ParameterNames = parameterNames;
            Memory.AddExpr(name, this);
        }

        public override Value Eval()
        {
            return null;
        }
    }
}

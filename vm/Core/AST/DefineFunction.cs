namespace SVLang.Core.AST
{
    public class DefineFunction : Expr
    {
        public readonly string Name;
        public readonly Expr Code;
        public readonly string[] ParameterNames;

        public DefineFunction(string name, Expr code, params string[] parameterNames)
        {
            Name = name;
            Code = code;
            ParameterNames = parameterNames;
        }
    }
}

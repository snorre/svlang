namespace SVLang.AST
{
    public abstract class BuiltinFunction : DefineFunction
    {
        protected BuiltinFunction(string name, params string[] parameterNames) : base(name, null, parameterNames)
        {
        }

        public abstract Value Execute(Value[] parameterValues);
    }
}

namespace SVLang.Basics
{
    public interface IBuiltIn
    {
        string Name { get; }

        object Call(object[] parameterValues);
    }
}

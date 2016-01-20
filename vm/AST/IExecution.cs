using SVLang.Basics.AST;

namespace SVLang.Basics
{
    public interface IExecution
    {
        ValueSingle EvalFunctionRefFromBuiltin(FunctionRef fr, ValueSingle[] parameters);
    }
}

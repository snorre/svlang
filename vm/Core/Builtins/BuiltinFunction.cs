using System.Linq;
using SVLang.Core.AST;
using SVLang.Core.Evaluation;

namespace SVLang.Core.Builtins
{
    public abstract class BuiltinFunction : DefineFunction
    {
        protected BuiltinFunction(string name, params string[] parameterNames) : base(name, null, parameterNames)
        {
        }

        public static void Load(BuiltinFunction bf)
        {
            Memory.AddExpr(bf.Name, bf);
        }

        public abstract Value Execute(Value[] parameterValues);
    }
}

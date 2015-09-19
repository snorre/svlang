using System.Linq;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Builtins.Sys
{
    public class Tail : BuiltinFunction
    {
        public Tail() : base("tail", "list")
        {
        }

        protected override Value ExecuteImpl(Value[] parameterValues)
        {
            var list = GetSingleParameterAsValueList(parameterValues);

            if (list.Values.Length < 2)
            {
                throw Error.Panic("List contains less than 2 elements.");
            }

            return new ValueList(list.Values.Skip(1).ToArray());
        }
    }
}

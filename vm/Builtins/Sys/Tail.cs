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
            var pv = parameterValues.Single();
            if (pv is ValueList)
            {
                var list = (ValueList)pv;
                if (list.Values.Length < 2)
                {
                    throw Error.Panic("List contains less than 2 elements.");
                }

                return new ValueList(list.Values.Skip(1).ToArray());
            }

            throw Error.Panic("Only lists with more than 1 element supported.");
        }
    }
}

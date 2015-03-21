using System.Linq;

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

        public override int GetHashCode()
        {
            return Name.GetHashCode();
        }

        public override bool Equals(object obj)
        {
            return
                (obj is CallFunction) &&
                (obj as CallFunction).Name.Equals(Name) &&
                (obj as CallFunction).Parameters.SequenceEqual(Parameters);
        }

        public override string ToString()
        {
            return "CallFunction(name=" + Name + ", params=[" + string.Join(",", Parameters.Select(p => p.ToString())) + "])";
        }
    }
}

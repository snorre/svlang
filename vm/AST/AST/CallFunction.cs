using System.Linq;

namespace SVLang.Basics.AST
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
            var other = obj as CallFunction;
            return
                other != null &&
                other.Name.Equals(Name) &&
                other.Parameters.SequenceEqual(Parameters);
        }

        public override string ToString(string indent)
        {
            return
                indent +
                "(" +
                    (
                        Name +
                        " " +
                        string.Join(" ", Parameters.Select(p => p.ToString(string.Empty)))
                    ).Trim() +
                ")";
        }
    }
}

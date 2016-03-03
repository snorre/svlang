using System.Linq;

namespace SVLang.Basics.AST
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

        public override int GetHashCode()
        {
            return Name.GetHashCode();
        }

        public override Expr[] GetChildExprs()
        {
            return new[] { Code };
        }

        public override bool Equals(object obj)
        {
            var other = obj as DefineFunction;
            return
                other != null &&
                other.Name.Equals(Name) &&
                other.Code.Equals(Code) &&
                other.ParameterNames.SequenceEqual(ParameterNames);
        }

        public override string ToString(string indent)
        {
            var preEqualSign = (Name + " " + string.Join(" ", ParameterNames)).Trim();
            var codeString = Code.ToString(indent).Trim();
            return $"{indent}{preEqualSign} = {codeString}";
        }
    }
}

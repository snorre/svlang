using System.Linq;

namespace SVLang.AST
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
            return
                string.Format(
                    "{0}{1} {2} = {{\n{3}\n{0}}}",
                    indent,
                    Name,
                    string.Join(" ", ParameterNames),
                    Code.ToString(indent + OneLevelIndent)
                );
            //return
            //    string.Format(
            //        "DefineFunction(name={0}, params=[{1}], code={2}",
            //        Name,
            //        string.Join(",", ParameterNames),
            //        Code
            //    );
        }
    }
}

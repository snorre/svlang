using System.Linq;

namespace SVLang.Basics.AST
{
    public class First : Expr
    {
        public readonly IfLine[] IfLines;

        public First(params IfLine[] ifLines)
        {
            IfLines = ifLines;
        }

        public override int GetHashCode()
        {
            return IfLines.Sum(il => il.GetHashCode());
        }

        public override bool Equals(object obj)
        {
            return
                obj is First &&
                IfLines.SequenceEqual((obj as First).IfLines);
        }

        public override string ToString(string indent)
        {
            return
                string.Format(
                    "{0}first {{\n{1}\n{0}}}",
                    indent,
                    string.Join("\n", IfLines.Select(il => il.ToString(indent + OneLevelIndent)))
                );
        }
    }
}

using System.Linq;

namespace SVLang.Core.AST
{
    public class Codeblock : Expr
    {
        public readonly Expr[] Codelines;

        public Codeblock(params Expr[] codelines)
        {
            Codelines = codelines;
        }

        public override int GetHashCode()
        {
            return Codelines.First().GetHashCode();
        }

        public override bool Equals(object obj)
        {
            var other = obj as Codeblock;
            return
                other != null &&
                other.Codelines.SequenceEqual(Codelines);
        }

        public override string ToString()
        {
            return 
                string.Format(
                    "Codeblock(lines=[{0}])",
                    string.Join(",", Codelines.ToList())
                );
        }
    }
}

using System.Linq;

namespace SVLang.AST
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

        public override string ToString(string indent)
        {
            return 
                string.Format(
                    "{0}{{\n{1}\n{0}}}", 
                    indent,
                    string.Join("\n" + indent, Codelines.Select(c => c.ToString(indent + OneLevelIndent)))
                );
            //return 
            //    string.Format(
            //        "Codeblock(lines=[{0}])",
            //        string.Join(",", Codelines.ToList())
            //    );
        }
    }
}

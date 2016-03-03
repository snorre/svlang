using System;
using System.Linq;

namespace SVLang.Basics.AST
{
    public class Codeblock : Expr
    {
        public readonly Expr[] Codelines;

        public Codeblock(params Expr[] codelines)
        {
            Codelines = codelines;
        }

        public override Expr[] GetChildExprs()
        {
            return Codelines;
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
            var nl = Environment.NewLine;
            return 
                string.Format(
                    "{0}{{{2}{1}{2}{0}}}", 
                    indent,
                    string.Join(nl, Codelines.Select(c => c.ToString(indent + OneLevelIndent))),
                    nl
                );
        }
    }
}

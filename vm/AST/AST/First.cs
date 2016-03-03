using System;
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

        public override Expr[] GetChildExprs()
        {
            return IfLines.Cast<Expr>().ToArray();
        }

        public override bool Equals(object obj)
        {
            return
                obj is First &&
                IfLines.SequenceEqual((obj as First).IfLines);
        }

        public override string ToString(string indent)
        {
            var nl = Environment.NewLine;
            return
                string.Format(
                    "{0}first {{{2}{1}{2}{0}}}",
                    indent,
                    string.Join(nl, IfLines.Select(il => il.ToString(indent + OneLevelIndent))),
                    nl
                );
        }
    }
}

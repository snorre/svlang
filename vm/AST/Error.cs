using System;
using SVLang.Basics.AST;

namespace SVLang.Basics
{
    public static class Error
    {
        public static SvlException Panic(string message, Expr relatedTo = null, Exception innerException = null)
        {
            return new SvlException(message, relatedTo);
        }

        public class SvlException : Exception
        {
            public Expr RelatedTo { get; private set; }

            internal SvlException(string message, Expr relatedTo)
                : base(message)
            {
                RelatedTo = relatedTo;
            }

            public override string ToString()
            {
                var nl = Environment.NewLine;
                var relatedToString = string.Empty;
                if (RelatedTo != null)
                {
                    var str = RelatedTo.ToString(Expr.OneLevelIndent);
                    relatedToString = string.Format("Related to:{0}\"{0}{1}{0}\"", nl, str.Substring(0, Math.Min(str.Length, 100)));
                }

                return 
                    string.Format(
                        "Error during execution: {0}{1}{1}{2}",
                        Message,
                        nl,
                        relatedToString
                    );
            }
        }
    }
}

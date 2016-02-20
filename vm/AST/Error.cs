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
            public string MessageBasic { get; private set; }

            public Expr RelatedTo { get; private set; }

            internal SvlException(string message, Expr relatedTo)
                : base(BuildMessage(message, relatedTo))
            {
                MessageBasic = message;
                RelatedTo = relatedTo;
            }

            private static string BuildMessage(string message, Expr relatedTo)
            {
                var nl = Environment.NewLine;
                var relatedToString = string.Empty;
                if (relatedTo != null)
                {
                    var str = relatedTo.ToString(Expr.OneLevelIndent);
                    relatedToString = string.Format("Related to:{0}\"{0}{1}{0}\"", nl, str.Substring(0, Math.Min(str.Length, 100)));
                }

                return $"{message}{nl}-{relatedToString}".Trim();
            }
        }
    }
}

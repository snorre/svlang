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
                var relatedToCode = RelatedTo.ToString();

                return 
                    string.Format(
                        "Error during execution: {0}{1}",
                        Message,
                        RelatedTo != null
                            ? "\n\nRelated to:\n\"\n" + relatedToCode.Substring(0, Math.Min(relatedToCode.Length, 100)) +"\n\""
                            : string.Empty
                    );
            }
        }
    }
}

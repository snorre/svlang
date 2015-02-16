namespace Core.AST
{
    public class Codeblock : Expr
    {
        public readonly Expr[] Codelines;

        public Codeblock(params Expr[] codelines)
        {
            Codelines = codelines;
        }
    }
}

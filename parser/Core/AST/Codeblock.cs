namespace Core.AST
{
    public class Codeblock : Expr
    {
        private readonly Expr[] _codelines;

        public Codeblock(params Expr[] codelines)
        {
            _codelines = codelines;
        }

        public override Value Eval()
        {
            Value lastValue = null;
            foreach (var line in _codelines)
            {
                lastValue = line.Eval();
            }
            return lastValue;
        }
    }
}

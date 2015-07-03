namespace SVLang.AST
{
    public class IfLine : Expr
    {
        public readonly Expr Condition;
        public readonly Expr Action;

        public IfLine(Expr condition, Expr action)
        {
            Condition = condition;
            Action = action;
        }

        public override int GetHashCode()
        {
            return Condition.GetHashCode() + Action.GetHashCode();
        }

        public override bool Equals(object obj)
        {
            var other = obj as IfLine;
            return
                obj is IfLine &&
                other.Condition.Equals(Condition) &&
                other.Action.Equals(Action);
        }

        public override string ToString(string indent)
        {
            return indent + Condition + " -> " + Action;
        }
    }
}

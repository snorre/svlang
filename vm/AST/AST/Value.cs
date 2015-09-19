namespace SVLang.Basics.AST
{
    public abstract class Value : Expr
    {
        public static readonly ValueSingle Void = new ValueSingle(new RawVoid());

        public class RawVoid
        {
            public override int GetHashCode()
            {
                return 1;
            }

            public override bool Equals(object obj)
            {
                return obj is RawVoid;
            }

            public override string ToString()
            {
                return "void";
            }
        }

        public abstract object RawValue();

        public abstract bool IsTrue();
    }
}

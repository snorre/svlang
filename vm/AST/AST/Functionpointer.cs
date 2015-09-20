namespace SVLang.Basics.AST
{
    public class Functionpointer : Expr
    {
        public readonly string Name;

        public Functionpointer(string name)
        {
            Name = name;
        }

        public override bool Equals(object obj)
        {
            var otherFp = obj as Functionpointer;
            return
                otherFp != null &&
                Name == otherFp.Name;
        }

        public override int GetHashCode()
        {
            return Name.GetHashCode();
        }

        public override string ToString(string indent)
        {
            return indent + Name;
        }
    }
}

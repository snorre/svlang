﻿namespace SVLang.Basics.AST
{
    public class FunctionRef : Expr
    {
        public readonly string Name;

        public FunctionRef(string name)
        {
            Name = CleanName(name);
        }

        public override bool Equals(object obj)
        {
            var otherFp = obj as FunctionRef;
            return
                otherFp != null &&
                Name == otherFp.Name;
        }

        public override int GetHashCode()
        {
            return Name.GetHashCode();
        }

        public override Expr[] GetChildExprs()
        {
            return new Expr[0];
        }

        public override string ToString(string indent)
        {
            return indent + Name;
        }
    }
}

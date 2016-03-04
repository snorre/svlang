namespace SVLang.Basics.AST
{
    public abstract class Expr
    {
        internal const string OneLevelIndent = "    ";

        public bool IsInCodeblockAndIsNotLast { get; set; }

        public abstract string ToString(string indent);

        public abstract override bool Equals(object obj);

        public abstract override int GetHashCode();

        public virtual bool IsTrue()
        {
            throw Error.Panic("Only booleans is supported as condition checks.", this);
        }

        public abstract Expr[] GetChildExprs();

        public override string ToString()
        {
            return ToString(string.Empty);
        }

        public bool IsCallFunction()
        {
            return this is CallFunction;
        }
        public CallFunction AsCallFunction()
        {
            return (CallFunction)this;
        }

        public bool IsCodeblock()
        {
            return this is Codeblock;
        }

        public Codeblock AsCodeblock()
        {
            return (Codeblock)this;
        }

        public bool IsDefineFunction()
        {
            return this is DefineFunction;
        }

        public DefineFunction AsDefineFunction()
        {
            return (DefineFunction)this;
        }

        public bool IsFirst()
        {
            return this is First;
        }

        public First AsFirst()
        {
            return (First)this;
        }

        public bool IsFunctionRef()
        {
            return this is FunctionRef;
        }

        public FunctionRef AsFunctionRef()
        {
            return (FunctionRef)this;
        }

        public bool IsIfLine()
        {
            return this is IfLine;
        }

        public IfLine AsIfLine()
        {
            return (IfLine)this;
        }

        public bool IsValue()
        {
            return this is Value;
        }

        public bool IsValueList()
        {
            return this is ValueList;
        }

        public ValueList AsValueList()
        {
            return (ValueList)this;
        }

        public bool IsValueSingle()
        {
            return this is ValueSingle;
        }

        public ValueSingle AsValueSingle()
        {
            return (ValueSingle)this;
        }

        protected string CleanName(string name)
        {
            return name.Replace('-', '_');
        }
    }
}

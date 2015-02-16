namespace Core.AST
{
    public class ReferenceSymbol : Expr
    {
        public readonly string SymbolName;

        public ReferenceSymbol(string symbolName)
        {
            SymbolName = symbolName;
        }
    }
}

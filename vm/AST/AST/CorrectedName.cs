namespace SVLang.Basics.AST
{
    public class CorrectedName
    {
        private readonly string _name;

        public CorrectedName(string name)
        {
            _name = name.Replace('-', '_');
        }
    }
}

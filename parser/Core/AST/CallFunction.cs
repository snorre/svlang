using System;

namespace Core.AST
{
    public class CallFunction : Expr
    {
        private readonly string _name;
        private readonly Expr[] _parameters;

        public CallFunction(string name, params Expr[] parameters)
        {
            _name = name;
            _parameters = parameters;
        }

        public override Value Eval()
        {
            var f = (DefineFunction)Memory.GetExpr(_name);

            if (f.ParameterNames.Length != _parameters.Length)
                throw new InvalidOperationException("Number of defined parameters and given parameter values differ.");

            for (int i = 0; i < _parameters.Length; i++)
            {
                var p = _parameters[i];
                var n = f.ParameterNames[i];
                Memory.AddValue(n, p.Eval());
            }
            return f.Code.Eval();
        }
    }
}

using System;
using Core.AST;

namespace Core.Evaluation
{
    public class Runner
    {
        private readonly Codeblock _codeblock;

        public Runner(Codeblock codeblock)
        {
            _codeblock = codeblock;
        }

        public object Run()
        {
            return Evaluate(_codeblock).RawValue();
        }

        private Value Evaluate(Expr e)
        {
            if (e is Value)
                return e as Value;

            if (e is DefineSymbol) // TODO Merge with DefineFunction?
                return EvalDefineSymbol(e as DefineSymbol);

            if (e is ReferenceSymbol) // TODO Merge with CallFunction?
                return EvalReference(e as ReferenceSymbol);

            if (e is DefineFunction)
                return EvalDefineFunction(e as DefineFunction);

            if (e is CallFunction)
                return EvalCallFunction(e as CallFunction);

            if (e is Codeblock)
                return EvalCodeblock(e as Codeblock);

            throw new InvalidOperationException("Cannot evaluate: " + e.GetType());
        }

        private Value EvalDefineSymbol(DefineSymbol s)
        {
            Memory.AddValue(s.Name, s.Value);
            return null; // TODO Return something else?
        }

        private Value EvalReference(ReferenceSymbol r)
        {
            return Memory.GetValue(r.SymbolName);
        }

        private Value EvalDefineFunction(DefineFunction df)
        {
            Memory.AddExpr(df.Name, df);
            return null; // TODO Return something else?
        }

        private Value EvalCodeblock(Codeblock c)
        {
            Value lastValue = null;
            foreach (var line in c.Codelines)
            {
                lastValue = Evaluate(line);
            }
            return lastValue;
        }

        private Value EvalCallFunction(CallFunction cf)
        {
            var f = (DefineFunction)Memory.GetExpr(cf.Name);

            if (f.ParameterNames.Length != cf.Parameters.Length)
                throw new InvalidOperationException("Number of defined parameters and given parameter values differ.");

            for (int i = 0; i < cf.Parameters.Length; i++)
            {
                var p = cf.Parameters[i];
                var n = f.ParameterNames[i];
                Memory.AddValue(n, Evaluate(p));
            }
            return Evaluate(f.Code);
        }

    }
}

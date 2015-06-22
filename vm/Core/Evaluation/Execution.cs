using System;
using System.Linq;
using SVLang.Core.AST;
using SVLang.Core.Builtins;
using SVLang.Core.Builtins.sys;

namespace SVLang.Core.Evaluation
{
    public class Execution
    {
        private readonly Expr _code;

        public Execution(Expr code)
        {
            _code = code;
        }

        public object Run()
        {
            LoadBuiltins();
            return Evaluate(_code).RawValue();
        }

        private void LoadBuiltins()
        {
            BuiltinFunction.Load(
                new Print(),
                new Concat(),
                new Plus(),
                new Minus()
            );
        }

        private Value Evaluate(Expr e)
        {
            if (e is BuiltinFunction)
                return EvaluateBuiltinFunction(e as BuiltinFunction);

            if (e is Value)
                return e as Value;

            if (e is DefineFunction)
                return EvalDefineFunction(e as DefineFunction);

            if (e is CallFunction)
                return EvalCallFunction(e as CallFunction);

            if (e is Codeblock)
                return EvalCodeblock(e as Codeblock);

            throw new InvalidOperationException("Cannot evaluate: " + e.GetType());
        }

        private Value EvaluateBuiltinFunction(BuiltinFunction bf)
        {
            var parameterValues =
                bf
                    .ParameterNames
                    .Select(pn => Evaluate(Memory.GetExpr(pn)))
                    .ToArray();

            return bf.Execute(parameterValues);
        }

        private Value EvalDefineFunction(DefineFunction df)
        {
            if (df.Name.Contains("."))
            {
                throw new InvalidOperationException("Function name cannot contain .: " + df.Name);
            }

            Memory.AddExpr(df.Name, df);
            return Value.Void;
        }

        private Value EvalCodeblock(Codeblock c)
        {
            Memory.Mark();

            Value lastValue = null;
            foreach (var line in c.Codelines)
            {
                lastValue = Evaluate(line);
            }

            Memory.RollbackMark();

            return lastValue;
        }

        private Value EvalCallFunction(CallFunction cf)
        {
            Memory.Mark();

            var e = Memory.GetExpr(cf.Name);

            if (e is Value)
            {
                return e as Value;
            }

            var f = (DefineFunction)e;

            if (f.ParameterNames.Length != cf.Parameters.Length)
                throw new InvalidOperationException("Number of defined parameters and given parameter values differ.");

            for (int i = 0; i < cf.Parameters.Length; i++)
            {
                var n = f.ParameterNames[i];
                var p = Evaluate(cf.Parameters[i]);
                Memory.AddExpr(n, p);
            }

            var result =
                f is BuiltinFunction
                    ? Evaluate(f)
                    : Evaluate(f.Code);

            Memory.RollbackMark();

            return result;
        }
    }
}

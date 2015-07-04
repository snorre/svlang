using System;
using System.Linq;
using Castle.Core.Internal;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Core
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
            var baseType = typeof(BuiltinFunction);
            AppDomain.CurrentDomain.GetAssemblies()
                .SelectMany(s => s.GetTypes())
                .Where(t => baseType.IsAssignableFrom(t) && t != typeof(BuiltinFunction))
                .Select(t => (BuiltinFunction)Activator.CreateInstance(t))
                .ForEach(i => Memory.AddExpr(i.Name, i));
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

            if (e is IfLine)
                return EvalIfLine(e as IfLine);

            if (e is First)
                return EvalFirst(e as First);

            throw Error.Panic("Cannot evaluate: " + e.GetType(), e);
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
                throw Error.Panic("Function name cannot contain .: " + df.Name, df);
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
                throw Error.Panic("Number of defined parameters and given parameter values differ.", cf);

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

        private Value EvalIfLine(IfLine ifLine)
        {
            bool notUsed;
            return EvalIfLine(ifLine, out notUsed);
        }

        private Value EvalIfLine(IfLine ifLine, out bool conditionWasTrue)
        {
            var conditionResult = Evaluate(ifLine.Condition);
            conditionWasTrue = conditionResult.IsTrue();
            return
                conditionWasTrue
                    ? Evaluate(ifLine.Action)
                    : Value.Void;
        }

        private Value EvalFirst(First first)
        {
            Value result = Value.Void;
            foreach (var ifLine in first.IfLines)
            {
                bool conditionWasTrue;
                result = EvalIfLine(ifLine, out conditionWasTrue);
                if (conditionWasTrue)
                    break;
            }
            return result;
        }
    }
}
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

        public Expr Run()
        {
            LoadBuiltins();
            return Evaluate(_code);
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

        private Expr Evaluate(Expr e)
        {
            if (e is BuiltinFunction)
                return EvaluateBuiltinFunction(e as BuiltinFunction);

            if (e is ValueSingle)
                return e as ValueSingle;

            if (e is ValueList)
                return e as ValueList;

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

            if (e is FunctionRef)
                return EvalFunctionRef(e as FunctionRef);

            throw Error.Panic("Cannot evaluate: " + e.GetType(), e);
        }

        private Expr EvalFunctionRef(FunctionRef functionRef)
        {
            return Memory.GetExpr(functionRef.Name);
        }

        private Expr EvaluateBuiltinFunction(BuiltinFunction bf)
        {
            var parameterValues =
                bf
                    .ParameterNames
                    .Select(pn => Evaluate(Memory.GetExpr(pn)))
                    .ToArray();

            return bf.Execute(parameterValues);
        }

        private Expr EvalDefineFunction(DefineFunction df)
        {
            Memory.AddExpr(df.Name, df);
            return Value.Void;
        }

        private Expr EvalCodeblock(Codeblock c)
        {
            Memory.Mark();

            Expr lastValue = Value.Void;
            foreach (var line in c.Codelines)
            {
                lastValue = Evaluate(line);
            }

            Memory.RollbackMark();

            return lastValue;
        }

        private Expr EvalCallFunction(CallFunction cf)
        {
            Memory.Mark();

            var e = Memory.GetExpr(cf.Name);

            if (e is Value)
            {
                return e as Value;
            }

            var f = (DefineFunction)e;

            if (f.ParameterNames.Length != cf.Parameters.Length)
                throw Error.Panic($"Call to \"{f.Name}\" failed. Number of defined parameters and given parameter values differ. Expected: {f.ParameterNames.Length}, actual: {cf.Parameters.Length}", cf);

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

        private Expr EvalIfLine(IfLine ifLine)
        {
            bool notUsed;
            return EvalIfLine(ifLine, out notUsed);
        }

        private Expr EvalIfLine(IfLine ifLine, out bool conditionWasTrue)
        {
            var conditionResult = Evaluate(ifLine.Condition);
            conditionWasTrue = conditionResult.IsTrue();
            return
                conditionWasTrue
                    ? Evaluate(ifLine.Action)
                    : Value.Void;
        }

        private Expr EvalFirst(First first)
        {
            Expr result = Value.Void;
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
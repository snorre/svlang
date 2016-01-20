using System;
using System.Diagnostics.CodeAnalysis;
using System.IO;
using System.Linq;
using System.Reflection;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Core
{
    public class Execution : IExecution
    {
        private bool _isPrepared;

        public Execution Prepare()
        {
            LoadBuiltins();
            _isPrepared = true;
            return this;
        }

        public Expr Run(Expr code)
        {
            if (!_isPrepared)
            {
                throw Error.Panic("Execution not prepared, prepare before run.");
            }

            return Evaluate(code);
        }

        [SuppressMessage("ReSharper", "PossibleNullReferenceException")]
        private void LoadBuiltins()
        {
            var baseType = typeof(BuiltinFunction);
            var currentFolder = new FileInfo(Assembly.GetExecutingAssembly().Location).Directory;
            var allBuiltins =
                currentFolder
                    .GetFiles("*.dll")
                    .Select(LoadFile)
                    .Where(a => a != null)
                    .SelectMany(a => a.GetTypes())
                    .Where(t => baseType.IsAssignableFrom(t) && t != baseType)
                    .Select(t => (BuiltinFunction)Activator.CreateInstance(t))
                    .ToList();

            allBuiltins.ForEach(b => b.SetExecutionEngine(this));

            allBuiltins
                .ForEach(i => Memory.AddExpr(i.Name, i.ParameterNames, i));
        }

        private Assembly LoadFile(FileInfo file)
        {
            try
            {
                return Assembly.LoadFile(file.FullName);
            }
            catch (Exception)
            {
                return null;
            }
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

            // Moved to direct call because of parameters. Need to get FR's parameters from outside call.
            //if (e is FunctionRef) 
            //    return EvalFunctionRef(e as FunctionRef);

            throw Error.Panic("Cannot evaluate: " + e.GetType(), e);
        }

        private Expr Evaluate(StackFunction sf)
        {
            return Evaluate(sf.Code);
        }

        public Expr EvalFunctionRef(FunctionRef fr, Expr callingCode)
        {
            var asCallF = callingCode as CallFunction;

            if (asCallF == null)
            {
                return Evaluate(Memory.GetExpr(fr.Name));
            }

            return 
                new CallFunction(
                    fr.Name,
                    asCallF.Parameters
                );
        }

        public ValueSingle EvalFunctionRefFromBuiltin(FunctionRef fr, ValueSingle[] parameters)
        {
            return
                (ValueSingle)Evaluate(
                    new CallFunction(
                        fr.Name,
                        parameters.Cast<Expr>().ToArray()
                    )
                );
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
            Memory.AddExpr(df.Name, df.ParameterNames, df.Code);
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

            var sf = Memory.GetExpr(cf.Name);

            if (sf.Code is Value)
            {
                return (Value)sf.Code;
            }

            if (sf.ParameterNames.Length != cf.Parameters.Length)
                throw Error.Panic($"Call to \"{sf.Name}\" failed. Number of defined parameters and given parameter values differ. Expected: {sf.ParameterNames.Length}, actual: {cf.Parameters.Length}", cf);

            for (int i = 0; i < cf.Parameters.Length; i++)
            {
                var n = sf.ParameterNames[i];

                var parameter = cf.Parameters[i];
                var p = 
                    (parameter is FunctionRef)
                        ? EvalFunctionRef((FunctionRef)parameter, sf.Code)
                        : Evaluate(parameter);

                Memory.AddExpr(n, sf.ParameterNames, p);
            }

            var result = Evaluate(sf.Code);

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
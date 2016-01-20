﻿using System;
using System.Collections.Generic;
using System.Linq;
using SVLang.Basics.AST;

namespace SVLang.Basics
{
    public abstract class BuiltinFunction : DefineFunction
    {
        protected static readonly List<Type> AllRawTypesSupported = new List<Type>();
        protected static readonly List<Type> OnlyInts = new List<Type> { typeof(int) }; 
        protected static readonly List<Type> OnlyStrings = new List<Type> { typeof(string) };
        protected static readonly List<Type> OnlyBools = new List<Type> { typeof(bool) };
        protected IExecution Execution;

        protected virtual List<Type> RawTypesSupported => AllRawTypesSupported;

        protected BuiltinFunction(string name, params string[] parameterNames) : base(name, null, parameterNames)
        {
        }

        protected abstract Expr ExecuteImpl(Expr[] parameterValues);

        public void SetExecutionEngine(IExecution execution)
        {
            Execution = execution;
        }

        public Expr Execute(Expr[] parameterValues)
        {
            ValidateTypesOfParametervalues(parameterValues);

            try
            {
                return ExecuteImpl(parameterValues);
            }
            catch (Exception e)
            {
                throw Error.Panic($"Builtin function \"{Name}\" failed: {e.Message}", innerException: e);
            }
        }

        protected T GetSingleParameter<T>(T[] parameterValues)
        {
            if (parameterValues.Length != 1)
            {
                throw Error.Panic($"Cannot get single parameter. Parameter count: {parameterValues.Length}");
            }

            return parameterValues.Single();
        }

        protected T GetNamedParameterAs<T>(Expr[] allParameters, string name) where T : Expr
        {
            if (ParameterNames.All(pn => pn != name))
            {
                throw Error.Panic($"Parameter not given: {name}");
            }

            var index = Array.IndexOf(ParameterNames, name);
            var paramAsT = allParameters[index] as T;
            if (paramAsT == null)
            {
                throw Error.Panic($"Cannot get parameter as type {typeof(T)} at index {index}");
            }

            return paramAsT;
        }


        protected T[] GetParametersAs<T>(Expr[] parameterValues) where T : Expr
        {
            var allAreCorrectType = parameterValues.All(pv => (pv as T) != null);
            if (!allAreCorrectType)
            {
                throw Error.Panic($"Cannot get parameters as type {typeof(T)}");
            }

            return
                parameterValues
                    .Select(pv => pv as T)
                    .ToArray();
        }

        private void ValidateTypesOfParametervalues(Expr[] parameterValues)
        {
            if (!RawTypesSupported.Any())
            {
                return;
            }

            for (int i=0; i<parameterValues.Length; i++)
            {
                var pvType = (parameterValues[i] as Value)?.RawValue()?.GetType() ?? typeof(Expr);
                if (!RawTypesSupported.Contains(pvType))
                {
                    var pName = ParameterNames[i];
                    throw Error.Panic(
                        $"Builtin function \"{Name}\" got invalid type in parameter. " +
                        $"Type: {pvType}, ParameterName: {pName}. " +
                        $"Supported types are: {string.Join(", ", RawTypesSupported)}"
                    );
                }
            }
        }
    }
}

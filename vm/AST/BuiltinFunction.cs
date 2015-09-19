using System;
using System.Collections.Generic;
using System.Linq;
using SVLang.Basics.AST;

namespace SVLang.Basics
{
    public abstract class BuiltinFunction : DefineFunction
    {
        private static readonly List<Type> AllRawTypesSupported = new List<Type>();

        protected virtual List<Type> RawTypesSupported => AllRawTypesSupported;

        protected BuiltinFunction(string name, params string[] parameterNames) : base(name, null, parameterNames)
        {
        }

        protected abstract Value ExecuteImpl(Value[] parameterValues);

        public Value Execute(Value[] parameterValues)
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

        protected ValueList GetSingleParameterAsValueList(Value[] parameterValues)
        {
            var pv = GetSingleParameter(parameterValues);
            if (!(pv is ValueList))
            {
                throw Error.Panic($"Cannot cast single parameter to ValueList, type is: {pv.GetType()}");
            }

            return (ValueList)pv;
        }

        protected ValueSingle GetSingleParameterAsValueSingle(Value[] parameterValues)
        {
            var pv = GetSingleParameter(parameterValues);
            if (!(pv is ValueSingle))
            {
                throw Error.Panic($"Cannot cast single parameter to ValueList, type is: {pv.GetType()}");
            }

            return (ValueSingle)pv;
        }

        protected Value GetSingleParameter(Value[] parameterValues)
        {
            if (parameterValues.Length != 1)
            {
                throw Error.Panic($"Cannot get single parameter. Parameter count: {parameterValues.Length}");
            }

            return parameterValues.Single();
        }

        private void ValidateTypesOfParametervalues(Value[] parameterValues)
        {
            if (!RawTypesSupported.Any())
            {
                return;
            }

            for (int i=0; i<parameterValues.Length; i++)
            {
                var pvType = parameterValues[i].RawValue().GetType();
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

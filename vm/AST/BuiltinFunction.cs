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
            return ExecuteImpl(parameterValues);
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

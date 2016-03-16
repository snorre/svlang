using System;
using System.Collections.Generic;
using System.Linq;

namespace SVLang.Basics
{
    public abstract class BuiltinBase
    {
        public abstract string Name { get; }

        public abstract object Call(params object[] parameterFuncs);

        protected T ReduceToValue<T>(dynamic o)
        {
            if (o is Func<dynamic>)
            {
                var r = o();
                return ReduceToValue<T>(r);
            }

            if (o is T)
            {
                return (T)o;
            }

            throw Error.Panic($"Builtin function '{Name}' can only handle '{typeof(T).Name}'-type og functionref parameters. Got: {o.GetType()}");
        }

        protected List<T> ReduceListToValues<T>(object[] oList)
        {
            return oList.Select(ReduceToValue<T>).ToList();
        }

        protected List<dynamic> ReduceToValueList(dynamic o)
        {
            return ReduceToValue<List<dynamic>>(o);
        }

        protected bool IsList(dynamic o)
        {
            return o is List<object>;
        }

        protected List<object> AsList(dynamic o)
        {
            return (List<object>)o;
        }

        protected void ValidateHasExactlyNumberOfParameters(object[] parameterFuncs, int number)
        {
            if (parameterFuncs.Length != number)
            {
                throw Error.Panic($"Builtin function '{Name}' must have {number} parameter. Got " + parameterFuncs.Length);
            }
        }

        protected void ValidateHasAtLeastNumberOfParameters(object[] parameterFuncs, int number)
        {
            if (parameterFuncs.Length < number)
            {
                throw Error.Panic($"Builtin function '{Name}' must have at least {number} parameter. Got " + parameterFuncs.Length);
            }
        }

        protected T ValidateAndGetParameterInPositionAs<T>(object[] parameterFuncs, int idx)
        {
            if (parameterFuncs.Length < (idx + 1))
            {
                throw Error.Panic($"{GetBaseErrorMessage()} did not get a parameter in position {idx} (zero based). Got only {parameterFuncs.Length} parameters.");
            }

            var p = parameterFuncs[idx];
            if (p is T)
            {
                return (T)p;
            }
            throw Error.Panic($"{GetBaseErrorMessage()} got an invalid parameter in position {idx}. Expected '{typeof(T)}' but got '{p.GetType()}'");
        }

        protected string GetBaseErrorMessage()
        {
            return $"Builtin function '{Name}'";
        }
    }
}

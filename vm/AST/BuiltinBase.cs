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
    }
}

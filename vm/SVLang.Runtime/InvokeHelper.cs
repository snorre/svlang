using System;

namespace SVLang.Runtime
{
    public class InvokeHelper
    {
        public static dynamic Invoke(object functionOrObject, dynamic caller)
        {
            var t = functionOrObject.GetType();
            if (t.BaseType == typeof(MulticastDelegate))
            {
                {
                    return caller();
                }
            }

            return functionOrObject;
        }
    }
}

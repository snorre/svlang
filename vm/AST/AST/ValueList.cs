using System.Linq;

namespace SVLang.Basics.AST
{
    public class ValueList : Value
    {
        public readonly ValueSingle[] Values;

        public ValueList(params ValueSingle[] values)
        {
            Values = values;
        }

        public override bool Equals(object obj)
        {
            return
                obj is ValueList &&
                Values.SequenceEqual(((ValueList)obj).Values);
        }

        public override int GetHashCode()
        {
            var numValues = Values.Length;
            return
                Values.Any()
                    ? Values[0].GetHashCode() + Values[numValues - 1].GetHashCode()
                    : 1;
        }

        public override object RawValue()
        {
            return Values.Select(v => v.RawValue()).ToArray();
        }

        public override bool IsTrue()
        {
            return
                Values.Length == 1 &&
                Values[0].IsTrue();
        }

        public override string ToString(string indent)
        {
            return
                indent + 
                "[" + 
                string.Join(" ", Values.Select(v => v.ToString())) + 
                "]";
        }
    }
}

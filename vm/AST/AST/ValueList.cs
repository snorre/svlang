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
            var otherList = obj as ValueList;
            return 
                otherList != null &&
                Values.SequenceEqual(otherList.Values);
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

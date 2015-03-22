using SVLang.Core.AST;

namespace SVLang.Test
{
    // ReSharper disable InconsistentNaming
    public abstract class TestBase
    {
        public static readonly Value Val_1 = new Value(1);
        public static readonly Value Val_123 = new Value(123);
        public static readonly Value Val_456 = new Value(456);
        public static readonly Value Val_abc = new Value("abc");
    }
    // ReSharper restore InconsistentNaming
}

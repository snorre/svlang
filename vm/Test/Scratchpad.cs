using System;
using SVLang.Builtins.Sys;
namespace SvlCompilation
{

    public static class ____Svlang____internals____LanguageConstants
    {
        public static readonly SVLang.Basics.AST.Value Void = SVLang.Basics.AST.Value.Void;
    }
    public class SvlEntryType
    {
        public object SvlEntryMethod()
        {
            {
                return (
                    ((bool)new SVLang.Builtins.Sys.Eq().Call(() => 1, () => 2)) 
                        ? 3 
                        : (((bool)false) 
                            ? 6 
                            : (((bool)new SVLang.Builtins.Sys.Eq().Call(() => 4, () => 4)) 
                                ? 5 
                                : (object)____Svlang____internals____LanguageConstants.Void
                                )
                            )
                        );
            }
        }
    }
}
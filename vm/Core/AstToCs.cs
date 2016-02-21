using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Castle.Core.Internal;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Core
{
    internal class AstToCs
    {
        // TODO Move?
        private static readonly string NL = Environment.NewLine;
        private const string Void = "____Svlang____internals____LanguageConstants.Void";

        internal const string EntryNamespace = "SvlCompilation";
        internal const string EntryTypeName = "SvlEntryType";
        internal const string EntryMethodName = "SvlEntryMethod";

        private readonly Expr _code;
        private readonly Dictionary<string, IBuiltIn> _builtins;

        internal AstToCs(Expr code, Dictionary<string, IBuiltIn> builtins)
        {
            _code = code;
            _builtins = builtins;
        }

        internal string GenerateCsCode()
        {
            var innerCsCode = BuildCode(_code);
            var csCode = WrapWithEverythingDownToEntryMethod(innerCsCode);
            return csCode;
        }

        private string BuildCode(Expr code)
        {
            if (IsFunctionCall(code))
            {
                var cf = (CallFunction)code;
                if (IsCallToBuiltin(cf))
                {
                    var b = _builtins[cf.Name];
                    return BuildBuiltinMethodCall(b, cf);
                }

                var paramsList = ParamsList(cf);
                return $"{cf.Name}({paramsList})";
            }

            if (code is Codeblock)
            {
                var cb = (Codeblock)code;
                var csLines = cb.Codelines.ToList().ConvertAll(BuildCode);
                if (csLines.Any())
                {
                    var lastCode = cb.Codelines.Last();
                    if (lastCode is DefineFunction)
                    {
                        var lastDf = (DefineFunction)lastCode;
                        csLines.Add(TurnIntoReturnStatement(lastDf.Name));
                    }
                    else if (!(lastCode is Codeblock))
                    {
                        csLines[csLines.Count - 1] = TurnIntoReturnStatement(csLines.Last());
                    }
                }
                else
                {
                    // Add void return if no statements
                    csLines.Add(TurnIntoReturnStatement(Void));
                }

                return $"{{{NL}{MergeLines(csLines)}{NL}}}";
            }

            if (code is ValueSingle)
            {
                var raw = ((ValueSingle)code).RawValue();
                if (raw is string)
                {
                    return $"\"{raw}\"";
                }
                if (raw is int)
                {
                    return raw.ToString();
                }
                if (raw is bool)
                {
                    return raw.ToString().ToLowerInvariant();
                }
                if (raw is Value.RawVoid)
                {
                    return Void;
                }

                return "UNKNOWN VALUESINGLE: " + raw.GetType();
            }

            if (code is DefineFunction)
            {
                var df = (DefineFunction)code;

                var declarationString = "Func<object>";
                var paramNames = "";
                if (df.ParameterNames.Any())
                {
                    var objList = df.ParameterNames.ToList().ConvertAll(pn => "Func<object>");
                    objList.Add("object"); // for return
                    declarationString = "Func<" + string.Join(", ", objList) + ">";

                    paramNames = string.Join(", ", df.ParameterNames);
                }

                var bodyCode =
                    df.Code is Codeblock
                        ? BuildCode(df.Code)
                        : BuildCode(new Codeblock(df.Code));

                return $"{declarationString} {df.Name} = ({paramNames}) => {bodyCode}"; 
            }

            if (code is FunctionRef)
            {
                var fr = (FunctionRef)code;
                return fr.Name;
            }

            if (code is IfLine) // TODO Turn single ifline into one-line first?
            {
                var il = (IfLine)code;
                return $"((bool){BuildCode(il.Condition)}) ? {BuildCode(il.Action)} : (object){Void}";
            }

            if (code is First)
            {
                var fi = (First)code;
                var sb = new StringBuilder();
                foreach (var il in fi.IfLines)
                {
                    sb.AppendLine($"(((bool){BuildCode(il.Condition)}) ? {BuildCode(il.Action)} :");
                }
                sb.Append("(object)" + Void);
                sb.Append(new string(')', fi.IfLines.Count()));
                return sb.ToString();
            }

            return "UNKNOWN GENERATION FOR: " + code.GetType();
        }

        private string MergeLines(IEnumerable<string> lines)
        {
            return string.Join($";{NL}", lines);
        }

        private bool IsFunctionCall(Expr code)
        {
            return code is CallFunction;
        }

        private bool IsCallToBuiltin(CallFunction cf)
        {
            return _builtins.ContainsKey(cf.Name);
        }

        private string WrapWithEverythingDownToEntryMethod(string csCode)
        {
            return
                Usings() +
                Namespace(
                    EntryNamespace,
                    LanguageConstants() +
                    Class(
                        EntryTypeName,
                        Method(
                            EntryMethodName,
                            csCode
                        )
                    )
                );
        }

        private string Usings()
        {
            var sb = new StringBuilder();
            sb.AppendLine("using System;");
            return sb.ToString();
        }

        private string Namespace(string ns, string content)
        {
            return $"namespace {ns}{NL}{{{NL}{content}{NL}}}";
        }

        private string LanguageConstants()
        {
            return 
                NL +
                @"public static class ____Svlang____internals____LanguageConstants
                {
                    public static readonly SVLang.Basics.AST.Value Void = SVLang.Basics.AST.Value.Void;
                }" + 
                NL;
        }

        private string Class(string className, string content)
        {
            return $"public class {className}{NL}{{{NL}{content}{NL}}}";
        }

        private string Method(string methodName, string content)
        {
            return $"public object {methodName}(){NL}{{{NL}{content}{NL}}}";
        }
        
        
        private string TurnIntoReturnStatement(string line)
        {
            return "return " + line + ";";
        }

        private string BuildBuiltinMethodCall(IBuiltIn builtin, CallFunction cf)
        {
            var paramString = ParamsList(cf);
            var t = builtin.GetType();
            return $"new {t.FullName}().Call({paramString})";
        }

        private string ParamsList(CallFunction cf)
        {
            if (cf.Parameters.Any())
            {
                var paramString = string.Join(", ", cf.Parameters.ConvertAll(p => "() => " + BuildCode(p)));
                return paramString;
            }
            return "";
        }
    }
}

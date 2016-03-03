using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Core
{
    internal class CsGenerator
    {
        private static readonly string InternalsClassName = CreateUniqueName("constants");
        private static readonly string NL = Environment.NewLine;
        private static readonly string Void = InternalsClassName + ".Void";

        internal const string EntryNamespace = "SvlCompilation";
        internal const string EntryTypeName = "SvlEntryType";
        internal const string EntryMethodName = "SvlEntryMethod";

        private readonly Expr _code;
        private readonly Dictionary<string, BuiltinBase> _builtins;

        internal CsGenerator(Expr code, Dictionary<string, BuiltinBase> builtins)
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
            // TODO Refactoring to classes?

            if (code.IsCallFunction())
            {
                return BuildCallFunction(code.AsCallFunction());
            }

            if (code.IsCodeblock())
            {
                return BuildCodeblock(code.AsCodeblock());
            }

            if (code.IsValueSingle())
            {
                return BuildValueSingle(code.AsValueSingle());
            }

            if (code.IsValueList())
            {
                return BuildValueList(code.AsValueList());
            }

            if (code.IsDefineFunction())
            {
                return BuildDefineFunction(code.AsDefineFunction());
            }

            if (code.IsFunctionRef())
            {
                return BuildFunctionRef(code.AsFunctionRef());
            }

            if (code.IsIfLine()) // TODO Turn single ifline into one-line first?
            {
                return BuildIfLine(code.AsIfLine());
            }

            if (code.IsFirst())
            {
                return BuildFirst(code.AsFirst());
            }

            return "UNKNOWN GENERATION FOR: " + code.GetType();
        }

        private string BuildCallFunction(CallFunction cf)
        {
            if (IsCallToBuiltin(cf))
            {
                var b = _builtins[cf.Name];
                return BuildBuiltinMethodCall(b, cf);
            }

            var paramsList = ParamsList(cf);

            return $"{cf.Name}({paramsList})";
        }

        private string BuildCodeblock(Codeblock cb)
        {
            var csLines = cb.Codelines.Select(BuildCode).ToList();
            if (csLines.Any())
            {
                var lastCode = cb.Codelines.Last();
                if (lastCode.IsDefineFunction())
                {
                    var lastDf = lastCode.AsDefineFunction();
                    csLines.Add(TurnIntoReturnStatement(lastDf.Name));
                }
                else if (!(lastCode.IsCodeblock()))
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

        private static string BuildValueSingle(ValueSingle value)
        {
            var raw = value.RawValue();
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

        private string BuildValueList(ValueList vl)
        {
            return $"new List<dynamic> {{ {string.Join(", ", vl.Values.Select(BuildCode))} }}";
        }

        private string BuildDefineFunction(DefineFunction df)
        {
            var paramNames = "";
            if (df.ParameterNames.Any())
            {
                paramNames = string.Join(", ", df.ParameterNames);
            }

            var declaration = BuildDeclaration(df.ParameterNames.Length);

            var bodyCode =
                df.Code.IsCodeblock()
                    ? BuildCode(df.Code)
                    : BuildCode(new Codeblock(df.Code));

            return $"{declaration} {df.Name} = null; {df.Name} = ({paramNames}) => {bodyCode}";
        }

        private static string BuildFunctionRef(FunctionRef fr)
        {
            return fr.Name;
        }

        private string BuildIfLine(IfLine il)
        {
            return
                il.IsInCodeblockAndIsNotLast
                    ? $"if ((bool){BuildCode(il.Condition)}) {{ {BuildCode(il.Action)}; }}"
                    : $"((bool){BuildCode(il.Condition)}) ? {BuildCode(il.Action)} : (object){Void}";
        }

        private string BuildFirst(First fi) // TODO Refactor to Expr class
        {
            var sb = new StringBuilder();
            foreach (var il in fi.IfLines)
            {
                sb.AppendLine($"(((bool){BuildCode(il.Condition)}) ? {BuildCode(il.Action)} :");
            }
            sb.Append("(object)" + Void);
            sb.Append(new string(')', fi.IfLines.Count()));

            var csLine = sb.ToString();

            if (fi.IsInCodeblockAndIsNotLast)
            {
                csLine = $"var {CreateUniqueName("unused")} = {csLine}";
            }

            return csLine;
        }

        private string BuildDeclaration(int numberOfParameters)
        {
            var sb = new StringBuilder();
            for (int i = 0; i < numberOfParameters; i++)
            {
                sb.Append("dynamic,");
            }
            return $"Func<{sb}dynamic>";
        }

        private string MergeLines(IEnumerable<string> lines)
        {
            return string.Join($";{NL}", lines);
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
            sb.AppendLine("using System.Collections.Generic;");
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
                $@"public static class {InternalsClassName}
                {{
                    public static readonly SVLang.Basics.AST.Value Void = SVLang.Basics.AST.Value.Void;
                }}" + 
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

        private string BuildBuiltinMethodCall(BuiltinBase builtin, CallFunction cf)
        {
            var paramString = ParamsList(cf);
            var t = builtin.GetType();
            return $"new {t.FullName}().Call({paramString})";
        }

        private string ParamsList(CallFunction cf)
        {
            if (cf.Parameters.Any())
            {
                var pList = new List<string>();
                foreach (var p in cf.Parameters)
                {
                    if (p.IsValue() || p.IsCallFunction())
                    {
                        pList.Add($"(Func<dynamic>)(() => {BuildCode(p)})");
                    }
                    else
                    {
                        pList.Add(BuildCode(p));
                    }
                }

                var paramString = string.Join(", ", pList);
                return paramString;
            }
            return "";
        }

        private static string CreateUniqueName(string baseName = "internal")
        {
            string uniqueId = Guid.NewGuid().ToString().Replace('-', '_');
            return $"svlang_{baseName}_{uniqueId}";
        }
    }
}

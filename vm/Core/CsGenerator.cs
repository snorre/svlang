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
        private static readonly string ConstantsClassName = typeof(Runtime.Constants).FullName;
        private static readonly string HelperClassName = typeof(Runtime.InvokeHelper).FullName;
        private static readonly string NL = Environment.NewLine;
        private static readonly string Void = ConstantsClassName + "." + nameof(Runtime.Constants.Void);

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

            if (code.IsIfLine())
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

            var callback =
                cf.Parameters.Length == 0
                    ? cf.Name
                    : BuildCast($"() => {cf.Name}({paramsList})");

            return $"{HelperClassName}.Invoke({cf.Name}, {callback})";
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

        private string BuildFunctionRef(FunctionRef fr)
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

        private string BuildFirst(First fi)
        {
            var sb = new StringBuilder();
            foreach (var il in fi.IfLines)
            {
                sb.AppendLine($"(((bool){BuildCode(il.Condition)}) ? {BuildCode(il.Action)} :");
            }
            sb.Append("(object)" + Void);
            sb.Append(new string(')', fi.IfLines.Length));

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

        private string BuildCast(string innerCsCode)
        {
            return $"({BuildDeclaration(0)})({innerCsCode})";
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
                $@"
                    using System;
                    using System.Collections.Generic;

                    namespace {EntryNamespace}
                    {{
                        public class {EntryTypeName}
                        {{
                            public object {EntryMethodName}()
                            {{
                                {csCode}
                            }}
                        }}
                    }}
                ";
        }
        
        private string TurnIntoReturnStatement(string line)
        {
            return "return " + line + ";";
        }

        private string BuildBuiltinMethodCall(BuiltinBase builtin, CallFunction cf)
        {
            var paramString = ParamsList(cf);
            var t = builtin.GetType();
            return $"new {t.FullName}().Call({paramString})"; // TODO Cache builtin instance?
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
                        pList.Add(BuildCode(p));
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

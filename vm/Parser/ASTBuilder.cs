using System;
using System.Linq;
using SVLang.Basics.AST;
using SVLang.Parser.GeneratedParser;

namespace SVLang.Parser
{
    public class ASTBuilder
    {
        public Expr BuildExpr(SVLangParser.ExprContext expr)
        {
            // TODO There has to be a better way than this..
            var value = expr.value();
            if (value != null)
            {
                return BuildValue(value);
            }

            var cf = expr.callFunction();
            if (cf != null)
            {
                return BuildCallFunction(cf);
            }

            var df = expr.defineFunction();
            if (df != null)
            {
                return BuildDefineFunction(df);
            }

            var cb = expr.codeblock();
            if (cb != null)
            {
                return BuildCodeblock(cb);
            }

            var ifline = expr.ifLine();
            if (ifline != null)
            {
                return BuildIfLine(ifline);
            }

            var first = expr.first();
            if (first != null)
            {
                return BuildFirst(first);
            }

            throw new InvalidOperationException("Cannot build expr, unknown type.", expr.exception);
        }

        private ValueList BuildValueList(SVLangParser.ValuelistContext valuelist)
        {
            var valuesingleList = valuelist.valuesingle(); 
            var values = new ValueSingle[0];
            if (valuesingleList != null)
            {
                values =
                    valuesingleList
                        .Select(v => BuildValueSingle((SVLangParser.ValuesingleContext)v.Payload))
                        .ToArray();
            }

            return new ValueList(values);
        }

        private First BuildFirst(SVLangParser.FirstContext first)
        {
            var ifLines =
                first
                    .firstline()
                    .Select(i => BuildIfLine(i.ifLine()))
                    .ToList();

            var els = first.firstelse();
            if (els != null)
            {
                var v = els.value();
                var cf = els.callFunction();
                var action =
                    v != null
                        ? (Expr)BuildValue(v)
                        : BuildCallFunction(cf);
                ifLines.Add(
                    new IfLine(new ValueSingle(true), action)
                );
            }

            return new First(ifLines.ToArray());
        }

        private Codeblock BuildCodeblock(SVLangParser.CodeblockContext cb)
        {
            var lines = cb.codeblockline();
            var exprList = lines.Select(l => BuildExpr(l.expr()));

            return new Codeblock(exprList.ToArray());
        }

        private DefineFunction BuildDefineFunction(SVLangParser.DefineFunctionContext df)
        {
            var idList = df.ID().Select(id => id.GetText()).ToList();

            var functionId = idList.First();
            var parameterIdList = idList.Skip(1);
            var v = df.value();
            var cb = df.codeblock();
            var cf = df.callFunction();

            Expr code;
            if (v != null)
            {
                code = BuildValue(v);
            }
            else if (cb != null)
            {
                code = BuildCodeblock(cb);
            }
            else if (cf != null)
            {
                code = BuildCallFunction(cf);
            }
            else
            {
                throw new InvalidOperationException("Cannot build define function.");
            }

            return 
                new DefineFunction(
                    name: functionId,
                    code: code,
                    parameterNames: parameterIdList.ToArray()
                );
        }

        private IfLine BuildIfLine(SVLangParser.IfLineContext ifline)
        {
            var cfList = ifline.callFunction();

            var condition = BuildCallFunction(cfList[0]);
            var action =
                    cfList.Length == 2
                        ? (Expr)BuildCallFunction(cfList[1])
                        : BuildValue(ifline.value());

            return new IfLine(condition, action);
        }

        private Value BuildValue(SVLangParser.ValueContext value)
        {
            var valuesingle = value.valuesingle();
            if (valuesingle != null)
            {
                return BuildValueSingle(valuesingle);
            }

            var valuelist = value.valuelist();
            if (valuelist != null)
            {
                return BuildValueList(valuelist);
            }

            throw new InvalidOperationException("Cannot build value, unknown type.", value.exception);
        }

        private ValueSingle BuildValueSingle(SVLangParser.ValuesingleContext valuesingle)
        {
            var n = valuesingle.NUM();
            if (n != null)
            {
                return new ValueSingle(int.Parse(n.GetText()));
            }

            var b = valuesingle.BOOL();
            if (b != null)
            {
                return new ValueSingle(bool.Parse(b.GetText()));
            }

            var s = valuesingle.STRING();
            if (s != null)
            {
                var str = s.GetText();
                return new ValueSingle(str.Substring(1, str.Length - 2)); // from "x" to x
            }

            var v = valuesingle.VOID();
            if (v != null)
            {
                return Value.Void;
            }

            throw new InvalidOperationException("Cannot build valuesingle, unknown type.", valuesingle.exception);
        }

        private CallFunction BuildCallFunction(SVLangParser.CallFunctionContext cf)
        {
            var cfParameters = cf.expr();

            var parameterExprList = new Expr[0];
            if (cfParameters != null)
            {
                parameterExprList =
                    cfParameters
                        .Select(BuildExpr)
                        .ToArray();
            }

            return 
                new CallFunction(
                    name: cf.ID().GetText(),
                    parameters: parameterExprList
                );
        }
    }
}

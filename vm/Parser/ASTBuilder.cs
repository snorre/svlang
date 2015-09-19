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

            throw new InvalidOperationException("Cannot build expr, unknown type.");
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
                    new IfLine(new Value(true), action)
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
            var id = df.ID().GetText();
            var v = df.value();
            var cb = df.codeblock();

            var code =
                v != null
                    ? (Expr)BuildValue(v)
                    : BuildCodeblock(cb);

            return 
                new DefineFunction(
                    name: id,
                    code: code
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
            var n = value.NUM();
            if (n != null)
            {
                return new Value(int.Parse(n.GetText()));
            }

            var b = value.BOOL();
            if (b != null)
            {
                return new Value(bool.Parse(b.GetText()));
            }

            var s = value.STRING();
            if (s != null)
            {
                var str = s.GetText();
                return new Value(str.Substring(1, str.Length - 2)); // from "x" to x
            }

            throw new InvalidOperationException("Cannot build value, unknown type.", value.exception);
        }

        private CallFunction BuildCallFunction(SVLangParser.CallFunctionContext cf)
        {
            var cfParameters = cf.parameterList().children;

            var parameterExprList = new Expr[0];
            if (cfParameters != null)
            {
                parameterExprList =
                    cfParameters
                        .Select(p => BuildValue((SVLangParser.ValueContext)p.Payload))
                        .Cast<Expr>()
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

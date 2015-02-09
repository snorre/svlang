namespace svlang

open svlang.common

module evaluation =

    let rec private EvalExpr (e:ast.expr) (c:ctx.Context) : ast.simpleValue =

        let ToValueList (el:ast.expr list) : ast.simpleValue list =
            el |> List.map (fun e -> EvalExpr e c)

        match e with
        | ast.Codeblock cb ->
            (ToValueList cb)
                |> List.rev
                |> List.head // Returns the last value

        | ast.Call (fn, pel) -> 
            match fn with
            | "defn" -> builtins.defn c pel
            | "var" -> 
                let vName = ast.EvalValue (EvalExpr pel.[0] c) :?> string
                let vValue = EvalExpr pel.[1] c
                builtins.var c vName vValue
            | ">" -> ast.String("Implement me!")
            | ">=" -> ast.String("Implement me!")
            | "<" -> ast.String("Implement me!")
            | "<=" -> ast.String("Implement me!")
            | "=" -> ast.String("Implement me!")
            | "-" -> builtins.minus (ToValueList pel)
            | "+" -> builtins.plus (ToValueList pel)
            | "prt" -> builtins.prt (ToValueList pel)
            | "ext" -> ast.String("Implement me! - call .NET libraries")
            | _ -> 
                let func_and_params = c.findFunction fn
                let pnl = fst func_and_params |> List.toArray
                let exprList = snd func_and_params
                let pvel = (ToValueList pel) |> List.toArray

                EvalExpr (ast.Codeblock(exprList)) (c.copyAndAddParameter (Array.zip pnl pvel |> List.ofArray))

        | ast.Value v -> v

        | ast.Reference r -> c.Variables.[r]

    let Eval (e:ast.expr) : ast.simpleValue =
        EvalExpr e ctx.emptyContext

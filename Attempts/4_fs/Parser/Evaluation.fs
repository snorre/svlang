namespace svlang
(* AST» *)

module evaluation =

    let rec EvalExpr (e:ast.expr) (c:ctx.Context) : ast.simpleValue =
        match e with
        | ast.Codeblock cb ->
            cb
                |> List.map (fun e -> EvalExpr e c)
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
            | "-" -> ast.String("Implement me!")
            | "+" -> builtins.plus (pel |> List.map (fun e -> EvalExpr e c))
            | "prt" -> builtins.prt (pel |> List.map (fun e -> EvalExpr e c))
            | "ext" -> ast.String("Implement me! - call .NET libraries")
            | _ -> 
                let func_and_params = c.findFunction fn
                let pnl = fst func_and_params |> List.toArray
                let exprList = snd func_and_params
                let pvel = pel |> List.map (fun p -> EvalExpr p c) |> List.toArray

                EvalExpr (ast.Codeblock(exprList)) (c.copyAndAddParameter (Array.zip pnl pvel |> List.ofArray))

        | ast.Value v -> v

        | ast.Reference r -> c.Variables.[r]


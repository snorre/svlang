namespace svlang

module builtins =

    // TODO: Return true if function was overwritten?
    let defn (c:ctx.Context) (expressions:ast.expr list) : ast.simpleValue =
        let fname = expressions.[0]
        let paramNames = expressions.[1]
        let exprList = expressions.[2]
        match (fname, paramNames, exprList) with
        | (ast.Value fn, ast.Value pnl, ast.Codeblock cb) -> 
            (
                match fn, pnl with
                | (ast.String fnS, ast.StringList pnlS) ->
                    c.addFunction fnS pnlS cb
                    ast.Bool(false)
                | _ -> raise (System.ArgumentException("Invalid arguments to defn"))
            )
        | (_,_,_) -> 
            raise (System.ArgumentException("Invalid arguments to defn"))

    let plus (values:ast.simpleValue list) : ast.simpleValue =
        let ints = values |> List.map (fun pv -> (ast.EvalValue pv) :?> int)
        ast.Number(ints |> List.sum)

    let var (c:ctx.Context) (name:string) (value:ast.simpleValue) : ast.simpleValue =
        c.addVariable (name, value)
        value

    let prt (values:ast.simpleValue list) : ast.simpleValue =
        let strings = values |> List.map (fun v -> (ast.EvalValue v))
        let output = System.String.Join(" ", strings)
        printfn "%s" output
        ast.String(output)

namespace svlang

open svlang.common

module builtins =

    let private getInt (value:ast.simpleValue) : int =
        (ast.EvalValue value) :?> int

    let private getInts (values:ast.simpleValue list) : int list =
        values |> List.map getInt

    let private error (msg:string) =
        raise (System.ArgumentException(msg))

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
                | _ -> error ("Invalid arguments to defn")
            )
        | (_,_,_) -> 
            error("Invalid arguments to defn")

    let plus (values:ast.simpleValue list) : ast.simpleValue =
        let ints = getInts values
        ast.Number(ints |> List.sum)

    let minus (values:ast.simpleValue list) : ast.simpleValue =
        // (- x y1 y2 y3) will return x - (y1 + y2 + y3)
        let ints = getInts values
        let x = ints.Head
        let sumYs = ints.Tail |> List.sum
        ast.Number((x-sumYs))

    let var (c:ctx.Context) (name:string) (value:ast.simpleValue) : ast.simpleValue =
        c.addVariable (name, value)
        value

    let prt (values:ast.simpleValue list) : ast.simpleValue =
        let strings = values |> List.map (fun v -> (ast.EvalValue v))
        let output = System.String.Join(" ", strings)
        printfn "%s" output
        ast.String(output)

//    let ext (values:ast.simpleValue list) : ast.simpleValue =
//        let t = System.Type.GetType "System.String"
//        let m = t.GetMethod "Substring"
//        t.InvokeMember(
//            "Substring", 
//            System.Reflection.BindingFlags.Static | System.Reflection.BindingFlags.Public | System.Reflection.BindingFlags.invo,
//        m
//        ast.Bool(true)

//    let gt (x:ast.simpleValue) (y:ast.simpleValue) : ast.simpleValue =
//        match (x, y) with
//        | (ast.Number x, ast.Number y) -> ast.Bool(x > y)
//        | (ast.String x, ast.String y) -> ast.Bool(x > y)
//        | (ast.Bool x, ast.Bool y) -> error("Cannot compare booleans")
//        | (_,_) -> error("Cannot compare types")


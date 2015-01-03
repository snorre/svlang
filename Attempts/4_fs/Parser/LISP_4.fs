//module lisp4

(* AST *)

type simpleValue =
    | Bool of bool
    | Number of int
    | String of string
    | StringList of string list

type expr = // things that can be evaluated to simpleValue
    | Codeblock of expr list    
    | Call of string * expr list
    | Value of simpleValue
    | Reference of string
    | Assignment of string * expr // returns the assigned simpleValue

(* Parser *)

let EvalValue (v:simpleValue) : obj =
    match v with
    | Bool b -> b :> obj
    | Number n -> n :> obj
    | String s -> s :> obj
    | StringList sl -> sl :> obj

type Context (variablesIn : Map<string, simpleValue>, functionsIn : Map<string, string list * expr list>) =
    let mutable variables = variablesIn
    let mutable functions = functionsIn

    member this.Variables with get() = variables

    member this.Functions with get() = functions

    member this.findFunction (fn:string) : string list * expr list =
        functions.[fn]

    member this.addVariable (p:string * simpleValue) =
        variables <- variables.Add p

    member this.addFunction (fName:string) (fParams:string list) (fExprList:expr list) =
        functions <- functions.Add (fName, (fParams, fExprList))

    member this.copyAndAddParameter (pList:List<string * simpleValue>) : Context =
        let newC = Context(variables, functions)
        pList |> List.iter (fun kv -> newC.addVariable kv)
        newC
    
    member this.copyAndAddFunction (fName:string) (fParams:string list) (fExprList:expr list) : Context =
        let newC = Context(variables, functions)
        newC.addFunction fName fParams fExprList
        newC

// TODO: Return true if function was overwritten?
let builtin_defn (ctx:Context) (expressions:expr list) : simpleValue =
    let fname = expressions.[0]
    let paramNames = expressions.[1]
    let exprList = expressions.[2]
    match (fname, paramNames, exprList) with
    | (Value fn, Value pnl, Codeblock cb) -> 
        (
            match fn, pnl with
            | (String fnS, StringList pnlS) ->
                ctx.addFunction fnS pnlS cb
                Bool(false)
            | _ -> raise (System.ArgumentException("Invalid arguments to defn"))
        )
    | (_,_,_) -> 
        raise (System.ArgumentException("Invalid arguments to defn"))

let builtin_var (ctx:Context) (name:string) (value:simpleValue) : simpleValue =
    ctx.addVariable (name, value)
    value

let builtin_plus (values:simpleValue list) : simpleValue =
    let ints = values |> List.map (fun pv -> (EvalValue pv) :?> int)
    Number(ints |> List.sum)

let builtin_prt (values:simpleValue list) : simpleValue =
    let strings = values |> List.map (fun v -> (EvalValue v))
    let output = System.String.Join(" ", strings)
    printfn "%s" output
    String(output)

let rec EvalExpr (e:expr) (ctx:Context) : simpleValue =
    match e with
    | Codeblock cb ->
        cb
            |> List.map (fun e -> EvalExpr e ctx)
            |> List.rev
            |> List.head // Returns the last value

    | Call (fn, pel) -> 
        match fn with
        | "defn" -> builtin_defn ctx pel
        | "var" -> 
            let vName = EvalValue (EvalExpr pel.[0] ctx) :?> string
            let vValue = EvalExpr pel.[1] ctx
            builtin_var ctx vName vValue
        | "if" ->
            String("Implement me!")
        | "+" -> builtin_plus (pel |> List.map (fun e -> EvalExpr e ctx))
        | "prt" -> builtin_prt (pel |> List.map (fun e -> EvalExpr e ctx))
        | _ -> 
            let func_and_params = ctx.findFunction fn
            let pnl = fst func_and_params |> List.toArray
            let exprList = snd func_and_params
            let pvel = pel |> List.map (fun p -> EvalExpr p ctx) |> List.toArray

            EvalExpr (Codeblock(exprList)) (ctx.copyAndAddParameter (Array.zip pnl pvel |> List.ofArray))

    | Value v -> v

    | Reference r -> ctx.Variables.[r]

let Run code = EvalExpr code (Context(Map.empty<string, simpleValue>, Map.empty<string, string list * expr list>))


let code_defn = 
    Call(
        "defn", 
        [
            Value(String("leggSammen")); 
            Value(StringList(["a"; "b"])); 
            Codeblock(
                [ 
                    Call("prt", [Value(String("Hei!")); Value(Bool(true)); Value(Number(123)); Value(StringList(["a"; "b"]))]);
                    Call("prt", [Value(String("Legger sammen")); Reference("a"); Value(String("og")); Reference("b")]);
                    Call("+", [Reference("a"); Reference("b") ])
                ]
            )
        ]
    )

let code_call = 
    Call(
        "leggSammen",
        [
            Value(Number(2));
            Value(Number(3))
        ]
    )
let code_assign =
    Codeblock(
        [
            Call("var", [Value(String("x")); Value(Number(4))])
            Call("+", [Reference("x"); Reference("x")])
        ]
    )
let code = Codeblock([ code_defn; code_call ])
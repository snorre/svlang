//module lisp4

(* AST *)

type simpleValue =
    | Bool of bool
    | Number of int
    | String of string

type expr = // things that can be evaluated to simpleValue
    | Codeblock of expr list    
    | Call of string * expr list
    | Value of simpleValue
    | Reference of string
    | Assignment of string * expr // returns the assigned simpleValue


(* Parser *)

type Context =
    struct
        val variables : Map<string, simpleValue>
    end

let EvalValue (v:simpleValue) : obj =
    match v with
    | Bool b -> b :> obj
    | Number n -> n :> obj
    | String s -> s :> obj


let rec EvalExpr (e:expr) (ctx:Context) : simpleValue =
    match e with
    | Codeblock cb ->
        cb
            |> List.map (fun e -> EvalExpr e ctx)
            |> List.rev
            |> List.head // Returns the last value

    | Call (c, pel) -> 
        // check builtins and call those
        // check for existance
        // call
        String("implement me!")

    | Value v -> v

    | Reference r -> String("implement me!")

    | Assignment (n, e) -> String("implement me!")
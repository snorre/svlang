//module lisp_3

type value =
    | Bool of bool
    | Number of int
    | String of string

type operator =
    | Plus
    | Minus

type expression =
    | Defn of string * string list * expression // TODO gjør om til builtin/operator?
    | Call of string * expression list
    | Value of value // TODO Slå sammen med call?
    | Operator of operator * expression list
    | MultiLine of expression list
    | Reference of string

let mutable declared_functions = Map.empty<string, expression * string list>

let EvalValue (v:value) : obj =
    match v with
    | Bool b -> b :> obj
    | Number n -> n :> obj
    | String s -> s :> obj

let EvalOp (op:operator) (pvel:List<value>) : value =

    match op with

    | Plus ->
        let ints = pvel |> List.map (fun pv -> (EvalValue pv) :?> int)
        Number(ints |> List.sum)

    | Minus ->
        String("Implement me!")

let rec Eval (exp:expression) (variables:Map<string, value>) : value =

    match exp with

    | MultiLine el -> 
        el 
            |> List.map (fun e -> Eval e variables)
            |> List.rev
            |> List.head // Return the last value

    | Defn (n, pnl, c) ->
        declared_functions <- declared_functions.Add (n, (c, pnl))
        String(n)

    | Operator (o, pvl) -> 
        let pvel = pvl |> List.map (fun pv -> Eval pv variables)
        EvalOp o pvel

    | Call (name, pvl) -> 
        let func_and_params = declared_functions.[name]
        let func = fst func_and_params
        let pnl = snd func_and_params |> List.toArray
        let pvel = pvl |> List.map (fun p -> Eval p variables) |> List.toArray

        Eval func (Array.zip pnl pvel |> Map.ofArray)

    | Value v -> v

    | Reference r -> variables.[r]

let Run code = Eval code Map.empty<string, value>

let code1 = Operator(Plus, [Value(Number(1)); Value(Number(2)) ]) // 3
let code2 = 
    Operator(Plus,
        [
            Value(Number(3));
            Operator(Minus, [ Value(Number(3)); Value(Number(2)) ])
        ]
    ) // 4
let code3 = Defn("jalla", ["a"; "b"], Operator(Plus, [ Reference("a"); Reference("b") ]))
let code4 = Call("jalla", [Value(Number(5)); Value(Number(6)); ])
let code5 = MultiLine([code3; code4])

// TODO Variabler på linjene
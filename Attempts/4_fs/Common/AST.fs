namespace svlang.common

module ast =

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

    let EvalValue (v:simpleValue) : obj =
        match v with
        | Bool b -> b :> obj
        | Number n -> n :> obj
        | String s -> s :> obj
        | StringList sl -> sl :> obj
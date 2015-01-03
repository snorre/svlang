namespace svlang


module ctx =

    type Context (variablesIn : Map<string, ast.simpleValue>, functionsIn : Map<string, string list * ast.expr list>) =
        let mutable variables = variablesIn
        let mutable functions = functionsIn

        member this.Variables with get() = variables

        member this.Functions with get() = functions

        member this.findFunction (fn:string) : string list * ast.expr list =
            functions.[fn]

        member this.addVariable (p:string * ast.simpleValue) =
            variables <- variables.Add p

        member this.addFunction (fName:string) (fParams:string list) (fExprList:ast.expr list) =
            functions <- functions.Add (fName, (fParams, fExprList))

        member this.copyAndAddParameter (pList:List<string * ast.simpleValue>) : Context =
            let newC = Context(variables, functions)
            pList |> List.iter (fun kv -> newC.addVariable kv)
            newC
        
        member this.copyAndAddFunction (fName:string) (fParams:string list) (fExprList:ast.expr list) : Context =
            let newC = Context(variables, functions)
            newC.addFunction fName fParams fExprList
            newC

    let emptyContext = Context(Map.empty<string, ast.simpleValue>, Map.empty<string, string list * ast.expr list>)
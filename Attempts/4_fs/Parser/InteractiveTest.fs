namespace svlang.test

open svlang 

module interactive_tests =

    let code_defn = 
        ast.Call(
            "defn", 
            [
                ast.Value(ast.String("leggSammen"));
                ast.Value(ast.StringList(["a"; "b"]));
                ast.Codeblock(
                    [ 
                        ast.Call("prt", [ast.Value(ast.String("Hei!")); ast.Value(ast.Bool(true)); ast.Value(ast.Number(123)); ast.Value(ast.StringList(["a"; "b"]))]);
                        ast.Call("prt", [ast.Value(ast.String("Legger sammen")); ast.Reference("a"); ast.Value(ast.String("og")); ast.Reference("b")]);
                        ast.Call("+", [ast.Reference("a"); ast.Reference("b") ])
                    ]
                )
            ]
        )

    let code_call = 
        ast.Call(
            "leggSammen",
            [
                ast.Value(ast.Number(2));
                ast.Value(ast.Number(3))
            ]
        )
    let code_assign =
        ast.Codeblock(
            [
                ast.Call("var", [ast.Value(ast.String("x")); ast.Value(ast.Number(4))])
                ast.Call("+", [ast.Reference("x"); ast.Reference("x")])
            ]
        )
    let code = ast.Codeblock([ code_defn; code_call ])

    let code_minus = ast.Call("-", [ast.Value(ast.Number(5)); ast.Value(ast.Number(2)); ast.Value(ast.Number(1)) ])
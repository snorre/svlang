namespace Tests

open System
open NUnit.Framework

open svlang
open svlang.common

module tb =

    let evaluatesTo expected code =
        let result = evaluation.Eval(code)
        Assert.AreEqual(expected, result)

    let code_add_p_and_p = ast.Call("+", [ast.Reference("p"); ast.Reference("p") ])
    let code_define_doubleNumber = 
        ast.Call(
            "defn", 
            [
                ast.Value(ast.String("doubleNumber"));
                ast.Value(ast.StringList(["p"]));
                ast.Codeblock([code_add_p_and_p])
            ]
        )

    let code_add_p_and_p_and_p = ast.Call("+", [ast.Reference("p"); ast.Reference("p"); ast.Reference("p") ])
    let code_define_doubleNumber_triple = 
        ast.Call(
            "defn", 
            [
                ast.Value(ast.String("doubleNumber"));
                ast.Value(ast.StringList(["p"]));
                ast.Codeblock([code_add_p_and_p_and_p])
            ]
        )
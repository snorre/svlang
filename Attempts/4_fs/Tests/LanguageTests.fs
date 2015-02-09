namespace Tests

open System
open NUnit.Framework
open svlang
open svlang.common


[<TestFixture>]
type LanguageTests() = 

    let code_add_1_and_2 = ast.Call("+", [ast.Value(ast.Number(1)); ast.Value(ast.Number(2)) ])

    [<Test>]
    member x.call_with_two_values() = 
        tb.evaluatesTo
            (ast.Number(3))
            code_add_1_and_2

    [<Test>]
    member x.call_with_value_and_expression() = 
        tb.evaluatesTo
            (ast.Number(5))
            (ast.Call(
                "+", 
                [
                    ast.Value(ast.Number(2));
                    code_add_1_and_2
                ]
            ))

    [<Test>]
    member x.call_with_parameter() =
        tb.evaluatesTo
            (ast.Number(12))
            (
                ast.Codeblock(
                    [
                        tb.code_define_doubleNumber;
                        ast.Call("doubleNumber", [ast.Value(ast.Number(6))])
                    ]
                )
            )

    [<Test>]
    member x.assign_variable() =
        tb.evaluatesTo
            (ast.Number(10))
            (
                ast.Codeblock(
                    [
                        ast.Call("var", [ast.Value(ast.String("p")); ast.Value(ast.Number(5))]);
                        tb.code_add_p_and_p
                    ]
                )
            )
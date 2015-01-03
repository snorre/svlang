namespace Tests

open System
open NUnit.Framework
open svlang

[<TestFixture>]
type BuiltinsTests() = 

    [<Test>]
    member x.defn_one_time() = 
        tb.evaluatesTo
            (ast.Number(6))
            (
                ast.Codeblock(
                    [
                        tb.code_define_doubleNumber; 
                        ast.Call("doubleNumber", [ast.Value(ast.Number(3))]) 
                    ]
                )
            )

    [<Test>]
    member x.defn_two_times() =
        tb.evaluatesTo
            (ast.Number(9))
            (
                ast.Codeblock(
                    [
                        tb.code_define_doubleNumber; 
                        tb.code_define_doubleNumber_triple;
                        ast.Call("doubleNumber", [ast.Value(ast.Number(3))]) 
                    ]
                )
            )

    [<Test>]
    member x.var() =
        tb.evaluatesTo
            (ast.String("abc"))
            (
                ast.Codeblock(
                    [
                        ast.Call("var", [ast.Value(ast.String("x")); ast.Value(ast.String("abc"))]);
                        ast.Reference("x")
                    ]
                )
            )

    [<Test>]
    member x.prt() =
        tb.evaluatesTo
            (ast.String("Hello World!"))
            (ast.Call("prt", [ast.Value(ast.String("Hello World!"))]))
            // Check manually if this was printed to console

    [<Test>]
    member x.minus() =
        tb.evaluatesTo
            (ast.Number(3))
            (ast.Call("-", [ast.Value(ast.Number(6)); ast.Value(ast.Number(2)); ast.Value(ast.Number(1));]))

    [<Test>]
    member x.plus() =
        tb.evaluatesTo
            (ast.Number(111))
            (ast.Call("+", [ast.Value(ast.Number(100)); ast.Value(ast.Number(10)); ast.Value(ast.Number(1));]))

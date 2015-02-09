namespace Tests
open System
open NUnit.Framework
open FParsec

[<TestFixture>]
type FParsecLearningTests() = 

    member x.test p str =
        match run p str with
        | Success(result, _, _)   -> printfn "Success: %A" result
        | Failure(errorMsg, _, _) -> printfn "Failure: %s" errorMsg

    [<Test>]
    member x.ParseFloat() =
        x.test pfloat "1.25"

    [<Test>]
    member x.ParseFloatWithinBrackets() =
        let str s = pstring s
        let floatInBrackets = str "[" >>. pfloat .>> str "]"
        x.test floatInBrackets "[1.23]"

    [<Test>]
    member x.ListOfFloatsWithinBrackets() =
        let str s = pstring s
        let floatInBrackets = str "[" >>. pfloat .>> str "]"
        x.test (many floatInBrackets) "[1][2.2][3.33]"

    [<Test>]
    member x.FloatList() =
        let floatList = pstring "[" >>. sepBy pfloat (pstring ",") .>> pstring "]"
        x.test floatList "[1,2.1,3.3,-4.4]"
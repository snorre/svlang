@echo off
set self=%~dp0%~1
java -jar %self%\antlr-4.5.1-complete.jar -o %self%\..\SubParsers -package SVLang.Parser.SubParsers -Dlanguage=CSharp %self%\SVLang.g4
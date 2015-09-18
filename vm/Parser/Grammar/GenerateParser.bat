@echo off
set self=%~dp0%~1
java -jar %self%\antlr-4.5.1-complete.jar -o %self%\..\GeneratedParser -package SVLang.Parser.GeneratedParser -Dlanguage=CSharp -Werror %self%\SVLang.g4
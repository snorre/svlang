@echo off
set self=%~dp0%~1
java -jar %self%\antlr-4.5.1-complete.jar -o %self%\..\SubParsers -Dlanguage=CSharp %self%\svlang.g4
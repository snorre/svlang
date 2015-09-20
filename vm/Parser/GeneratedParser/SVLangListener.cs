//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.5.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from C:\Dev\Egne\svlang\vm\Parser\Grammar\\SVLang.g4 by ANTLR 4.5.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591

namespace SVLang.Parser.GeneratedParser {
using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="SVLangParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.5.1")]
[System.CLSCompliant(false)]
public interface ISVLangListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpr([NotNull] SVLangParser.ExprContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpr([NotNull] SVLangParser.ExprContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.value"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterValue([NotNull] SVLangParser.ValueContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.value"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitValue([NotNull] SVLangParser.ValueContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.valuesingle"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterValuesingle([NotNull] SVLangParser.ValuesingleContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.valuesingle"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitValuesingle([NotNull] SVLangParser.ValuesingleContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.valuelist"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterValuelist([NotNull] SVLangParser.ValuelistContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.valuelist"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitValuelist([NotNull] SVLangParser.ValuelistContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.callFunction"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCallFunction([NotNull] SVLangParser.CallFunctionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.callFunction"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCallFunction([NotNull] SVLangParser.CallFunctionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.defineFunction"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDefineFunction([NotNull] SVLangParser.DefineFunctionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.defineFunction"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDefineFunction([NotNull] SVLangParser.DefineFunctionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.ifLine"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIfLine([NotNull] SVLangParser.IfLineContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.ifLine"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIfLine([NotNull] SVLangParser.IfLineContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.codeblock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCodeblock([NotNull] SVLangParser.CodeblockContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.codeblock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCodeblock([NotNull] SVLangParser.CodeblockContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.codeblockline"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCodeblockline([NotNull] SVLangParser.CodeblocklineContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.codeblockline"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCodeblockline([NotNull] SVLangParser.CodeblocklineContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.first"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFirst([NotNull] SVLangParser.FirstContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.first"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFirst([NotNull] SVLangParser.FirstContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.firstline"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFirstline([NotNull] SVLangParser.FirstlineContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.firstline"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFirstline([NotNull] SVLangParser.FirstlineContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.firstelse"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFirstelse([NotNull] SVLangParser.FirstelseContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.firstelse"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFirstelse([NotNull] SVLangParser.FirstelseContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.functionRef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFunctionRef([NotNull] SVLangParser.FunctionRefContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.functionRef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFunctionRef([NotNull] SVLangParser.FunctionRefContext context);
}
} // namespace SVLang.Parser.GeneratedParser

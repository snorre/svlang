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
using IErrorNode = Antlr4.Runtime.Tree.IErrorNode;
using ITerminalNode = Antlr4.Runtime.Tree.ITerminalNode;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="ISVLangListener"/>,
/// which can be extended to create a listener which only needs to handle a subset
/// of the available methods.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.5.1")]
[System.CLSCompliant(false)]
public partial class SVLangBaseListener : ISVLangListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterExpr([NotNull] SVLangParser.ExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitExpr([NotNull] SVLangParser.ExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.value"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterValue([NotNull] SVLangParser.ValueContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.value"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitValue([NotNull] SVLangParser.ValueContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.valuesingle"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterValuesingle([NotNull] SVLangParser.ValuesingleContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.valuesingle"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitValuesingle([NotNull] SVLangParser.ValuesingleContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.valuelist"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterValuelist([NotNull] SVLangParser.ValuelistContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.valuelist"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitValuelist([NotNull] SVLangParser.ValuelistContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.callFunction"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterCallFunction([NotNull] SVLangParser.CallFunctionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.callFunction"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitCallFunction([NotNull] SVLangParser.CallFunctionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.defineFunction"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterDefineFunction([NotNull] SVLangParser.DefineFunctionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.defineFunction"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitDefineFunction([NotNull] SVLangParser.DefineFunctionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.ifLine"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterIfLine([NotNull] SVLangParser.IfLineContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.ifLine"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitIfLine([NotNull] SVLangParser.IfLineContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.codeblock"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterCodeblock([NotNull] SVLangParser.CodeblockContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.codeblock"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitCodeblock([NotNull] SVLangParser.CodeblockContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.codeblockline"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterCodeblockline([NotNull] SVLangParser.CodeblocklineContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.codeblockline"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitCodeblockline([NotNull] SVLangParser.CodeblocklineContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.first"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFirst([NotNull] SVLangParser.FirstContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.first"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFirst([NotNull] SVLangParser.FirstContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.firstline"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFirstline([NotNull] SVLangParser.FirstlineContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.firstline"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFirstline([NotNull] SVLangParser.FirstlineContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="SVLangParser.firstelse"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFirstelse([NotNull] SVLangParser.FirstelseContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="SVLangParser.firstelse"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFirstelse([NotNull] SVLangParser.FirstelseContext context) { }

	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void EnterEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void ExitEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitTerminal([NotNull] ITerminalNode node) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitErrorNode([NotNull] IErrorNode node) { }
}
} // namespace SVLang.Parser.GeneratedParser

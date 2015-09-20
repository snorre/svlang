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
using System;
using System.Text;
using System.Diagnostics;
using System.Collections.Generic;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.5.1")]
[System.CLSCompliant(false)]
public partial class SVLangParser : Parser {
	public const int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		BOOL=10, NUM=11, STRING=12, VOID=13, ID=14, WS=15, EOL=16;
	public const int
		RULE_expr = 0, RULE_value = 1, RULE_valuesingle = 2, RULE_valuelist = 3, 
		RULE_callFunction = 4, RULE_defineFunction = 5, RULE_ifLine = 6, RULE_codeblock = 7, 
		RULE_codeblockline = 8, RULE_first = 9, RULE_firstline = 10, RULE_firstelse = 11;
	public static readonly string[] ruleNames = {
		"expr", "value", "valuesingle", "valuelist", "callFunction", "defineFunction", 
		"ifLine", "codeblock", "codeblockline", "first", "firstline", "firstelse"
	};

	private static readonly string[] _LiteralNames = {
		null, "'['", "']'", "'('", "')'", "'='", "'->'", "'{'", "'}'", "'first'", 
		null, null, null, "'void'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, null, null, null, null, null, null, "BOOL", "NUM", 
		"STRING", "VOID", "ID", "WS", "EOL"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "SVLang.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string SerializedAtn { get { return _serializedATN; } }

	public SVLangParser(ITokenStream input)
		: base(input)
	{
		Interpreter = new ParserATNSimulator(this,_ATN);
	}
	public partial class ExprContext : ParserRuleContext {
		public ValueContext value() {
			return GetRuleContext<ValueContext>(0);
		}
		public CallFunctionContext callFunction() {
			return GetRuleContext<CallFunctionContext>(0);
		}
		public DefineFunctionContext defineFunction() {
			return GetRuleContext<DefineFunctionContext>(0);
		}
		public IfLineContext ifLine() {
			return GetRuleContext<IfLineContext>(0);
		}
		public CodeblockContext codeblock() {
			return GetRuleContext<CodeblockContext>(0);
		}
		public FirstContext first() {
			return GetRuleContext<FirstContext>(0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_expr; } }
		public override void EnterRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.EnterExpr(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.ExitExpr(this);
		}
	}

	[RuleVersion(0)]
	public ExprContext expr() {
		ExprContext _localctx = new ExprContext(Context, State);
		EnterRule(_localctx, 0, RULE_expr);
		try {
			State = 30;
			switch ( Interpreter.AdaptivePredict(TokenStream,0,Context) ) {
			case 1:
				EnterOuterAlt(_localctx, 1);
				{
				State = 24; value();
				}
				break;
			case 2:
				EnterOuterAlt(_localctx, 2);
				{
				State = 25; callFunction();
				}
				break;
			case 3:
				EnterOuterAlt(_localctx, 3);
				{
				State = 26; defineFunction();
				}
				break;
			case 4:
				EnterOuterAlt(_localctx, 4);
				{
				State = 27; ifLine();
				}
				break;
			case 5:
				EnterOuterAlt(_localctx, 5);
				{
				State = 28; codeblock();
				}
				break;
			case 6:
				EnterOuterAlt(_localctx, 6);
				{
				State = 29; first();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class ValueContext : ParserRuleContext {
		public ValuesingleContext valuesingle() {
			return GetRuleContext<ValuesingleContext>(0);
		}
		public ValuelistContext valuelist() {
			return GetRuleContext<ValuelistContext>(0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_value; } }
		public override void EnterRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.EnterValue(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.ExitValue(this);
		}
	}

	[RuleVersion(0)]
	public ValueContext value() {
		ValueContext _localctx = new ValueContext(Context, State);
		EnterRule(_localctx, 2, RULE_value);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 34;
			switch (TokenStream.La(1)) {
			case BOOL:
			case NUM:
			case STRING:
			case VOID:
				{
				State = 32; valuesingle();
				}
				break;
			case T__0:
				{
				State = 33; valuelist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class ValuesingleContext : ParserRuleContext {
		public ITerminalNode BOOL() { return GetToken(SVLangParser.BOOL, 0); }
		public ITerminalNode NUM() { return GetToken(SVLangParser.NUM, 0); }
		public ITerminalNode STRING() { return GetToken(SVLangParser.STRING, 0); }
		public ITerminalNode VOID() { return GetToken(SVLangParser.VOID, 0); }
		public ValuesingleContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_valuesingle; } }
		public override void EnterRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.EnterValuesingle(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.ExitValuesingle(this);
		}
	}

	[RuleVersion(0)]
	public ValuesingleContext valuesingle() {
		ValuesingleContext _localctx = new ValuesingleContext(Context, State);
		EnterRule(_localctx, 4, RULE_valuesingle);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 36;
			_la = TokenStream.La(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NUM) | (1L << STRING) | (1L << VOID))) != 0)) ) {
			ErrorHandler.RecoverInline(this);
			}
			else {
			    Consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class ValuelistContext : ParserRuleContext {
		public ValuesingleContext[] valuesingle() {
			return GetRuleContexts<ValuesingleContext>();
		}
		public ValuesingleContext valuesingle(int i) {
			return GetRuleContext<ValuesingleContext>(i);
		}
		public ValuelistContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_valuelist; } }
		public override void EnterRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.EnterValuelist(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.ExitValuelist(this);
		}
	}

	[RuleVersion(0)]
	public ValuelistContext valuelist() {
		ValuelistContext _localctx = new ValuelistContext(Context, State);
		EnterRule(_localctx, 6, RULE_valuelist);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 38; Match(T__0);
			State = 42;
			ErrorHandler.Sync(this);
			_la = TokenStream.La(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NUM) | (1L << STRING) | (1L << VOID))) != 0)) {
				{
				{
				State = 39; valuesingle();
				}
				}
				State = 44;
				ErrorHandler.Sync(this);
				_la = TokenStream.La(1);
			}
			State = 45; Match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class CallFunctionContext : ParserRuleContext {
		public ITerminalNode ID() { return GetToken(SVLangParser.ID, 0); }
		public ExprContext[] expr() {
			return GetRuleContexts<ExprContext>();
		}
		public ExprContext expr(int i) {
			return GetRuleContext<ExprContext>(i);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_callFunction; } }
		public override void EnterRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.EnterCallFunction(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.ExitCallFunction(this);
		}
	}

	[RuleVersion(0)]
	public CallFunctionContext callFunction() {
		CallFunctionContext _localctx = new CallFunctionContext(Context, State);
		EnterRule(_localctx, 8, RULE_callFunction);
		int _la;
		try {
			State = 57;
			switch (TokenStream.La(1)) {
			case T__2:
				EnterOuterAlt(_localctx, 1);
				{
				State = 47; Match(T__2);
				State = 48; Match(ID);
				State = 52;
				ErrorHandler.Sync(this);
				_la = TokenStream.La(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__8) | (1L << BOOL) | (1L << NUM) | (1L << STRING) | (1L << VOID) | (1L << ID))) != 0)) {
					{
					{
					State = 49; expr();
					}
					}
					State = 54;
					ErrorHandler.Sync(this);
					_la = TokenStream.La(1);
				}
				State = 55; Match(T__3);
				}
				break;
			case ID:
				EnterOuterAlt(_localctx, 2);
				{
				State = 56; Match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class DefineFunctionContext : ParserRuleContext {
		public ValueContext value() {
			return GetRuleContext<ValueContext>(0);
		}
		public CodeblockContext codeblock() {
			return GetRuleContext<CodeblockContext>(0);
		}
		public CallFunctionContext callFunction() {
			return GetRuleContext<CallFunctionContext>(0);
		}
		public ITerminalNode[] ID() { return GetTokens(SVLangParser.ID); }
		public ITerminalNode ID(int i) {
			return GetToken(SVLangParser.ID, i);
		}
		public DefineFunctionContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_defineFunction; } }
		public override void EnterRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.EnterDefineFunction(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.ExitDefineFunction(this);
		}
	}

	[RuleVersion(0)]
	public DefineFunctionContext defineFunction() {
		DefineFunctionContext _localctx = new DefineFunctionContext(Context, State);
		EnterRule(_localctx, 10, RULE_defineFunction);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 60;
			ErrorHandler.Sync(this);
			_la = TokenStream.La(1);
			do {
				{
				{
				State = 59; Match(ID);
				}
				}
				State = 62;
				ErrorHandler.Sync(this);
				_la = TokenStream.La(1);
			} while ( _la==ID );
			State = 64; Match(T__4);
			State = 68;
			switch (TokenStream.La(1)) {
			case T__0:
			case BOOL:
			case NUM:
			case STRING:
			case VOID:
				{
				State = 65; value();
				}
				break;
			case T__6:
				{
				State = 66; codeblock();
				}
				break;
			case T__2:
			case ID:
				{
				State = 67; callFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class IfLineContext : ParserRuleContext {
		public CallFunctionContext[] callFunction() {
			return GetRuleContexts<CallFunctionContext>();
		}
		public CallFunctionContext callFunction(int i) {
			return GetRuleContext<CallFunctionContext>(i);
		}
		public ValueContext value() {
			return GetRuleContext<ValueContext>(0);
		}
		public IfLineContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_ifLine; } }
		public override void EnterRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.EnterIfLine(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.ExitIfLine(this);
		}
	}

	[RuleVersion(0)]
	public IfLineContext ifLine() {
		IfLineContext _localctx = new IfLineContext(Context, State);
		EnterRule(_localctx, 12, RULE_ifLine);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 70; callFunction();
			State = 71; Match(T__5);
			State = 74;
			switch (TokenStream.La(1)) {
			case T__2:
			case ID:
				{
				State = 72; callFunction();
				}
				break;
			case T__0:
			case BOOL:
			case NUM:
			case STRING:
			case VOID:
				{
				State = 73; value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class CodeblockContext : ParserRuleContext {
		public ITerminalNode EOL() { return GetToken(SVLangParser.EOL, 0); }
		public CodeblocklineContext[] codeblockline() {
			return GetRuleContexts<CodeblocklineContext>();
		}
		public CodeblocklineContext codeblockline(int i) {
			return GetRuleContext<CodeblocklineContext>(i);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_codeblock; } }
		public override void EnterRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.EnterCodeblock(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.ExitCodeblock(this);
		}
	}

	[RuleVersion(0)]
	public CodeblockContext codeblock() {
		CodeblockContext _localctx = new CodeblockContext(Context, State);
		EnterRule(_localctx, 14, RULE_codeblock);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 76; Match(T__6);
			State = 77; Match(EOL);
			State = 81;
			ErrorHandler.Sync(this);
			_la = TokenStream.La(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__8) | (1L << BOOL) | (1L << NUM) | (1L << STRING) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				{
				State = 78; codeblockline();
				}
				}
				State = 83;
				ErrorHandler.Sync(this);
				_la = TokenStream.La(1);
			}
			State = 84; Match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class CodeblocklineContext : ParserRuleContext {
		public ExprContext expr() {
			return GetRuleContext<ExprContext>(0);
		}
		public ITerminalNode EOL() { return GetToken(SVLangParser.EOL, 0); }
		public CodeblocklineContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_codeblockline; } }
		public override void EnterRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.EnterCodeblockline(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.ExitCodeblockline(this);
		}
	}

	[RuleVersion(0)]
	public CodeblocklineContext codeblockline() {
		CodeblocklineContext _localctx = new CodeblocklineContext(Context, State);
		EnterRule(_localctx, 16, RULE_codeblockline);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 86; expr();
			State = 87; Match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class FirstContext : ParserRuleContext {
		public ITerminalNode EOL() { return GetToken(SVLangParser.EOL, 0); }
		public FirstlineContext[] firstline() {
			return GetRuleContexts<FirstlineContext>();
		}
		public FirstlineContext firstline(int i) {
			return GetRuleContext<FirstlineContext>(i);
		}
		public FirstelseContext firstelse() {
			return GetRuleContext<FirstelseContext>(0);
		}
		public FirstContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_first; } }
		public override void EnterRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.EnterFirst(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.ExitFirst(this);
		}
	}

	[RuleVersion(0)]
	public FirstContext first() {
		FirstContext _localctx = new FirstContext(Context, State);
		EnterRule(_localctx, 18, RULE_first);
		int _la;
		try {
			int _alt;
			EnterOuterAlt(_localctx, 1);
			{
			State = 89; Match(T__8);
			State = 90; Match(T__6);
			State = 91; Match(EOL);
			State = 93;
			ErrorHandler.Sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					State = 92; firstline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				State = 95;
				ErrorHandler.Sync(this);
				_alt = Interpreter.AdaptivePredict(TokenStream,9,Context);
			} while ( _alt!=2 && _alt!=global::Antlr4.Runtime.Atn.ATN.InvalidAltNumber );
			State = 98;
			_la = TokenStream.La(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << BOOL) | (1L << NUM) | (1L << STRING) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				State = 97; firstelse();
				}
			}

			State = 100; Match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class FirstlineContext : ParserRuleContext {
		public IfLineContext ifLine() {
			return GetRuleContext<IfLineContext>(0);
		}
		public ITerminalNode EOL() { return GetToken(SVLangParser.EOL, 0); }
		public FirstlineContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_firstline; } }
		public override void EnterRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.EnterFirstline(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.ExitFirstline(this);
		}
	}

	[RuleVersion(0)]
	public FirstlineContext firstline() {
		FirstlineContext _localctx = new FirstlineContext(Context, State);
		EnterRule(_localctx, 20, RULE_firstline);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 102; ifLine();
			State = 103; Match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class FirstelseContext : ParserRuleContext {
		public ITerminalNode EOL() { return GetToken(SVLangParser.EOL, 0); }
		public ValueContext value() {
			return GetRuleContext<ValueContext>(0);
		}
		public CallFunctionContext callFunction() {
			return GetRuleContext<CallFunctionContext>(0);
		}
		public FirstelseContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_firstelse; } }
		public override void EnterRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.EnterFirstelse(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			ISVLangListener typedListener = listener as ISVLangListener;
			if (typedListener != null) typedListener.ExitFirstelse(this);
		}
	}

	[RuleVersion(0)]
	public FirstelseContext firstelse() {
		FirstelseContext _localctx = new FirstelseContext(Context, State);
		EnterRule(_localctx, 22, RULE_firstelse);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 107;
			switch (TokenStream.La(1)) {
			case T__0:
			case BOOL:
			case NUM:
			case STRING:
			case VOID:
				{
				State = 105; value();
				}
				break;
			case T__2:
			case ID:
				{
				State = 106; callFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			State = 109; Match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public static readonly string _serializedATN =
		"\x3\x430\xD6D1\x8206\xAD2D\x4417\xAEF1\x8D80\xAADD\x3\x12r\x4\x2\t\x2"+
		"\x4\x3\t\x3\x4\x4\t\x4\x4\x5\t\x5\x4\x6\t\x6\x4\a\t\a\x4\b\t\b\x4\t\t"+
		"\t\x4\n\t\n\x4\v\t\v\x4\f\t\f\x4\r\t\r\x3\x2\x3\x2\x3\x2\x3\x2\x3\x2\x3"+
		"\x2\x5\x2!\n\x2\x3\x3\x3\x3\x5\x3%\n\x3\x3\x4\x3\x4\x3\x5\x3\x5\a\x5+"+
		"\n\x5\f\x5\xE\x5.\v\x5\x3\x5\x3\x5\x3\x6\x3\x6\x3\x6\a\x6\x35\n\x6\f\x6"+
		"\xE\x6\x38\v\x6\x3\x6\x3\x6\x5\x6<\n\x6\x3\a\x6\a?\n\a\r\a\xE\a@\x3\a"+
		"\x3\a\x3\a\x3\a\x5\aG\n\a\x3\b\x3\b\x3\b\x3\b\x5\bM\n\b\x3\t\x3\t\x3\t"+
		"\a\tR\n\t\f\t\xE\tU\v\t\x3\t\x3\t\x3\n\x3\n\x3\n\x3\v\x3\v\x3\v\x3\v\x6"+
		"\v`\n\v\r\v\xE\v\x61\x3\v\x5\v\x65\n\v\x3\v\x3\v\x3\f\x3\f\x3\f\x3\r\x3"+
		"\r\x5\rn\n\r\x3\r\x3\r\x3\r\x2\x2\xE\x2\x4\x6\b\n\f\xE\x10\x12\x14\x16"+
		"\x18\x2\x3\x3\x2\f\xFv\x2 \x3\x2\x2\x2\x4$\x3\x2\x2\x2\x6&\x3\x2\x2\x2"+
		"\b(\x3\x2\x2\x2\n;\x3\x2\x2\x2\f>\x3\x2\x2\x2\xEH\x3\x2\x2\x2\x10N\x3"+
		"\x2\x2\x2\x12X\x3\x2\x2\x2\x14[\x3\x2\x2\x2\x16h\x3\x2\x2\x2\x18m\x3\x2"+
		"\x2\x2\x1A!\x5\x4\x3\x2\x1B!\x5\n\x6\x2\x1C!\x5\f\a\x2\x1D!\x5\xE\b\x2"+
		"\x1E!\x5\x10\t\x2\x1F!\x5\x14\v\x2 \x1A\x3\x2\x2\x2 \x1B\x3\x2\x2\x2 "+
		"\x1C\x3\x2\x2\x2 \x1D\x3\x2\x2\x2 \x1E\x3\x2\x2\x2 \x1F\x3\x2\x2\x2!\x3"+
		"\x3\x2\x2\x2\"%\x5\x6\x4\x2#%\x5\b\x5\x2$\"\x3\x2\x2\x2$#\x3\x2\x2\x2"+
		"%\x5\x3\x2\x2\x2&\'\t\x2\x2\x2\'\a\x3\x2\x2\x2(,\a\x3\x2\x2)+\x5\x6\x4"+
		"\x2*)\x3\x2\x2\x2+.\x3\x2\x2\x2,*\x3\x2\x2\x2,-\x3\x2\x2\x2-/\x3\x2\x2"+
		"\x2.,\x3\x2\x2\x2/\x30\a\x4\x2\x2\x30\t\x3\x2\x2\x2\x31\x32\a\x5\x2\x2"+
		"\x32\x36\a\x10\x2\x2\x33\x35\x5\x2\x2\x2\x34\x33\x3\x2\x2\x2\x35\x38\x3"+
		"\x2\x2\x2\x36\x34\x3\x2\x2\x2\x36\x37\x3\x2\x2\x2\x37\x39\x3\x2\x2\x2"+
		"\x38\x36\x3\x2\x2\x2\x39<\a\x6\x2\x2:<\a\x10\x2\x2;\x31\x3\x2\x2\x2;:"+
		"\x3\x2\x2\x2<\v\x3\x2\x2\x2=?\a\x10\x2\x2>=\x3\x2\x2\x2?@\x3\x2\x2\x2"+
		"@>\x3\x2\x2\x2@\x41\x3\x2\x2\x2\x41\x42\x3\x2\x2\x2\x42\x46\a\a\x2\x2"+
		"\x43G\x5\x4\x3\x2\x44G\x5\x10\t\x2\x45G\x5\n\x6\x2\x46\x43\x3\x2\x2\x2"+
		"\x46\x44\x3\x2\x2\x2\x46\x45\x3\x2\x2\x2G\r\x3\x2\x2\x2HI\x5\n\x6\x2I"+
		"L\a\b\x2\x2JM\x5\n\x6\x2KM\x5\x4\x3\x2LJ\x3\x2\x2\x2LK\x3\x2\x2\x2M\xF"+
		"\x3\x2\x2\x2NO\a\t\x2\x2OS\a\x12\x2\x2PR\x5\x12\n\x2QP\x3\x2\x2\x2RU\x3"+
		"\x2\x2\x2SQ\x3\x2\x2\x2ST\x3\x2\x2\x2TV\x3\x2\x2\x2US\x3\x2\x2\x2VW\a"+
		"\n\x2\x2W\x11\x3\x2\x2\x2XY\x5\x2\x2\x2YZ\a\x12\x2\x2Z\x13\x3\x2\x2\x2"+
		"[\\\a\v\x2\x2\\]\a\t\x2\x2]_\a\x12\x2\x2^`\x5\x16\f\x2_^\x3\x2\x2\x2`"+
		"\x61\x3\x2\x2\x2\x61_\x3\x2\x2\x2\x61\x62\x3\x2\x2\x2\x62\x64\x3\x2\x2"+
		"\x2\x63\x65\x5\x18\r\x2\x64\x63\x3\x2\x2\x2\x64\x65\x3\x2\x2\x2\x65\x66"+
		"\x3\x2\x2\x2\x66g\a\n\x2\x2g\x15\x3\x2\x2\x2hi\x5\xE\b\x2ij\a\x12\x2\x2"+
		"j\x17\x3\x2\x2\x2kn\x5\x4\x3\x2ln\x5\n\x6\x2mk\x3\x2\x2\x2ml\x3\x2\x2"+
		"\x2no\x3\x2\x2\x2op\a\x12\x2\x2p\x19\x3\x2\x2\x2\xE $,\x36;@\x46LS\x61"+
		"\x64m";
	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN.ToCharArray());
}
} // namespace SVLang.Parser.GeneratedParser

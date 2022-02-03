// Generated from TExprParser.g4 by ANTLR 4.6

    package io.tauris.expression.ast;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Integer=1, Float=2, Boolean=3, String=4, AND=5, OR=6, NOT=7, IS=8, IN=9, 
		TRUE=10, FALSE=11, ENDSWITH=12, STARTSWITH=13, EXISTS=14, GT=15, GE=16, 
		LT=17, LE=18, EQ=19, NE=20, MATCH=21, LPAREN=22, RPAREN=23, INT=24, FLOAT=25, 
		IDENTIFIER=26, VARIABLE=27, PLUS=28, MINUS=29, MUL=30, DIV=31, MOD=32, 
		POINT=33, E=34, LSHIFT=35, RSHIFT=36, RSHIFT3=37, BAND=38, BEOR=39, BIOR=40, 
		NL=41, DIGIT=42, COMMA=43, LBRACKET=44, RBRACKET=45, WS=46, SLASH=47, 
		REGEX=48;
	public static final int
		RULE_parse = 0, RULE_expression = 1, RULE_variable = 2, RULE_comparator = 3, 
		RULE_binary = 4, RULE_sewith = 5, RULE_bool = 6, RULE_exists = 7, RULE_literal = 8, 
		RULE_container = 9, RULE_array = 10, RULE_calc = 11, RULE_bit = 12, RULE_shift = 13, 
		RULE_plus = 14, RULE_multiplying = 15, RULE_atom = 16, RULE_scientific = 17, 
		RULE_function = 18, RULE_funcname = 19, RULE_parameters = 20, RULE_number = 21, 
		RULE_regex = 22, RULE_type = 23, RULE_strings = 24, RULE_integers = 25, 
		RULE_floats = 26, RULE_booleans = 27;
	public static final String[] ruleNames = {
		"parse", "expression", "variable", "comparator", "binary", "sewith", "bool", 
		"exists", "literal", "container", "array", "calc", "bit", "shift", "plus", 
		"multiplying", "atom", "scientific", "function", "funcname", "parameters", 
		"number", "regex", "type", "strings", "integers", "floats", "booleans"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'&&'", "'||'", "'not'", "'is'", "'in'", 
		"'true'", "'false'", "'endswith'", "'startswith'", "'exists'", "'>'", 
		"'>='", "'<'", "'<='", "'=='", "'!='", "'=~'", "'('", "')'", null, null, 
		null, null, "'+'", "'-'", "'*'", null, "'%'", "'.'", null, "'<<'", "'>>'", 
		"'>>>'", "'&'", "'^'", "'|'", "'\n'", null, "','", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Integer", "Float", "Boolean", "String", "AND", "OR", "NOT", "IS", 
		"IN", "TRUE", "FALSE", "ENDSWITH", "STARTSWITH", "EXISTS", "GT", "GE", 
		"LT", "LE", "EQ", "NE", "MATCH", "LPAREN", "RPAREN", "INT", "FLOAT", "IDENTIFIER", 
		"VARIABLE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POINT", "E", "LSHIFT", 
		"RSHIFT", "RSHIFT3", "BAND", "BEOR", "BIOR", "NL", "DIGIT", "COMMA", "LBRACKET", 
		"RBRACKET", "WS", "SLASH", "REGEX"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TExprParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TExprParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			expression(0);
			setState(57);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MatchExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(TExprParser.MATCH, 0); }
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public MatchExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitMatchExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsTypeExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(TExprParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IsTypeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitIsTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(TExprParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(TExprParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TExprParser.RPAREN, 0); }
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExpressionContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SewithExpressionContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SewithContext sewith() {
			return getRuleContext(SewithContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SewithExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitSewithExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(TExprParser.IN, 0); }
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsExpressionContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExistsContext exists() {
			return getRuleContext(ExistsContext.class,0);
		}
		public ExistsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitExistsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalcExpressionContext extends ExpressionContext {
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public CalcExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitCalcExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsNotTypeExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(TExprParser.IS, 0); }
		public TerminalNode NOT() { return getToken(TExprParser.NOT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IsNotTypeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitIsNotTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotInExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TExprParser.NOT, 0); }
		public TerminalNode IN() { return getToken(TExprParser.IN, 0); }
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public NotInExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitNotInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparatorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ComparatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitComparatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(60);
				match(LPAREN);
				setState(61);
				expression(0);
				setState(62);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(NOT);
				setState(65);
				expression(12);
				}
				break;
			case 3:
				{
				_localctx = new SewithExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				variable();
				setState(67);
				sewith();
				setState(68);
				expression(4);
				}
				break;
			case 4:
				{
				_localctx = new ExistsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				variable();
				setState(71);
				exists();
				}
				break;
			case 5:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				variable();
				}
				break;
			case 6:
				{
				_localctx = new CalcExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				calc();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ComparatorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(78);
						comparator();
						setState(79);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(81);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(82);
						binary();
						setState(83);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(85);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(86);
						match(IN);
						setState(87);
						container();
						}
						break;
					case 4:
						{
						_localctx = new NotInExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(89);
						match(NOT);
						setState(90);
						match(IN);
						setState(91);
						container();
						}
						break;
					case 5:
						{
						_localctx = new MatchExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(93);
						match(MATCH);
						setState(94);
						regex();
						}
						break;
					case 6:
						{
						_localctx = new IsTypeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(96);
						match(IS);
						setState(97);
						type();
						}
						break;
					case 7:
						{
						_localctx = new IsNotTypeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(99);
						match(IS);
						setState(100);
						match(NOT);
						setState(101);
						type();
						}
						break;
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(TExprParser.VARIABLE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(VARIABLE);
				}
				break;
			case Integer:
			case Float:
			case Boolean:
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				literal();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(TExprParser.GT, 0); }
		public TerminalNode GE() { return getToken(TExprParser.GE, 0); }
		public TerminalNode LT() { return getToken(TExprParser.LT, 0); }
		public TerminalNode LE() { return getToken(TExprParser.LE, 0); }
		public TerminalNode EQ() { return getToken(TExprParser.EQ, 0); }
		public TerminalNode NE() { return getToken(TExprParser.NE, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(TExprParser.AND, 0); }
		public TerminalNode OR() { return getToken(TExprParser.OR, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SewithContext extends ParserRuleContext {
		public TerminalNode STARTSWITH() { return getToken(TExprParser.STARTSWITH, 0); }
		public TerminalNode ENDSWITH() { return getToken(TExprParser.ENDSWITH, 0); }
		public SewithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sewith; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitSewith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SewithContext sewith() throws RecognitionException {
		SewithContext _localctx = new SewithContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sewith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==ENDSWITH || _la==STARTSWITH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(TExprParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TExprParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistsContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(TExprParser.EXISTS, 0); }
		public ExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exists; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsContext exists() throws RecognitionException {
		ExistsContext _localctx = new ExistsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(TExprParser.String, 0); }
		public TerminalNode Integer() { return getToken(TExprParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TExprParser.Float, 0); }
		public TerminalNode Boolean() { return getToken(TExprParser.Boolean, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << Float) | (1L << Boolean) | (1L << String))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainerContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode String() { return getToken(TExprParser.String, 0); }
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_container);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(String);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(TExprParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(TExprParser.RBRACKET, 0); }
		public IntegersContext integers() {
			return getRuleContext(IntegersContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public FloatsContext floats() {
			return getRuleContext(FloatsContext.class,0);
		}
		public BooleansContext booleans() {
			return getRuleContext(BooleansContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(LBRACKET);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Integer) {
					{
					setState(130);
					integers();
					}
				}

				setState(133);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(LBRACKET);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==String) {
					{
					setState(135);
					strings();
					}
				}

				setState(138);
				match(RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(LBRACKET);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Float) {
					{
					setState(140);
					floats();
					}
				}

				setState(143);
				match(RBRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(LBRACKET);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Boolean) {
					{
					setState(145);
					booleans();
					}
				}

				setState(148);
				match(RBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalcContext extends ParserRuleContext {
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			bit(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitContext extends ParserRuleContext {
		public ShiftContext shift() {
			return getRuleContext(ShiftContext.class,0);
		}
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public TerminalNode BAND() { return getToken(TExprParser.BAND, 0); }
		public TerminalNode BEOR() { return getToken(TExprParser.BEOR, 0); }
		public TerminalNode BIOR() { return getToken(TExprParser.BIOR, 0); }
		public BitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitBit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitContext bit() throws RecognitionException {
		return bit(0);
	}

	private BitContext bit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitContext _localctx = new BitContext(_ctx, _parentState);
		BitContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_bit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(154);
			shift(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new BitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit);
						setState(156);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(157);
						match(BAND);
						setState(158);
						shift(0);
						}
						break;
					case 2:
						{
						_localctx = new BitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit);
						setState(159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(160);
						match(BEOR);
						setState(161);
						shift(0);
						}
						break;
					case 3:
						{
						_localctx = new BitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit);
						setState(162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(163);
						match(BIOR);
						setState(164);
						shift(0);
						}
						break;
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftContext extends ParserRuleContext {
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public ShiftContext shift() {
			return getRuleContext(ShiftContext.class,0);
		}
		public TerminalNode LSHIFT() { return getToken(TExprParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(TExprParser.RSHIFT, 0); }
		public TerminalNode RSHIFT3() { return getToken(TExprParser.RSHIFT3, 0); }
		public ShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitShift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftContext shift() throws RecognitionException {
		return shift(0);
	}

	private ShiftContext shift(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftContext _localctx = new ShiftContext(_ctx, _parentState);
		ShiftContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_shift, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(171);
			plus(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shift);
						setState(173);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(174);
						match(LSHIFT);
						setState(175);
						plus(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shift);
						setState(176);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(177);
						match(RSHIFT);
						setState(178);
						plus(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shift);
						setState(179);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(180);
						match(RSHIFT3);
						setState(181);
						plus(0);
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PlusContext extends ParserRuleContext {
		public MultiplyingContext multiplying() {
			return getRuleContext(MultiplyingContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(TExprParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TExprParser.MINUS, 0); }
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		return plus(0);
	}

	private PlusContext plus(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PlusContext _localctx = new PlusContext(_ctx, _parentState);
		PlusContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_plus, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(188);
			multiplying(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_plus);
						setState(190);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(191);
						match(PLUS);
						setState(192);
						multiplying(0);
						}
						break;
					case 2:
						{
						_localctx = new PlusContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_plus);
						setState(193);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(194);
						match(MINUS);
						setState(195);
						multiplying(0);
						}
						break;
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplyingContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public MultiplyingContext multiplying() {
			return getRuleContext(MultiplyingContext.class,0);
		}
		public TerminalNode MUL() { return getToken(TExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TExprParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(TExprParser.MOD, 0); }
		public MultiplyingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplying; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitMultiplying(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingContext multiplying() throws RecognitionException {
		return multiplying(0);
	}

	private MultiplyingContext multiplying(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplyingContext _localctx = new MultiplyingContext(_ctx, _parentState);
		MultiplyingContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_multiplying, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(202);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyingContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplying);
						setState(204);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(205);
						match(MUL);
						setState(206);
						atom();
						}
						break;
					case 2:
						{
						_localctx = new MultiplyingContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplying);
						setState(207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208);
						match(DIV);
						setState(209);
						atom();
						}
						break;
					case 3:
						{
						_localctx = new MultiplyingContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplying);
						setState(210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(211);
						match(MOD);
						setState(212);
						atom();
						}
						break;
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ScientificContext scientific() {
			return getRuleContext(ScientificContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TExprParser.LPAREN, 0); }
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TExprParser.RPAREN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atom);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
			case Boolean:
			case String:
			case VARIABLE:
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				variable();
				}
				break;
			case MINUS:
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				scientific();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(LPAREN);
				setState(221);
				bit(0);
				setState(222);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScientificContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode E() { return getToken(TExprParser.E, 0); }
		public ScientificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitScientific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_scientific);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				number();
				setState(228);
				match(E);
				setState(229);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				number();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TExprParser.LPAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TExprParser.RPAREN, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			funcname();
			setState(235);
			match(LPAREN);
			setState(236);
			parameters();
			setState(237);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncnameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TExprParser.IDENTIFIER, 0); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			expression(0);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				expression(0);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(TExprParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(TExprParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TExprParser.DIGIT, i);
		}
		public TerminalNode POINT() { return getToken(TExprParser.POINT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(249);
				match(MINUS);
				}
			}

			setState(253); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(252);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(255); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(257);
				match(POINT);
				setState(259); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(258);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(261); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegexContext extends ParserRuleContext {
		public TerminalNode REGEX() { return getToken(TExprParser.REGEX, 0); }
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_regex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(REGEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TExprParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringsContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(TExprParser.String); }
		public TerminalNode String(int i) {
			return getToken(TExprParser.String, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TExprParser.COMMA, i);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_strings);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(String);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					match(COMMA);
					setState(271);
					match(String);
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(277);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegersContext extends ParserRuleContext {
		public List<TerminalNode> Integer() { return getTokens(TExprParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(TExprParser.Integer, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TExprParser.COMMA, i);
		}
		public IntegersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitIntegers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegersContext integers() throws RecognitionException {
		IntegersContext _localctx = new IntegersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_integers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(Integer);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					match(COMMA);
					setState(282);
					match(Integer);
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(288);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatsContext extends ParserRuleContext {
		public List<TerminalNode> Float() { return getTokens(TExprParser.Float); }
		public TerminalNode Float(int i) {
			return getToken(TExprParser.Float, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TExprParser.COMMA, i);
		}
		public FloatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floats; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitFloats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatsContext floats() throws RecognitionException {
		FloatsContext _localctx = new FloatsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_floats);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(Float);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(292);
					match(COMMA);
					setState(293);
					match(Float);
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(299);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleansContext extends ParserRuleContext {
		public List<TerminalNode> Boolean() { return getTokens(TExprParser.Boolean); }
		public TerminalNode Boolean(int i) {
			return getToken(TExprParser.Boolean, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TExprParser.COMMA, i);
		}
		public BooleansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleans; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TExprParserVisitor ) return ((TExprParserVisitor<? extends T>)visitor).visitBooleans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleansContext booleans() throws RecognitionException {
		BooleansContext _localctx = new BooleansContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_booleans);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(Boolean);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					match(COMMA);
					setState(304);
					match(Boolean);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(310);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 12:
			return bit_sempred((BitContext)_localctx, predIndex);
		case 13:
			return shift_sempred((ShiftContext)_localctx, predIndex);
		case 14:
			return plus_sempred((PlusContext)_localctx, predIndex);
		case 15:
			return multiplying_sempred((MultiplyingContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean bit_sempred(BitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean shift_sempred(ShiftContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean plus_sempred(PlusContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplying_sempred(MultiplyingContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u013c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3i\n\3\f\3\16\3l\13\3\3\4\3\4\3\4\5\4q\n\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13\u0082\n\13"+
		"\3\f\3\f\5\f\u0086\n\f\3\f\3\f\3\f\5\f\u008b\n\f\3\f\3\f\3\f\5\f\u0090"+
		"\n\f\3\f\3\f\3\f\5\f\u0095\n\f\3\f\5\f\u0098\n\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a8\n\16\f\16\16"+
		"\16\u00ab\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00b9\n\17\f\17\16\17\u00bc\13\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00c7\n\20\f\20\16\20\u00ca\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d8\n\21\f\21"+
		"\16\21\u00db\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e4\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00eb\n\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\7\26\u00f7\n\26\f\26\16\26\u00fa\13\26\3\27\5\27"+
		"\u00fd\n\27\3\27\6\27\u0100\n\27\r\27\16\27\u0101\3\27\3\27\6\27\u0106"+
		"\n\27\r\27\16\27\u0107\5\27\u010a\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\32\7\32\u0113\n\32\f\32\16\32\u0116\13\32\3\32\5\32\u0119\n\32\3\33\3"+
		"\33\3\33\7\33\u011e\n\33\f\33\16\33\u0121\13\33\3\33\5\33\u0124\n\33\3"+
		"\34\3\34\3\34\7\34\u0129\n\34\f\34\16\34\u012c\13\34\3\34\5\34\u012f\n"+
		"\34\3\35\3\35\3\35\7\35\u0134\n\35\f\35\16\35\u0137\13\35\3\35\5\35\u013a"+
		"\n\35\3\35\2\7\4\32\34\36 \36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668\2\7\3\2\21\26\3\2\7\b\3\2\16\17\3\2\f\r\3\2\3\6"+
		"\u0152\2:\3\2\2\2\4M\3\2\2\2\6p\3\2\2\2\br\3\2\2\2\nt\3\2\2\2\fv\3\2\2"+
		"\2\16x\3\2\2\2\20z\3\2\2\2\22|\3\2\2\2\24\u0081\3\2\2\2\26\u0097\3\2\2"+
		"\2\30\u0099\3\2\2\2\32\u009b\3\2\2\2\34\u00ac\3\2\2\2\36\u00bd\3\2\2\2"+
		" \u00cb\3\2\2\2\"\u00e3\3\2\2\2$\u00ea\3\2\2\2&\u00ec\3\2\2\2(\u00f1\3"+
		"\2\2\2*\u00f3\3\2\2\2,\u00fc\3\2\2\2.\u010b\3\2\2\2\60\u010d\3\2\2\2\62"+
		"\u010f\3\2\2\2\64\u011a\3\2\2\2\66\u0125\3\2\2\28\u0130\3\2\2\2:;\5\4"+
		"\3\2;<\7\2\2\3<\3\3\2\2\2=>\b\3\1\2>?\7\30\2\2?@\5\4\3\2@A\7\31\2\2AN"+
		"\3\2\2\2BC\7\t\2\2CN\5\4\3\16DE\5\6\4\2EF\5\f\7\2FG\5\4\3\6GN\3\2\2\2"+
		"HI\5\6\4\2IJ\5\20\t\2JN\3\2\2\2KN\5\6\4\2LN\5\30\r\2M=\3\2\2\2MB\3\2\2"+
		"\2MD\3\2\2\2MH\3\2\2\2MK\3\2\2\2ML\3\2\2\2Nj\3\2\2\2OP\f\b\2\2PQ\5\b\5"+
		"\2QR\5\4\3\tRi\3\2\2\2ST\f\7\2\2TU\5\n\6\2UV\5\4\3\bVi\3\2\2\2WX\f\r\2"+
		"\2XY\7\13\2\2Yi\5\24\13\2Z[\f\f\2\2[\\\7\t\2\2\\]\7\13\2\2]i\5\24\13\2"+
		"^_\f\13\2\2_`\7\27\2\2`i\5.\30\2ab\f\n\2\2bc\7\n\2\2ci\5\60\31\2de\f\t"+
		"\2\2ef\7\n\2\2fg\7\t\2\2gi\5\60\31\2hO\3\2\2\2hS\3\2\2\2hW\3\2\2\2hZ\3"+
		"\2\2\2h^\3\2\2\2ha\3\2\2\2hd\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\5"+
		"\3\2\2\2lj\3\2\2\2mq\7\35\2\2nq\5\22\n\2oq\5\26\f\2pm\3\2\2\2pn\3\2\2"+
		"\2po\3\2\2\2q\7\3\2\2\2rs\t\2\2\2s\t\3\2\2\2tu\t\3\2\2u\13\3\2\2\2vw\t"+
		"\4\2\2w\r\3\2\2\2xy\t\5\2\2y\17\3\2\2\2z{\7\20\2\2{\21\3\2\2\2|}\t\6\2"+
		"\2}\23\3\2\2\2~\u0082\5\26\f\2\177\u0082\5\6\4\2\u0080\u0082\7\6\2\2\u0081"+
		"~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\25\3\2\2\2\u0083"+
		"\u0085\7.\2\2\u0084\u0086\5\64\33\2\u0085\u0084\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0098\7/\2\2\u0088\u008a\7.\2\2\u0089"+
		"\u008b\5\62\32\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\u0098\7/\2\2\u008d\u008f\7.\2\2\u008e\u0090\5\66\34\2\u008f"+
		"\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0098\7/"+
		"\2\2\u0092\u0094\7.\2\2\u0093\u0095\58\35\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\7/\2\2\u0097\u0083\3\2"+
		"\2\2\u0097\u0088\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u0092\3\2\2\2\u0098"+
		"\27\3\2\2\2\u0099\u009a\5\32\16\2\u009a\31\3\2\2\2\u009b\u009c\b\16\1"+
		"\2\u009c\u009d\5\34\17\2\u009d\u00a9\3\2\2\2\u009e\u009f\f\6\2\2\u009f"+
		"\u00a0\7(\2\2\u00a0\u00a8\5\34\17\2\u00a1\u00a2\f\5\2\2\u00a2\u00a3\7"+
		")\2\2\u00a3\u00a8\5\34\17\2\u00a4\u00a5\f\4\2\2\u00a5\u00a6\7*\2\2\u00a6"+
		"\u00a8\5\34\17\2\u00a7\u009e\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a4\3"+
		"\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\33\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\b\17\1\2\u00ad\u00ae\5\36"+
		"\20\2\u00ae\u00ba\3\2\2\2\u00af\u00b0\f\6\2\2\u00b0\u00b1\7%\2\2\u00b1"+
		"\u00b9\5\36\20\2\u00b2\u00b3\f\5\2\2\u00b3\u00b4\7&\2\2\u00b4\u00b9\5"+
		"\36\20\2\u00b5\u00b6\f\4\2\2\u00b6\u00b7\7\'\2\2\u00b7\u00b9\5\36\20\2"+
		"\u00b8\u00af\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\35\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\b\20\1\2\u00be\u00bf\5 \21\2\u00bf\u00c8\3"+
		"\2\2\2\u00c0\u00c1\f\5\2\2\u00c1\u00c2\7\36\2\2\u00c2\u00c7\5 \21\2\u00c3"+
		"\u00c4\f\4\2\2\u00c4\u00c5\7\37\2\2\u00c5\u00c7\5 \21\2\u00c6\u00c0\3"+
		"\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\37\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\b\21\1"+
		"\2\u00cc\u00cd\5\"\22\2\u00cd\u00d9\3\2\2\2\u00ce\u00cf\f\6\2\2\u00cf"+
		"\u00d0\7 \2\2\u00d0\u00d8\5\"\22\2\u00d1\u00d2\f\5\2\2\u00d2\u00d3\7!"+
		"\2\2\u00d3\u00d8\5\"\22\2\u00d4\u00d5\f\4\2\2\u00d5\u00d6\7\"\2\2\u00d6"+
		"\u00d8\5\"\22\2\u00d7\u00ce\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d4\3"+
		"\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"!\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e4\5\6\4\2\u00dd\u00e4\5$\23\2"+
		"\u00de\u00df\7\30\2\2\u00df\u00e0\5\32\16\2\u00e0\u00e1\7\31\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e4\5&\24\2\u00e3\u00dc\3\2\2\2\u00e3\u00dd\3\2"+
		"\2\2\u00e3\u00de\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4#\3\2\2\2\u00e5\u00e6"+
		"\5,\27\2\u00e6\u00e7\7$\2\2\u00e7\u00e8\5,\27\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00eb\5,\27\2\u00ea\u00e5\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb%\3\2\2\2"+
		"\u00ec\u00ed\5(\25\2\u00ed\u00ee\7\30\2\2\u00ee\u00ef\5*\26\2\u00ef\u00f0"+
		"\7\31\2\2\u00f0\'\3\2\2\2\u00f1\u00f2\7\34\2\2\u00f2)\3\2\2\2\u00f3\u00f8"+
		"\5\4\3\2\u00f4\u00f5\7-\2\2\u00f5\u00f7\5\4\3\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9+\3\2\2\2"+
		"\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7\37\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u0100\7,\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0109\3\2"+
		"\2\2\u0103\u0105\7#\2\2\u0104\u0106\7,\2\2\u0105\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0103\3\2\2\2\u0109\u010a\3\2\2\2\u010a-\3\2\2\2\u010b\u010c\7\62\2\2"+
		"\u010c/\3\2\2\2\u010d\u010e\7\34\2\2\u010e\61\3\2\2\2\u010f\u0114\7\6"+
		"\2\2\u0110\u0111\7-\2\2\u0111\u0113\7\6\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0117\u0119\7-\2\2\u0118\u0117\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\63\3\2\2\2\u011a\u011f\7\3\2\2\u011b\u011c\7-\2\2"+
		"\u011c\u011e\7\3\2\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0124\7-\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\65\3\2\2\2"+
		"\u0125\u012a\7\4\2\2\u0126\u0127\7-\2\2\u0127\u0129\7\4\2\2\u0128\u0126"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\7-\2\2\u012e\u012d\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\67\3\2\2\2\u0130\u0135\7\5\2\2\u0131\u0132"+
		"\7-\2\2\u0132\u0134\7\5\2\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0138\u013a\7-\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"9\3\2\2\2#Mhjp\u0081\u0085\u008a\u008f\u0094\u0097\u00a7\u00a9\u00b8\u00ba"+
		"\u00c6\u00c8\u00d7\u00d9\u00e3\u00ea\u00f8\u00fc\u0101\u0107\u0109\u0114"+
		"\u0118\u011f\u0123\u012a\u012e\u0135\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
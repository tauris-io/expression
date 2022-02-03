// Generated from TExprLexer.g4 by ANTLR 4.6

    package io.tauris.expression.ast;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TExprLexer extends Lexer {
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
	public static final int REG = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "REG"
	};

	public static final String[] ruleNames = {
		"Integer", "Float", "Boolean", "String", "STRING", "STRING_ESCAPE_SEQ", 
		"ESC", "NAME", "AND", "OR", "NOT", "IS", "IN", "TRUE", "FALSE", "ENDSWITH", 
		"STARTSWITH", "EXISTS", "GT", "GE", "LT", "LE", "EQ", "NE", "MATCH", "LPAREN", 
		"RPAREN", "INT", "FLOAT", "IDENTIFIER", "VARIABLE", "PLUS", "MINUS", "MUL", 
		"DIV", "MOD", "POINT", "E", "LSHIFT", "RSHIFT", "RSHIFT3", "BAND", "BEOR", 
		"BIOR", "NL", "DIGIT", "COMMA", "LBRACKET", "RBRACKET", "WS", "SLASH", 
		"REGEX"
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


	public TExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TExprLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u0160\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4"+
		" \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4"+
		"+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4"+
		"\64\t\64\4\65\t\65\3\2\5\2n\n\2\3\2\3\2\3\3\5\3s\n\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\5\4{\n\4\3\5\3\5\3\6\3\6\3\6\7\6\u0082\n\6\f\6\16\6\u0085\13\6"+
		"\3\6\3\6\3\6\3\6\7\6\u008b\n\6\f\6\16\6\u008e\13\6\3\6\5\6\u0091\n\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\6\t\u009b\n\t\r\t\16\t\u009c\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\5\35\u00ef\n\35\3\35\6\35\u00f2\n\35\r"+
		"\35\16\35\u00f3\3\36\5\36\u00f7\n\36\3\36\6\36\u00fa\n\36\r\36\16\36\u00fb"+
		"\3\36\3\36\6\36\u0100\n\36\r\36\16\36\u0101\5\36\u0104\n\36\3\37\3\37"+
		"\7\37\u0108\n\37\f\37\16\37\u010b\13\37\3 \3 \3 \7 \u0110\n \f \16 \u0113"+
		"\13 \3 \3 \3 \7 \u0118\n \f \16 \u011b\13 \5 \u011d\n \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,"+
		"\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\6\63\u0148\n"+
		"\63\r\63\16\63\u0149\3\63\3\63\3\64\3\64\3\65\7\65\u0151\n\65\f\65\16"+
		"\65\u0154\13\65\3\65\3\65\3\65\6\65\u0159\n\65\r\65\16\65\u015a\3\65\3"+
		"\65\3\65\3\65\2\2\66\4\3\6\4\b\5\n\6\f\2\16\2\20\2\22\2\24\7\26\b\30\t"+
		"\32\n\34\13\36\f \r\"\16$\17&\20(\21*\22,\23.\24\60\25\62\26\64\27\66"+
		"\308\31:\32<\33>\34@\35B\36D\37F H!J\"L#N$P%R&T\'V(X)Z*\\+^,`-b.d/f\60"+
		"h\61j\62\4\2\3\17\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\n\2$$\61\61^^dd"+
		"hhppttvv\4\2C\\c|\b\2\60\60\62;C\\^^aac|\3\2\62;\5\2C\\aac|\6\2\62;C\\"+
		"aac|\7\2\60\60\62;C\\aac|\4\2GGgg\5\2\13\f\16\17\"\"\3\2\"\"\7\2\f\f\17"+
		"\17))\61\61^^\u0171\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2"+
		"\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3"+
		"\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2"+
		"\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66"+
		"\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2"+
		"\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2"+
		"\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\"+
		"\3\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\3h\3\2"+
		"\2\2\3j\3\2\2\2\4m\3\2\2\2\6r\3\2\2\2\bz\3\2\2\2\n|\3\2\2\2\f\u0090\3"+
		"\2\2\2\16\u0092\3\2\2\2\20\u0095\3\2\2\2\22\u0098\3\2\2\2\24\u009e\3\2"+
		"\2\2\26\u00a1\3\2\2\2\30\u00a4\3\2\2\2\32\u00a8\3\2\2\2\34\u00ab\3\2\2"+
		"\2\36\u00ae\3\2\2\2 \u00b3\3\2\2\2\"\u00b9\3\2\2\2$\u00c2\3\2\2\2&\u00cd"+
		"\3\2\2\2(\u00d4\3\2\2\2*\u00d6\3\2\2\2,\u00d9\3\2\2\2.\u00db\3\2\2\2\60"+
		"\u00de\3\2\2\2\62\u00e1\3\2\2\2\64\u00e4\3\2\2\2\66\u00e9\3\2\2\28\u00eb"+
		"\3\2\2\2:\u00ee\3\2\2\2<\u00f6\3\2\2\2>\u0105\3\2\2\2@\u011c\3\2\2\2B"+
		"\u011e\3\2\2\2D\u0120\3\2\2\2F\u0122\3\2\2\2H\u0124\3\2\2\2J\u0126\3\2"+
		"\2\2L\u0128\3\2\2\2N\u012a\3\2\2\2P\u012c\3\2\2\2R\u012f\3\2\2\2T\u0132"+
		"\3\2\2\2V\u0136\3\2\2\2X\u0138\3\2\2\2Z\u013a\3\2\2\2\\\u013c\3\2\2\2"+
		"^\u013e\3\2\2\2`\u0140\3\2\2\2b\u0142\3\2\2\2d\u0144\3\2\2\2f\u0147\3"+
		"\2\2\2h\u014d\3\2\2\2j\u0152\3\2\2\2ln\7/\2\2ml\3\2\2\2mn\3\2\2\2no\3"+
		"\2\2\2op\5:\35\2p\5\3\2\2\2qs\7/\2\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\5"+
		":\35\2uv\7\60\2\2vw\5:\35\2w\7\3\2\2\2x{\5\36\17\2y{\5 \20\2zx\3\2\2\2"+
		"zy\3\2\2\2{\t\3\2\2\2|}\5\f\6\2}\13\3\2\2\2~\u0083\7)\2\2\177\u0082\5"+
		"\16\7\2\u0080\u0082\n\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u0091\7)\2\2\u0087\u008c\7$\2\2\u0088\u008b"+
		"\5\16\7\2\u0089\u008b\n\3\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\7$\2\2\u0090~\3\2\2\2\u0090\u0087"+
		"\3\2\2\2\u0091\r\3\2\2\2\u0092\u0093\7^\2\2\u0093\u0094\13\2\2\2\u0094"+
		"\17\3\2\2\2\u0095\u0096\7^\2\2\u0096\u0097\t\4\2\2\u0097\21\3\2\2\2\u0098"+
		"\u009a\t\5\2\2\u0099\u009b\t\6\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\23\3\2\2\2\u009e\u009f"+
		"\7(\2\2\u009f\u00a0\7(\2\2\u00a0\25\3\2\2\2\u00a1\u00a2\7~\2\2\u00a2\u00a3"+
		"\7~\2\2\u00a3\27\3\2\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7"+
		"\7v\2\2\u00a7\31\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7u\2\2\u00aa\33"+
		"\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\35\3\2\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7g\2\2"+
		"\u00b2\37\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7"+
		"n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8!\3\2\2\2\u00b9\u00ba"+
		"\7g\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7u\2\2\u00bd"+
		"\u00be\7y\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7j\2\2"+
		"\u00c1#\3\2\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7c\2"+
		"\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9"+
		"\7y\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7j\2\2\u00cc"+
		"%\3\2\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7z\2\2\u00cf\u00d0\7k\2\2\u00d0"+
		"\u00d1\7u\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7u\2\2\u00d3\'\3\2\2\2\u00d4"+
		"\u00d5\7@\2\2\u00d5)\3\2\2\2\u00d6\u00d7\7@\2\2\u00d7\u00d8\7?\2\2\u00d8"+
		"+\3\2\2\2\u00d9\u00da\7>\2\2\u00da-\3\2\2\2\u00db\u00dc\7>\2\2\u00dc\u00dd"+
		"\7?\2\2\u00dd/\3\2\2\2\u00de\u00df\7?\2\2\u00df\u00e0\7?\2\2\u00e0\61"+
		"\3\2\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e3\7?\2\2\u00e3\63\3\2\2\2\u00e4"+
		"\u00e5\7?\2\2\u00e5\u00e6\7\u0080\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8"+
		"\b\32\2\2\u00e8\65\3\2\2\2\u00e9\u00ea\7*\2\2\u00ea\67\3\2\2\2\u00eb\u00ec"+
		"\7+\2\2\u00ec9\3\2\2\2\u00ed\u00ef\7/\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\t\7\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4;\3\2\2\2"+
		"\u00f5\u00f7\7/\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9"+
		"\3\2\2\2\u00f8\u00fa\t\7\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0103\3\2\2\2\u00fd\u00ff\7\60"+
		"\2\2\u00fe\u0100\t\7\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u00fd\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104=\3\2\2\2\u0105\u0109\t\b\2\2\u0106\u0108"+
		"\t\t\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a?\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7&\2\2\u010d"+
		"\u0111\t\b\2\2\u010e\u0110\t\n\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u011d\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0115\7B\2\2\u0115\u0119\t\b\2\2\u0116\u0118\t\n"+
		"\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u010c\3\2"+
		"\2\2\u011c\u0114\3\2\2\2\u011dA\3\2\2\2\u011e\u011f\7-\2\2\u011fC\3\2"+
		"\2\2\u0120\u0121\7/\2\2\u0121E\3\2\2\2\u0122\u0123\7,\2\2\u0123G\3\2\2"+
		"\2\u0124\u0125\7\61\2\2\u0125I\3\2\2\2\u0126\u0127\7\'\2\2\u0127K\3\2"+
		"\2\2\u0128\u0129\7\60\2\2\u0129M\3\2\2\2\u012a\u012b\t\13\2\2\u012bO\3"+
		"\2\2\2\u012c\u012d\7>\2\2\u012d\u012e\7>\2\2\u012eQ\3\2\2\2\u012f\u0130"+
		"\7@\2\2\u0130\u0131\7@\2\2\u0131S\3\2\2\2\u0132\u0133\7@\2\2\u0133\u0134"+
		"\7@\2\2\u0134\u0135\7@\2\2\u0135U\3\2\2\2\u0136\u0137\7(\2\2\u0137W\3"+
		"\2\2\2\u0138\u0139\7`\2\2\u0139Y\3\2\2\2\u013a\u013b\7~\2\2\u013b[\3\2"+
		"\2\2\u013c\u013d\7\f\2\2\u013d]\3\2\2\2\u013e\u013f\4\62;\2\u013f_\3\2"+
		"\2\2\u0140\u0141\7.\2\2\u0141a\3\2\2\2\u0142\u0143\7]\2\2\u0143c\3\2\2"+
		"\2\u0144\u0145\7_\2\2\u0145e\3\2\2\2\u0146\u0148\t\f\2\2\u0147\u0146\3"+
		"\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\b\63\3\2\u014cg\3\2\2\2\u014d\u014e\7\61\2"+
		"\2\u014ei\3\2\2\2\u014f\u0151\t\r\2\2\u0150\u014f\3\2\2\2\u0151\u0154"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0158\5h\64\2\u0156\u0159\5\16\7\2\u0157\u0159\n"+
		"\16\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\5h"+
		"\64\2\u015d\u015e\3\2\2\2\u015e\u015f\b\65\4\2\u015fk\3\2\2\2\33\2\3m"+
		"rz\u0081\u0083\u008a\u008c\u0090\u009c\u00ee\u00f3\u00f6\u00fb\u0101\u0103"+
		"\u0109\u0111\u0119\u011c\u0149\u0152\u0158\u015a\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
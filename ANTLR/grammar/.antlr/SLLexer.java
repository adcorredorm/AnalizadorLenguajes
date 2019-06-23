// Generated from /home/angel/Code/Lenguajes/ANTLR/grammar/SL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, COMMENT=41, LINE_COMMENT=42, WS=43, ID=44, NUM=45, 
		STR=46, LOG=47, OP_COMP=48, OP_MAT=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "COMMENT", 
		"LINE_COMMENT", "WS", "ID", "NUM", "STR", "LOG", "OP_COMP", "OP_MAT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'inicio'", "'fin'", "'programa'", "';'", "'constantes'", "'='", 
		"'tipos'", "':'", "'var'", "','", "'subrutina'", "'('", "')'", "'retorna'", 
		"'ref'", "'si'", "'{'", "'}'", "'mientras'", "'repetir'", "'hasta'", "'desde'", 
		"'paso'", "'eval'", "'caso'", "'numerico'", "'cadena'", "'logico'", "'.'", 
		"'['", "']'", "'+'", "'-'", "'not'", "'and'", "'or'", "'vector'", "'matriz'", 
		"'*'", "'registro'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "COMMENT", "LINE_COMMENT", "WS", "ID", "NUM", 
		"STR", "LOG", "OP_COMP", "OP_MAT"
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


	public SLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u017a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\7*\u012d\n*\f*\16*\u0130\13*\3*\3*\3*\3*\3*\3+\3+\3+\3+\7+\u013b\n+"+
		"\f+\16+\u013e\13+\3+\3+\3,\6,\u0143\n,\r,\16,\u0144\3,\3,\3-\3-\7-\u014b"+
		"\n-\f-\16-\u014e\13-\3.\6.\u0151\n.\r.\16.\u0152\3/\3/\7/\u0157\n/\f/"+
		"\16/\u015a\13/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u016b\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u0177\n\61\3\62\3\62\4\u012e\u0158\2\63\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\b\4\2\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\7\2\'\',-//\61\61``\2\u0187"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5l\3\2\2\2\7p\3\2\2\2\ty\3\2\2\2\13{\3\2"+
		"\2\2\r\u0086\3\2\2\2\17\u0088\3\2\2\2\21\u008e\3\2\2\2\23\u0090\3\2\2"+
		"\2\25\u0094\3\2\2\2\27\u0096\3\2\2\2\31\u00a0\3\2\2\2\33\u00a2\3\2\2\2"+
		"\35\u00a4\3\2\2\2\37\u00ac\3\2\2\2!\u00b0\3\2\2\2#\u00b3\3\2\2\2%\u00b5"+
		"\3\2\2\2\'\u00b7\3\2\2\2)\u00c0\3\2\2\2+\u00c8\3\2\2\2-\u00ce\3\2\2\2"+
		"/\u00d4\3\2\2\2\61\u00d9\3\2\2\2\63\u00de\3\2\2\2\65\u00e3\3\2\2\2\67"+
		"\u00ec\3\2\2\29\u00f3\3\2\2\2;\u00fa\3\2\2\2=\u00fc\3\2\2\2?\u00fe\3\2"+
		"\2\2A\u0100\3\2\2\2C\u0102\3\2\2\2E\u0104\3\2\2\2G\u0108\3\2\2\2I\u010c"+
		"\3\2\2\2K\u010f\3\2\2\2M\u0116\3\2\2\2O\u011d\3\2\2\2Q\u011f\3\2\2\2S"+
		"\u0128\3\2\2\2U\u0136\3\2\2\2W\u0142\3\2\2\2Y\u0148\3\2\2\2[\u0150\3\2"+
		"\2\2]\u0154\3\2\2\2_\u016a\3\2\2\2a\u0176\3\2\2\2c\u0178\3\2\2\2ef\7k"+
		"\2\2fg\7p\2\2gh\7k\2\2hi\7e\2\2ij\7k\2\2jk\7q\2\2k\4\3\2\2\2lm\7h\2\2"+
		"mn\7k\2\2no\7p\2\2o\6\3\2\2\2pq\7r\2\2qr\7t\2\2rs\7q\2\2st\7i\2\2tu\7"+
		"t\2\2uv\7c\2\2vw\7o\2\2wx\7c\2\2x\b\3\2\2\2yz\7=\2\2z\n\3\2\2\2{|\7e\2"+
		"\2|}\7q\2\2}~\7p\2\2~\177\7u\2\2\177\u0080\7v\2\2\u0080\u0081\7c\2\2\u0081"+
		"\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083\u0084\7g\2\2\u0084\u0085\7u\2\2"+
		"\u0085\f\3\2\2\2\u0086\u0087\7?\2\2\u0087\16\3\2\2\2\u0088\u0089\7v\2"+
		"\2\u0089\u008a\7k\2\2\u008a\u008b\7r\2\2\u008b\u008c\7q\2\2\u008c\u008d"+
		"\7u\2\2\u008d\20\3\2\2\2\u008e\u008f\7<\2\2\u008f\22\3\2\2\2\u0090\u0091"+
		"\7x\2\2\u0091\u0092\7c\2\2\u0092\u0093\7t\2\2\u0093\24\3\2\2\2\u0094\u0095"+
		"\7.\2\2\u0095\26\3\2\2\2\u0096\u0097\7u\2\2\u0097\u0098\7w\2\2\u0098\u0099"+
		"\7d\2\2\u0099\u009a\7t\2\2\u009a\u009b\7w\2\2\u009b\u009c\7v\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7c\2\2\u009f\30\3\2\2\2\u00a0"+
		"\u00a1\7*\2\2\u00a1\32\3\2\2\2\u00a2\u00a3\7+\2\2\u00a3\34\3\2\2\2\u00a4"+
		"\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7q\2\2"+
		"\u00a8\u00a9\7t\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7c\2\2\u00ab\36\3\2"+
		"\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7h\2\2\u00af \3"+
		"\2\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7k\2\2\u00b2\"\3\2\2\2\u00b3\u00b4"+
		"\7}\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7\177\2\2\u00b6&\3\2\2\2\u00b7\u00b8"+
		"\7o\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7u\2\2"+
		"\u00bf(\3\2\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7r\2"+
		"\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7"+
		"\7t\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb"+
		"\7u\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7c\2\2\u00cd,\3\2\2\2\u00ce\u00cf"+
		"\7f\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7f\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6\7c\2\2\u00d6"+
		"\u00d7\7u\2\2\u00d7\u00d8\7q\2\2\u00d8\60\3\2\2\2\u00d9\u00da\7g\2\2\u00da"+
		"\u00db\7x\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7n\2\2\u00dd\62\3\2\2\2\u00de"+
		"\u00df\7e\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7q\2\2"+
		"\u00e2\64\3\2\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7"+
		"o\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea"+
		"\7e\2\2\u00ea\u00eb\7q\2\2\u00eb\66\3\2\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee"+
		"\7c\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7p\2\2\u00f1"+
		"\u00f2\7c\2\2\u00f28\3\2\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7q\2\2\u00f5"+
		"\u00f6\7i\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7q\2\2"+
		"\u00f9:\3\2\2\2\u00fa\u00fb\7\60\2\2\u00fb<\3\2\2\2\u00fc\u00fd\7]\2\2"+
		"\u00fd>\3\2\2\2\u00fe\u00ff\7_\2\2\u00ff@\3\2\2\2\u0100\u0101\7-\2\2\u0101"+
		"B\3\2\2\2\u0102\u0103\7/\2\2\u0103D\3\2\2\2\u0104\u0105\7p\2\2\u0105\u0106"+
		"\7q\2\2\u0106\u0107\7v\2\2\u0107F\3\2\2\2\u0108\u0109\7c\2\2\u0109\u010a"+
		"\7p\2\2\u010a\u010b\7f\2\2\u010bH\3\2\2\2\u010c\u010d\7q\2\2\u010d\u010e"+
		"\7t\2\2\u010eJ\3\2\2\2\u010f\u0110\7x\2\2\u0110\u0111\7g\2\2\u0111\u0112"+
		"\7e\2\2\u0112\u0113\7v\2\2\u0113\u0114\7q\2\2\u0114\u0115\7t\2\2\u0115"+
		"L\3\2\2\2\u0116\u0117\7o\2\2\u0117\u0118\7c\2\2\u0118\u0119\7v\2\2\u0119"+
		"\u011a\7t\2\2\u011a\u011b\7k\2\2\u011b\u011c\7|\2\2\u011cN\3\2\2\2\u011d"+
		"\u011e\7,\2\2\u011eP\3\2\2\2\u011f\u0120\7t\2\2\u0120\u0121\7g\2\2\u0121"+
		"\u0122\7i\2\2\u0122\u0123\7k\2\2\u0123\u0124\7u\2\2\u0124\u0125\7v\2\2"+
		"\u0125\u0126\7t\2\2\u0126\u0127\7q\2\2\u0127R\3\2\2\2\u0128\u0129\7\61"+
		"\2\2\u0129\u012a\7,\2\2\u012a\u012e\3\2\2\2\u012b\u012d\13\2\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012f\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7,\2\2\u0132"+
		"\u0133\7\61\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b*\2\2\u0135T\3\2\2\2"+
		"\u0136\u0137\7\61\2\2\u0137\u0138\7\61\2\2\u0138\u013c\3\2\2\2\u0139\u013b"+
		"\n\2\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\b+"+
		"\2\2\u0140V\3\2\2\2\u0141\u0143\t\3\2\2\u0142\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\b,\2\2\u0147X\3\2\2\2\u0148\u014c\t\4\2\2\u0149\u014b\t\5\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014dZ\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\t\6\2\2\u0150\u014f"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\\\3\2\2\2\u0154\u0158\7$\2\2\u0155\u0157\13\2\2\2\u0156\u0155\3\2\2\2"+
		"\u0157\u015a\3\2\2\2\u0158\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015b"+
		"\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7$\2\2\u015c^\3\2\2\2\u015d\u015e"+
		"\7U\2\2\u015e\u016b\7K\2\2\u015f\u0160\7V\2\2\u0160\u0161\7T\2\2\u0161"+
		"\u0162\7W\2\2\u0162\u016b\7G\2\2\u0163\u0164\7P\2\2\u0164\u016b\7Q\2\2"+
		"\u0165\u0166\7H\2\2\u0166\u0167\7C\2\2\u0167\u0168\7N\2\2\u0168\u0169"+
		"\7U\2\2\u0169\u016b\7G\2\2\u016a\u015d\3\2\2\2\u016a\u015f\3\2\2\2\u016a"+
		"\u0163\3\2\2\2\u016a\u0165\3\2\2\2\u016b`\3\2\2\2\u016c\u0177\7>\2\2\u016d"+
		"\u016e\7>\2\2\u016e\u0177\7?\2\2\u016f\u0170\7?\2\2\u0170\u0177\7?\2\2"+
		"\u0171\u0172\7>\2\2\u0172\u0177\7@\2\2\u0173\u0174\7@\2\2\u0174\u0177"+
		"\7?\2\2\u0175\u0177\7@\2\2\u0176\u016c\3\2\2\2\u0176\u016d\3\2\2\2\u0176"+
		"\u016f\3\2\2\2\u0176\u0171\3\2\2\2\u0176\u0173\3\2\2\2\u0176\u0175\3\2"+
		"\2\2\u0177b\3\2\2\2\u0178\u0179\t\7\2\2\u0179d\3\2\2\2\13\2\u012e\u013c"+
		"\u0144\u014c\u0152\u0158\u016a\u0176\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
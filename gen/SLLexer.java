// Generated from /home/angel/Code/Lenguajes/ANTLR/grammar/SL.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, LINE_COMMENT=2, WS=3, NUM=4, REAL=5, CTF=6, STR=7, OP_COMP=8, 
		OP_IDEN=9, OP_MAT=10, Tk_logico=11, Tk_verdadero=12, Tk_falso=13, Tk_if=14, 
		Tk_elseif=15, Tk_conjuncion=16, Tk_disyuncion=17, Tk_negacion=18, Tk_matriz=19, 
		Tk_vector=20, Tk_suma=21, Tk_resta=22, Tk_asterisco=23, Tk_division=24, 
		Tk_modulo=25, Tk_potencia=26, Tk_asignacion=27, Tk_menor=28, Tk_mayor=29, 
		Tk_menor_o_igual=30, Tk_mayor_o_igual=31, Tk_igual_que=32, Tk_distinto_de=33, 
		Tk_punto=34, Tk_coma=35, Tk_pyc=36, Tk_dospuntos=37, Tk_par_izq=38, Tk_par_der=39, 
		Tk_llave_izq=40, Tk_llave_der=41, Tk_corchete_izq=42, Tk_corchete_der=43, 
		Tk_var=44, Tk_const=45, Tk_tipos=46, Tk_registro=47, Tk_cadenaRW=48, Tk_logicoRW=49, 
		Tk_numericoRW=50, Tk_caso=51, Tk_eval=52, Tk_desde=53, Tk_hasta=54, Tk_paso=55, 
		Tk_mientras=56, Tk_repetir=57, Tk_inicio=58, Tk_fin=59, Tk_subrutina=60, 
		Tk_retorna=61, Tk_ref=62, Tk_programa=63, ID=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "LINE_COMMENT", "WS", "NUM", "REAL", "CTF", "STR", "OP_COMP", 
			"OP_IDEN", "OP_MAT", "Tk_logico", "Tk_verdadero", "Tk_falso", "Tk_if", 
			"Tk_elseif", "Tk_conjuncion", "Tk_disyuncion", "Tk_negacion", "Tk_matriz", 
			"Tk_vector", "Tk_suma", "Tk_resta", "Tk_asterisco", "Tk_division", "Tk_modulo", 
			"Tk_potencia", "Tk_asignacion", "Tk_menor", "Tk_mayor", "Tk_menor_o_igual", 
			"Tk_mayor_o_igual", "Tk_igual_que", "Tk_distinto_de", "Tk_punto", "Tk_coma", 
			"Tk_pyc", "Tk_dospuntos", "Tk_par_izq", "Tk_par_der", "Tk_llave_izq", 
			"Tk_llave_der", "Tk_corchete_izq", "Tk_corchete_der", "Tk_var", "Tk_const", 
			"Tk_tipos", "Tk_registro", "Tk_cadenaRW", "Tk_logicoRW", "Tk_numericoRW", 
			"Tk_caso", "Tk_eval", "Tk_desde", "Tk_hasta", "Tk_paso", "Tk_mientras", 
			"Tk_repetir", "Tk_inicio", "Tk_fin", "Tk_subrutina", "Tk_retorna", "Tk_ref", 
			"Tk_programa", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'si'", "'sino'", "'and'", "'or'", "'not'", "'matriz'", "'vector'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'='", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'<>'", "'.'", "','", "';'", "':'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", null, null, "'tipos'", "'registro'", "'cadena'", 
			"'logico'", "'numerico'", "'caso'", "'eval'", "'desde'", "'hasta'", "'paso'", 
			"'mientras'", "'repetir'", "'inicio'", "'fin'", "'subrutina'", "'retorna'", 
			"'ref'", "'programa'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "LINE_COMMENT", "WS", "NUM", "REAL", "CTF", "STR", "OP_COMP", 
			"OP_IDEN", "OP_MAT", "Tk_logico", "Tk_verdadero", "Tk_falso", "Tk_if", 
			"Tk_elseif", "Tk_conjuncion", "Tk_disyuncion", "Tk_negacion", "Tk_matriz", 
			"Tk_vector", "Tk_suma", "Tk_resta", "Tk_asterisco", "Tk_division", "Tk_modulo", 
			"Tk_potencia", "Tk_asignacion", "Tk_menor", "Tk_mayor", "Tk_menor_o_igual", 
			"Tk_mayor_o_igual", "Tk_igual_que", "Tk_distinto_de", "Tk_punto", "Tk_coma", 
			"Tk_pyc", "Tk_dospuntos", "Tk_par_izq", "Tk_par_der", "Tk_llave_izq", 
			"Tk_llave_der", "Tk_corchete_izq", "Tk_corchete_der", "Tk_var", "Tk_const", 
			"Tk_tipos", "Tk_registro", "Tk_cadenaRW", "Tk_logicoRW", "Tk_numericoRW", 
			"Tk_caso", "Tk_eval", "Tk_desde", "Tk_hasta", "Tk_paso", "Tk_mientras", 
			"Tk_repetir", "Tk_inicio", "Tk_fin", "Tk_subrutina", "Tk_retorna", "Tk_ref", 
			"Tk_programa", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u01ee\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\7\2\u0088\n\2\f\2\16\2\u008b"+
		"\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0096\n\3\f\3\16\3\u0099"+
		"\13\3\3\3\3\3\3\4\6\4\u009e\n\4\r\4\16\4\u009f\3\4\3\4\3\5\5\5\u00a5\n"+
		"\5\3\5\6\5\u00a8\n\5\r\5\16\5\u00a9\3\5\3\5\5\5\u00ae\n\5\3\6\3\6\6\6"+
		"\u00b2\n\6\r\6\16\6\u00b3\3\6\5\6\u00b7\n\6\3\7\3\7\3\7\6\7\u00bc\n\7"+
		"\r\7\16\7\u00bd\3\b\3\b\7\b\u00c2\n\b\f\b\16\b\u00c5\13\b\3\b\3\b\3\b"+
		"\7\b\u00ca\n\b\f\b\16\b\u00cd\13\b\3\b\5\b\u00d0\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00d7\n\t\3\n\3\n\5\n\u00db\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00e3\n\13\3\f\3\f\5\f\u00e7\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ef"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f8\n\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0159\n-\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\5.\u016a\n.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\3"+
		"9\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3"+
		"<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3"+
		"?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\7A\u01ea\nA\fA\16A\u01ed\13A\5\u0089"+
		"\u00c3\u00cb\2B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\3\2\t\4\2\f\f\17\17\5\2\13"+
		"\f\17\17\"\"\3\2\62;\4\2GGgg\4\2--//\7\2C\\aac|\u00d3\u00d3\u00f3\u00f3"+
		"\b\2\62;C\\aac|\u00d3\u00d3\u00f3\u00f3\2\u020a\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5\u0091\3\2\2\2\7\u009d\3"+
		"\2\2\2\t\u00a4\3\2\2\2\13\u00af\3\2\2\2\r\u00b8\3\2\2\2\17\u00cf\3\2\2"+
		"\2\21\u00d6\3\2\2\2\23\u00da\3\2\2\2\25\u00e2\3\2\2\2\27\u00e6\3\2\2\2"+
		"\31\u00ee\3\2\2\2\33\u00f7\3\2\2\2\35\u00f9\3\2\2\2\37\u00fc\3\2\2\2!"+
		"\u0101\3\2\2\2#\u0105\3\2\2\2%\u0108\3\2\2\2\'\u010c\3\2\2\2)\u0113\3"+
		"\2\2\2+\u011a\3\2\2\2-\u011c\3\2\2\2/\u011e\3\2\2\2\61\u0120\3\2\2\2\63"+
		"\u0122\3\2\2\2\65\u0124\3\2\2\2\67\u0126\3\2\2\29\u0128\3\2\2\2;\u012a"+
		"\3\2\2\2=\u012c\3\2\2\2?\u012f\3\2\2\2A\u0132\3\2\2\2C\u0135\3\2\2\2E"+
		"\u0138\3\2\2\2G\u013a\3\2\2\2I\u013c\3\2\2\2K\u013e\3\2\2\2M\u0140\3\2"+
		"\2\2O\u0142\3\2\2\2Q\u0144\3\2\2\2S\u0146\3\2\2\2U\u0148\3\2\2\2W\u014a"+
		"\3\2\2\2Y\u0158\3\2\2\2[\u0169\3\2\2\2]\u016b\3\2\2\2_\u0171\3\2\2\2a"+
		"\u017a\3\2\2\2c\u0181\3\2\2\2e\u0188\3\2\2\2g\u0191\3\2\2\2i\u0196\3\2"+
		"\2\2k\u019b\3\2\2\2m\u01a1\3\2\2\2o\u01a7\3\2\2\2q\u01ac\3\2\2\2s\u01b5"+
		"\3\2\2\2u\u01bd\3\2\2\2w\u01c4\3\2\2\2y\u01c8\3\2\2\2{\u01d2\3\2\2\2}"+
		"\u01da\3\2\2\2\177\u01de\3\2\2\2\u0081\u01e7\3\2\2\2\u0083\u0084\7\61"+
		"\2\2\u0084\u0085\7,\2\2\u0085\u0089\3\2\2\2\u0086\u0088\13\2\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008a\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7,\2\2\u008d"+
		"\u008e\7\61\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\2\2\2\u0090\4\3\2\2"+
		"\2\u0091\u0092\7\61\2\2\u0092\u0093\7\61\2\2\u0093\u0097\3\2\2\2\u0094"+
		"\u0096\n\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\b\3\2\2\u009b\6\3\2\2\2\u009c\u009e\t\3\2\2\u009d\u009c\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a2\b\4\2\2\u00a2\b\3\2\2\2\u00a3\u00a5\5-\27\2\u00a4"+
		"\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8\t\4"+
		"\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00ae\5\13\6\2\u00ac\u00ae\5"+
		"\r\7\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\n\3\2\2\2\u00af\u00b1\7\60\2\2\u00b0\u00b2\t\4\2\2\u00b1\u00b0\3\2\2"+
		"\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u00b7\5\r\7\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\f\3\2\2\2\u00b8\u00b9\t\5\2\2\u00b9\u00bb\t\6\2\2\u00ba\u00bc\t\4\2\2"+
		"\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\16\3\2\2\2\u00bf\u00c3\7$\2\2\u00c0\u00c2\13\2\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00d0\7$\2\2\u00c7"+
		"\u00cb\7)\2\2\u00c8\u00ca\13\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d0\7)\2\2\u00cf\u00bf\3\2\2\2\u00cf\u00c7\3\2"+
		"\2\2\u00d0\20\3\2\2\2\u00d1\u00d7\59\35\2\u00d2\u00d7\5=\37\2\u00d3\u00d7"+
		"\5? \2\u00d4\u00d7\5;\36\2\u00d5\u00d7\5\23\n\2\u00d6\u00d1\3\2\2\2\u00d6"+
		"\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7\22\3\2\2\2\u00d8\u00db\5A!\2\u00d9\u00db\5C\"\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\24\3\2\2\2\u00dc\u00e3\5+\26\2\u00dd"+
		"\u00e3\5-\27\2\u00de\u00e3\5/\30\2\u00df\u00e3\5\61\31\2\u00e0\u00e3\5"+
		"\63\32\2\u00e1\u00e3\5\65\33\2\u00e2\u00dc\3\2\2\2\u00e2\u00dd\3\2\2\2"+
		"\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\26\3\2\2\2\u00e4\u00e7\5\31\r\2\u00e5\u00e7\5\33\16\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\30\3\2\2\2\u00e8\u00e9\7V\2\2"+
		"\u00e9\u00ea\7T\2\2\u00ea\u00eb\7W\2\2\u00eb\u00ef\7G\2\2\u00ec\u00ed"+
		"\7U\2\2\u00ed\u00ef\7K\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\32\3\2\2\2\u00f0\u00f1\7H\2\2\u00f1\u00f2\7C\2\2\u00f2\u00f3\7N\2\2\u00f3"+
		"\u00f4\7U\2\2\u00f4\u00f8\7G\2\2\u00f5\u00f6\7P\2\2\u00f6\u00f8\7Q\2\2"+
		"\u00f7\u00f0\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\34\3\2\2\2\u00f9\u00fa"+
		"\7u\2\2\u00fa\u00fb\7k\2\2\u00fb\36\3\2\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe"+
		"\7k\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7q\2\2\u0100 \3\2\2\2\u0101\u0102"+
		"\7c\2\2\u0102\u0103\7p\2\2\u0103\u0104\7f\2\2\u0104\"\3\2\2\2\u0105\u0106"+
		"\7q\2\2\u0106\u0107\7t\2\2\u0107$\3\2\2\2\u0108\u0109\7p\2\2\u0109\u010a"+
		"\7q\2\2\u010a\u010b\7v\2\2\u010b&\3\2\2\2\u010c\u010d\7o\2\2\u010d\u010e"+
		"\7c\2\2\u010e\u010f\7v\2\2\u010f\u0110\7t\2\2\u0110\u0111\7k\2\2\u0111"+
		"\u0112\7|\2\2\u0112(\3\2\2\2\u0113\u0114\7x\2\2\u0114\u0115\7g\2\2\u0115"+
		"\u0116\7e\2\2\u0116\u0117\7v\2\2\u0117\u0118\7q\2\2\u0118\u0119\7t\2\2"+
		"\u0119*\3\2\2\2\u011a\u011b\7-\2\2\u011b,\3\2\2\2\u011c\u011d\7/\2\2\u011d"+
		".\3\2\2\2\u011e\u011f\7,\2\2\u011f\60\3\2\2\2\u0120\u0121\7\61\2\2\u0121"+
		"\62\3\2\2\2\u0122\u0123\7\'\2\2\u0123\64\3\2\2\2\u0124\u0125\7`\2\2\u0125"+
		"\66\3\2\2\2\u0126\u0127\7?\2\2\u01278\3\2\2\2\u0128\u0129\7>\2\2\u0129"+
		":\3\2\2\2\u012a\u012b\7@\2\2\u012b<\3\2\2\2\u012c\u012d\7>\2\2\u012d\u012e"+
		"\7?\2\2\u012e>\3\2\2\2\u012f\u0130\7@\2\2\u0130\u0131\7?\2\2\u0131@\3"+
		"\2\2\2\u0132\u0133\7?\2\2\u0133\u0134\7?\2\2\u0134B\3\2\2\2\u0135\u0136"+
		"\7>\2\2\u0136\u0137\7@\2\2\u0137D\3\2\2\2\u0138\u0139\7\60\2\2\u0139F"+
		"\3\2\2\2\u013a\u013b\7.\2\2\u013bH\3\2\2\2\u013c\u013d\7=\2\2\u013dJ\3"+
		"\2\2\2\u013e\u013f\7<\2\2\u013fL\3\2\2\2\u0140\u0141\7*\2\2\u0141N\3\2"+
		"\2\2\u0142\u0143\7+\2\2\u0143P\3\2\2\2\u0144\u0145\7}\2\2\u0145R\3\2\2"+
		"\2\u0146\u0147\7\177\2\2\u0147T\3\2\2\2\u0148\u0149\7]\2\2\u0149V\3\2"+
		"\2\2\u014a\u014b\7_\2\2\u014bX\3\2\2\2\u014c\u014d\7x\2\2\u014d\u014e"+
		"\7c\2\2\u014e\u0159\7t\2\2\u014f\u0150\7x\2\2\u0150\u0151\7c\2\2\u0151"+
		"\u0152\7t\2\2\u0152\u0153\7k\2\2\u0153\u0154\7c\2\2\u0154\u0155\7d\2\2"+
		"\u0155\u0156\7n\2\2\u0156\u0157\7g\2\2\u0157\u0159\7u\2\2\u0158\u014c"+
		"\3\2\2\2\u0158\u014f\3\2\2\2\u0159Z\3\2\2\2\u015a\u015b\7e\2\2\u015b\u015c"+
		"\7q\2\2\u015c\u015d\7p\2\2\u015d\u015e\7u\2\2\u015e\u016a\7v\2\2\u015f"+
		"\u0160\7e\2\2\u0160\u0161\7q\2\2\u0161\u0162\7p\2\2\u0162\u0163\7u\2\2"+
		"\u0163\u0164\7v\2\2\u0164\u0165\7c\2\2\u0165\u0166\7p\2\2\u0166\u0167"+
		"\7v\2\2\u0167\u0168\7g\2\2\u0168\u016a\7u\2\2\u0169\u015a\3\2\2\2\u0169"+
		"\u015f\3\2\2\2\u016a\\\3\2\2\2\u016b\u016c\7v\2\2\u016c\u016d\7k\2\2\u016d"+
		"\u016e\7r\2\2\u016e\u016f\7q\2\2\u016f\u0170\7u\2\2\u0170^\3\2\2\2\u0171"+
		"\u0172\7t\2\2\u0172\u0173\7g\2\2\u0173\u0174\7i\2\2\u0174\u0175\7k\2\2"+
		"\u0175\u0176\7u\2\2\u0176\u0177\7v\2\2\u0177\u0178\7t\2\2\u0178\u0179"+
		"\7q\2\2\u0179`\3\2\2\2\u017a\u017b\7e\2\2\u017b\u017c\7c\2\2\u017c\u017d"+
		"\7f\2\2\u017d\u017e\7g\2\2\u017e\u017f\7p\2\2\u017f\u0180\7c\2\2\u0180"+
		"b\3\2\2\2\u0181\u0182\7n\2\2\u0182\u0183\7q\2\2\u0183\u0184\7i\2\2\u0184"+
		"\u0185\7k\2\2\u0185\u0186\7e\2\2\u0186\u0187\7q\2\2\u0187d\3\2\2\2\u0188"+
		"\u0189\7p\2\2\u0189\u018a\7w\2\2\u018a\u018b\7o\2\2\u018b\u018c\7g\2\2"+
		"\u018c\u018d\7t\2\2\u018d\u018e\7k\2\2\u018e\u018f\7e\2\2\u018f\u0190"+
		"\7q\2\2\u0190f\3\2\2\2\u0191\u0192\7e\2\2\u0192\u0193\7c\2\2\u0193\u0194"+
		"\7u\2\2\u0194\u0195\7q\2\2\u0195h\3\2\2\2\u0196\u0197\7g\2\2\u0197\u0198"+
		"\7x\2\2\u0198\u0199\7c\2\2\u0199\u019a\7n\2\2\u019aj\3\2\2\2\u019b\u019c"+
		"\7f\2\2\u019c\u019d\7g\2\2\u019d\u019e\7u\2\2\u019e\u019f\7f\2\2\u019f"+
		"\u01a0\7g\2\2\u01a0l\3\2\2\2\u01a1\u01a2\7j\2\2\u01a2\u01a3\7c\2\2\u01a3"+
		"\u01a4\7u\2\2\u01a4\u01a5\7v\2\2\u01a5\u01a6\7c\2\2\u01a6n\3\2\2\2\u01a7"+
		"\u01a8\7r\2\2\u01a8\u01a9\7c\2\2\u01a9\u01aa\7u\2\2\u01aa\u01ab\7q\2\2"+
		"\u01abp\3\2\2\2\u01ac\u01ad\7o\2\2\u01ad\u01ae\7k\2\2\u01ae\u01af\7g\2"+
		"\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7v\2\2\u01b1\u01b2\7t\2\2\u01b2\u01b3"+
		"\7c\2\2\u01b3\u01b4\7u\2\2\u01b4r\3\2\2\2\u01b5\u01b6\7t\2\2\u01b6\u01b7"+
		"\7g\2\2\u01b7\u01b8\7r\2\2\u01b8\u01b9\7g\2\2\u01b9\u01ba\7v\2\2\u01ba"+
		"\u01bb\7k\2\2\u01bb\u01bc\7t\2\2\u01bct\3\2\2\2\u01bd\u01be\7k\2\2\u01be"+
		"\u01bf\7p\2\2\u01bf\u01c0\7k\2\2\u01c0\u01c1\7e\2\2\u01c1\u01c2\7k\2\2"+
		"\u01c2\u01c3\7q\2\2\u01c3v\3\2\2\2\u01c4\u01c5\7h\2\2\u01c5\u01c6\7k\2"+
		"\2\u01c6\u01c7\7p\2\2\u01c7x\3\2\2\2\u01c8\u01c9\7u\2\2\u01c9\u01ca\7"+
		"w\2\2\u01ca\u01cb\7d\2\2\u01cb\u01cc\7t\2\2\u01cc\u01cd\7w\2\2\u01cd\u01ce"+
		"\7v\2\2\u01ce\u01cf\7k\2\2\u01cf\u01d0\7p\2\2\u01d0\u01d1\7c\2\2\u01d1"+
		"z\3\2\2\2\u01d2\u01d3\7t\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7v\2\2\u01d5"+
		"\u01d6\7q\2\2\u01d6\u01d7\7t\2\2\u01d7\u01d8\7p\2\2\u01d8\u01d9\7c\2\2"+
		"\u01d9|\3\2\2\2\u01da\u01db\7t\2\2\u01db\u01dc\7g\2\2\u01dc\u01dd\7h\2"+
		"\2\u01dd~\3\2\2\2\u01de\u01df\7r\2\2\u01df\u01e0\7t\2\2\u01e0\u01e1\7"+
		"q\2\2\u01e1\u01e2\7i\2\2\u01e2\u01e3\7t\2\2\u01e3\u01e4\7c\2\2\u01e4\u01e5"+
		"\7o\2\2\u01e5\u01e6\7c\2\2\u01e6\u0080\3\2\2\2\u01e7\u01eb\t\7\2\2\u01e8"+
		"\u01ea\t\b\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u0082\3\2\2\2\u01ed\u01eb\3\2\2\2\30\2"+
		"\u0089\u0097\u009f\u00a4\u00a9\u00ad\u00b3\u00b6\u00bd\u00c3\u00cb\u00cf"+
		"\u00d6\u00da\u00e2\u00e6\u00ee\u00f7\u0158\u0169\u01eb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /home/angel/Code/Lenguajes/ANTLR/grammar/SL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLParser extends Parser {
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
	public static final int
		RULE_inicio = 0, RULE_programa = 1, RULE_declaracion = 2, RULE_constantes = 3, 
		RULE_declaracion_constante = 4, RULE_tipos = 5, RULE_declaracion_campo = 6, 
		RULE_variables = 7, RULE_declaracion_variable = 8, RULE_subrutina = 9, 
		RULE_subrutina_base = 10, RULE_parametros_subrutina = 11, RULE_metodo = 12, 
		RULE_funcion = 13, RULE_sentencia = 14, RULE_llamadoFuncion = 15, RULE_parametros = 16, 
		RULE_asignacion = 17, RULE_estructura_control = 18, RULE_condicional = 19, 
		RULE_sino_si = 20, RULE_sino = 21, RULE_mientras = 22, RULE_repetir_hasta = 23, 
		RULE_desde = 24, RULE_eval = 25, RULE_caso = 26, RULE_caso_default = 27, 
		RULE_tipo_dato = 28, RULE_dato = 29, RULE_identificador = 30, RULE_numerico = 31, 
		RULE_cadena = 32, RULE_logico = 33, RULE_estructura = 34, RULE_dim = 35, 
		RULE_registro = 36, RULE_comparacion = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "programa", "declaracion", "constantes", "declaracion_constante", 
			"tipos", "declaracion_campo", "variables", "declaracion_variable", "subrutina", 
			"subrutina_base", "parametros_subrutina", "metodo", "funcion", "sentencia", 
			"llamadoFuncion", "parametros", "asignacion", "estructura_control", "condicional", 
			"sino_si", "sino", "mientras", "repetir_hasta", "desde", "eval", "caso", 
			"caso_default", "tipo_dato", "dato", "identificador", "numerico", "cadena", 
			"logico", "estructura", "dim", "registro", "comparacion"
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

	@Override
	public String getGrammarFileName() { return "SL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode Tk_inicio() { return getToken(SLParser.Tk_inicio, 0); }
		public TerminalNode Tk_fin() { return getToken(SLParser.Tk_fin, 0); }
		public TerminalNode EOF() { return getToken(SLParser.EOF, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<SubrutinaContext> subrutina() {
			return getRuleContexts(SubrutinaContext.class);
		}
		public SubrutinaContext subrutina(int i) {
			return getRuleContext(SubrutinaContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_programa) {
				{
				setState(76);
				programa();
				}
			}

			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_const) | (1L << Tk_tipos))) != 0)) {
				{
				{
				setState(79);
				declaracion();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(Tk_inicio);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Tk_if - 14)) | (1L << (Tk_eval - 14)) | (1L << (Tk_desde - 14)) | (1L << (Tk_mientras - 14)) | (1L << (Tk_repetir - 14)) | (1L << (ID - 14)))) != 0)) {
				{
				{
				setState(86);
				sentencia();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(Tk_fin);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_subrutina) {
				{
				{
				setState(93);
				subrutina();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode Tk_programa() { return getToken(SLParser.Tk_programa, 0); }
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TerminalNode Tk_pyc() { return getToken(SLParser.Tk_pyc, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(Tk_programa);
			setState(102);
			match(ID);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_pyc) {
				{
				setState(103);
				match(Tk_pyc);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode Tk_pyc() { return getToken(SLParser.Tk_pyc, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_const:
				{
				setState(106);
				constantes();
				}
				break;
			case Tk_tipos:
				{
				setState(107);
				tipos();
				}
				break;
			case Tk_var:
				{
				setState(108);
				variables();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_pyc) {
				{
				setState(111);
				match(Tk_pyc);
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

	public static class ConstantesContext extends ParserRuleContext {
		public TerminalNode Tk_const() { return getToken(SLParser.Tk_const, 0); }
		public List<Declaracion_constanteContext> declaracion_constante() {
			return getRuleContexts(Declaracion_constanteContext.class);
		}
		public Declaracion_constanteContext declaracion_constante(int i) {
			return getRuleContext(Declaracion_constanteContext.class,i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(Tk_const);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				declaracion_constante();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class Declaracion_constanteContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode Tk_asignacion() { return getToken(SLParser.Tk_asignacion, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public TerminalNode Tk_pyc() { return getToken(SLParser.Tk_pyc, 0); }
		public Declaracion_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDeclaracion_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDeclaracion_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDeclaracion_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_constanteContext declaracion_constante() throws RecognitionException {
		Declaracion_constanteContext _localctx = new Declaracion_constanteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			identificador();
			setState(121);
			match(Tk_asignacion);
			setState(122);
			dato();
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(123);
				match(Tk_pyc);
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

	public static class TiposContext extends ParserRuleContext {
		public TerminalNode Tk_tipos() { return getToken(SLParser.Tk_tipos, 0); }
		public List<Declaracion_campoContext> declaracion_campo() {
			return getRuleContexts(Declaracion_campoContext.class);
		}
		public Declaracion_campoContext declaracion_campo(int i) {
			return getRuleContext(Declaracion_campoContext.class,i);
		}
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(Tk_tipos);
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				declaracion_campo();
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class Declaracion_campoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TerminalNode Tk_dospuntos() { return getToken(SLParser.Tk_dospuntos, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode Tk_pyc() { return getToken(SLParser.Tk_pyc, 0); }
		public Declaracion_campoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDeclaracion_campo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDeclaracion_campo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDeclaracion_campo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_campoContext declaracion_campo() throws RecognitionException {
		Declaracion_campoContext _localctx = new Declaracion_campoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ID);
			setState(133);
			match(Tk_dospuntos);
			setState(134);
			tipo_dato();
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(135);
				match(Tk_pyc);
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode Tk_var() { return getToken(SLParser.Tk_var, 0); }
		public List<Declaracion_variableContext> declaracion_variable() {
			return getRuleContexts(Declaracion_variableContext.class);
		}
		public Declaracion_variableContext declaracion_variable(int i) {
			return getRuleContext(Declaracion_variableContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(Tk_var);
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				declaracion_variable();
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class Declaracion_variableContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLParser.ID, i);
		}
		public TerminalNode Tk_dospuntos() { return getToken(SLParser.Tk_dospuntos, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public List<TerminalNode> Tk_coma() { return getTokens(SLParser.Tk_coma); }
		public TerminalNode Tk_coma(int i) {
			return getToken(SLParser.Tk_coma, i);
		}
		public TerminalNode Tk_asignacion() { return getToken(SLParser.Tk_asignacion, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public TerminalNode Tk_pyc() { return getToken(SLParser.Tk_pyc, 0); }
		public Declaracion_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDeclaracion_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDeclaracion_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDeclaracion_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_variableContext declaracion_variable() throws RecognitionException {
		Declaracion_variableContext _localctx = new Declaracion_variableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracion_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(ID);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_coma) {
				{
				{
				setState(145);
				match(Tk_coma);
				setState(146);
				match(ID);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(Tk_dospuntos);
			setState(153);
			tipo_dato();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_asignacion) {
				{
				setState(154);
				match(Tk_asignacion);
				setState(155);
				dato();
				}
			}

			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(158);
				match(Tk_pyc);
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

	public static class SubrutinaContext extends ParserRuleContext {
		public Subrutina_baseContext subrutina_base() {
			return getRuleContext(Subrutina_baseContext.class,0);
		}
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public SubrutinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrutina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSubrutina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSubrutina(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSubrutina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrutinaContext subrutina() throws RecognitionException {
		SubrutinaContext _localctx = new SubrutinaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subrutina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			subrutina_base();
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_var:
			case Tk_const:
			case Tk_tipos:
			case Tk_inicio:
				{
				setState(162);
				metodo();
				}
				break;
			case Tk_retorna:
				{
				setState(163);
				funcion();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Subrutina_baseContext extends ParserRuleContext {
		public TerminalNode Tk_subrutina() { return getToken(SLParser.Tk_subrutina, 0); }
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TerminalNode Tk_par_izq() { return getToken(SLParser.Tk_par_izq, 0); }
		public TerminalNode Tk_par_der() { return getToken(SLParser.Tk_par_der, 0); }
		public Parametros_subrutinaContext parametros_subrutina() {
			return getRuleContext(Parametros_subrutinaContext.class,0);
		}
		public Subrutina_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrutina_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSubrutina_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSubrutina_base(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSubrutina_base(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subrutina_baseContext subrutina_base() throws RecognitionException {
		Subrutina_baseContext _localctx = new Subrutina_baseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_subrutina_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(Tk_subrutina);
			setState(167);
			match(ID);
			setState(168);
			match(Tk_par_izq);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_ref || _la==ID) {
				{
				setState(169);
				parametros_subrutina();
				}
			}

			setState(172);
			match(Tk_par_der);
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

	public static class Parametros_subrutinaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLParser.ID, i);
		}
		public List<TerminalNode> Tk_dospuntos() { return getTokens(SLParser.Tk_dospuntos); }
		public TerminalNode Tk_dospuntos(int i) {
			return getToken(SLParser.Tk_dospuntos, i);
		}
		public List<Tipo_datoContext> tipo_dato() {
			return getRuleContexts(Tipo_datoContext.class);
		}
		public Tipo_datoContext tipo_dato(int i) {
			return getRuleContext(Tipo_datoContext.class,i);
		}
		public List<TerminalNode> Tk_ref() { return getTokens(SLParser.Tk_ref); }
		public TerminalNode Tk_ref(int i) {
			return getToken(SLParser.Tk_ref, i);
		}
		public List<TerminalNode> Tk_coma() { return getTokens(SLParser.Tk_coma); }
		public TerminalNode Tk_coma(int i) {
			return getToken(SLParser.Tk_coma, i);
		}
		public Parametros_subrutinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_subrutina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterParametros_subrutina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitParametros_subrutina(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitParametros_subrutina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_subrutinaContext parametros_subrutina() throws RecognitionException {
		Parametros_subrutinaContext _localctx = new Parametros_subrutinaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametros_subrutina);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_ref) {
				{
				setState(174);
				match(Tk_ref);
				}
			}

			setState(177);
			match(ID);
			setState(178);
			match(Tk_dospuntos);
			setState(179);
			tipo_dato();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_coma) {
				{
				{
				setState(180);
				match(Tk_coma);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_ref) {
					{
					setState(181);
					match(Tk_ref);
					}
				}

				setState(184);
				match(ID);
				setState(185);
				match(Tk_dospuntos);
				setState(186);
				tipo_dato();
				}
				}
				setState(191);
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

	public static class MetodoContext extends ParserRuleContext {
		public TerminalNode Tk_inicio() { return getToken(SLParser.Tk_inicio, 0); }
		public TerminalNode Tk_fin() { return getToken(SLParser.Tk_fin, 0); }
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_const) | (1L << Tk_tipos))) != 0)) {
				{
				{
				setState(192);
				declaracion();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(Tk_inicio);
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				sentencia();
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Tk_if - 14)) | (1L << (Tk_eval - 14)) | (1L << (Tk_desde - 14)) | (1L << (Tk_mientras - 14)) | (1L << (Tk_repetir - 14)) | (1L << (ID - 14)))) != 0) );
			setState(204);
			match(Tk_fin);
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

	public static class FuncionContext extends ParserRuleContext {
		public List<TerminalNode> Tk_retorna() { return getTokens(SLParser.Tk_retorna); }
		public TerminalNode Tk_retorna(int i) {
			return getToken(SLParser.Tk_retorna, i);
		}
		public TerminalNode Tk_inicio() { return getToken(SLParser.Tk_inicio, 0); }
		public TerminalNode Tk_par_izq() { return getToken(SLParser.Tk_par_izq, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public TerminalNode Tk_par_der() { return getToken(SLParser.Tk_par_der, 0); }
		public TerminalNode Tk_fin() { return getToken(SLParser.Tk_fin, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Tk_retorna);
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(207);
				tipo_dato();
				}
				break;
			case 2:
				{
				setState(208);
				match(ID);
				}
				break;
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_const) | (1L << Tk_tipos))) != 0)) {
				{
				{
				setState(211);
				declaracion();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(Tk_inicio);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				sentencia();
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Tk_if - 14)) | (1L << (Tk_eval - 14)) | (1L << (Tk_desde - 14)) | (1L << (Tk_mientras - 14)) | (1L << (Tk_repetir - 14)) | (1L << (ID - 14)))) != 0) );
			setState(223);
			match(Tk_retorna);
			setState(224);
			match(Tk_par_izq);
			setState(225);
			dato();
			setState(226);
			match(Tk_par_der);
			setState(227);
			match(Tk_fin);
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

	public static class SentenciaContext extends ParserRuleContext {
		public LlamadoFuncionContext llamadoFuncion() {
			return getRuleContext(LlamadoFuncionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Estructura_controlContext estructura_control() {
			return getRuleContext(Estructura_controlContext.class,0);
		}
		public TerminalNode Tk_pyc() { return getToken(SLParser.Tk_pyc, 0); }
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(229);
				llamadoFuncion();
				}
				break;
			case 2:
				{
				setState(230);
				asignacion();
				}
				break;
			case 3:
				{
				setState(231);
				estructura_control();
				}
				break;
			}
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_pyc) {
				{
				setState(234);
				match(Tk_pyc);
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

	public static class LlamadoFuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TerminalNode Tk_par_izq() { return getToken(SLParser.Tk_par_izq, 0); }
		public TerminalNode Tk_par_der() { return getToken(SLParser.Tk_par_der, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public LlamadoFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadoFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterLlamadoFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitLlamadoFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitLlamadoFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadoFuncionContext llamadoFuncion() throws RecognitionException {
		LlamadoFuncionContext _localctx = new LlamadoFuncionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_llamadoFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(ID);
			setState(238);
			match(Tk_par_izq);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (NUM - 4)) | (1L << (STR - 4)) | (1L << (Tk_logico - 4)) | (1L << (Tk_negacion - 4)) | (1L << (Tk_matriz - 4)) | (1L << (Tk_vector - 4)) | (1L << (Tk_suma - 4)) | (1L << (Tk_resta - 4)) | (1L << (Tk_par_izq - 4)) | (1L << (Tk_registro - 4)) | (1L << (ID - 4)))) != 0)) {
				{
				setState(239);
				parametros();
				}
			}

			setState(242);
			match(Tk_par_der);
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<DatoContext> dato() {
			return getRuleContexts(DatoContext.class);
		}
		public DatoContext dato(int i) {
			return getRuleContext(DatoContext.class,i);
		}
		public List<TerminalNode> Tk_coma() { return getTokens(SLParser.Tk_coma); }
		public TerminalNode Tk_coma(int i) {
			return getToken(SLParser.Tk_coma, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			dato();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_coma) {
				{
				{
				setState(245);
				match(Tk_coma);
				setState(246);
				dato();
				}
				}
				setState(251);
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

	public static class AsignacionContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode Tk_asignacion() { return getToken(SLParser.Tk_asignacion, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			identificador();
			setState(253);
			match(Tk_asignacion);
			setState(254);
			dato();
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

	public static class Estructura_controlContext extends ParserRuleContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public Repetir_hastaContext repetir_hasta() {
			return getRuleContext(Repetir_hastaContext.class,0);
		}
		public DesdeContext desde() {
			return getRuleContext(DesdeContext.class,0);
		}
		public EvalContext eval() {
			return getRuleContext(EvalContext.class,0);
		}
		public Estructura_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterEstructura_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitEstructura_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitEstructura_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Estructura_controlContext estructura_control() throws RecognitionException {
		Estructura_controlContext _localctx = new Estructura_controlContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_estructura_control);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_if:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				condicional();
				}
				break;
			case Tk_mientras:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				mientras();
				}
				break;
			case Tk_repetir:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				repetir_hasta();
				}
				break;
			case Tk_desde:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				desde();
				}
				break;
			case Tk_eval:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				eval();
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode Tk_if() { return getToken(SLParser.Tk_if, 0); }
		public TerminalNode Tk_par_izq() { return getToken(SLParser.Tk_par_izq, 0); }
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public TerminalNode Tk_par_der() { return getToken(SLParser.Tk_par_der, 0); }
		public TerminalNode Tk_llave_izq() { return getToken(SLParser.Tk_llave_izq, 0); }
		public TerminalNode Tk_llave_der() { return getToken(SLParser.Tk_llave_der, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<Sino_siContext> sino_si() {
			return getRuleContexts(Sino_siContext.class);
		}
		public Sino_siContext sino_si(int i) {
			return getRuleContext(Sino_siContext.class,i);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condicional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(Tk_if);
			setState(264);
			match(Tk_par_izq);
			setState(265);
			logico(0);
			setState(266);
			match(Tk_par_der);
			setState(267);
			match(Tk_llave_izq);
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				sentencia();
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Tk_if - 14)) | (1L << (Tk_eval - 14)) | (1L << (Tk_desde - 14)) | (1L << (Tk_mientras - 14)) | (1L << (Tk_repetir - 14)) | (1L << (ID - 14)))) != 0) );
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					sino_si();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_elseif) {
				{
				setState(279);
				sino();
				}
			}

			setState(282);
			match(Tk_llave_der);
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

	public static class Sino_siContext extends ParserRuleContext {
		public TerminalNode Tk_elseif() { return getToken(SLParser.Tk_elseif, 0); }
		public TerminalNode Tk_if() { return getToken(SLParser.Tk_if, 0); }
		public TerminalNode Tk_par_izq() { return getToken(SLParser.Tk_par_izq, 0); }
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public TerminalNode Tk_par_der() { return getToken(SLParser.Tk_par_der, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Sino_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSino_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSino_si(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSino_si(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sino_siContext sino_si() throws RecognitionException {
		Sino_siContext _localctx = new Sino_siContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sino_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(Tk_elseif);
			setState(285);
			match(Tk_if);
			setState(286);
			match(Tk_par_izq);
			setState(287);
			logico(0);
			setState(288);
			match(Tk_par_der);
			setState(290); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(289);
				sentencia();
				}
				}
				setState(292); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Tk_if - 14)) | (1L << (Tk_eval - 14)) | (1L << (Tk_desde - 14)) | (1L << (Tk_mientras - 14)) | (1L << (Tk_repetir - 14)) | (1L << (ID - 14)))) != 0) );
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

	public static class SinoContext extends ParserRuleContext {
		public TerminalNode Tk_elseif() { return getToken(SLParser.Tk_elseif, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Tk_elseif);
			setState(296); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(295);
				sentencia();
				}
				}
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Tk_if - 14)) | (1L << (Tk_eval - 14)) | (1L << (Tk_desde - 14)) | (1L << (Tk_mientras - 14)) | (1L << (Tk_repetir - 14)) | (1L << (ID - 14)))) != 0) );
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode Tk_mientras() { return getToken(SLParser.Tk_mientras, 0); }
		public TerminalNode Tk_par_izq() { return getToken(SLParser.Tk_par_izq, 0); }
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public TerminalNode Tk_par_der() { return getToken(SLParser.Tk_par_der, 0); }
		public TerminalNode Tk_llave_izq() { return getToken(SLParser.Tk_llave_izq, 0); }
		public TerminalNode Tk_llave_der() { return getToken(SLParser.Tk_llave_der, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(Tk_mientras);
			setState(301);
			match(Tk_par_izq);
			setState(302);
			logico(0);
			setState(303);
			match(Tk_par_der);
			setState(304);
			match(Tk_llave_izq);
			setState(306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305);
				sentencia();
				}
				}
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Tk_if - 14)) | (1L << (Tk_eval - 14)) | (1L << (Tk_desde - 14)) | (1L << (Tk_mientras - 14)) | (1L << (Tk_repetir - 14)) | (1L << (ID - 14)))) != 0) );
			setState(310);
			match(Tk_llave_der);
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

	public static class Repetir_hastaContext extends ParserRuleContext {
		public TerminalNode Tk_repetir() { return getToken(SLParser.Tk_repetir, 0); }
		public TerminalNode Tk_hasta() { return getToken(SLParser.Tk_hasta, 0); }
		public TerminalNode Tk_par_izq() { return getToken(SLParser.Tk_par_izq, 0); }
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public TerminalNode Tk_par_der() { return getToken(SLParser.Tk_par_der, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Repetir_hastaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir_hasta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterRepetir_hasta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitRepetir_hasta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitRepetir_hasta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repetir_hastaContext repetir_hasta() throws RecognitionException {
		Repetir_hastaContext _localctx = new Repetir_hastaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_repetir_hasta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(Tk_repetir);
			setState(314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(313);
				sentencia();
				}
				}
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Tk_if - 14)) | (1L << (Tk_eval - 14)) | (1L << (Tk_desde - 14)) | (1L << (Tk_mientras - 14)) | (1L << (Tk_repetir - 14)) | (1L << (ID - 14)))) != 0) );
			setState(318);
			match(Tk_hasta);
			setState(319);
			match(Tk_par_izq);
			setState(320);
			logico(0);
			setState(321);
			match(Tk_par_der);
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

	public static class DesdeContext extends ParserRuleContext {
		public TerminalNode Tk_desde() { return getToken(SLParser.Tk_desde, 0); }
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TerminalNode Tk_asignacion() { return getToken(SLParser.Tk_asignacion, 0); }
		public List<NumericoContext> numerico() {
			return getRuleContexts(NumericoContext.class);
		}
		public NumericoContext numerico(int i) {
			return getRuleContext(NumericoContext.class,i);
		}
		public TerminalNode Tk_hasta() { return getToken(SLParser.Tk_hasta, 0); }
		public TerminalNode Tk_llave_izq() { return getToken(SLParser.Tk_llave_izq, 0); }
		public TerminalNode Tk_llave_der() { return getToken(SLParser.Tk_llave_der, 0); }
		public TerminalNode Tk_paso() { return getToken(SLParser.Tk_paso, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public DesdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDesde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDesde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDesde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesdeContext desde() throws RecognitionException {
		DesdeContext _localctx = new DesdeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_desde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(Tk_desde);
			setState(324);
			match(ID);
			setState(325);
			match(Tk_asignacion);
			setState(326);
			numerico(0);
			setState(327);
			match(Tk_hasta);
			setState(328);
			numerico(0);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_paso) {
				{
				setState(329);
				match(Tk_paso);
				setState(330);
				numerico(0);
				}
			}

			setState(333);
			match(Tk_llave_izq);
			setState(335); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(334);
				sentencia();
				}
				}
				setState(337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Tk_if - 14)) | (1L << (Tk_eval - 14)) | (1L << (Tk_desde - 14)) | (1L << (Tk_mientras - 14)) | (1L << (Tk_repetir - 14)) | (1L << (ID - 14)))) != 0) );
			setState(339);
			match(Tk_llave_der);
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

	public static class EvalContext extends ParserRuleContext {
		public TerminalNode Tk_eval() { return getToken(SLParser.Tk_eval, 0); }
		public TerminalNode Tk_llave_izq() { return getToken(SLParser.Tk_llave_izq, 0); }
		public TerminalNode Tk_llave_der() { return getToken(SLParser.Tk_llave_der, 0); }
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public Caso_defaultContext caso_default() {
			return getRuleContext(Caso_defaultContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_eval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(Tk_eval);
			setState(342);
			match(Tk_llave_izq);
			setState(344); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(343);
				caso();
				}
				}
				setState(346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Tk_caso );
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_elseif) {
				{
				setState(348);
				caso_default();
				}
			}

			setState(351);
			match(Tk_llave_der);
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

	public static class CasoContext extends ParserRuleContext {
		public TerminalNode Tk_caso() { return getToken(SLParser.Tk_caso, 0); }
		public TerminalNode Tk_par_izq() { return getToken(SLParser.Tk_par_izq, 0); }
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public TerminalNode Tk_par_der() { return getToken(SLParser.Tk_par_der, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(Tk_caso);
			setState(354);
			match(Tk_par_izq);
			setState(355);
			logico(0);
			setState(356);
			match(Tk_par_der);
			setState(358); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(357);
				sentencia();
				}
				}
				setState(360); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Tk_if - 14)) | (1L << (Tk_eval - 14)) | (1L << (Tk_desde - 14)) | (1L << (Tk_mientras - 14)) | (1L << (Tk_repetir - 14)) | (1L << (ID - 14)))) != 0) );
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

	public static class Caso_defaultContext extends ParserRuleContext {
		public TerminalNode Tk_elseif() { return getToken(SLParser.Tk_elseif, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Caso_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCaso_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCaso_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitCaso_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Caso_defaultContext caso_default() throws RecognitionException {
		Caso_defaultContext _localctx = new Caso_defaultContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_caso_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(Tk_elseif);
			setState(364); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(363);
				sentencia();
				}
				}
				setState(366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Tk_if - 14)) | (1L << (Tk_eval - 14)) | (1L << (Tk_desde - 14)) | (1L << (Tk_mientras - 14)) | (1L << (Tk_repetir - 14)) | (1L << (ID - 14)))) != 0) );
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

	public static class Tipo_datoContext extends ParserRuleContext {
		public TerminalNode Tk_numericoRW() { return getToken(SLParser.Tk_numericoRW, 0); }
		public TerminalNode Tk_cadenaRW() { return getToken(SLParser.Tk_cadenaRW, 0); }
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public EstructuraContext estructura() {
			return getRuleContext(EstructuraContext.class,0);
		}
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTipo_dato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTipo_dato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitTipo_dato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tipo_dato);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(Tk_numericoRW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(Tk_cadenaRW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(Tk_cadenaRW);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(372);
				estructura();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(373);
				registro();
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

	public static class DatoContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public NumericoContext numerico() {
			return getRuleContext(NumericoContext.class,0);
		}
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public EstructuraContext estructura() {
			return getRuleContext(EstructuraContext.class,0);
		}
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public LlamadoFuncionContext llamadoFuncion() {
			return getRuleContext(LlamadoFuncionContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public DatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dato);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				cadena(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				numerico(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				logico(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				estructura();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				registro();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(381);
				llamadoFuncion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(382);
				identificador();
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

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public List<TerminalNode> Tk_punto() { return getTokens(SLParser.Tk_punto); }
		public TerminalNode Tk_punto(int i) {
			return getToken(SLParser.Tk_punto, i);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<TerminalNode> Tk_corchete_izq() { return getTokens(SLParser.Tk_corchete_izq); }
		public TerminalNode Tk_corchete_izq(int i) {
			return getToken(SLParser.Tk_corchete_izq, i);
		}
		public List<NumericoContext> numerico() {
			return getRuleContexts(NumericoContext.class);
		}
		public NumericoContext numerico(int i) {
			return getRuleContext(NumericoContext.class,i);
		}
		public List<TerminalNode> Tk_corchete_der() { return getTokens(SLParser.Tk_corchete_der); }
		public TerminalNode Tk_corchete_der(int i) {
			return getToken(SLParser.Tk_corchete_der, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_identificador);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(ID);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(392);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Tk_punto:
						{
						setState(386);
						match(Tk_punto);
						setState(387);
						identificador();
						}
						break;
					case Tk_corchete_izq:
						{
						setState(388);
						match(Tk_corchete_izq);
						setState(389);
						numerico(0);
						setState(390);
						match(Tk_corchete_der);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class NumericoContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SLParser.NUM, 0); }
		public TerminalNode Tk_suma() { return getToken(SLParser.Tk_suma, 0); }
		public TerminalNode Tk_resta() { return getToken(SLParser.Tk_resta, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public LlamadoFuncionContext llamadoFuncion() {
			return getRuleContext(LlamadoFuncionContext.class,0);
		}
		public TerminalNode Tk_par_izq() { return getToken(SLParser.Tk_par_izq, 0); }
		public List<NumericoContext> numerico() {
			return getRuleContexts(NumericoContext.class);
		}
		public NumericoContext numerico(int i) {
			return getRuleContext(NumericoContext.class,i);
		}
		public TerminalNode Tk_par_der() { return getToken(SLParser.Tk_par_der, 0); }
		public TerminalNode OP_MAT() { return getToken(SLParser.OP_MAT, 0); }
		public NumericoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNumerico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNumerico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNumerico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericoContext numerico() throws RecognitionException {
		return numerico(0);
	}

	private NumericoContext numerico(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumericoContext _localctx = new NumericoContext(_ctx, _parentState);
		NumericoContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_numerico, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_suma || _la==Tk_resta) {
					{
					setState(398);
					_la = _input.LA(1);
					if ( !(_la==Tk_suma || _la==Tk_resta) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(401);
				match(NUM);
				}
				break;
			case 2:
				{
				setState(402);
				identificador();
				}
				break;
			case 3:
				{
				setState(403);
				llamadoFuncion();
				}
				break;
			case 4:
				{
				setState(404);
				match(Tk_par_izq);
				setState(405);
				numerico(0);
				setState(406);
				match(Tk_par_der);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NumericoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_numerico);
					setState(410);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(411);
					match(OP_MAT);
					setState(412);
					numerico(3);
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class CadenaContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(SLParser.STR, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public LlamadoFuncionContext llamadoFuncion() {
			return getRuleContext(LlamadoFuncionContext.class,0);
		}
		public List<CadenaContext> cadena() {
			return getRuleContexts(CadenaContext.class);
		}
		public CadenaContext cadena(int i) {
			return getRuleContext(CadenaContext.class,i);
		}
		public TerminalNode Tk_suma() { return getToken(SLParser.Tk_suma, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCadena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		return cadena(0);
	}

	private CadenaContext cadena(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CadenaContext _localctx = new CadenaContext(_ctx, _parentState);
		CadenaContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_cadena, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(419);
				match(STR);
				}
				break;
			case 2:
				{
				setState(420);
				identificador();
				}
				break;
			case 3:
				{
				setState(421);
				llamadoFuncion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CadenaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cadena);
					setState(424);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(425);
					match(Tk_suma);
					setState(426);
					cadena(2);
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class LogicoContext extends ParserRuleContext {
		public TerminalNode Tk_logico() { return getToken(SLParser.Tk_logico, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public LlamadoFuncionContext llamadoFuncion() {
			return getRuleContext(LlamadoFuncionContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode Tk_negacion() { return getToken(SLParser.Tk_negacion, 0); }
		public List<LogicoContext> logico() {
			return getRuleContexts(LogicoContext.class);
		}
		public LogicoContext logico(int i) {
			return getRuleContext(LogicoContext.class,i);
		}
		public TerminalNode Tk_par_izq() { return getToken(SLParser.Tk_par_izq, 0); }
		public TerminalNode Tk_par_der() { return getToken(SLParser.Tk_par_der, 0); }
		public TerminalNode Tk_conjuncion() { return getToken(SLParser.Tk_conjuncion, 0); }
		public TerminalNode Tk_disyuncion() { return getToken(SLParser.Tk_disyuncion, 0); }
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicoContext logico() throws RecognitionException {
		return logico(0);
	}

	private LogicoContext logico(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicoContext _localctx = new LogicoContext(_ctx, _parentState);
		LogicoContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_logico, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(433);
				match(Tk_logico);
				}
				break;
			case 2:
				{
				setState(434);
				identificador();
				}
				break;
			case 3:
				{
				setState(435);
				llamadoFuncion();
				}
				break;
			case 4:
				{
				setState(436);
				comparacion();
				}
				break;
			case 5:
				{
				setState(437);
				match(Tk_negacion);
				setState(438);
				logico(3);
				}
				break;
			case 6:
				{
				setState(439);
				match(Tk_par_izq);
				setState(440);
				logico(0);
				setState(441);
				match(Tk_par_der);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logico);
					setState(445);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(446);
					_la = _input.LA(1);
					if ( !(_la==Tk_conjuncion || _la==Tk_disyuncion) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(447);
					logico(3);
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class EstructuraContext extends ParserRuleContext {
		public TerminalNode Tk_corchete_izq() { return getToken(SLParser.Tk_corchete_izq, 0); }
		public DimContext dim() {
			return getRuleContext(DimContext.class,0);
		}
		public TerminalNode Tk_corchete_der() { return getToken(SLParser.Tk_corchete_der, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode Tk_vector() { return getToken(SLParser.Tk_vector, 0); }
		public TerminalNode Tk_matriz() { return getToken(SLParser.Tk_matriz, 0); }
		public EstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraContext estructura() throws RecognitionException {
		EstructuraContext _localctx = new EstructuraContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_estructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_la = _input.LA(1);
			if ( !(_la==Tk_matriz || _la==Tk_vector) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(454);
			match(Tk_corchete_izq);
			setState(455);
			dim();
			setState(456);
			match(Tk_corchete_der);
			setState(457);
			tipo_dato();
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

	public static class DimContext extends ParserRuleContext {
		public List<TerminalNode> Tk_asterisco() { return getTokens(SLParser.Tk_asterisco); }
		public TerminalNode Tk_asterisco(int i) {
			return getToken(SLParser.Tk_asterisco, i);
		}
		public List<NumericoContext> numerico() {
			return getRuleContexts(NumericoContext.class);
		}
		public NumericoContext numerico(int i) {
			return getRuleContext(NumericoContext.class,i);
		}
		public List<TerminalNode> Tk_coma() { return getTokens(SLParser.Tk_coma); }
		public TerminalNode Tk_coma(int i) {
			return getToken(SLParser.Tk_coma, i);
		}
		public DimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimContext dim() throws RecognitionException {
		DimContext _localctx = new DimContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_asterisco:
				{
				setState(459);
				match(Tk_asterisco);
				}
				break;
			case NUM:
			case Tk_suma:
			case Tk_resta:
			case Tk_par_izq:
			case ID:
				{
				setState(460);
				numerico(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_coma) {
				{
				{
				setState(463);
				match(Tk_coma);
				setState(466);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Tk_asterisco:
					{
					setState(464);
					match(Tk_asterisco);
					}
					break;
				case NUM:
				case Tk_suma:
				case Tk_resta:
				case Tk_par_izq:
				case ID:
					{
					setState(465);
					numerico(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(472);
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

	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode Tk_registro() { return getToken(SLParser.Tk_registro, 0); }
		public TerminalNode Tk_llave_izq() { return getToken(SLParser.Tk_llave_izq, 0); }
		public TerminalNode Tk_llave_der() { return getToken(SLParser.Tk_llave_der, 0); }
		public List<Declaracion_campoContext> declaracion_campo() {
			return getRuleContexts(Declaracion_campoContext.class);
		}
		public Declaracion_campoContext declaracion_campo(int i) {
			return getRuleContext(Declaracion_campoContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(Tk_registro);
			setState(474);
			match(Tk_llave_izq);
			setState(476); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(475);
				declaracion_campo();
				}
				}
				setState(478); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(480);
			match(Tk_llave_der);
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

	public static class ComparacionContext extends ParserRuleContext {
		public List<NumericoContext> numerico() {
			return getRuleContexts(NumericoContext.class);
		}
		public NumericoContext numerico(int i) {
			return getRuleContext(NumericoContext.class,i);
		}
		public TerminalNode OP_COMP() { return getToken(SLParser.OP_COMP, 0); }
		public List<CadenaContext> cadena() {
			return getRuleContexts(CadenaContext.class);
		}
		public CadenaContext cadena(int i) {
			return getRuleContext(CadenaContext.class,i);
		}
		public TerminalNode OP_IDEN() { return getToken(SLParser.OP_IDEN, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_comparacion);
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				numerico(0);
				setState(483);
				match(OP_COMP);
				setState(484);
				numerico(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				cadena(0);
				setState(487);
				match(OP_IDEN);
				setState(488);
				cadena(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31:
			return numerico_sempred((NumericoContext)_localctx, predIndex);
		case 32:
			return cadena_sempred((CadenaContext)_localctx, predIndex);
		case 33:
			return logico_sempred((LogicoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean numerico_sempred(NumericoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cadena_sempred(CadenaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logico_sempred(LogicoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u01ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\5\2P\n\2\3\2\7\2S\n\2"+
		"\f\2\16\2V\13\2\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\7\2a\n\2\f\2\16"+
		"\2d\13\2\3\2\3\2\3\3\3\3\3\3\5\3k\n\3\3\4\3\4\3\4\5\4p\n\4\3\4\5\4s\n"+
		"\4\3\5\3\5\6\5w\n\5\r\5\16\5x\3\6\3\6\3\6\3\6\5\6\177\n\6\3\7\3\7\6\7"+
		"\u0083\n\7\r\7\16\7\u0084\3\b\3\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\6\t\u008f"+
		"\n\t\r\t\16\t\u0090\3\n\3\n\3\n\7\n\u0096\n\n\f\n\16\n\u0099\13\n\3\n"+
		"\3\n\3\n\3\n\5\n\u009f\n\n\3\n\5\n\u00a2\n\n\3\13\3\13\3\13\5\13\u00a7"+
		"\n\13\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\3\f\3\f\3\r\5\r\u00b2\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00b9\n\r\3\r\3\r\3\r\7\r\u00be\n\r\f\r\16\r\u00c1\13"+
		"\r\3\16\7\16\u00c4\n\16\f\16\16\16\u00c7\13\16\3\16\3\16\6\16\u00cb\n"+
		"\16\r\16\16\16\u00cc\3\16\3\16\3\17\3\17\3\17\5\17\u00d4\n\17\3\17\7\17"+
		"\u00d7\n\17\f\17\16\17\u00da\13\17\3\17\3\17\6\17\u00de\n\17\r\17\16\17"+
		"\u00df\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00eb\n\20\3"+
		"\20\5\20\u00ee\n\20\3\21\3\21\3\21\5\21\u00f3\n\21\3\21\3\21\3\22\3\22"+
		"\3\22\7\22\u00fa\n\22\f\22\16\22\u00fd\13\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0108\n\24\3\25\3\25\3\25\3\25\3\25\3\25\6\25"+
		"\u0110\n\25\r\25\16\25\u0111\3\25\7\25\u0115\n\25\f\25\16\25\u0118\13"+
		"\25\3\25\5\25\u011b\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\6\26"+
		"\u0125\n\26\r\26\16\26\u0126\3\27\3\27\6\27\u012b\n\27\r\27\16\27\u012c"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u0135\n\30\r\30\16\30\u0136\3\30\3"+
		"\30\3\31\3\31\6\31\u013d\n\31\r\31\16\31\u013e\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u014e\n\32\3\32\3\32\6\32"+
		"\u0152\n\32\r\32\16\32\u0153\3\32\3\32\3\33\3\33\3\33\6\33\u015b\n\33"+
		"\r\33\16\33\u015c\3\33\5\33\u0160\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\6\34\u0169\n\34\r\34\16\34\u016a\3\35\3\35\6\35\u016f\n\35\r\35\16"+
		"\35\u0170\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0179\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0182\n\37\3 \3 \3 \3 \3 \3 \3 \7 \u018b\n "+
		"\f \16 \u018e\13 \3!\3!\5!\u0192\n!\3!\3!\3!\3!\3!\3!\3!\5!\u019b\n!\3"+
		"!\3!\3!\7!\u01a0\n!\f!\16!\u01a3\13!\3\"\3\"\3\"\3\"\5\"\u01a9\n\"\3\""+
		"\3\"\3\"\7\"\u01ae\n\"\f\"\16\"\u01b1\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u01be\n#\3#\3#\3#\7#\u01c3\n#\f#\16#\u01c6\13#\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\5%\u01d0\n%\3%\3%\3%\5%\u01d5\n%\7%\u01d7\n%\f%\16%\u01da\13"+
		"%\3&\3&\3&\6&\u01df\n&\r&\16&\u01e0\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u01ed\n\'\3\'\2\5@BD(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJL\2\5\3\2\27\30\3\2\22\23\3\2\25\26\2\u0218"+
		"\2O\3\2\2\2\4g\3\2\2\2\6o\3\2\2\2\bt\3\2\2\2\nz\3\2\2\2\f\u0080\3\2\2"+
		"\2\16\u0086\3\2\2\2\20\u008c\3\2\2\2\22\u0092\3\2\2\2\24\u00a3\3\2\2\2"+
		"\26\u00a8\3\2\2\2\30\u00b1\3\2\2\2\32\u00c5\3\2\2\2\34\u00d0\3\2\2\2\36"+
		"\u00ea\3\2\2\2 \u00ef\3\2\2\2\"\u00f6\3\2\2\2$\u00fe\3\2\2\2&\u0107\3"+
		"\2\2\2(\u0109\3\2\2\2*\u011e\3\2\2\2,\u0128\3\2\2\2.\u012e\3\2\2\2\60"+
		"\u013a\3\2\2\2\62\u0145\3\2\2\2\64\u0157\3\2\2\2\66\u0163\3\2\2\28\u016c"+
		"\3\2\2\2:\u0178\3\2\2\2<\u0181\3\2\2\2>\u0183\3\2\2\2@\u019a\3\2\2\2B"+
		"\u01a8\3\2\2\2D\u01bd\3\2\2\2F\u01c7\3\2\2\2H\u01cf\3\2\2\2J\u01db\3\2"+
		"\2\2L\u01ec\3\2\2\2NP\5\4\3\2ON\3\2\2\2OP\3\2\2\2PT\3\2\2\2QS\5\6\4\2"+
		"RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2W[\7<\2\2"+
		"XZ\5\36\20\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2"+
		"\2\2^b\7=\2\2_a\5\24\13\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3"+
		"\2\2\2db\3\2\2\2ef\7\2\2\3f\3\3\2\2\2gh\7A\2\2hj\7B\2\2ik\7&\2\2ji\3\2"+
		"\2\2jk\3\2\2\2k\5\3\2\2\2lp\5\b\5\2mp\5\f\7\2np\5\20\t\2ol\3\2\2\2om\3"+
		"\2\2\2on\3\2\2\2pr\3\2\2\2qs\7&\2\2rq\3\2\2\2rs\3\2\2\2s\7\3\2\2\2tv\7"+
		"/\2\2uw\5\n\6\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\t\3\2\2\2z{\5"+
		"> \2{|\7\35\2\2|~\5<\37\2}\177\7&\2\2~}\3\2\2\2~\177\3\2\2\2\177\13\3"+
		"\2\2\2\u0080\u0082\7\60\2\2\u0081\u0083\5\16\b\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\r\3\2\2\2"+
		"\u0086\u0087\7B\2\2\u0087\u0088\7\'\2\2\u0088\u008a\5:\36\2\u0089\u008b"+
		"\7&\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\17\3\2\2\2\u008c"+
		"\u008e\7.\2\2\u008d\u008f\5\22\n\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\21\3\2\2\2\u0092\u0097"+
		"\7B\2\2\u0093\u0094\7%\2\2\u0094\u0096\7B\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\'\2\2\u009b\u009e\5:\36\2\u009c"+
		"\u009d\7\35\2\2\u009d\u009f\5<\37\2\u009e\u009c\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\7&\2\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\23\3\2\2\2\u00a3\u00a6\5\26\f\2\u00a4\u00a7\5\32"+
		"\16\2\u00a5\u00a7\5\34\17\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\25\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa\7B\2\2\u00aa\u00ac\7(\2\2\u00ab"+
		"\u00ad\5\30\r\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3"+
		"\2\2\2\u00ae\u00af\7)\2\2\u00af\27\3\2\2\2\u00b0\u00b2\7@\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7B\2\2\u00b4"+
		"\u00b5\7\'\2\2\u00b5\u00bf\5:\36\2\u00b6\u00b8\7%\2\2\u00b7\u00b9\7@\2"+
		"\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb"+
		"\7B\2\2\u00bb\u00bc\7\'\2\2\u00bc\u00be\5:\36\2\u00bd\u00b6\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\31\3\2\2"+
		"\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\5\6\4\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00ca\7<\2\2\u00c9\u00cb\5\36\20\2\u00ca\u00c9\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\7=\2\2\u00cf\33\3\2\2\2\u00d0\u00d3\7?\2\2"+
		"\u00d1\u00d4\5:\36\2\u00d2\u00d4\7B\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\u00d8\3\2\2\2\u00d5\u00d7\5\6\4\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\7<\2\2\u00dc\u00de\5\36\20\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7?\2\2\u00e2\u00e3\7(\2\2\u00e3\u00e4"+
		"\5<\37\2\u00e4\u00e5\7)\2\2\u00e5\u00e6\7=\2\2\u00e6\35\3\2\2\2\u00e7"+
		"\u00eb\5 \21\2\u00e8\u00eb\5$\23\2\u00e9\u00eb\5&\24\2\u00ea\u00e7\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ee\7&\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\37\3\2\2\2"+
		"\u00ef\u00f0\7B\2\2\u00f0\u00f2\7(\2\2\u00f1\u00f3\5\"\22\2\u00f2\u00f1"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7)\2\2\u00f5"+
		"!\3\2\2\2\u00f6\u00fb\5<\37\2\u00f7\u00f8\7%\2\2\u00f8\u00fa\5<\37\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc#\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\5> \2\u00ff\u0100"+
		"\7\35\2\2\u0100\u0101\5<\37\2\u0101%\3\2\2\2\u0102\u0108\5(\25\2\u0103"+
		"\u0108\5.\30\2\u0104\u0108\5\60\31\2\u0105\u0108\5\62\32\2\u0106\u0108"+
		"\5\64\33\2\u0107\u0102\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0104\3\2\2\2"+
		"\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108\'\3\2\2\2\u0109\u010a\7"+
		"\20\2\2\u010a\u010b\7(\2\2\u010b\u010c\5D#\2\u010c\u010d\7)\2\2\u010d"+
		"\u010f\7*\2\2\u010e\u0110\5\36\20\2\u010f\u010e\3\2\2\2\u0110\u0111\3"+
		"\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0116\3\2\2\2\u0113"+
		"\u0115\5*\26\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011b\5,\27\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011d\7+\2\2\u011d)\3\2\2\2\u011e\u011f\7\21\2\2\u011f\u0120"+
		"\7\20\2\2\u0120\u0121\7(\2\2\u0121\u0122\5D#\2\u0122\u0124\7)\2\2\u0123"+
		"\u0125\5\36\20\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127+\3\2\2\2\u0128\u012a\7\21\2\2\u0129\u012b"+
		"\5\36\20\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d-\3\2\2\2\u012e\u012f\7:\2\2\u012f\u0130\7("+
		"\2\2\u0130\u0131\5D#\2\u0131\u0132\7)\2\2\u0132\u0134\7*\2\2\u0133\u0135"+
		"\5\36\20\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2"+
		"\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7+\2\2\u0139/\3\2"+
		"\2\2\u013a\u013c\7;\2\2\u013b\u013d\5\36\20\2\u013c\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\78\2\2\u0141\u0142\7(\2\2\u0142\u0143\5D#\2\u0143\u0144"+
		"\7)\2\2\u0144\61\3\2\2\2\u0145\u0146\7\67\2\2\u0146\u0147\7B\2\2\u0147"+
		"\u0148\7\35\2\2\u0148\u0149\5@!\2\u0149\u014a\78\2\2\u014a\u014d\5@!\2"+
		"\u014b\u014c\79\2\2\u014c\u014e\5@!\2\u014d\u014b\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\7*\2\2\u0150\u0152\5\36\20\2"+
		"\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7+\2\2\u0156\63\3\2\2\2\u0157"+
		"\u0158\7\66\2\2\u0158\u015a\7*\2\2\u0159\u015b\5\66\34\2\u015a\u0159\3"+
		"\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u0160\58\35\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7+\2\2\u0162\65\3\2\2\2\u0163\u0164"+
		"\7\65\2\2\u0164\u0165\7(\2\2\u0165\u0166\5D#\2\u0166\u0168\7)\2\2\u0167"+
		"\u0169\5\36\20\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3"+
		"\2\2\2\u016a\u016b\3\2\2\2\u016b\67\3\2\2\2\u016c\u016e\7\21\2\2\u016d"+
		"\u016f\5\36\20\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3"+
		"\2\2\2\u0170\u0171\3\2\2\2\u01719\3\2\2\2\u0172\u0179\7\64\2\2\u0173\u0179"+
		"\7\62\2\2\u0174\u0179\7\62\2\2\u0175\u0179\7B\2\2\u0176\u0179\5F$\2\u0177"+
		"\u0179\5J&\2\u0178\u0172\3\2\2\2\u0178\u0173\3\2\2\2\u0178\u0174\3\2\2"+
		"\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179;"+
		"\3\2\2\2\u017a\u0182\5B\"\2\u017b\u0182\5@!\2\u017c\u0182\5D#\2\u017d"+
		"\u0182\5F$\2\u017e\u0182\5J&\2\u017f\u0182\5 \21\2\u0180\u0182\5> \2\u0181"+
		"\u017a\3\2\2\2\u0181\u017b\3\2\2\2\u0181\u017c\3\2\2\2\u0181\u017d\3\2"+
		"\2\2\u0181\u017e\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182"+
		"=\3\2\2\2\u0183\u018c\7B\2\2\u0184\u0185\7$\2\2\u0185\u018b\5> \2\u0186"+
		"\u0187\7,\2\2\u0187\u0188\5@!\2\u0188\u0189\7-\2\2\u0189\u018b\3\2\2\2"+
		"\u018a\u0184\3\2\2\2\u018a\u0186\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d?\3\2\2\2\u018e\u018c\3\2\2\2\u018f"+
		"\u0191\b!\1\2\u0190\u0192\t\2\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0193\3\2\2\2\u0193\u019b\7\6\2\2\u0194\u019b\5> \2\u0195\u019b"+
		"\5 \21\2\u0196\u0197\7(\2\2\u0197\u0198\5@!\2\u0198\u0199\7)\2\2\u0199"+
		"\u019b\3\2\2\2\u019a\u018f\3\2\2\2\u019a\u0194\3\2\2\2\u019a\u0195\3\2"+
		"\2\2\u019a\u0196\3\2\2\2\u019b\u01a1\3\2\2\2\u019c\u019d\f\4\2\2\u019d"+
		"\u019e\7\f\2\2\u019e\u01a0\5@!\5\u019f\u019c\3\2\2\2\u01a0\u01a3\3\2\2"+
		"\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2A\3\2\2\2\u01a3\u01a1"+
		"\3\2\2\2\u01a4\u01a5\b\"\1\2\u01a5\u01a9\7\t\2\2\u01a6\u01a9\5> \2\u01a7"+
		"\u01a9\5 \21\2\u01a8\u01a4\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2"+
		"\2\2\u01a9\u01af\3\2\2\2\u01aa\u01ab\f\3\2\2\u01ab\u01ac\7\27\2\2\u01ac"+
		"\u01ae\5B\"\4\u01ad\u01aa\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2"+
		"\2\2\u01af\u01b0\3\2\2\2\u01b0C\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3"+
		"\b#\1\2\u01b3\u01be\7\r\2\2\u01b4\u01be\5> \2\u01b5\u01be\5 \21\2\u01b6"+
		"\u01be\5L\'\2\u01b7\u01b8\7\24\2\2\u01b8\u01be\5D#\5\u01b9\u01ba\7(\2"+
		"\2\u01ba\u01bb\5D#\2\u01bb\u01bc\7)\2\2\u01bc\u01be\3\2\2\2\u01bd\u01b2"+
		"\3\2\2\2\u01bd\u01b4\3\2\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01b6\3\2\2\2\u01bd"+
		"\u01b7\3\2\2\2\u01bd\u01b9\3\2\2\2\u01be\u01c4\3\2\2\2\u01bf\u01c0\f\4"+
		"\2\2\u01c0\u01c1\t\3\2\2\u01c1\u01c3\5D#\5\u01c2\u01bf\3\2\2\2\u01c3\u01c6"+
		"\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5E\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\u01c8\t\4\2\2\u01c8\u01c9\7,\2\2\u01c9\u01ca\5H%"+
		"\2\u01ca\u01cb\7-\2\2\u01cb\u01cc\5:\36\2\u01ccG\3\2\2\2\u01cd\u01d0\7"+
		"\31\2\2\u01ce\u01d0\5@!\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0"+
		"\u01d8\3\2\2\2\u01d1\u01d4\7%\2\2\u01d2\u01d5\7\31\2\2\u01d3\u01d5\5@"+
		"!\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6"+
		"\u01d1\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9I\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc\7\61\2\2\u01dc\u01de"+
		"\7*\2\2\u01dd\u01df\5\16\b\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\7+"+
		"\2\2\u01e3K\3\2\2\2\u01e4\u01e5\5@!\2\u01e5\u01e6\7\n\2\2\u01e6\u01e7"+
		"\5@!\2\u01e7\u01ed\3\2\2\2\u01e8\u01e9\5B\"\2\u01e9\u01ea\7\13\2\2\u01ea"+
		"\u01eb\5B\"\2\u01eb\u01ed\3\2\2\2\u01ec\u01e4\3\2\2\2\u01ec\u01e8\3\2"+
		"\2\2\u01edM\3\2\2\2=OT[bjorx~\u0084\u008a\u0090\u0097\u009e\u00a1\u00a6"+
		"\u00ac\u00b1\u00b8\u00bf\u00c5\u00cc\u00d3\u00d8\u00df\u00ea\u00ed\u00f2"+
		"\u00fb\u0107\u0111\u0116\u011a\u0126\u012c\u0136\u013e\u014d\u0153\u015c"+
		"\u015f\u016a\u0170\u0178\u0181\u018a\u018c\u0191\u019a\u01a1\u01a8\u01af"+
		"\u01bd\u01c4\u01cf\u01d4\u01d8\u01e0\u01ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
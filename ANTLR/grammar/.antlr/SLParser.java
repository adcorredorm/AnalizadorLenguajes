// Generated from /home/angel/Code/Lenguajes/ANTLR/grammar/SL.g4 by ANTLR 4.7.1
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
		REAL=46, CTF=47, STR=48, LOG=49, OP_COMP=50, OP_MAT=51;
	public static final int
		RULE_inicio = 0, RULE_programa = 1, RULE_declaracion = 2, RULE_constantes = 3, 
		RULE_tipos = 4, RULE_declaracion_campo = 5, RULE_variables = 6, RULE_subrutina = 7, 
		RULE_subrutina_base = 8, RULE_metodo = 9, RULE_funcion = 10, RULE_parametros_subrutina = 11, 
		RULE_sentencia = 12, RULE_llamadoFuncion = 13, RULE_parametros = 14, RULE_operacion_matematica = 15, 
		RULE_asignacion = 16, RULE_estructura_control = 17, RULE_condicional = 18, 
		RULE_mientras = 19, RULE_repetir_hasta = 20, RULE_desde = 21, RULE_eval = 22, 
		RULE_caso = 23, RULE_tipo_dato = 24, RULE_dato = 25, RULE_identificador = 26, 
		RULE_numerico = 27, RULE_cadena = 28, RULE_logico = 29, RULE_estructura = 30, 
		RULE_dim = 31, RULE_registro = 32, RULE_comparacion = 33;
	public static final String[] ruleNames = {
		"inicio", "programa", "declaracion", "constantes", "tipos", "declaracion_campo", 
		"variables", "subrutina", "subrutina_base", "metodo", "funcion", "parametros_subrutina", 
		"sentencia", "llamadoFuncion", "parametros", "operacion_matematica", "asignacion", 
		"estructura_control", "condicional", "mientras", "repetir_hasta", "desde", 
		"eval", "caso", "tipo_dato", "dato", "identificador", "numerico", "cadena", 
		"logico", "estructura", "dim", "registro", "comparacion"
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
		"REAL", "CTF", "STR", "LOG", "OP_COMP", "OP_MAT"
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
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(68);
				programa();
				}
			}

			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__8))) != 0)) {
				{
				{
				setState(71);
				declaracion();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__0);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(78);
				sentencia();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(T__1);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(85);
				subrutina();
				}
				}
				setState(90);
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

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__2);
			setState(92);
			match(ID);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(93);
				match(T__3);
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
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(96);
				constantes();
				}
				break;
			case T__6:
				{
				setState(97);
				tipos();
				}
				break;
			case T__8:
				{
				setState(98);
				variables();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(101);
				match(T__3);
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
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<Tipo_datoContext> tipo_dato() {
			return getRuleContexts(Tipo_datoContext.class);
		}
		public Tipo_datoContext tipo_dato(int i) {
			return getRuleContext(Tipo_datoContext.class,i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__4);
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				identificador();
				setState(106);
				match(T__5);
				setState(107);
				tipo_dato();
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(108);
					match(T__3);
					}
					break;
				}
				}
				}
				setState(113); 
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

	public static class TiposContext extends ParserRuleContext {
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
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__6);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				declaracion_campo();
				}
				}
				setState(119); 
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
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Declaracion_campoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_campo; }
	}

	public final Declaracion_campoContext declaracion_campo() throws RecognitionException {
		Declaracion_campoContext _localctx = new Declaracion_campoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ID);
			setState(122);
			match(T__7);
			setState(123);
			tipo_dato();
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(124);
				match(T__3);
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
		public List<TerminalNode> ID() { return getTokens(SLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLParser.ID, i);
		}
		public List<Tipo_datoContext> tipo_dato() {
			return getRuleContexts(Tipo_datoContext.class);
		}
		public Tipo_datoContext tipo_dato(int i) {
			return getRuleContext(Tipo_datoContext.class,i);
		}
		public List<DatoContext> dato() {
			return getRuleContexts(DatoContext.class);
		}
		public DatoContext dato(int i) {
			return getRuleContext(DatoContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__8);
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				match(ID);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(129);
					match(T__9);
					setState(130);
					match(ID);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(T__7);
				setState(137);
				tipo_dato();
				setState(138);
				match(T__5);
				setState(139);
				dato();
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(140);
					match(T__3);
					}
					break;
				}
				}
				}
				setState(145); 
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
	}

	public final SubrutinaContext subrutina() throws RecognitionException {
		SubrutinaContext _localctx = new SubrutinaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subrutina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			subrutina_base();
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__4:
			case T__6:
			case T__8:
				{
				setState(148);
				metodo();
				}
				break;
			case T__13:
				{
				setState(149);
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
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Parametros_subrutinaContext parametros_subrutina() {
			return getRuleContext(Parametros_subrutinaContext.class,0);
		}
		public Subrutina_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrutina_base; }
	}

	public final Subrutina_baseContext subrutina_base() throws RecognitionException {
		Subrutina_baseContext _localctx = new Subrutina_baseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subrutina_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__10);
			setState(153);
			match(ID);
			setState(154);
			match(T__11);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14 || _la==ID) {
				{
				setState(155);
				parametros_subrutina();
				}
			}

			setState(158);
			match(T__12);
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
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__8))) != 0)) {
				{
				{
				setState(160);
				declaracion();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(T__0);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(167);
				sentencia();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(T__1);
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
		public List<TerminalNode> ID() { return getTokens(SLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLParser.ID, i);
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
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__13);
			setState(176);
			match(ID);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__8))) != 0)) {
				{
				{
				setState(177);
				declaracion();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(T__0);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(184);
				sentencia();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(T__13);
			setState(191);
			match(T__11);
			setState(192);
			match(ID);
			setState(193);
			match(T__12);
			setState(194);
			match(T__1);
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
		public List<Tipo_datoContext> tipo_dato() {
			return getRuleContexts(Tipo_datoContext.class);
		}
		public Tipo_datoContext tipo_dato(int i) {
			return getRuleContext(Tipo_datoContext.class,i);
		}
		public Parametros_subrutinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_subrutina; }
	}

	public final Parametros_subrutinaContext parametros_subrutina() throws RecognitionException {
		Parametros_subrutinaContext _localctx = new Parametros_subrutinaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametros_subrutina);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(196);
				match(T__14);
				}
			}

			setState(199);
			match(ID);
			setState(200);
			match(T__7);
			setState(201);
			tipo_dato();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(202);
				match(T__9);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(203);
					match(T__14);
					}
				}

				setState(206);
				match(ID);
				setState(207);
				match(T__7);
				setState(208);
				tipo_dato();
				}
				}
				setState(213);
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
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(214);
				llamadoFuncion();
				}
				break;
			case 2:
				{
				setState(215);
				asignacion();
				}
				break;
			case 3:
				{
				setState(216);
				estructura_control();
				}
				break;
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(219);
				match(T__3);
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
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public LlamadoFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadoFuncion; }
	}

	public final LlamadoFuncionContext llamadoFuncion() throws RecognitionException {
		LlamadoFuncionContext _localctx = new LlamadoFuncionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_llamadoFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ID);
			setState(223);
			match(T__11);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << ID) | (1L << NUM) | (1L << STR) | (1L << LOG))) != 0)) {
				{
				setState(224);
				parametros();
				}
			}

			setState(227);
			match(T__12);
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
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<DatoContext> dato() {
			return getRuleContexts(DatoContext.class);
		}
		public DatoContext dato(int i) {
			return getRuleContext(DatoContext.class,i);
		}
		public List<LlamadoFuncionContext> llamadoFuncion() {
			return getRuleContexts(LlamadoFuncionContext.class);
		}
		public LlamadoFuncionContext llamadoFuncion(int i) {
			return getRuleContext(LlamadoFuncionContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(229);
				identificador();
				}
				break;
			case 2:
				{
				setState(230);
				dato();
				}
				break;
			case 3:
				{
				setState(231);
				llamadoFuncion();
				}
				break;
			}
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << ID) | (1L << NUM) | (1L << STR) | (1L << LOG))) != 0)) {
				{
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(234);
					match(T__9);
					setState(235);
					identificador();
					}
					break;
				case 2:
					{
					setState(236);
					dato();
					}
					break;
				case 3:
					{
					setState(237);
					llamadoFuncion();
					}
					break;
				}
				}
				setState(242);
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

	public static class Operacion_matematicaContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode NUM() { return getToken(SLParser.NUM, 0); }
		public List<TerminalNode> OP_MAT() { return getTokens(SLParser.OP_MAT); }
		public TerminalNode OP_MAT(int i) {
			return getToken(SLParser.OP_MAT, i);
		}
		public List<NumericoContext> numerico() {
			return getRuleContexts(NumericoContext.class);
		}
		public NumericoContext numerico(int i) {
			return getRuleContext(NumericoContext.class,i);
		}
		public Operacion_matematicaContext operacion_matematica() {
			return getRuleContext(Operacion_matematicaContext.class,0);
		}
		public Operacion_matematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion_matematica; }
	}

	public final Operacion_matematicaContext operacion_matematica() throws RecognitionException {
		Operacion_matematicaContext _localctx = new Operacion_matematicaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operacion_matematica);
		try {
			int _alt;
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(243);
					identificador();
					}
					break;
				case NUM:
					{
					setState(244);
					match(NUM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(247);
						match(OP_MAT);
						setState(248);
						numerico();
						}
						} 
					}
					setState(253);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(T__11);
				setState(255);
				operacion_matematica();
				setState(256);
				match(T__12);
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

	public static class AsignacionContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			identificador();
			setState(261);
			match(T__5);
			setState(262);
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
	}

	public final Estructura_controlContext estructura_control() throws RecognitionException {
		Estructura_controlContext _localctx = new Estructura_controlContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_estructura_control);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				condicional();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				mientras();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				repetir_hasta();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				desde();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
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
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__15);
			setState(272);
			match(T__11);
			setState(273);
			logico();
			setState(274);
			match(T__12);
			setState(275);
			match(T__16);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(276);
				sentencia();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(T__17);
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
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
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
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__18);
			setState(285);
			match(T__11);
			setState(286);
			logico();
			setState(287);
			match(T__12);
			setState(288);
			match(T__16);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(289);
				sentencia();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(T__17);
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
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
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
	}

	public final Repetir_hastaContext repetir_hasta() throws RecognitionException {
		Repetir_hastaContext _localctx = new Repetir_hastaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_repetir_hasta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__19);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(298);
				sentencia();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(T__20);
			setState(305);
			match(T__11);
			setState(306);
			logico();
			setState(307);
			match(T__12);
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
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public List<NumericoContext> numerico() {
			return getRuleContexts(NumericoContext.class);
		}
		public NumericoContext numerico(int i) {
			return getRuleContext(NumericoContext.class,i);
		}
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
	}

	public final DesdeContext desde() throws RecognitionException {
		DesdeContext _localctx = new DesdeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_desde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__21);
			setState(310);
			match(ID);
			setState(311);
			match(T__5);
			setState(312);
			numerico();
			setState(313);
			match(T__20);
			setState(314);
			numerico();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(315);
				match(T__22);
				setState(316);
				numerico();
				}
			}

			setState(319);
			match(T__16);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(320);
				sentencia();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			match(T__17);
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
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_eval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__23);
			setState(329);
			match(T__16);
			setState(331); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(330);
				caso();
				}
				}
				setState(333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__24 );
			setState(335);
			match(T__17);
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
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
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
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__24);
			setState(338);
			match(T__11);
			setState(339);
			logico();
			setState(340);
			match(T__12);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(341);
				sentencia();
				}
				}
				setState(346);
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

	public static class Tipo_datoContext extends ParserRuleContext {
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
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tipo_dato);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(ID);
				}
				break;
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				estructura();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				registro();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(351);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 6);
				{
				setState(352);
				match(T__27);
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
		public DatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dato; }
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dato);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				cadena();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				numerico();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				logico();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				estructura();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
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

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<NumericoContext> numerico() {
			return getRuleContexts(NumericoContext.class);
		}
		public NumericoContext numerico(int i) {
			return getRuleContext(NumericoContext.class,i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_identificador);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(ID);
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(369);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__28:
						{
						setState(363);
						match(T__28);
						setState(364);
						identificador();
						}
						break;
					case T__29:
						{
						setState(365);
						match(T__29);
						setState(366);
						numerico();
						setState(367);
						match(T__30);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode NUM() { return getToken(SLParser.NUM, 0); }
		public Operacion_matematicaContext operacion_matematica() {
			return getRuleContext(Operacion_matematicaContext.class,0);
		}
		public LlamadoFuncionContext llamadoFuncion() {
			return getRuleContext(LlamadoFuncionContext.class,0);
		}
		public NumericoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerico; }
	}

	public final NumericoContext numerico() throws RecognitionException {
		NumericoContext _localctx = new NumericoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numerico);
		int _la;
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31 || _la==T__32) {
					{
					setState(375);
					_la = _input.LA(1);
					if ( !(_la==T__31 || _la==T__32) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(378);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				operacion_matematica();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				llamadoFuncion();
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

	public static class CadenaContext extends ParserRuleContext {
		public List<TerminalNode> STR() { return getTokens(SLParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(SLParser.STR, i);
		}
		public LlamadoFuncionContext llamadoFuncion() {
			return getRuleContext(LlamadoFuncionContext.class,0);
		}
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cadena);
		try {
			int _alt;
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(STR);
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(384);
						match(T__31);
						setState(385);
						match(STR);
						}
						} 
					}
					setState(390);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				llamadoFuncion();
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

	public static class LogicoContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(SLParser.LOG, 0); }
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public List<LogicoContext> logico() {
			return getRuleContexts(LogicoContext.class);
		}
		public LogicoContext logico(int i) {
			return getRuleContext(LogicoContext.class,i);
		}
		public LlamadoFuncionContext llamadoFuncion() {
			return getRuleContext(LlamadoFuncionContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
	}

	public final LogicoContext logico() throws RecognitionException {
		LogicoContext _localctx = new LogicoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_logico);
		int _la;
		try {
			int _alt;
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(394);
					match(LOG);
					}
					break;
				case 2:
					{
					setState(395);
					match(ID);
					}
					break;
				case 3:
					{
					setState(396);
					match(T__33);
					setState(397);
					logico();
					}
					break;
				case 4:
					{
					setState(398);
					llamadoFuncion();
					}
					break;
				case 5:
					{
					setState(399);
					comparacion();
					}
					break;
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(402);
						_la = _input.LA(1);
						if ( !(_la==T__34 || _la==T__35) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(403);
						logico();
						}
						} 
					}
					setState(408);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(T__11);
				setState(410);
				logico();
				setState(411);
				match(T__12);
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

	public static class EstructuraContext extends ParserRuleContext {
		public DimContext dim() {
			return getRuleContext(DimContext.class,0);
		}
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public EstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura; }
	}

	public final EstructuraContext estructura() throws RecognitionException {
		EstructuraContext _localctx = new EstructuraContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_estructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__37) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(416);
			match(T__29);
			setState(417);
			dim();
			setState(418);
			match(T__30);
			setState(419);
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
		public List<NumericoContext> numerico() {
			return getRuleContexts(NumericoContext.class);
		}
		public NumericoContext numerico(int i) {
			return getRuleContext(NumericoContext.class,i);
		}
		public DimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim; }
	}

	public final DimContext dim() throws RecognitionException {
		DimContext _localctx = new DimContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				{
				setState(421);
				match(T__38);
				}
				break;
			case T__11:
			case T__31:
			case T__32:
			case ID:
			case NUM:
				{
				setState(422);
				numerico();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(425);
				match(T__9);
				setState(428);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__38:
					{
					setState(426);
					match(T__38);
					}
					break;
				case T__11:
				case T__31:
				case T__32:
				case ID:
				case NUM:
					{
					setState(427);
					numerico();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(434);
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
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T__39);
			setState(436);
			match(T__16);
			setState(438); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(437);
				declaracion_campo();
				}
				}
				setState(440); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(442);
			match(T__17);
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
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_comparacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			numerico();
			setState(445);
			match(OP_COMP);
			setState(446);
			numerico();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u01c3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\5\2H\n\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3\2\7\2"+
		"R\n\2\f\2\16\2U\13\2\3\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\3\3\3\3\3\5\3"+
		"a\n\3\3\4\3\4\3\4\5\4f\n\4\3\4\5\4i\n\4\3\5\3\5\3\5\3\5\3\5\5\5p\n\5\6"+
		"\5r\n\5\r\5\16\5s\3\6\3\6\6\6x\n\6\r\6\16\6y\3\7\3\7\3\7\3\7\5\7\u0080"+
		"\n\7\3\b\3\b\3\b\3\b\7\b\u0086\n\b\f\b\16\b\u0089\13\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0090\n\b\6\b\u0092\n\b\r\b\16\b\u0093\3\t\3\t\3\t\5\t\u0099"+
		"\n\t\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3\n\3\n\3\13\7\13\u00a4\n\13\f\13\16"+
		"\13\u00a7\13\13\3\13\3\13\7\13\u00ab\n\13\f\13\16\13\u00ae\13\13\3\13"+
		"\3\13\3\f\3\f\3\f\7\f\u00b5\n\f\f\f\16\f\u00b8\13\f\3\f\3\f\7\f\u00bc"+
		"\n\f\f\f\16\f\u00bf\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\5\r\u00c8\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00cf\n\r\3\r\3\r\3\r\7\r\u00d4\n\r\f\r\16\r\u00d7"+
		"\13\r\3\16\3\16\3\16\5\16\u00dc\n\16\3\16\5\16\u00df\n\16\3\17\3\17\3"+
		"\17\5\17\u00e4\n\17\3\17\3\17\3\20\3\20\3\20\5\20\u00eb\n\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00f1\n\20\f\20\16\20\u00f4\13\20\3\21\3\21\5\21\u00f8"+
		"\n\21\3\21\3\21\7\21\u00fc\n\21\f\21\16\21\u00ff\13\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0105\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0110\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0118\n\24\f\24\16\24\u011b"+
		"\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0125\n\25\f\25\16"+
		"\25\u0128\13\25\3\25\3\25\3\26\3\26\7\26\u012e\n\26\f\26\16\26\u0131\13"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u0140\n\27\3\27\3\27\7\27\u0144\n\27\f\27\16\27\u0147\13\27\3\27\3"+
		"\27\3\30\3\30\3\30\6\30\u014e\n\30\r\30\16\30\u014f\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u0159\n\31\f\31\16\31\u015c\13\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0164\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u016b\n"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0174\n\34\f\34\16\34\u0177"+
		"\13\34\3\35\3\35\5\35\u017b\n\35\3\35\3\35\3\35\5\35\u0180\n\35\3\36\3"+
		"\36\3\36\7\36\u0185\n\36\f\36\16\36\u0188\13\36\3\36\5\36\u018b\n\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\5\37\u0193\n\37\3\37\3\37\7\37\u0197\n\37"+
		"\f\37\16\37\u019a\13\37\3\37\3\37\3\37\3\37\5\37\u01a0\n\37\3 \3 \3 \3"+
		" \3 \3 \3!\3!\5!\u01aa\n!\3!\3!\3!\5!\u01af\n!\7!\u01b1\n!\f!\16!\u01b4"+
		"\13!\3\"\3\"\3\"\6\"\u01b9\n\"\r\"\16\"\u01ba\3\"\3\"\3#\3#\3#\3#\3#\2"+
		"\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"D\2\5\3\2\"#\3\2%&\3\2\'(\2\u01ea\2G\3\2\2\2\4]\3\2\2\2\6e\3\2\2\2\bj"+
		"\3\2\2\2\nu\3\2\2\2\f{\3\2\2\2\16\u0081\3\2\2\2\20\u0095\3\2\2\2\22\u009a"+
		"\3\2\2\2\24\u00a5\3\2\2\2\26\u00b1\3\2\2\2\30\u00c7\3\2\2\2\32\u00db\3"+
		"\2\2\2\34\u00e0\3\2\2\2\36\u00ea\3\2\2\2 \u0104\3\2\2\2\"\u0106\3\2\2"+
		"\2$\u010f\3\2\2\2&\u0111\3\2\2\2(\u011e\3\2\2\2*\u012b\3\2\2\2,\u0137"+
		"\3\2\2\2.\u014a\3\2\2\2\60\u0153\3\2\2\2\62\u0163\3\2\2\2\64\u016a\3\2"+
		"\2\2\66\u016c\3\2\2\28\u017f\3\2\2\2:\u018a\3\2\2\2<\u019f\3\2\2\2>\u01a1"+
		"\3\2\2\2@\u01a9\3\2\2\2B\u01b5\3\2\2\2D\u01be\3\2\2\2FH\5\4\3\2GF\3\2"+
		"\2\2GH\3\2\2\2HL\3\2\2\2IK\5\6\4\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2"+
		"\2\2MO\3\2\2\2NL\3\2\2\2OS\7\3\2\2PR\5\32\16\2QP\3\2\2\2RU\3\2\2\2SQ\3"+
		"\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VZ\7\4\2\2WY\5\20\t\2XW\3\2\2\2Y\\"+
		"\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\3\3\2\2\2\\Z\3\2\2\2]^\7\5\2\2^`\7.\2\2"+
		"_a\7\6\2\2`_\3\2\2\2`a\3\2\2\2a\5\3\2\2\2bf\5\b\5\2cf\5\n\6\2df\5\16\b"+
		"\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2fh\3\2\2\2gi\7\6\2\2hg\3\2\2\2hi\3\2\2"+
		"\2i\7\3\2\2\2jq\7\7\2\2kl\5\66\34\2lm\7\b\2\2mo\5\62\32\2np\7\6\2\2on"+
		"\3\2\2\2op\3\2\2\2pr\3\2\2\2qk\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t"+
		"\t\3\2\2\2uw\7\t\2\2vx\5\f\7\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2"+
		"z\13\3\2\2\2{|\7.\2\2|}\7\n\2\2}\177\5\62\32\2~\u0080\7\6\2\2\177~\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080\r\3\2\2\2\u0081\u0091\7\13\2\2\u0082\u0087"+
		"\7.\2\2\u0083\u0084\7\f\2\2\u0084\u0086\7.\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\n\2\2\u008b\u008c\5\62\32\2\u008c"+
		"\u008d\7\b\2\2\u008d\u008f\5\64\33\2\u008e\u0090\7\6\2\2\u008f\u008e\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0082\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\17\3\2\2"+
		"\2\u0095\u0098\5\22\n\2\u0096\u0099\5\24\13\2\u0097\u0099\5\26\f\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\21\3\2\2\2\u009a\u009b\7\r\2"+
		"\2\u009b\u009c\7.\2\2\u009c\u009e\7\16\2\2\u009d\u009f\5\30\r\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\17"+
		"\2\2\u00a1\23\3\2\2\2\u00a2\u00a4\5\6\4\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00ac\7\3\2\2\u00a9\u00ab\5\32\16\2\u00aa\u00a9\3"+
		"\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\4\2\2\u00b0\25\3\2\2"+
		"\2\u00b1\u00b2\7\20\2\2\u00b2\u00b6\7.\2\2\u00b3\u00b5\5\6\4\2\u00b4\u00b3"+
		"\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bd\7\3\2\2\u00ba\u00bc\5\32"+
		"\16\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\20"+
		"\2\2\u00c1\u00c2\7\16\2\2\u00c2\u00c3\7.\2\2\u00c3\u00c4\7\17\2\2\u00c4"+
		"\u00c5\7\4\2\2\u00c5\27\3\2\2\2\u00c6\u00c8\7\21\2\2\u00c7\u00c6\3\2\2"+
		"\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7.\2\2\u00ca\u00cb"+
		"\7\n\2\2\u00cb\u00d5\5\62\32\2\u00cc\u00ce\7\f\2\2\u00cd\u00cf\7\21\2"+
		"\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
		"\7.\2\2\u00d1\u00d2\7\n\2\2\u00d2\u00d4\5\62\32\2\u00d3\u00cc\3\2\2\2"+
		"\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\31"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00dc\5\34\17\2\u00d9\u00dc\5\"\22"+
		"\2\u00da\u00dc\5$\23\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00df\7\6\2\2\u00de\u00dd\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\33\3\2\2\2\u00e0\u00e1\7.\2\2\u00e1\u00e3\7\16\2"+
		"\2\u00e2\u00e4\5\36\20\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\7\17\2\2\u00e6\35\3\2\2\2\u00e7\u00eb\5\66"+
		"\34\2\u00e8\u00eb\5\64\33\2\u00e9\u00eb\5\34\17\2\u00ea\u00e7\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00f2\3\2\2\2\u00ec\u00ed"+
		"\7\f\2\2\u00ed\u00f1\5\66\34\2\u00ee\u00f1\5\64\33\2\u00ef\u00f1\5\34"+
		"\17\2\u00f0\u00ec\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\37\3\2\2"+
		"\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\5\66\34\2\u00f6\u00f8\7/\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fd\3\2\2\2\u00f9\u00fa\7\65"+
		"\2\2\u00fa\u00fc\58\35\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0105\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0101\7\16\2\2\u0101\u0102\5 \21\2\u0102\u0103\7\17\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u00f7\3\2\2\2\u0104\u0100\3\2\2\2\u0105!\3\2\2\2"+
		"\u0106\u0107\5\66\34\2\u0107\u0108\7\b\2\2\u0108\u0109\5\64\33\2\u0109"+
		"#\3\2\2\2\u010a\u0110\5&\24\2\u010b\u0110\5(\25\2\u010c\u0110\5*\26\2"+
		"\u010d\u0110\5,\27\2\u010e\u0110\5.\30\2\u010f\u010a\3\2\2\2\u010f\u010b"+
		"\3\2\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110"+
		"%\3\2\2\2\u0111\u0112\7\22\2\2\u0112\u0113\7\16\2\2\u0113\u0114\5<\37"+
		"\2\u0114\u0115\7\17\2\2\u0115\u0119\7\23\2\2\u0116\u0118\5\32\16\2\u0117"+
		"\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\24\2\2\u011d"+
		"\'\3\2\2\2\u011e\u011f\7\25\2\2\u011f\u0120\7\16\2\2\u0120\u0121\5<\37"+
		"\2\u0121\u0122\7\17\2\2\u0122\u0126\7\23\2\2\u0123\u0125\5\32\16\2\u0124"+
		"\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\24\2\2\u012a"+
		")\3\2\2\2\u012b\u012f\7\26\2\2\u012c\u012e\5\32\16\2\u012d\u012c\3\2\2"+
		"\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7\27\2\2\u0133\u0134\7\16\2\2"+
		"\u0134\u0135\5<\37\2\u0135\u0136\7\17\2\2\u0136+\3\2\2\2\u0137\u0138\7"+
		"\30\2\2\u0138\u0139\7.\2\2\u0139\u013a\7\b\2\2\u013a\u013b\58\35\2\u013b"+
		"\u013c\7\27\2\2\u013c\u013f\58\35\2\u013d\u013e\7\31\2\2\u013e\u0140\5"+
		"8\35\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0145\7\23\2\2\u0142\u0144\5\32\16\2\u0143\u0142\3\2\2\2\u0144\u0147"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0148\u0149\7\24\2\2\u0149-\3\2\2\2\u014a\u014b\7\32\2"+
		"\2\u014b\u014d\7\23\2\2\u014c\u014e\5\60\31\2\u014d\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0152\7\24\2\2\u0152/\3\2\2\2\u0153\u0154\7\33\2\2\u0154\u0155"+
		"\7\16\2\2\u0155\u0156\5<\37\2\u0156\u015a\7\17\2\2\u0157\u0159\5\32\16"+
		"\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\61\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0164\7.\2\2\u015e"+
		"\u0164\5> \2\u015f\u0164\5B\"\2\u0160\u0164\7\34\2\2\u0161\u0164\7\35"+
		"\2\2\u0162\u0164\7\36\2\2\u0163\u015d\3\2\2\2\u0163\u015e\3\2\2\2\u0163"+
		"\u015f\3\2\2\2\u0163\u0160\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2"+
		"\2\2\u0164\63\3\2\2\2\u0165\u016b\5:\36\2\u0166\u016b\58\35\2\u0167\u016b"+
		"\5<\37\2\u0168\u016b\5> \2\u0169\u016b\5B\"\2\u016a\u0165\3\2\2\2\u016a"+
		"\u0166\3\2\2\2\u016a\u0167\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2"+
		"\2\2\u016b\65\3\2\2\2\u016c\u0175\7.\2\2\u016d\u016e\7\37\2\2\u016e\u0174"+
		"\5\66\34\2\u016f\u0170\7 \2\2\u0170\u0171\58\35\2\u0171\u0172\7!\2\2\u0172"+
		"\u0174\3\2\2\2\u0173\u016d\3\2\2\2\u0173\u016f\3\2\2\2\u0174\u0177\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\67\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0178\u0180\5\66\34\2\u0179\u017b\t\2\2\2\u017a\u0179\3\2\2\2"+
		"\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u0180\7/\2\2\u017d\u0180"+
		"\5 \21\2\u017e\u0180\5\34\17\2\u017f\u0178\3\2\2\2\u017f\u017a\3\2\2\2"+
		"\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u01809\3\2\2\2\u0181\u0186\7"+
		"\62\2\2\u0182\u0183\7\"\2\2\u0183\u0185\7\62\2\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018b\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0189\u018b\5\34\17\2\u018a\u0181\3\2\2\2\u018a"+
		"\u0189\3\2\2\2\u018b;\3\2\2\2\u018c\u0193\7\63\2\2\u018d\u0193\7.\2\2"+
		"\u018e\u018f\7$\2\2\u018f\u0193\5<\37\2\u0190\u0193\5\34\17\2\u0191\u0193"+
		"\5D#\2\u0192\u018c\3\2\2\2\u0192\u018d\3\2\2\2\u0192\u018e\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193\u0198\3\2\2\2\u0194\u0195\t\3"+
		"\2\2\u0195\u0197\5<\37\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u01a0\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019b\u019c\7\16\2\2\u019c\u019d\5<\37\2\u019d\u019e\7\17\2\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u0192\3\2\2\2\u019f\u019b\3\2\2\2\u01a0=\3\2\2\2"+
		"\u01a1\u01a2\t\4\2\2\u01a2\u01a3\7 \2\2\u01a3\u01a4\5@!\2\u01a4\u01a5"+
		"\7!\2\2\u01a5\u01a6\5\62\32\2\u01a6?\3\2\2\2\u01a7\u01aa\7)\2\2\u01a8"+
		"\u01aa\58\35\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01b2\3\2"+
		"\2\2\u01ab\u01ae\7\f\2\2\u01ac\u01af\7)\2\2\u01ad\u01af\58\35\2\u01ae"+
		"\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ab\3\2"+
		"\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"A\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7*\2\2\u01b6\u01b8\7\23\2\2"+
		"\u01b7\u01b9\5\f\7\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8"+
		"\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\7\24\2\2"+
		"\u01bdC\3\2\2\2\u01be\u01bf\58\35\2\u01bf\u01c0\7\64\2\2\u01c0\u01c1\5"+
		"8\35\2\u01c1E\3\2\2\29GLSZ`ehosy\177\u0087\u008f\u0093\u0098\u009e\u00a5"+
		"\u00ac\u00b6\u00bd\u00c7\u00ce\u00d5\u00db\u00de\u00e3\u00ea\u00f0\u00f2"+
		"\u00f7\u00fd\u0104\u010f\u0119\u0126\u012f\u013f\u0145\u014f\u015a\u0163"+
		"\u016a\u0173\u0175\u017a\u017f\u0186\u018a\u0192\u0198\u019f\u01a9\u01ae"+
		"\u01b2\u01ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
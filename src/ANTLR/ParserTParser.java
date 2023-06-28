package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, BEGIN=19, END=20, INPUT=21, OUTPUT=22, VARNAME=23, CADENA=24, 
		INT=25, FLOAT=26, SENO=27, COSENO=28, AND=29, OR=30, MAYOR=31, MENOR=32, 
		IGUAL=33, NOIGUAL=34, WS=35;
	public static final int
		RULE_program = 0, RULE_ruta = 1, RULE_accion = 2, RULE_operacion = 3, 
		RULE_funcion = 4, RULE_ciclo = 5, RULE_varDeclaracion = 6, RULE_suma = 7, 
		RULE_resta = 8, RULE_mult = 9, RULE_div = 10, RULE_doMientras = 11, RULE_mientras = 12, 
		RULE_condicional = 13, RULE_logica = 14, RULE_multiCondicion = 15, RULE_condicion = 16, 
		RULE_mejor = 17, RULE_peor = 18, RULE_igual = 19, RULE_noigual = 20, RULE_lectura = 21, 
		RULE_impresion = 22, RULE_sen = 23, RULE_cos = 24, RULE_raiz = 25;
	public static final String[] ruleNames = {
		"program", "ruta", "accion", "operacion", "funcion", "ciclo", "varDeclaracion", 
		"suma", "resta", "mult", "div", "doMientras", "mientras", "condicional", 
		"logica", "multiCondicion", "condicion", "mejor", "peor", "igual", "noigual", 
		"lectura", "impresion", "sen", "cos", "raiz"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'desde'", "'viajar a'", "'volver a'", "'en'", "'comer en'", "'lugares'", 
		"'la ruta hacia'", "'se divide en'", "'caminos'", "'siga recorriendo'", 
		"'cuando'", "'mientras'", "'si'", "'entonces puede seguir recorriendo'", 
		"'el clima'", "'sea '", "'que en'", "'conozca el pais'", "'Viaje a '", 
		"'FIN'", "'lugar recomendado '", "'viaje luego a'", null, null, null, 
		null, "'cene '", "'conozca '", "'y '", "'o '", "'mejor '", "'peor '", 
		"'igual '", "'distinto '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "BEGIN", "END", "INPUT", "OUTPUT", 
		"VARNAME", "CADENA", "INT", "FLOAT", "SENO", "COSENO", "AND", "OR", "MAYOR", 
		"MENOR", "IGUAL", "NOIGUAL", "WS"
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
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public TerminalNode CADENA() { return getToken(ParserTParser.CADENA, 0); }
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public TerminalNode END() { return getToken(ParserTParser.END, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(BEGIN);
			setState(53);
			match(CADENA);
			setState(54);
			ruta();
			setState(55);
			match(END);
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

	public static class RutaContext extends ParserRuleContext {
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public List<CicloContext> ciclo() {
			return getRuleContexts(CicloContext.class);
		}
		public CicloContext ciclo(int i) {
			return getRuleContext(CicloContext.class,i);
		}
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public List<LecturaContext> lectura() {
			return getRuleContexts(LecturaContext.class);
		}
		public LecturaContext lectura(int i) {
			return getRuleContext(LecturaContext.class,i);
		}
		public List<ImpresionContext> impresion() {
			return getRuleContexts(ImpresionContext.class);
		}
		public ImpresionContext impresion(int i) {
			return getRuleContext(ImpresionContext.class,i);
		}
		public List<VarDeclaracionContext> varDeclaracion() {
			return getRuleContexts(VarDeclaracionContext.class);
		}
		public VarDeclaracionContext varDeclaracion(int i) {
			return getRuleContext(VarDeclaracionContext.class,i);
		}
		public RutaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruta; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitRuta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RutaContext ruta() throws RecognitionException {
		RutaContext _localctx = new RutaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ruta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << INPUT) | (1L << OUTPUT) | (1L << VARNAME) | (1L << SENO) | (1L << COSENO))) != 0)) {
				{
				setState(63);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__3:
				case T__6:
				case T__17:
				case SENO:
				case COSENO:
					{
					setState(57);
					accion();
					}
					break;
				case T__9:
				case T__11:
					{
					setState(58);
					ciclo();
					}
					break;
				case T__12:
					{
					setState(59);
					condicional();
					}
					break;
				case INPUT:
					{
					setState(60);
					lectura();
					}
					break;
				case OUTPUT:
					{
					setState(61);
					impresion();
					}
					break;
				case VARNAME:
					{
					setState(62);
					varDeclaracion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(67);
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

	public static class AccionContext extends ParserRuleContext {
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitAccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_accion);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				operacion();
				}
				break;
			case T__17:
			case SENO:
			case COSENO:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				funcion();
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

	public static class OperacionContext extends ParserRuleContext {
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public RestaContext resta() {
			return getRuleContext(RestaContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(72);
				suma();
				}
				break;
			case 2:
				{
				setState(73);
				resta();
				}
				break;
			case 3:
				{
				setState(74);
				mult();
				}
				break;
			case 4:
				{
				setState(75);
				div();
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

	public static class FuncionContext extends ParserRuleContext {
		public SenContext sen() {
			return getRuleContext(SenContext.class,0);
		}
		public CosContext cos() {
			return getRuleContext(CosContext.class,0);
		}
		public RaizContext raiz() {
			return getRuleContext(RaizContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SENO:
				{
				setState(78);
				sen();
				}
				break;
			case COSENO:
				{
				setState(79);
				cos();
				}
				break;
			case T__17:
				{
				setState(80);
				raiz();
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

	public static class CicloContext extends ParserRuleContext {
		public DoMientrasContext doMientras() {
			return getRuleContext(DoMientrasContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ciclo);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				doMientras();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				mientras();
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

	public static class VarDeclaracionContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public VarDeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaracion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitVarDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclaracionContext varDeclaracion() throws RecognitionException {
		VarDeclaracionContext _localctx = new VarDeclaracionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDeclaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(VARNAME);
			setState(88);
			match(IGUAL);
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
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

	public static class SumaContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__0);
			setState(92);
			match(VARNAME);
			setState(93);
			match(T__1);
			setState(94);
			match(VARNAME);
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

	public static class RestaContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public RestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resta; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitResta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__0);
			setState(97);
			match(VARNAME);
			setState(98);
			match(T__2);
			setState(99);
			match(VARNAME);
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

	public static class MultContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__3);
			setState(102);
			match(VARNAME);
			setState(103);
			match(T__4);
			setState(104);
			match(INT);
			setState(105);
			match(T__5);
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

	public static class DivContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__6);
			setState(108);
			match(VARNAME);
			setState(109);
			match(T__7);
			setState(110);
			match(INT);
			setState(111);
			match(T__8);
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

	public static class DoMientrasContext extends ParserRuleContext {
		public LogicaContext logica() {
			return getRuleContext(LogicaContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public DoMientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doMientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDoMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoMientrasContext doMientras() throws RecognitionException {
		DoMientrasContext _localctx = new DoMientrasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_doMientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__9);
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(114);
				match(VARNAME);
				}
				break;
			case T__9:
			case T__11:
				{
				setState(115);
				ciclo();
				}
				break;
			case T__12:
				{
				setState(116);
				condicional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(119);
			match(T__10);
			setState(120);
			logica();
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
		public LogicaContext logica() {
			return getRuleContext(LogicaContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__11);
			setState(123);
			logica();
			setState(124);
			match(T__9);
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(125);
				match(VARNAME);
				}
				break;
			case T__9:
			case T__11:
				{
				setState(126);
				ciclo();
				}
				break;
			case T__12:
				{
				setState(127);
				condicional();
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

	public static class CondicionalContext extends ParserRuleContext {
		public LogicaContext logica() {
			return getRuleContext(LogicaContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__12);
			setState(131);
			logica();
			setState(132);
			match(T__13);
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(133);
				match(VARNAME);
				}
				break;
			case T__9:
			case T__11:
				{
				setState(134);
				ciclo();
				}
				break;
			case T__12:
				{
				setState(135);
				condicional();
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

	public static class LogicaContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public MultiCondicionContext multiCondicion() {
			return getRuleContext(MultiCondicionContext.class,0);
		}
		public LogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logica; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicaContext logica() throws RecognitionException {
		LogicaContext _localctx = new LogicaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__3);
			setState(139);
			match(VARNAME);
			setState(140);
			match(T__14);
			setState(141);
			multiCondicion();
			setState(142);
			match(VARNAME);
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

	public static class MultiCondicionContext extends ParserRuleContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ParserTParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ParserTParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(ParserTParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ParserTParser.OR, i);
		}
		public MultiCondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiCondicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMultiCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiCondicionContext multiCondicion() throws RecognitionException {
		MultiCondicionContext _localctx = new MultiCondicionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiCondicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			condicion();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(145);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				condicion();
				}
				}
				setState(151);
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

	public static class CondicionContext extends ParserRuleContext {
		public MejorContext mejor() {
			return getRuleContext(MejorContext.class,0);
		}
		public PeorContext peor() {
			return getRuleContext(PeorContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public NoigualContext noigual() {
			return getRuleContext(NoigualContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(152);
				mejor();
				}
				break;
			case 2:
				{
				setState(153);
				peor();
				}
				break;
			case 3:
				{
				setState(154);
				igual();
				}
				break;
			case 4:
				{
				setState(155);
				noigual();
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

	public static class MejorContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(ParserTParser.MAYOR, 0); }
		public MejorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mejor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMejor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MejorContext mejor() throws RecognitionException {
		MejorContext _localctx = new MejorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mejor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__15);
			setState(159);
			match(MAYOR);
			setState(160);
			match(T__16);
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

	public static class PeorContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(ParserTParser.MENOR, 0); }
		public PeorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPeor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeorContext peor() throws RecognitionException {
		PeorContext _localctx = new PeorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_peor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__15);
			setState(163);
			match(MENOR);
			setState(164);
			match(T__16);
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

	public static class IgualContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__15);
			setState(167);
			match(IGUAL);
			setState(168);
			match(T__16);
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

	public static class NoigualContext extends ParserRuleContext {
		public TerminalNode NOIGUAL() { return getToken(ParserTParser.NOIGUAL, 0); }
		public NoigualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noigual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitNoigual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoigualContext noigual() throws RecognitionException {
		NoigualContext _localctx = new NoigualContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_noigual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__15);
			setState(171);
			match(NOIGUAL);
			setState(172);
			match(T__16);
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

	public static class LecturaContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(ParserTParser.INPUT, 0); }
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLectura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(INPUT);
			setState(175);
			match(VARNAME);
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

	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(ParserTParser.OUTPUT, 0); }
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(OUTPUT);
			setState(178);
			match(VARNAME);
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

	public static class SenContext extends ParserRuleContext {
		public TerminalNode SENO() { return getToken(ParserTParser.SENO, 0); }
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public SenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenContext sen() throws RecognitionException {
		SenContext _localctx = new SenContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(SENO);
			setState(181);
			match(T__3);
			setState(182);
			match(VARNAME);
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

	public static class CosContext extends ParserRuleContext {
		public TerminalNode COSENO() { return getToken(ParserTParser.COSENO, 0); }
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public CosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(COSENO);
			setState(185);
			match(VARNAME);
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

	public static class RaizContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public RaizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitRaiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaizContext raiz() throws RecognitionException {
		RaizContext _localctx = new RaizContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_raiz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__17);
			setState(188);
			match(VARNAME);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3B"+
		"\n\3\f\3\16\3E\13\3\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6"+
		"\3\6\5\6T\n\6\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\5\rx\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u0083\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008b\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u0096\n\21\f\21\16\21\u0099\13"+
		"\21\3\22\3\22\3\22\3\22\5\22\u009f\n\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\2\2"+
		"\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\4\4\2\31"+
		"\31\33\34\3\2\37 \2\u00bd\2\66\3\2\2\2\4C\3\2\2\2\6H\3\2\2\2\bN\3\2\2"+
		"\2\nS\3\2\2\2\fW\3\2\2\2\16Y\3\2\2\2\20]\3\2\2\2\22b\3\2\2\2\24g\3\2\2"+
		"\2\26m\3\2\2\2\30s\3\2\2\2\32|\3\2\2\2\34\u0084\3\2\2\2\36\u008c\3\2\2"+
		"\2 \u0092\3\2\2\2\"\u009e\3\2\2\2$\u00a0\3\2\2\2&\u00a4\3\2\2\2(\u00a8"+
		"\3\2\2\2*\u00ac\3\2\2\2,\u00b0\3\2\2\2.\u00b3\3\2\2\2\60\u00b6\3\2\2\2"+
		"\62\u00ba\3\2\2\2\64\u00bd\3\2\2\2\66\67\7\25\2\2\678\7\32\2\289\5\4\3"+
		"\29:\7\26\2\2:\3\3\2\2\2;B\5\6\4\2<B\5\f\7\2=B\5\34\17\2>B\5,\27\2?B\5"+
		".\30\2@B\5\16\b\2A;\3\2\2\2A<\3\2\2\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@"+
		"\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\5\3\2\2\2EC\3\2\2\2FI\5\b\5\2"+
		"GI\5\n\6\2HF\3\2\2\2HG\3\2\2\2I\7\3\2\2\2JO\5\20\t\2KO\5\22\n\2LO\5\24"+
		"\13\2MO\5\26\f\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\t\3\2\2\2PT"+
		"\5\60\31\2QT\5\62\32\2RT\5\64\33\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\13\3"+
		"\2\2\2UX\5\30\r\2VX\5\32\16\2WU\3\2\2\2WV\3\2\2\2X\r\3\2\2\2YZ\7\31\2"+
		"\2Z[\7#\2\2[\\\t\2\2\2\\\17\3\2\2\2]^\7\3\2\2^_\7\31\2\2_`\7\4\2\2`a\7"+
		"\31\2\2a\21\3\2\2\2bc\7\3\2\2cd\7\31\2\2de\7\5\2\2ef\7\31\2\2f\23\3\2"+
		"\2\2gh\7\6\2\2hi\7\31\2\2ij\7\7\2\2jk\7\33\2\2kl\7\b\2\2l\25\3\2\2\2m"+
		"n\7\t\2\2no\7\31\2\2op\7\n\2\2pq\7\33\2\2qr\7\13\2\2r\27\3\2\2\2sw\7\f"+
		"\2\2tx\7\31\2\2ux\5\f\7\2vx\5\34\17\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2xy"+
		"\3\2\2\2yz\7\r\2\2z{\5\36\20\2{\31\3\2\2\2|}\7\16\2\2}~\5\36\20\2~\u0082"+
		"\7\f\2\2\177\u0083\7\31\2\2\u0080\u0083\5\f\7\2\u0081\u0083\5\34\17\2"+
		"\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\33\3"+
		"\2\2\2\u0084\u0085\7\17\2\2\u0085\u0086\5\36\20\2\u0086\u008a\7\20\2\2"+
		"\u0087\u008b\7\31\2\2\u0088\u008b\5\f\7\2\u0089\u008b\5\34\17\2\u008a"+
		"\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\35\3\2\2"+
		"\2\u008c\u008d\7\6\2\2\u008d\u008e\7\31\2\2\u008e\u008f\7\21\2\2\u008f"+
		"\u0090\5 \21\2\u0090\u0091\7\31\2\2\u0091\37\3\2\2\2\u0092\u0097\5\"\22"+
		"\2\u0093\u0094\t\3\2\2\u0094\u0096\5\"\22\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098!\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u009a\u009f\5$\23\2\u009b\u009f\5&\24\2\u009c\u009f"+
		"\5(\25\2\u009d\u009f\5*\26\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f#\3\2\2\2\u00a0\u00a1\7\22\2\2"+
		"\u00a1\u00a2\7!\2\2\u00a2\u00a3\7\23\2\2\u00a3%\3\2\2\2\u00a4\u00a5\7"+
		"\22\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\7\23\2\2\u00a7\'\3\2\2\2\u00a8"+
		"\u00a9\7\22\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ab\7\23\2\2\u00ab)\3\2\2\2"+
		"\u00ac\u00ad\7\22\2\2\u00ad\u00ae\7$\2\2\u00ae\u00af\7\23\2\2\u00af+\3"+
		"\2\2\2\u00b0\u00b1\7\27\2\2\u00b1\u00b2\7\31\2\2\u00b2-\3\2\2\2\u00b3"+
		"\u00b4\7\30\2\2\u00b4\u00b5\7\31\2\2\u00b5/\3\2\2\2\u00b6\u00b7\7\35\2"+
		"\2\u00b7\u00b8\7\6\2\2\u00b8\u00b9\7\31\2\2\u00b9\61\3\2\2\2\u00ba\u00bb"+
		"\7\36\2\2\u00bb\u00bc\7\31\2\2\u00bc\63\3\2\2\2\u00bd\u00be\7\24\2\2\u00be"+
		"\u00bf\7\31\2\2\u00bf\65\3\2\2\2\rACHNSWw\u0082\u008a\u0097\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
package ANTLR;

// Generated from LexerT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, INPUT=3, OUTPUT=4, VARNAME=5, CADENA=6, INT=7, FLOAT=8, 
		SENO=9, COSENO=10, AND=11, OR=12, MAYOR=13, MENOR=14, IGUAL=15, NOIGUAL=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "END", "INPUT", "OUTPUT", "VARNAME", "CADENA", "INT", "FLOAT", 
		"SENO", "COSENO", "AND", "OR", "MAYOR", "MENOR", "IGUAL", "NOIGUAL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Viaje a '", "'FIN'", "'lugar recomendado '", "'viaje luego a'", 
		null, null, null, null, "'cene '", "'conozca '", "'y '", "'o '", "'mejor '", 
		"'peor '", "'igual '", "'distinto '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "INPUT", "OUTPUT", "VARNAME", "CADENA", "INT", "FLOAT", 
		"SENO", "COSENO", "AND", "OR", "MAYOR", "MENOR", "IGUAL", "NOIGUAL", "WS"
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


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\6\6U\n\6\r\6\16"+
		"\6V\3\7\3\7\6\7[\n\7\r\7\16\7\\\3\7\3\7\3\b\6\bb\n\b\r\b\16\bc\3\t\6\t"+
		"g\n\t\r\t\16\th\3\t\3\t\6\tm\n\t\r\t\16\tn\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\6\22\u00a5\n\22\r\22\16\22\u00a6\3\22\3\22\2\2\23\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00af\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5.\3"+
		"\2\2\2\7\62\3\2\2\2\tE\3\2\2\2\13T\3\2\2\2\rX\3\2\2\2\17a\3\2\2\2\21f"+
		"\3\2\2\2\23p\3\2\2\2\25v\3\2\2\2\27\177\3\2\2\2\31\u0082\3\2\2\2\33\u0085"+
		"\3\2\2\2\35\u008c\3\2\2\2\37\u0092\3\2\2\2!\u0099\3\2\2\2#\u00a4\3\2\2"+
		"\2%&\7X\2\2&\'\7k\2\2\'(\7c\2\2()\7l\2\2)*\7g\2\2*+\7\"\2\2+,\7c\2\2,"+
		"-\7\"\2\2-\4\3\2\2\2./\7H\2\2/\60\7K\2\2\60\61\7P\2\2\61\6\3\2\2\2\62"+
		"\63\7n\2\2\63\64\7w\2\2\64\65\7i\2\2\65\66\7c\2\2\66\67\7t\2\2\678\7\""+
		"\2\289\7t\2\29:\7g\2\2:;\7e\2\2;<\7q\2\2<=\7o\2\2=>\7g\2\2>?\7p\2\2?@"+
		"\7f\2\2@A\7c\2\2AB\7f\2\2BC\7q\2\2CD\7\"\2\2D\b\3\2\2\2EF\7x\2\2FG\7k"+
		"\2\2GH\7c\2\2HI\7l\2\2IJ\7g\2\2JK\7\"\2\2KL\7n\2\2LM\7w\2\2MN\7g\2\2N"+
		"O\7i\2\2OP\7q\2\2PQ\7\"\2\2QR\7c\2\2R\n\3\2\2\2SU\t\2\2\2TS\3\2\2\2UV"+
		"\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\f\3\2\2\2XZ\7$\2\2Y[\t\2\2\2ZY\3\2\2\2["+
		"\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7$\2\2_\16\3\2\2\2`b\t\3"+
		"\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\20\3\2\2\2eg\t\3\2\2fe\3"+
		"\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jl\7.\2\2km\t\3\2\2lk\3"+
		"\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\22\3\2\2\2pq\7e\2\2qr\7g\2\2rs\7"+
		"p\2\2st\7g\2\2tu\7\"\2\2u\24\3\2\2\2vw\7e\2\2wx\7q\2\2xy\7p\2\2yz\7q\2"+
		"\2z{\7|\2\2{|\7e\2\2|}\7c\2\2}~\7\"\2\2~\26\3\2\2\2\177\u0080\7{\2\2\u0080"+
		"\u0081\7\"\2\2\u0081\30\3\2\2\2\u0082\u0083\7q\2\2\u0083\u0084\7\"\2\2"+
		"\u0084\32\3\2\2\2\u0085\u0086\7o\2\2\u0086\u0087\7g\2\2\u0087\u0088\7"+
		"l\2\2\u0088\u0089\7q\2\2\u0089\u008a\7t\2\2\u008a\u008b\7\"\2\2\u008b"+
		"\34\3\2\2\2\u008c\u008d\7r\2\2\u008d\u008e\7g\2\2\u008e\u008f\7q\2\2\u008f"+
		"\u0090\7t\2\2\u0090\u0091\7\"\2\2\u0091\36\3\2\2\2\u0092\u0093\7k\2\2"+
		"\u0093\u0094\7i\2\2\u0094\u0095\7w\2\2\u0095\u0096\7c\2\2\u0096\u0097"+
		"\7n\2\2\u0097\u0098\7\"\2\2\u0098 \3\2\2\2\u0099\u009a\7f\2\2\u009a\u009b"+
		"\7k\2\2\u009b\u009c\7u\2\2\u009c\u009d\7v\2\2\u009d\u009e\7k\2\2\u009e"+
		"\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7\"\2"+
		"\2\u00a2\"\3\2\2\2\u00a3\u00a5\t\4\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\b\22\2\2\u00a9$\3\2\2\2\t\2V\\chn\u00a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
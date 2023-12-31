package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "BEGIN", "END", "INPUT", "OUTPUT", "VARNAME", "CADENA", "INT", 
		"FLOAT", "SENO", "COSENO", "AND", "OR", "MAYOR", "MENOR", "IGUAL", "NOIGUAL", 
		"WS"
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


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0188\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\6\30\u0133\n\30\r\30\16"+
		"\30\u0134\3\31\3\31\6\31\u0139\n\31\r\31\16\31\u013a\3\31\3\31\3\32\6"+
		"\32\u0140\n\32\r\32\16\32\u0141\3\33\6\33\u0145\n\33\r\33\16\33\u0146"+
		"\3\33\3\33\6\33\u014b\n\33\r\33\16\33\u014c\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\6$\u0183\n$\r$\16$\u0184\3$\3"+
		"$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\2\u018d\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\3I\3\2\2\2\5O\3\2\2\2\7X\3\2\2\2\ta\3\2\2\2\13d\3\2\2\2\rm\3\2\2\2\17"+
		"u\3\2\2\2\21\u0083\3\2\2\2\23\u0090\3\2\2\2\25\u0098\3\2\2\2\27\u00a9"+
		"\3\2\2\2\31\u00b0\3\2\2\2\33\u00b9\3\2\2\2\35\u00bc\3\2\2\2\37\u00de\3"+
		"\2\2\2!\u00e7\3\2\2\2#\u00ec\3\2\2\2%\u00f3\3\2\2\2\'\u0103\3\2\2\2)\u010c"+
		"\3\2\2\2+\u0110\3\2\2\2-\u0123\3\2\2\2/\u0132\3\2\2\2\61\u0136\3\2\2\2"+
		"\63\u013f\3\2\2\2\65\u0144\3\2\2\2\67\u014e\3\2\2\29\u0154\3\2\2\2;\u015d"+
		"\3\2\2\2=\u0160\3\2\2\2?\u0163\3\2\2\2A\u016a\3\2\2\2C\u0170\3\2\2\2E"+
		"\u0177\3\2\2\2G\u0182\3\2\2\2IJ\7f\2\2JK\7g\2\2KL\7u\2\2LM\7f\2\2MN\7"+
		"g\2\2N\4\3\2\2\2OP\7x\2\2PQ\7k\2\2QR\7c\2\2RS\7l\2\2ST\7c\2\2TU\7t\2\2"+
		"UV\7\"\2\2VW\7c\2\2W\6\3\2\2\2XY\7x\2\2YZ\7q\2\2Z[\7n\2\2[\\\7x\2\2\\"+
		"]\7g\2\2]^\7t\2\2^_\7\"\2\2_`\7c\2\2`\b\3\2\2\2ab\7g\2\2bc\7p\2\2c\n\3"+
		"\2\2\2de\7e\2\2ef\7q\2\2fg\7o\2\2gh\7g\2\2hi\7t\2\2ij\7\"\2\2jk\7g\2\2"+
		"kl\7p\2\2l\f\3\2\2\2mn\7n\2\2no\7w\2\2op\7i\2\2pq\7c\2\2qr\7t\2\2rs\7"+
		"g\2\2st\7u\2\2t\16\3\2\2\2uv\7n\2\2vw\7c\2\2wx\7\"\2\2xy\7t\2\2yz\7w\2"+
		"\2z{\7v\2\2{|\7c\2\2|}\7\"\2\2}~\7j\2\2~\177\7c\2\2\177\u0080\7e\2\2\u0080"+
		"\u0081\7k\2\2\u0081\u0082\7c\2\2\u0082\20\3\2\2\2\u0083\u0084\7u\2\2\u0084"+
		"\u0085\7g\2\2\u0085\u0086\7\"\2\2\u0086\u0087\7f\2\2\u0087\u0088\7k\2"+
		"\2\u0088\u0089\7x\2\2\u0089\u008a\7k\2\2\u008a\u008b\7f\2\2\u008b\u008c"+
		"\7g\2\2\u008c\u008d\7\"\2\2\u008d\u008e\7g\2\2\u008e\u008f\7p\2\2\u008f"+
		"\22\3\2\2\2\u0090\u0091\7e\2\2\u0091\u0092\7c\2\2\u0092\u0093\7o\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095\u0096\7q\2\2\u0096\u0097\7u\2\2"+
		"\u0097\24\3\2\2\2\u0098\u0099\7u\2\2\u0099\u009a\7k\2\2\u009a\u009b\7"+
		"i\2\2\u009b\u009c\7c\2\2\u009c\u009d\7\"\2\2\u009d\u009e\7t\2\2\u009e"+
		"\u009f\7g\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7t\2\2"+
		"\u00a2\u00a3\7t\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7q\2\2\u00a8\26\3\2\2\2\u00a9\u00aa"+
		"\7e\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7p\2\2\u00ad"+
		"\u00ae\7f\2\2\u00ae\u00af\7q\2\2\u00af\30\3\2\2\2\u00b0\u00b1\7o\2\2\u00b1"+
		"\u00b2\7k\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7v\2\2"+
		"\u00b5\u00b6\7t\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7u\2\2\u00b8\32\3\2"+
		"\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7k\2\2\u00bb\34\3\2\2\2\u00bc\u00bd"+
		"\7g\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7q\2\2\u00c0"+
		"\u00c1\7p\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7u\2\2"+
		"\u00c4\u00c5\7\"\2\2\u00c5\u00c6\7r\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8"+
		"\7g\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7\"\2\2\u00cb"+
		"\u00cc\7u\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7i\2\2\u00ce\u00cf\7w\2\2"+
		"\u00cf\u00d0\7k\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7\"\2\2\u00d2\u00d3"+
		"\7t\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\7q\2\2\u00d6"+
		"\u00d7\7t\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7g\2\2"+
		"\u00da\u00db\7p\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7q\2\2\u00dd\36\3\2"+
		"\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7\"\2\2\u00e1\u00e2"+
		"\7e\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7o\2\2\u00e5"+
		"\u00e6\7c\2\2\u00e6 \3\2\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2\u00e9"+
		"\u00ea\7c\2\2\u00ea\u00eb\7\"\2\2\u00eb\"\3\2\2\2\u00ec\u00ed\7s\2\2\u00ed"+
		"\u00ee\7w\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7\"\2\2\u00f0\u00f1\7g\2"+
		"\2\u00f1\u00f2\7p\2\2\u00f2$\3\2\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5\7"+
		"q\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7|\2\2\u00f8\u00f9"+
		"\7e\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7\"\2\2\u00fb\u00fc\7g\2\2\u00fc"+
		"\u00fd\7n\2\2\u00fd\u00fe\7\"\2\2\u00fe\u00ff\7r\2\2\u00ff\u0100\7c\2"+
		"\2\u0100\u0101\7k\2\2\u0101\u0102\7u\2\2\u0102&\3\2\2\2\u0103\u0104\7"+
		"X\2\2\u0104\u0105\7k\2\2\u0105\u0106\7c\2\2\u0106\u0107\7l\2\2\u0107\u0108"+
		"\7g\2\2\u0108\u0109\7\"\2\2\u0109\u010a\7c\2\2\u010a\u010b\7\"\2\2\u010b"+
		"(\3\2\2\2\u010c\u010d\7H\2\2\u010d\u010e\7K\2\2\u010e\u010f\7P\2\2\u010f"+
		"*\3\2\2\2\u0110\u0111\7n\2\2\u0111\u0112\7w\2\2\u0112\u0113\7i\2\2\u0113"+
		"\u0114\7c\2\2\u0114\u0115\7t\2\2\u0115\u0116\7\"\2\2\u0116\u0117\7t\2"+
		"\2\u0117\u0118\7g\2\2\u0118\u0119\7e\2\2\u0119\u011a\7q\2\2\u011a\u011b"+
		"\7o\2\2\u011b\u011c\7g\2\2\u011c\u011d\7p\2\2\u011d\u011e\7f\2\2\u011e"+
		"\u011f\7c\2\2\u011f\u0120\7f\2\2\u0120\u0121\7q\2\2\u0121\u0122\7\"\2"+
		"\2\u0122,\3\2\2\2\u0123\u0124\7x\2\2\u0124\u0125\7k\2\2\u0125\u0126\7"+
		"c\2\2\u0126\u0127\7l\2\2\u0127\u0128\7g\2\2\u0128\u0129\7\"\2\2\u0129"+
		"\u012a\7n\2\2\u012a\u012b\7w\2\2\u012b\u012c\7g\2\2\u012c\u012d\7i\2\2"+
		"\u012d\u012e\7q\2\2\u012e\u012f\7\"\2\2\u012f\u0130\7c\2\2\u0130.\3\2"+
		"\2\2\u0131\u0133\t\2\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\60\3\2\2\2\u0136\u0138\7$\2\2"+
		"\u0137\u0139\t\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\7$\2\2\u013d"+
		"\62\3\2\2\2\u013e\u0140\t\3\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2"+
		"\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\64\3\2\2\2\u0143\u0145"+
		"\t\3\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\7.\2\2\u0149\u014b\t\3"+
		"\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\66\3\2\2\2\u014e\u014f\7e\2\2\u014f\u0150\7g\2\2"+
		"\u0150\u0151\7p\2\2\u0151\u0152\7g\2\2\u0152\u0153\7\"\2\2\u01538\3\2"+
		"\2\2\u0154\u0155\7e\2\2\u0155\u0156\7q\2\2\u0156\u0157\7p\2\2\u0157\u0158"+
		"\7q\2\2\u0158\u0159\7|\2\2\u0159\u015a\7e\2\2\u015a\u015b\7c\2\2\u015b"+
		"\u015c\7\"\2\2\u015c:\3\2\2\2\u015d\u015e\7{\2\2\u015e\u015f\7\"\2\2\u015f"+
		"<\3\2\2\2\u0160\u0161\7q\2\2\u0161\u0162\7\"\2\2\u0162>\3\2\2\2\u0163"+
		"\u0164\7o\2\2\u0164\u0165\7g\2\2\u0165\u0166\7l\2\2\u0166\u0167\7q\2\2"+
		"\u0167\u0168\7t\2\2\u0168\u0169\7\"\2\2\u0169@\3\2\2\2\u016a\u016b\7r"+
		"\2\2\u016b\u016c\7g\2\2\u016c\u016d\7q\2\2\u016d\u016e\7t\2\2\u016e\u016f"+
		"\7\"\2\2\u016fB\3\2\2\2\u0170\u0171\7k\2\2\u0171\u0172\7i\2\2\u0172\u0173"+
		"\7w\2\2\u0173\u0174\7c\2\2\u0174\u0175\7n\2\2\u0175\u0176\7\"\2\2\u0176"+
		"D\3\2\2\2\u0177\u0178\7f\2\2\u0178\u0179\7k\2\2\u0179\u017a\7u\2\2\u017a"+
		"\u017b\7v\2\2\u017b\u017c\7k\2\2\u017c\u017d\7p\2\2\u017d\u017e\7v\2\2"+
		"\u017e\u017f\7q\2\2\u017f\u0180\7\"\2\2\u0180F\3\2\2\2\u0181\u0183\t\4"+
		"\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\b$\2\2\u0187H\3\2\2\2\t"+
		"\2\u0134\u013a\u0141\u0146\u014c\u0184\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
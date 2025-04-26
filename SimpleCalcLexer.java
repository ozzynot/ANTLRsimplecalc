// Generated from C:/Users/odare/IdeaProjects/Simple Calculator/src/simplecalc/grammar/SimpleCalc.g4 by ANTLR 4.13.2
package simplecalc.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READ=1, WRITE=2, LPAREN=3, RPAREN=4, ASSIGN=5, ADD=6, SUB=7, MUL=8, DIV=9, 
		STOP=10, ID=11, NUMBER=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"READ", "WRITE", "LPAREN", "RPAREN", "ASSIGN", "ADD", "SUB", "MUL", "DIV", 
			"STOP", "ID", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'read'", "'write'", "'('", "')'", "':='", "'+'", "'-'", "'*'", 
			"'/'", "'$$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "READ", "WRITE", "LPAREN", "RPAREN", "ASSIGN", "ADD", "SUB", "MUL", 
			"DIV", "STOP", "ID", "NUMBER", "WS"
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


	public SimpleCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleCalc.g4"; }

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
		"\u0004\u0000\rI\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0004\n:\b\n\u000b\n\f\n;\u0001\u000b\u0004\u000b?\b\u000b\u000b"+
		"\u000b\f\u000b@\u0001\f\u0004\fD\b\f\u000b\f\f\fE\u0001\f\u0001\f\u0000"+
		"\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001"+
		"\u0000\u0003\u0001\u0000az\u0001\u000009\u0003\u0000\t\n\r\r  K\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003 \u0001"+
		"\u0000\u0000\u0000\u0005&\u0001\u0000\u0000\u0000\u0007(\u0001\u0000\u0000"+
		"\u0000\t*\u0001\u0000\u0000\u0000\u000b-\u0001\u0000\u0000\u0000\r/\u0001"+
		"\u0000\u0000\u0000\u000f1\u0001\u0000\u0000\u0000\u00113\u0001\u0000\u0000"+
		"\u0000\u00135\u0001\u0000\u0000\u0000\u00159\u0001\u0000\u0000\u0000\u0017"+
		">\u0001\u0000\u0000\u0000\u0019C\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"r\u0000\u0000\u001c\u001d\u0005e\u0000\u0000\u001d\u001e\u0005a\u0000"+
		"\u0000\u001e\u001f\u0005d\u0000\u0000\u001f\u0002\u0001\u0000\u0000\u0000"+
		" !\u0005w\u0000\u0000!\"\u0005r\u0000\u0000\"#\u0005i\u0000\u0000#$\u0005"+
		"t\u0000\u0000$%\u0005e\u0000\u0000%\u0004\u0001\u0000\u0000\u0000&\'\u0005"+
		"(\u0000\u0000\'\u0006\u0001\u0000\u0000\u0000()\u0005)\u0000\u0000)\b"+
		"\u0001\u0000\u0000\u0000*+\u0005:\u0000\u0000+,\u0005=\u0000\u0000,\n"+
		"\u0001\u0000\u0000\u0000-.\u0005+\u0000\u0000.\f\u0001\u0000\u0000\u0000"+
		"/0\u0005-\u0000\u00000\u000e\u0001\u0000\u0000\u000012\u0005*\u0000\u0000"+
		"2\u0010\u0001\u0000\u0000\u000034\u0005/\u0000\u00004\u0012\u0001\u0000"+
		"\u0000\u000056\u0005$\u0000\u000067\u0005$\u0000\u00007\u0014\u0001\u0000"+
		"\u0000\u00008:\u0007\u0000\u0000\u000098\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<\u0016\u0001\u0000\u0000\u0000=?\u0007\u0001\u0000\u0000>=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000A\u0018\u0001\u0000\u0000\u0000BD\u0007\u0002\u0000"+
		"\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0006"+
		"\f\u0000\u0000H\u001a\u0001\u0000\u0000\u0000\u0004\u0000;@E\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from Narsese.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NarseseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, SentenceType=27, NarsLogEntryPrefix=28, Believe=29, 
		Wonder=30, Variable=31, COPULA=32, FutureEvent=33, PresentEvent=34, PastEvent=35, 
		CYCLES=36, FLOAT=37, DIGIT=38, WORD=39, NewLine=40, WS=41, LineComment=42, 
		BlockComment=43;
	public static final int
		RULE_narsese = 0, RULE_statement = 1, RULE_coreterm = 2, RULE_freqConf = 3, 
		RULE_term = 4, RULE_extensionalSet = 5, RULE_compoundTerm = 6, RULE_compoundTermOpMulti = 7, 
		RULE_tense = 8, RULE_opMulti = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"narsese", "statement", "coreterm", "freqConf", "term", "extensionalSet", 
			"compoundTerm", "compoundTermOpMulti", "tense", "opMulti"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'{'", "'}'", "'>'", "'('", "'*'", "','", "')'", "'ECHO'", 
			"':'", "'['", "']'", "'%'", "';'", "'_'", "'&&'", "'||'", "'&|'", "'&/'", 
			"'|'", "'&'", "'/'", "'--'", "'\\'", "'-'", "'~'", null, null, "'^believe'", 
			"'^wonder'", null, null, "':/:'", "':|:'", "':\\:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "SentenceType", "NarsLogEntryPrefix", "Believe", "Wonder", 
			"Variable", "COPULA", "FutureEvent", "PresentEvent", "PastEvent", "CYCLES", 
			"FLOAT", "DIGIT", "WORD", "NewLine", "WS", "LineComment", "BlockComment"
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
	public String getGrammarFileName() { return "Narsese.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NarseseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class NarseseContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NewLine() { return getTokens(NarseseParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(NarseseParser.NewLine, i);
		}
		public NarseseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_narsese; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterNarsese(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitNarsese(this);
		}
	}

	public final NarseseContext narsese() throws RecognitionException {
		NarseseContext _localctx = new NarseseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_narsese);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__8) | (1L << T__10) | (1L << T__14) | (1L << NarsLogEntryPrefix) | (1L << Believe) | (1L << Wonder) | (1L << Variable) | (1L << CYCLES) | (1L << WORD))) != 0)) {
				{
				{
				setState(20);
				statement();
				setState(22); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(21);
						matchWildcard();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(24); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(26);
				match(NewLine);
				}
				}
				setState(32);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Statement1bContext extends StatementContext {
		public TerminalNode NarsLogEntryPrefix() { return getToken(NarseseParser.NarsLogEntryPrefix, 0); }
		public List<CoretermContext> coreterm() {
			return getRuleContexts(CoretermContext.class);
		}
		public CoretermContext coreterm(int i) {
			return getRuleContext(CoretermContext.class,i);
		}
		public TerminalNode COPULA() { return getToken(NarseseParser.COPULA, 0); }
		public TerminalNode SentenceType() { return getToken(NarseseParser.SentenceType, 0); }
		public TenseContext tense() {
			return getRuleContext(TenseContext.class,0);
		}
		public FreqConfContext freqConf() {
			return getRuleContext(FreqConfContext.class,0);
		}
		public Statement1bContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterStatement1b(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitStatement1b(this);
		}
	}
	public static class Statement5Context extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode COPULA() { return getToken(NarseseParser.COPULA, 0); }
		public Statement5Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterStatement5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitStatement5(this);
		}
	}
	public static class Statement6Context extends StatementContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Statement6Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterStatement6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitStatement6(this);
		}
	}
	public static class Statement3Context extends StatementContext {
		public TerminalNode NarsLogEntryPrefix() { return getToken(NarseseParser.NarsLogEntryPrefix, 0); }
		public CompoundTermOpMultiContext compoundTermOpMulti() {
			return getRuleContext(CompoundTermOpMultiContext.class,0);
		}
		public TerminalNode SentenceType() { return getToken(NarseseParser.SentenceType, 0); }
		public TenseContext tense() {
			return getRuleContext(TenseContext.class,0);
		}
		public FreqConfContext freqConf() {
			return getRuleContext(FreqConfContext.class,0);
		}
		public Statement3Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterStatement3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitStatement3(this);
		}
	}
	public static class Statement4Context extends StatementContext {
		public Statement4Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterStatement4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitStatement4(this);
		}
	}
	public static class Statement1Context extends StatementContext {
		public TerminalNode NarsLogEntryPrefix() { return getToken(NarseseParser.NarsLogEntryPrefix, 0); }
		public TerminalNode WORD() { return getToken(NarseseParser.WORD, 0); }
		public TerminalNode COPULA() { return getToken(NarseseParser.COPULA, 0); }
		public CoretermContext coreterm() {
			return getRuleContext(CoretermContext.class,0);
		}
		public TerminalNode SentenceType() { return getToken(NarseseParser.SentenceType, 0); }
		public FreqConfContext freqConf() {
			return getRuleContext(FreqConfContext.class,0);
		}
		public TenseContext tense() {
			return getRuleContext(TenseContext.class,0);
		}
		public Statement1Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterStatement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitStatement1(this);
		}
	}
	public static class Statement2Context extends StatementContext {
		public TerminalNode NarsLogEntryPrefix() { return getToken(NarseseParser.NarsLogEntryPrefix, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode COPULA() { return getToken(NarseseParser.COPULA, 0); }
		public TerminalNode SentenceType() { return getToken(NarseseParser.SentenceType, 0); }
		public TenseContext tense() {
			return getRuleContext(TenseContext.class,0);
		}
		public FreqConfContext freqConf() {
			return getRuleContext(FreqConfContext.class,0);
		}
		public Statement2Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterStatement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitStatement2(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Statement1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(NarsLogEntryPrefix);
				setState(34);
				match(T__0);
				setState(35);
				match(T__1);
				setState(36);
				match(WORD);
				setState(37);
				match(T__2);
				setState(38);
				match(COPULA);
				setState(39);
				coreterm();
				setState(40);
				match(T__3);
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(41);
					match(SentenceType);
					setState(43);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(42);
						tense();
						}
						break;
					}
					}
					break;
				}
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(47);
					freqConf();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new Statement1bContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(NarsLogEntryPrefix);
				setState(51);
				match(T__0);
				setState(52);
				match(T__4);
				setState(53);
				match(T__5);
				setState(54);
				match(T__6);
				setState(55);
				coreterm();
				setState(56);
				match(T__6);
				setState(57);
				coreterm();
				setState(58);
				match(T__7);
				setState(59);
				match(COPULA);
				setState(60);
				coreterm();
				setState(61);
				match(T__3);
				setState(62);
				match(SentenceType);
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(63);
					tense();
					}
					break;
				}
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(66);
					freqConf();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new Statement2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(NarsLogEntryPrefix);
				setState(70);
				match(T__0);
				setState(71);
				statement();
				setState(72);
				match(COPULA);
				setState(73);
				statement();
				setState(74);
				match(T__3);
				setState(75);
				match(SentenceType);
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(76);
					tense();
					}
					break;
				}
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(79);
					freqConf();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new Statement3Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(NarsLogEntryPrefix);
				setState(83);
				compoundTermOpMulti();
				setState(84);
				match(SentenceType);
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(85);
					tense();
					}
					break;
				}
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(88);
					freqConf();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new Statement4Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				match(T__8);
				setState(92);
				match(T__9);
				}
				break;
			case 6:
				_localctx = new Statement5Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				match(T__0);
				setState(94);
				statement();
				setState(95);
				match(COPULA);
				setState(96);
				statement();
				setState(97);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new Statement6Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				term();
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

	public static class CoretermContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(NarseseParser.WORD, 0); }
		public CoretermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coreterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterCoreterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitCoreterm(this);
		}
	}

	public final CoretermContext coreterm() throws RecognitionException {
		CoretermContext _localctx = new CoretermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_coreterm);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(WORD);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__1);
				setState(104);
				match(WORD);
				setState(105);
				match(T__2);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(T__10);
				setState(107);
				match(WORD);
				setState(108);
				match(T__11);
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

	public static class FreqConfContext extends ParserRuleContext {
		public List<TerminalNode> FLOAT() { return getTokens(NarseseParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(NarseseParser.FLOAT, i);
		}
		public FreqConfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freqConf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterFreqConf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitFreqConf(this);
		}
	}

	public final FreqConfContext freqConf() throws RecognitionException {
		FreqConfContext _localctx = new FreqConfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_freqConf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__12);
			setState(112);
			match(FLOAT);
			setState(113);
			match(T__13);
			setState(114);
			match(FLOAT);
			setState(115);
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(NarseseParser.WORD, 0); }
		public TerminalNode Variable() { return getToken(NarseseParser.Variable, 0); }
		public CompoundTermContext compoundTerm() {
			return getRuleContext(CompoundTermContext.class,0);
		}
		public TerminalNode CYCLES() { return getToken(NarseseParser.CYCLES, 0); }
		public TerminalNode Believe() { return getToken(NarseseParser.Believe, 0); }
		public TerminalNode Wonder() { return getToken(NarseseParser.Wonder, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(WORD);
				}
				break;
			case Variable:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(Variable);
				}
				break;
			case T__1:
			case T__4:
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				compoundTerm();
				}
				break;
			case CYCLES:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(CYCLES);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				match(T__14);
				}
				break;
			case Believe:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				match(Believe);
				}
				break;
			case Wonder:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				match(Wonder);
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

	public static class ExtensionalSetContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExtensionalSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionalSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterExtensionalSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitExtensionalSet(this);
		}
	}

	public final ExtensionalSetContext extensionalSet() throws RecognitionException {
		ExtensionalSetContext _localctx = new ExtensionalSetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_extensionalSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__1);
			setState(127);
			term();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(128);
				match(T__6);
				setState(129);
				term();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(T__2);
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

	public static class CompoundTermContext extends ParserRuleContext {
		public CompoundTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundTerm; }
	 
		public CompoundTermContext() { }
		public void copyFrom(CompoundTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompoundTerm1Context extends CompoundTermContext {
		public CompoundTermOpMultiContext compoundTermOpMulti() {
			return getRuleContext(CompoundTermOpMultiContext.class,0);
		}
		public CompoundTerm1Context(CompoundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterCompoundTerm1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitCompoundTerm1(this);
		}
	}
	public static class CompoundTerm2Context extends CompoundTermContext {
		public TerminalNode Believe() { return getToken(NarseseParser.Believe, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundTerm2Context(CompoundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterCompoundTerm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitCompoundTerm2(this);
		}
	}
	public static class CtextensionalSetContext extends CompoundTermContext {
		public ExtensionalSetContext extensionalSet() {
			return getRuleContext(ExtensionalSetContext.class,0);
		}
		public CtextensionalSetContext(CompoundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterCtextensionalSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitCtextensionalSet(this);
		}
	}
	public static class IntensionalSetContext extends CompoundTermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public IntensionalSetContext(CompoundTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterIntensionalSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitIntensionalSet(this);
		}
	}

	public final CompoundTermContext compoundTerm() throws RecognitionException {
		CompoundTermContext _localctx = new CompoundTermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compoundTerm);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new CtextensionalSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				extensionalSet();
				}
				break;
			case 2:
				_localctx = new IntensionalSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__10);
				setState(139);
				term();
				setState(140);
				match(T__11);
				}
				break;
			case 3:
				_localctx = new CompoundTerm1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				compoundTermOpMulti();
				}
				break;
			case 4:
				_localctx = new CompoundTerm2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(T__4);
				setState(144);
				match(Believe);
				setState(145);
				match(T__6);
				setState(146);
				statement();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(147);
					match(T__6);
					setState(148);
					statement();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				match(T__7);
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

	public static class CompoundTermOpMultiContext extends ParserRuleContext {
		public OpMultiContext opMulti() {
			return getRuleContext(OpMultiContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundTermOpMultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundTermOpMulti; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterCompoundTermOpMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitCompoundTermOpMulti(this);
		}
	}

	public final CompoundTermOpMultiContext compoundTermOpMulti() throws RecognitionException {
		CompoundTermOpMultiContext _localctx = new CompoundTermOpMultiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compoundTermOpMulti);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__4);
			setState(159);
			opMulti();
			setState(160);
			match(T__6);
			setState(161);
			statement();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(162);
				match(T__6);
				setState(163);
				statement();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(T__7);
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

	public static class TenseContext extends ParserRuleContext {
		public TerminalNode FutureEvent() { return getToken(NarseseParser.FutureEvent, 0); }
		public TerminalNode PresentEvent() { return getToken(NarseseParser.PresentEvent, 0); }
		public TerminalNode PastEvent() { return getToken(NarseseParser.PastEvent, 0); }
		public TenseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tense; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterTense(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitTense(this);
		}
	}

	public final TenseContext tense() throws RecognitionException {
		TenseContext _localctx = new TenseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tense);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FutureEvent) | (1L << PresentEvent) | (1L << PastEvent))) != 0)) ) {
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

	public static class OpMultiContext extends ParserRuleContext {
		public OpMultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opMulti; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).enterOpMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NarseseListener ) ((NarseseListener)listener).exitOpMulti(this);
		}
	}

	public final OpMultiContext opMulti() throws RecognitionException {
		OpMultiContext _localctx = new OpMultiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_opMulti);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\5\3\60\n\3\3\3\5\3\63"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3C\n\3"+
		"\3\3\5\3F\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3\3\5\3S\n\3\3"+
		"\3\3\3\3\3\3\3\5\3Y\n\3\3\3\5\3\\\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3g\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\177\n\6\3\7\3\7\3\7\3\7\7\7\u0085"+
		"\n\7\f\7\16\7\u0088\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u0098\n\b\f\b\16\b\u009b\13\b\3\b\3\b\5\b\u009f\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u00a7\n\t\f\t\16\t\u00aa\13\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\32\2\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2#%\4\2\b\b\22"+
		"\34\2\u00c6\2 \3\2\2\2\4f\3\2\2\2\6o\3\2\2\2\bq\3\2\2\2\n~\3\2\2\2\f\u0080"+
		"\3\2\2\2\16\u009e\3\2\2\2\20\u00a0\3\2\2\2\22\u00ad\3\2\2\2\24\u00af\3"+
		"\2\2\2\26\30\5\4\3\2\27\31\13\2\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32\33"+
		"\3\2\2\2\32\30\3\2\2\2\33\34\3\2\2\2\34\35\7*\2\2\35\37\3\2\2\2\36\26"+
		"\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\3\3\2\2\2\" \3\2\2\2#$\7"+
		"\36\2\2$%\7\3\2\2%&\7\4\2\2&\'\7)\2\2\'(\7\5\2\2()\7\"\2\2)*\5\6\4\2*"+
		"/\7\6\2\2+-\7\35\2\2,.\5\22\n\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/+\3\2"+
		"\2\2/\60\3\2\2\2\60\62\3\2\2\2\61\63\5\b\5\2\62\61\3\2\2\2\62\63\3\2\2"+
		"\2\63g\3\2\2\2\64\65\7\36\2\2\65\66\7\3\2\2\66\67\7\7\2\2\678\7\b\2\2"+
		"89\7\t\2\29:\5\6\4\2:;\7\t\2\2;<\5\6\4\2<=\7\n\2\2=>\7\"\2\2>?\5\6\4\2"+
		"?@\7\6\2\2@B\7\35\2\2AC\5\22\n\2BA\3\2\2\2BC\3\2\2\2CE\3\2\2\2DF\5\b\5"+
		"\2ED\3\2\2\2EF\3\2\2\2Fg\3\2\2\2GH\7\36\2\2HI\7\3\2\2IJ\5\4\3\2JK\7\""+
		"\2\2KL\5\4\3\2LM\7\6\2\2MO\7\35\2\2NP\5\22\n\2ON\3\2\2\2OP\3\2\2\2PR\3"+
		"\2\2\2QS\5\b\5\2RQ\3\2\2\2RS\3\2\2\2Sg\3\2\2\2TU\7\36\2\2UV\5\20\t\2V"+
		"X\7\35\2\2WY\5\22\n\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\5\b\5\2[Z\3\2\2"+
		"\2[\\\3\2\2\2\\g\3\2\2\2]^\7\13\2\2^g\7\f\2\2_`\7\3\2\2`a\5\4\3\2ab\7"+
		"\"\2\2bc\5\4\3\2cd\7\6\2\2dg\3\2\2\2eg\5\n\6\2f#\3\2\2\2f\64\3\2\2\2f"+
		"G\3\2\2\2fT\3\2\2\2f]\3\2\2\2f_\3\2\2\2fe\3\2\2\2g\5\3\2\2\2hp\7)\2\2"+
		"ij\7\4\2\2jk\7)\2\2kp\7\5\2\2lm\7\r\2\2mn\7)\2\2np\7\16\2\2oh\3\2\2\2"+
		"oi\3\2\2\2ol\3\2\2\2p\7\3\2\2\2qr\7\17\2\2rs\7\'\2\2st\7\20\2\2tu\7\'"+
		"\2\2uv\7\17\2\2v\t\3\2\2\2w\177\7)\2\2x\177\7!\2\2y\177\5\16\b\2z\177"+
		"\7&\2\2{\177\7\21\2\2|\177\7\37\2\2}\177\7 \2\2~w\3\2\2\2~x\3\2\2\2~y"+
		"\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\13\3\2\2\2\u0080"+
		"\u0081\7\4\2\2\u0081\u0086\5\n\6\2\u0082\u0083\7\t\2\2\u0083\u0085\5\n"+
		"\6\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\5"+
		"\2\2\u008a\r\3\2\2\2\u008b\u009f\5\f\7\2\u008c\u008d\7\r\2\2\u008d\u008e"+
		"\5\n\6\2\u008e\u008f\7\16\2\2\u008f\u009f\3\2\2\2\u0090\u009f\5\20\t\2"+
		"\u0091\u0092\7\7\2\2\u0092\u0093\7\37\2\2\u0093\u0094\7\t\2\2\u0094\u0099"+
		"\5\4\3\2\u0095\u0096\7\t\2\2\u0096\u0098\5\4\3\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\n\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u008b\3\2\2\2\u009e\u008c\3\2\2\2\u009e\u0090\3\2\2\2\u009e\u0091\3\2"+
		"\2\2\u009f\17\3\2\2\2\u00a0\u00a1\7\7\2\2\u00a1\u00a2\5\24\13\2\u00a2"+
		"\u00a3\7\t\2\2\u00a3\u00a8\5\4\3\2\u00a4\u00a5\7\t\2\2\u00a5\u00a7\5\4"+
		"\3\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\n"+
		"\2\2\u00ac\21\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae\23\3\2\2\2\u00af\u00b0"+
		"\t\3\2\2\u00b0\25\3\2\2\2\24\32 -/\62BEORX[fo~\u0086\u0099\u009e\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
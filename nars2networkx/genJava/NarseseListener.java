// Generated from Narsese.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NarseseParser}.
 */
public interface NarseseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NarseseParser#narsese}.
	 * @param ctx the parse tree
	 */
	void enterNarsese(NarseseParser.NarseseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NarseseParser#narsese}.
	 * @param ctx the parse tree
	 */
	void exitNarsese(NarseseParser.NarseseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement1}
	 * labeled alternative in {@link NarseseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement1(NarseseParser.Statement1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement1}
	 * labeled alternative in {@link NarseseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement1(NarseseParser.Statement1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement1b}
	 * labeled alternative in {@link NarseseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement1b(NarseseParser.Statement1bContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement1b}
	 * labeled alternative in {@link NarseseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement1b(NarseseParser.Statement1bContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement2}
	 * labeled alternative in {@link NarseseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement2(NarseseParser.Statement2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement2}
	 * labeled alternative in {@link NarseseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement2(NarseseParser.Statement2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement3}
	 * labeled alternative in {@link NarseseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement3(NarseseParser.Statement3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement3}
	 * labeled alternative in {@link NarseseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement3(NarseseParser.Statement3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement4}
	 * labeled alternative in {@link NarseseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement4(NarseseParser.Statement4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement4}
	 * labeled alternative in {@link NarseseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement4(NarseseParser.Statement4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement5}
	 * labeled alternative in {@link NarseseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement5(NarseseParser.Statement5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement5}
	 * labeled alternative in {@link NarseseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement5(NarseseParser.Statement5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement6}
	 * labeled alternative in {@link NarseseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement6(NarseseParser.Statement6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement6}
	 * labeled alternative in {@link NarseseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement6(NarseseParser.Statement6Context ctx);
	/**
	 * Enter a parse tree produced by {@link NarseseParser#coreterm}.
	 * @param ctx the parse tree
	 */
	void enterCoreterm(NarseseParser.CoretermContext ctx);
	/**
	 * Exit a parse tree produced by {@link NarseseParser#coreterm}.
	 * @param ctx the parse tree
	 */
	void exitCoreterm(NarseseParser.CoretermContext ctx);
	/**
	 * Enter a parse tree produced by {@link NarseseParser#freqConf}.
	 * @param ctx the parse tree
	 */
	void enterFreqConf(NarseseParser.FreqConfContext ctx);
	/**
	 * Exit a parse tree produced by {@link NarseseParser#freqConf}.
	 * @param ctx the parse tree
	 */
	void exitFreqConf(NarseseParser.FreqConfContext ctx);
	/**
	 * Enter a parse tree produced by {@link NarseseParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(NarseseParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link NarseseParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(NarseseParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link NarseseParser#extensionalSet}.
	 * @param ctx the parse tree
	 */
	void enterExtensionalSet(NarseseParser.ExtensionalSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link NarseseParser#extensionalSet}.
	 * @param ctx the parse tree
	 */
	void exitExtensionalSet(NarseseParser.ExtensionalSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctextensionalSet}
	 * labeled alternative in {@link NarseseParser#compoundTerm}.
	 * @param ctx the parse tree
	 */
	void enterCtextensionalSet(NarseseParser.CtextensionalSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctextensionalSet}
	 * labeled alternative in {@link NarseseParser#compoundTerm}.
	 * @param ctx the parse tree
	 */
	void exitCtextensionalSet(NarseseParser.CtextensionalSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intensionalSet}
	 * labeled alternative in {@link NarseseParser#compoundTerm}.
	 * @param ctx the parse tree
	 */
	void enterIntensionalSet(NarseseParser.IntensionalSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intensionalSet}
	 * labeled alternative in {@link NarseseParser#compoundTerm}.
	 * @param ctx the parse tree
	 */
	void exitIntensionalSet(NarseseParser.IntensionalSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundTerm1}
	 * labeled alternative in {@link NarseseParser#compoundTerm}.
	 * @param ctx the parse tree
	 */
	void enterCompoundTerm1(NarseseParser.CompoundTerm1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundTerm1}
	 * labeled alternative in {@link NarseseParser#compoundTerm}.
	 * @param ctx the parse tree
	 */
	void exitCompoundTerm1(NarseseParser.CompoundTerm1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundTerm2}
	 * labeled alternative in {@link NarseseParser#compoundTerm}.
	 * @param ctx the parse tree
	 */
	void enterCompoundTerm2(NarseseParser.CompoundTerm2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundTerm2}
	 * labeled alternative in {@link NarseseParser#compoundTerm}.
	 * @param ctx the parse tree
	 */
	void exitCompoundTerm2(NarseseParser.CompoundTerm2Context ctx);
	/**
	 * Enter a parse tree produced by {@link NarseseParser#compoundTermOpMulti}.
	 * @param ctx the parse tree
	 */
	void enterCompoundTermOpMulti(NarseseParser.CompoundTermOpMultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link NarseseParser#compoundTermOpMulti}.
	 * @param ctx the parse tree
	 */
	void exitCompoundTermOpMulti(NarseseParser.CompoundTermOpMultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link NarseseParser#tense}.
	 * @param ctx the parse tree
	 */
	void enterTense(NarseseParser.TenseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NarseseParser#tense}.
	 * @param ctx the parse tree
	 */
	void exitTense(NarseseParser.TenseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NarseseParser#opMulti}.
	 * @param ctx the parse tree
	 */
	void enterOpMulti(NarseseParser.OpMultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link NarseseParser#opMulti}.
	 * @param ctx the parse tree
	 */
	void exitOpMulti(NarseseParser.OpMultiContext ctx);
}
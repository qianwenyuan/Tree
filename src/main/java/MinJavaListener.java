// Generated from /Users/frankqian/Tree/src/main/java/MinJava.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinJavaParser}.
 */
public interface MinJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MinJavaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MinJavaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinJavaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MinJavaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinJavaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MinJavaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinJavaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MinJavaParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MinJavaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MinJavaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinJavaParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(MinJavaParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinJavaParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(MinJavaParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinJavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(MinJavaParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinJavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(MinJavaParser.AtomContext ctx);
}
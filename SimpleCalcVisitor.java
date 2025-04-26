// Generated from C:/Users/odare/IdeaProjects/Simple Calculator/src/simplecalc/grammar/SimpleCalc.g4 by ANTLR 4.13.2
package simplecalc.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleCalcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link SimpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(SimpleCalcParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadStmt}
	 * labeled alternative in {@link SimpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(SimpleCalcParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteStmt}
	 * labeled alternative in {@link SimpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(SimpleCalcParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentExpr(SimpleCalcParser.IdentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(SimpleCalcParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(SimpleCalcParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(SimpleCalcParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(SimpleCalcParser.AddSubExprContext ctx);
}
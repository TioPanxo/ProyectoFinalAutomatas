package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#ruta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuta(ParserTParser.RutaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#accion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion(ParserTParser.AccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(ParserTParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(ParserTParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(ParserTParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#varDeclaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaracion(ParserTParser.VarDeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(ParserTParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(ParserTParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(ParserTParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ParserTParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#doMientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoMientras(ParserTParser.DoMientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(ParserTParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(ParserTParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogica(ParserTParser.LogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#multiCondicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiCondicion(ParserTParser.MultiCondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(ParserTParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mejor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMejor(ParserTParser.MejorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#peor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeor(ParserTParser.PeorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#igual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgual(ParserTParser.IgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#noigual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoigual(ParserTParser.NoigualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#lectura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLectura(ParserTParser.LecturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(ParserTParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSen(ParserTParser.SenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(ParserTParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#raiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiz(ParserTParser.RaizContext ctx);
}
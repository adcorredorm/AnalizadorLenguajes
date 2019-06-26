// Generated from /home/angel/Code/Lenguajes/ANTLR/grammar/SL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SLParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(SLParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SLParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(SLParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(SLParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(SLParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#declaracion_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_constante(SLParser.Declaracion_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos(SLParser.TiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#declaracion_campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_campo(SLParser.Declaracion_campoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(SLParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#declaracion_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_variable(SLParser.Declaracion_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#subrutina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrutina(SLParser.SubrutinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#subrutina_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrutina_base(SLParser.Subrutina_baseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#parametros_subrutina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_subrutina(SLParser.Parametros_subrutinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo(SLParser.MetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(SLParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(SLParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#llamadoFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadoFuncion(SLParser.LlamadoFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(SLParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(SLParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#estructura_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura_control(SLParser.Estructura_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(SLParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sino_si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino_si(SLParser.Sino_siContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(SLParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(SLParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#repetir_hasta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetir_hasta(SLParser.Repetir_hastaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#desde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesde(SLParser.DesdeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(SLParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(SLParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#caso_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso_default(SLParser.Caso_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#llamadoFuncion_parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadoFuncion_parametro(SLParser.LlamadoFuncion_parametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(SLParser.Tipo_datoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDato(SLParser.DatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(SLParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#numerico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumerico(SLParser.NumericoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#cadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(SLParser.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico(SLParser.LogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura(SLParser.EstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim(SLParser.DimContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(SLParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(SLParser.ComparacionContext ctx);
}
// Generated from /home/angel/Code/Lenguajes/ANTLR/grammar/SL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SLParser}.
 */
public interface SLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SLParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(SLParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(SLParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SLParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SLParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(SLParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(SLParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(SLParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(SLParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#declaracion_constante}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_constante(SLParser.Declaracion_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#declaracion_constante}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_constante(SLParser.Declaracion_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipos(SLParser.TiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipos(SLParser.TiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#declaracion_campo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_campo(SLParser.Declaracion_campoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#declaracion_campo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_campo(SLParser.Declaracion_campoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(SLParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(SLParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#declaracion_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_variable(SLParser.Declaracion_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#declaracion_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_variable(SLParser.Declaracion_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#subrutina}.
	 * @param ctx the parse tree
	 */
	void enterSubrutina(SLParser.SubrutinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#subrutina}.
	 * @param ctx the parse tree
	 */
	void exitSubrutina(SLParser.SubrutinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#subrutina_base}.
	 * @param ctx the parse tree
	 */
	void enterSubrutina_base(SLParser.Subrutina_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#subrutina_base}.
	 * @param ctx the parse tree
	 */
	void exitSubrutina_base(SLParser.Subrutina_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#parametros_subrutina}.
	 * @param ctx the parse tree
	 */
	void enterParametros_subrutina(SLParser.Parametros_subrutinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#parametros_subrutina}.
	 * @param ctx the parse tree
	 */
	void exitParametros_subrutina(SLParser.Parametros_subrutinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(SLParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(SLParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(SLParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(SLParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(SLParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(SLParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#llamadoFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadoFuncion(SLParser.LlamadoFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#llamadoFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadoFuncion(SLParser.LlamadoFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(SLParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(SLParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(SLParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(SLParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#estructura_control}.
	 * @param ctx the parse tree
	 */
	void enterEstructura_control(SLParser.Estructura_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#estructura_control}.
	 * @param ctx the parse tree
	 */
	void exitEstructura_control(SLParser.Estructura_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(SLParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(SLParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sino_si}.
	 * @param ctx the parse tree
	 */
	void enterSino_si(SLParser.Sino_siContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sino_si}.
	 * @param ctx the parse tree
	 */
	void exitSino_si(SLParser.Sino_siContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(SLParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(SLParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(SLParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(SLParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#repetir_hasta}.
	 * @param ctx the parse tree
	 */
	void enterRepetir_hasta(SLParser.Repetir_hastaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#repetir_hasta}.
	 * @param ctx the parse tree
	 */
	void exitRepetir_hasta(SLParser.Repetir_hastaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#desde}.
	 * @param ctx the parse tree
	 */
	void enterDesde(SLParser.DesdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#desde}.
	 * @param ctx the parse tree
	 */
	void exitDesde(SLParser.DesdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(SLParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(SLParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(SLParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(SLParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#caso_default}.
	 * @param ctx the parse tree
	 */
	void enterCaso_default(SLParser.Caso_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#caso_default}.
	 * @param ctx the parse tree
	 */
	void exitCaso_default(SLParser.Caso_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void enterTipo_dato(SLParser.Tipo_datoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void exitTipo_dato(SLParser.Tipo_datoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#dato}.
	 * @param ctx the parse tree
	 */
	void enterDato(SLParser.DatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#dato}.
	 * @param ctx the parse tree
	 */
	void exitDato(SLParser.DatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(SLParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(SLParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#numerico}.
	 * @param ctx the parse tree
	 */
	void enterNumerico(SLParser.NumericoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#numerico}.
	 * @param ctx the parse tree
	 */
	void exitNumerico(SLParser.NumericoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(SLParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(SLParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#logico}.
	 * @param ctx the parse tree
	 */
	void enterLogico(SLParser.LogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#logico}.
	 * @param ctx the parse tree
	 */
	void exitLogico(SLParser.LogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#estructura}.
	 * @param ctx the parse tree
	 */
	void enterEstructura(SLParser.EstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#estructura}.
	 * @param ctx the parse tree
	 */
	void exitEstructura(SLParser.EstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#dim}.
	 * @param ctx the parse tree
	 */
	void enterDim(SLParser.DimContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#dim}.
	 * @param ctx the parse tree
	 */
	void exitDim(SLParser.DimContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(SLParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(SLParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(SLParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(SLParser.ComparacionContext ctx);
}
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.util.List;

public class Translator extends SLBaseListener{

    protected static BufferedWriter file;
    protected String class_name;
    protected static int nested = 0;
    private StringBuilder builder;

    protected static void write(String s) {
        try {
            for (int i = 0; i < nested ; i++) {
                file.write("\t");
                file.write(s);
                file.flush();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    protected static void write2(String s) {
        try {
            file.write(s);

            file.flush();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private String getTipo(SLParser.DatoContext dato){
        if( dato.cadena() != null )
            return "String";
        if( dato.numerico() != null )
            return "double";
        if( dato.logico() != null )
            return "boolean";
        else
            return dato.identificador().getText();
    }

    private String getTipo(SLParser.Tipo_datoContext tipoDato){
        if( tipoDato.getText().equals("cadena") )
            return "String";
        if( tipoDato.getText().equals("numerico") )
            return "double";
        else
            return "boolean";
    }

    @Override
    public void enterInicio(SLParser.InicioContext ctx){
        try {
            if(ctx.programa() != null) class_name = ctx.programa().ID().getText();
            else class_name = "Main";

            file = new BufferedWriter(new FileWriter(new File(class_name + ".java")));
        }catch (Exception e){
            System.out.println(e);
        }
        write("public class "+class_name+"{\n\n");
        nested ++;
    }

    @Override
    public void exitInicio(SLParser.InicioContext ctx){
        nested --;
        write("}\n");
    }

    @Override
    public void enterMain(SLParser.MainContext ctx){

        write("public static void main(String[] args){\n");
        nested ++;
    }

    @Override public void exitMain(SLParser.MainContext ctx){
        nested --;
        write("}\n\n");
    }

    @Override
    public void enterPrograma(SLParser.ProgramaContext ctx){
    }

    @Override
    public void exitPrograma(SLParser.ProgramaContext ctx){

    }

    @Override
    public void enterDeclaracion(SLParser.DeclaracionContext ctx){

    }

    @Override
    public void exitDeclaracion(SLParser.DeclaracionContext ctx){

    }

    @Override
    public void enterConstantes(SLParser.ConstantesContext ctx){

    }

    @Override
    public void exitConstantes(SLParser.ConstantesContext ctx){

    }

    @Override
    public void enterDeclaracion_constante(SLParser.Declaracion_constanteContext ctx){
        write("final " + getTipo(ctx.dato()) + " " + ctx.identificador().getText() + " " + ctx.Tk_asignacion().getText() + " " + ctx.dato().getText()+";\n");
    }

    @Override
    public void exitDeclaracion_constante(SLParser.Declaracion_constanteContext ctx){

    }

    @Override
    public void enterTipos(SLParser.TiposContext ctx){

    }

    @Override
    public void exitTipos(SLParser.TiposContext ctx){

    }

    @Override
    public void enterDeclaracion_campo(SLParser.Declaracion_campoContext ctx){
        write("class " + ctx.ID() + "{");
        write(getTipo(ctx.tipo_dato()) + " " + ctx.ID() + ";");
        write("}");
    }

    @Override
    public void exitDeclaracion_campo(SLParser.Declaracion_campoContext ctx){

    }

    @Override
    public void enterVariables(SLParser.VariablesContext ctx){

    }

    @Override
    public void exitVariables(SLParser.VariablesContext ctx){

    }

    @Override
    public void enterDeclaracion_variable(SLParser.Declaracion_variableContext ctx){
        if(ctx.dato() != null){
            write(getTipo(ctx.tipo_dato()) + " " + ctx.ID() + " = " + ctx.dato() + ";");
        }else {
            write(getTipo(ctx.tipo_dato()) + " " + ctx.ID() + ";");;
        }
    }

    @Override
    public void exitDeclaracion_variable(SLParser.Declaracion_variableContext ctx){

    }

    @Override
    public void enterSubrutina(SLParser.SubrutinaContext ctx){
        String header = "public static ";
        if( ctx.metodo()!= null )
            header += "void ";
        else if( ctx.funcion().tipo_dato() != null ){
            header += getTipo(ctx.funcion().tipo_dato())+" ";;
        }  else
            header += ctx.funcion().ID().getText() + " ";
        write(header);
    }

    @Override
    public void exitSubrutina(SLParser.SubrutinaContext ctx){
        nested--;
        write("}\n\n");
    }

    @Override
    public void enterSubrutina_base(SLParser.Subrutina_baseContext ctx){
        write2(ctx.ID().getText()+"(");
    }

    @Override
    public void exitSubrutina_base(SLParser.Subrutina_baseContext ctx){
        write2("){\n");
        nested++;
    }

    // FALTA POR TERMINAR
    @Override
    public void enterParametros_subrutina(SLParser.Parametros_subrutinaContext ctx){
        List<TerminalNode> IDs = ctx.ID();
        List<SLParser.Tipo_datoContext> tipos = ctx.tipo_dato();

        for (int i = 0; i < IDs.size() ; i++) {

        }
    }

    @Override
    public void exitParametros_subrutina(SLParser.Parametros_subrutinaContext ctx){

    }

    @Override
    public void enterMetodo(SLParser.MetodoContext ctx){

    }

    @Override
    public void exitMetodo(SLParser.MetodoContext ctx){

    }

    @Override
    public void enterFuncion(SLParser.FuncionContext ctx){

    }

    @Override
    public void exitFuncion(SLParser.FuncionContext ctx){

    }

    @Override
    public void enterSentencia(SLParser.SentenciaContext ctx){

    }

    @Override
    public void exitSentencia(SLParser.SentenciaContext ctx){

    }

    @Override
    public void enterLlamadoFuncion(SLParser.LlamadoFuncionContext ctx){

    }

    @Override
    public void exitLlamadoFuncion(SLParser.LlamadoFuncionContext ctx){

    }

    @Override
    public void enterParametros(SLParser.ParametrosContext ctx){

    }

    @Override
    public void exitParametros(SLParser.ParametrosContext ctx){

    }

    @Override
    public void enterAsignacion(SLParser.AsignacionContext ctx){
        write( "");
        enterIdentificador(ctx.identificador());
        write2(" = ");
        enterDato( ctx.dato() );
        write2(";\n");
    }

    @Override
    public void exitAsignacion(SLParser.AsignacionContext ctx){

    }

    @Override
    public void enterEstructura_control(SLParser.Estructura_controlContext ctx){

    }

    @Override
    public void exitEstructura_control(SLParser.Estructura_controlContext ctx){

    }

    @Override
    public void enterCondicional(SLParser.CondicionalContext ctx){

    }

    @Override
    public void exitCondicional(SLParser.CondicionalContext ctx){

    }

    @Override
    public void enterSino_si(SLParser.Sino_siContext ctx){

    }

    @Override
    public void exitSino_si(SLParser.Sino_siContext ctx){

    }

    @Override
    public void enterSino(SLParser.SinoContext ctx){

    }

    @Override
    public void exitSino(SLParser.SinoContext ctx){

    }

    @Override
    public void enterMientras(SLParser.MientrasContext ctx){

    }

    @Override
    public void exitMientras(SLParser.MientrasContext ctx){
        write("}");
    }

    @Override
    public void enterRepetir_hasta(SLParser.Repetir_hastaContext ctx){
        write("do{\n");
    }

    @Override
    public void exitRepetir_hasta(SLParser.Repetir_hastaContext ctx){
        builder = new StringBuilder();

        builder.append("}while(");
        builder.append(visitLogico(ctx.logico()));
        builder.append(");\n");

        write(builder.toString());
    }

    @Override
    public void enterDesde(SLParser.DesdeContext ctx){
        String var = ctx.ID().getText();
        write("for(int " + var + " = ");
        write2(ctx.numerico(0).getText());
        write2("; " + var + " < ");
        write2(ctx.numerico(1).getText());
        write2("; " + var);
        if(ctx.Tk_paso() != null){
            write2("+=");
            write2(ctx.numerico(2).getText());
        }else{
            write2("++");
        }
        write2("){\n");
        nested ++;
    }

    @Override
    public void exitDesde(SLParser.DesdeContext ctx){
        nested --;
        write("}\n");
    }

    //Eval
    boolean first = true;

    @Override
    public void enterEval(SLParser.EvalContext ctx){

    }

    @Override
    public void exitEval(SLParser.EvalContext ctx){
        first = true;
    }

    @Override
    public void enterCaso(SLParser.CasoContext ctx){
        if(first == true){
            write("if(" + ctx.logico().getText() + "){");
        }else{
            write("else if(" + ctx.logico().getText() + "){");
        }
        first = false;
    }

    @Override
    public void exitCaso(SLParser.CasoContext ctx){

        write("}");
    }

    @Override
    public void enterCaso_default(SLParser.Caso_defaultContext ctx){
        write("else{");
    }

    @Override
    public void exitCaso_default(SLParser.Caso_defaultContext ctx){
        write("}");

    }

    @Override
    public void enterTipo_dato(SLParser.Tipo_datoContext ctx){

    }

    @Override
    public void exitTipo_dato(SLParser.Tipo_datoContext ctx){

    }

    @Override
    public void enterDato(SLParser.DatoContext ctx){
    }

    @Override
    public void exitDato(SLParser.DatoContext ctx){

    }

    @Override
    public void enterIdentificador(SLParser.IdentificadorContext ctx){


    }

    @Override
    public void exitIdentificador(SLParser.IdentificadorContext ctx){

    }

    @Override
    public void enterNumerico(SLParser.NumericoContext ctx){
        write(ctx.getText());
    }

    @Override
    public void exitNumerico(SLParser.NumericoContext ctx){

    }

    @Override
    public void enterCadena(SLParser.CadenaContext ctx){

    }

    @Override
    public void exitCadena(SLParser.CadenaContext ctx){

    }

    @Override
    public void enterLogico(SLParser.LogicoContext ctx){

    }

    private String visitLogico(SLParser.LogicoContext ctx){
        builder = new StringBuilder();
        if(ctx.Tk_logico() != null){
            if(ctx.Tk_logico().getText().equals("TRUE") || ctx.Tk_logico().getText().equals("SI")){
                builder.append("true");
            }else{
                builder.append("false");
            }
        }else if(ctx.Tk_negacion() != null){
            builder.append("!");
            builder.append(visitLogico(ctx.logico(0)));
        }else if(ctx.Tk_conjuncion() != null){
            builder.append(visitLogico(ctx.logico(0)));
            builder.append("&&");
            builder.append(visitLogico(ctx.logico(1)));
        }else if(ctx.Tk_disyuncion() != null){
            builder.append(visitLogico(ctx.logico(0)));
            builder.append("||");
            builder.append(visitLogico(ctx.logico(1)));
        }else if(ctx.Tk_par_izq() != null){
            builder.append("(");
            builder.append(visitLogico(ctx.logico(0)));
            builder.append(")");
        }

        return builder.toString();
    }

    @Override
    public void exitLogico(SLParser.LogicoContext ctx){

    }

    @Override
    public void enterEstructura(SLParser.EstructuraContext ctx){

    }

    @Override
    public void exitEstructura(SLParser.EstructuraContext ctx){

    }

    @Override
    public void enterDim(SLParser.DimContext ctx){

    }

    @Override
    public void exitDim(SLParser.DimContext ctx){

    }

    @Override
    public void enterRegistro(SLParser.RegistroContext ctx){

    }

    @Override
    public void exitRegistro(SLParser.RegistroContext ctx){

    }

    @Override
    public void enterComparacion(SLParser.ComparacionContext ctx){
        builder = new StringBuilder();
        if(ctx.numerico().size() > 0){
            write(ctx.OP_COMP().getText());
        }else{
            write(ctx.OP_IDEN().getText());
        }
    }

    @Override
    public void exitComparacion(SLParser.ComparacionContext ctx){

    }

    @Override
    public void visitErrorNode(ErrorNode node){

    }
}
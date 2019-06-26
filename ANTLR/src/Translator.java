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
            for (int i = 0; i < nested ; i++)
                file.write("\t");
                file.write(s);
                file.flush();
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
        else if( dato.numerico() != null )
            return "double";
        else if( dato.logico() != null )
            return "boolean";
        else
            return dato.identificador().getText();
    }

    private String getTipo(String tipoDato){
        if( tipoDato.equals("cadena") )
            return "String";
        else if( tipoDato.equals("numerico") )
            return "double";
        else if (tipoDato.startsWith("matriz") || tipoDato.startsWith("vector"))
            return getTipo(tipoDato.split("]")[1]);
        else
            return "boolean";
    }

    private String getTipo(SLParser.Tipo_datoContext tipoDato){

        if( tipoDato.getText().equals("cadena") )
            return "String";
        else if( tipoDato.getText().equals("numerico") )
            return "double";
        else if (tipoDato.getText().startsWith("matriz") || tipoDato.getText().startsWith("vector"))
            return getTipo(tipoDato.getText().split("]")[1]);
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

        try{
            file.close();
        }catch(Exception e){
            System.out.println(e);
        }
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
        //write("\n");
    }

    @Override
    public void enterConstantes(SLParser.ConstantesContext ctx){

    }

    @Override
    public void exitConstantes(SLParser.ConstantesContext ctx){
        write("\n");
    }

    @Override
    public void enterDeclaracion_constante(SLParser.Declaracion_constanteContext ctx){
        write("final " + getTipo(ctx.dato()) + " " + ctx.identificador().getText() + " " + ctx.Tk_asignacion().getText() + " " + ctx.dato().getText()+";");
        write("\n");
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
        write("class " + ctx.ID() + "{\n");
        nested++;
        write(getTipo(ctx.tipo_dato()) + " " + ctx.ID() + ";" + "\n");
        nested--;
        write("}\n\n");
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
            if(ctx.tipo_dato().estructura() != null){
                write(getTipo(ctx.tipo_dato()) + "[] " + ctx.ID().toString().substring(1,ctx.ID().toString().length()-1) + ";\n");
            }else {
                write(getTipo(ctx.tipo_dato()) + " " +
                        ctx.ID().toString().substring(1, ctx.ID().toString().length() - 1) + " = " +
                        ctx.dato().getText() + ";\n");
            }
            }else {
            if(ctx.tipo_dato().estructura() != null){
                write(getTipo(ctx.tipo_dato()) + "[] " + ctx.ID().toString().substring(1,ctx.ID().toString().length()-1));
                write2(" = new " + getTipo(ctx.tipo_dato()));
                for(SLParser.NumericoContext num: ctx.tipo_dato().estructura().dim().numerico())
                    write2("[" + num.getText() + "]");
                write2(";\n");

            }else {
                write(getTipo(ctx.tipo_dato()) + " " +
                        ctx.ID().toString().substring(1, ctx.ID().toString().length() - 1) + ";\n"
                );
            }
        }
    }

    @Override
    public void exitDeclaracion_variable(SLParser.Declaracion_variableContext ctx){

    }

    @Override
    public void enterSubrutina(SLParser.SubrutinaContext ctx){
        write("public static ");
        if( ctx.metodo()!= null )
            write2("void ");
        else if( ctx.funcion().tipo_dato() != null ){
            if(ctx.funcion().tipo_dato().estructura() != null)
                enterEstructura(ctx.funcion().tipo_dato().estructura());
            else
                write2(getTipo(ctx.funcion().tipo_dato()).trim() + " ");
        }  else
            write2(ctx.funcion().ID().getText().trim() + " ");
    }

    @Override
    public void exitSubrutina(SLParser.SubrutinaContext ctx){
        if(ctx.funcion() != null)
            write("return " + ctx.funcion().dato().getText() + ";\n");

        nested--;
        write("}\n\n");
    }

    @Override
    public void enterSubrutina_base(SLParser.Subrutina_baseContext ctx){
        if(ctx.parametros_subrutina() != null) {
            write2(ctx.ID().getText() + "(");
        }else{
            write2(ctx.ID().getText() + "(){\n");
            nested++;
        }
    }

    @Override
    public void exitSubrutina_base(SLParser.Subrutina_baseContext ctx){

    }

    // FALTA POR TERMINAR
    @Override
    public void enterParametros_subrutina(SLParser.Parametros_subrutinaContext ctx){
        List<TerminalNode> IDs = ctx.ID();
        List<SLParser.Tipo_datoContext> tipos = ctx.tipo_dato();

        int i;
        for (i = 0; i < IDs.size()-1 ; i++)
            write2(getTipo(tipos.get(i)) + " " + IDs.get(i).getText() + ", ");

        write2(getTipo(tipos.get(i)) + " " + IDs.get(i).getText());
        write2("){\n");
        nested++;
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
        write("\n");
    }

    @Override
    public void enterLlamadoFuncion(SLParser.LlamadoFuncionContext ctx){
        if(ctx.ID().getText().equals("imprimir")){
            String [] splitter = ctx.parametros().getText().split(",");
            String acum = splitter[0];
            for (int i = 1; i < splitter.length; i++) {
                acum += " + " + splitter[i] + " ";
            }
            write("System.out.println(" + acum + ");");
        }else if(ctx.ID().getText().equals("leer")){
            String [] splitter = ctx.parametros().getText().split(",");
            write2("\n");
            write("// Import Scanner from java.io and initialize an instance 'sc' for the following inputs:\n");
            for (int i = 0; i < splitter.length; i++) {
                write("String " + splitter[i] + " = " + "sc.nextLine();\n");
            }

        }else {
            if (ctx.parametros() != null) {
                write(ctx.ID().getText() + "(" + ctx.parametros().getText() + ");");
            } else {
                write(ctx.ID().getText() + "();");
            }
        }
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
    public void enterAsignacion(SLParser.AsignacionContext ctx) {
        write(ctx.identificador().getText() + " = " + ctx.dato().getText() + ";");
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
        write("if(" + ctx.logico().getText() + "){\n");
        nested++;
    }

    @Override
    public void exitCondicional(SLParser.CondicionalContext ctx){
        nested--;
        write("}");
    }

    @Override
    public void enterSino_si(SLParser.Sino_siContext ctx){
        write("}else if(" + ctx.logico().getText() + "){\n");
        nested++;
    }

    @Override
    public void exitSino_si(SLParser.Sino_siContext ctx){

    }

    @Override
    public void enterSino(SLParser.SinoContext ctx){
        nested--;
        write("}else{\n");
        nested++;
    }

    @Override
    public void exitSino(SLParser.SinoContext ctx){

    }

    @Override
    public void enterMientras(SLParser.MientrasContext ctx){
        write("while(" + ctx.logico().getText() + "){\n");
        nested++;
    }

    @Override
    public void exitMientras(SLParser.MientrasContext ctx){
        nested--;
        write("}");
    }

    @Override
    public void enterRepetir_hasta(SLParser.Repetir_hastaContext ctx){
        write("do{\n");
    }

    @Override
    public void exitRepetir_hasta(SLParser.Repetir_hastaContext ctx){
        builder = new StringBuilder();

        write("}while(");
        visitLogico(ctx.logico());
        write(");\n");

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
        write("}");
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
            write("if(" + ctx.logico().getText() + "){\n");
        }else{
            write("else if(" + ctx.logico().getText() + "){\n");
        }
        nested++;
        first = false;
    }

    @Override
    public void exitCaso(SLParser.CasoContext ctx){
        nested--;
        write("}");
    }

    @Override
    public void enterCaso_default(SLParser.Caso_defaultContext ctx){
        write("else{\n");
        nested++;
    }

    @Override
    public void exitCaso_default(SLParser.Caso_defaultContext ctx){
        write("}");
        nested--;
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

    private void visitLogico(SLParser.LogicoContext ctx){

        if(ctx.Tk_logico() != null){
            if(ctx.Tk_logico().getText().equals("TRUE") || ctx.Tk_logico().getText().equals("SI")){
                write("true");
            }else{
                write("false");
            }
        }else if(ctx.Tk_negacion() != null){
            write("!");
            visitLogico(ctx.logico(0));
        }else if(ctx.Tk_conjuncion() != null){
            visitLogico(ctx.logico(0));
            write(" && ");
            visitLogico(ctx.logico(1));
        }else if(ctx.Tk_disyuncion() != null){
            visitLogico(ctx.logico(0));
            write(" || ");
            visitLogico(ctx.logico(1));
        }else if(ctx.Tk_par_izq() != null){
            write("(");
            visitLogico(ctx.logico(0));
            write(")");
        }else if(ctx.llamadoFuncion_parametro() != null){
            visitLlamadoFuncion_parametro(ctx.llamadoFuncion_parametro());
        }else if(ctx.comparacion() != null){
            if(ctx.comparacion().numerico() != null){
                write(ctx.comparacion().numerico().getText());
            }else{
                write(ctx.comparacion().cadena().getText());
            }
            write(ctx.comparacion().OP_COMP().getText());
            write(ctx.comparacion().dato().getText());
        }
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

    }

    @Override
    public void exitComparacion(SLParser.ComparacionContext ctx){

    }

    @Override
    public void visitErrorNode(ErrorNode node){

    }

    @Override
    public void enterLlamadoFuncion_parametro(SLParser.LlamadoFuncion_parametroContext ctx) {

    }

    private void visitLlamadoFuncion_parametro(SLParser.LlamadoFuncion_parametroContext ctx) {
        if (ctx.parametros() != null) {
            write(ctx.ID() + "(" + ctx.parametros().getText() + ")");
        } else {
            write(ctx.ID() + "()");
        }
    }
}
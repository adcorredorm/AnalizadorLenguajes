public class Translator extends SLBaseListener{

    @Override
    public void enterInicio(SLParser.InicioContext ctx){
        System.out.println("Inicia el analisis");
    }

    @Override
    public void exitInicio(SLParser.InicioContext ctx){
        System.out.println("Termina el analisis");
    }
}

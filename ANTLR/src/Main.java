import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Main {

    public static void main(String[] args) throws Exception{

        try{
            SLLexer lexer = new SLLexer(CharStreams.fromFileName(args[0]));

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            SLParser parser = new SLParser(tokens);
            ParseTree tree = parser.inicio();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new Translator(), tree);

            System.out.println("Done!");

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}

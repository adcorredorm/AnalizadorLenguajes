package LexicalAnalizer;

public class ErrorToken extends Token{

    public ErrorToken(int row, int column){
        super("Lexical Error", "Lexical Error", row, column);
    }

    @Override
    public String toString(){
        return ">>> Error Lexico(linea:" + row + ", posicion:" + column + ')';
    }
}

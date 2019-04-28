package LexicalAnalizer;

public class Token {

    public static final String EOF = "EOF";
    public static final String Numeric = "Tk_Numeric";
    public static final String Identifier = "Tk_Identifier";
    public static final String String = "Tk_String";


    protected String tokenType, lexeme;
    protected int row, column;
    protected boolean reservedWord;

    public Token(String tokenType, String lexeme, int row, int column, boolean reservedWord){
        this.tokenType = tokenType;
        this.lexeme = lexeme;
        this.row = row;
        this.column = column;
        this.reservedWord = reservedWord;
    }

    public Token(String tokenType, String lexeme, int row, int column){
        this(tokenType, lexeme, row, column,false);
    }

    @Override
    public String toString(){
        if(reservedWord) return "" + '<' + tokenType + ',' + row + ',' + column + '>';
        return "" + '<' + tokenType + ',' + lexeme + ',' + row + ',' + column + '>';
    }

}

package LexicalAnalizer;

public class Token {

    public static final String EOF = "§";
    public static final String Numeric = "tk_num";
    public static final String Identifier = "tk_identificador";
    public static final String String = "tk_texto";


    public String tokenType, lexeme;
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
        if(reservedWord) return "" + '<' + tokenType + ',' + row + ',' + (column+1) + '>';
        return "" + '<' + tokenType + ',' + lexeme + ',' + row + ',' + (column+1) + '>';
    }

}

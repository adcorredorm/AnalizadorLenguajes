package LexicalAnalizer;

public class Token {

    private int tokenType; //TODO: Hacer clase/enum tokenType
    private String lexeme;
    private int row, column;

    public Token(int tokenType, String lexeme, int row, int column){
        this.tokenType = tokenType;
        this.lexeme = lexeme;
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString(){
        //TODO: TokenType
        return "" + '<' + tokenType + ',' + lexeme + ',' + row + ',' + column + '>';
    }

}

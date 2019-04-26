package LexicalAnalizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Analyzer {

    private BufferedReader reader;
    private int row;
    private int column;
    private String buffer;

    public Analyzer(String srcPath, String TokenDescription) throws IOException{ //TODO: tokenDescription
        this.reader = new BufferedReader(new FileReader(srcPath));
        this.row = 0;
        this.column = 0;
        this.buffer = "";
    }

    public Token nextToken() throws IOException{
        if(buffer.length() - column == 0){
            buffer = reader.readLine();
            row++;
            column = 0;
            if(buffer == null) return new Token(2, "EOF", row, column);
        }
        StringBuilder builder = new StringBuilder();

        //Lectura y separacion de tokens por ' ' (provicional)
        int i;
        for(i = column; i < buffer.length(); i++){
            if(buffer.charAt(i) != ' ') builder.append(buffer.charAt(i));
            else{
                i++;
                break;
            }
        }

        Token t = new Token(1, builder.toString(), row, column);
        column = i;
        return t;
    }

    public static void main(String[] args) throws IOException{
        Analyzer Analyzer = new Analyzer("Input/code.txt", "");
        for (int i = 0; i < 12; i++) {
            System.out.println(Analyzer.nextToken().toString());
        }
    }
}

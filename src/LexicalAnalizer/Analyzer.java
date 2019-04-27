package LexicalAnalizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Analyzer {

    /*TODO:
     * Leer e ignorar comentarios
     * Describir el lengueje asignado xD
     * Lectura de Strings "String"
     * TokenType como clase (o almenos como un string)
     * Pendiente Refactor
     */

    private BufferedReader reader;
    private int row;
    private int column;
    private String buffer;
    private HashMap<String, String> literalTokens;
    private Automaton automaton;

    public Analyzer(String srcPath, String TokenDescription) throws IOException{
        this.literalTokens = new HashMap<>();
        this.automaton = new Automaton();
        this.reader = new BufferedReader(new FileReader(srcPath));
        this.row = 0;
        this.column = 0;
        this.buffer = "";

        parseTokenDescription(TokenDescription);
    }

    private void parseTokenDescription(String TokenDescription) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(TokenDescription));
        String line = reader.readLine();
        while(line != null){
            String[] descriptor = line.split(" ");
            literalTokens.put(descriptor[0], descriptor[1]);
            line = reader.readLine();
        }
    }

    public Token nextToken() throws IOException{
        if(buffer.length() - column == 0){
            buffer = reader.readLine();
            row++;
            column = 0;
            if(buffer == null) return new Token(-1, "EOF", row, column);
        }

        int lastAccepted = column;
        boolean rejected = false;
        while( column < buffer.length() && (buffer.charAt(column) == ' ' || buffer.charAt(column) == '\t')) column++;

        int i = column;
        StringBuilder builder = new StringBuilder();

        while(i < buffer.length()){
            builder.append(buffer.charAt(i));
            if(literalTokens.containsKey(builder.toString())) lastAccepted = i+1;
            else{
                int acceptation = automaton.process(builder.toString());
                switch (acceptation){
                    case Automaton.ACCEPTED:
                        lastAccepted = i+1;
                        break;

                    case Automaton.REJECTED:
                        rejected = true;
                        break;
                }
            }
            if(rejected) break;
            i++;
        }

        if(i == column) return new Token(-2,"Lexical Error", row, column);

        String lexem = builder.substring(0, lastAccepted-column);

        Token t;
        if(literalTokens.containsKey(lexem))
            t = new Token(0, literalTokens.get(lexem), column, row);
        else if(Character.isDigit(builder.charAt(0)))
            t = new Token(1, lexem, column, row);
        else t = new Token(2, lexem, column, row);

        column = lastAccepted;

        return t;
    }

    public static void main(String[] args) throws IOException{
        Analyzer Analyzer = new Analyzer("Input/code.txt", "Input/description.txt");
        for (int i = 0; i < 14; i++) {
            System.out.println(Analyzer.nextToken().toString());
        }
    }
}

package LexicalAnalizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Analyzer {

    /*TODO:
     * Describir el lengueje asignado xD
     * Pendiente Refactor
     */

    private BufferedReader reader;
    private int row;
    private int column;
    private String buffer;
    private HashMap<String, String> literalTokens;
    private Automaton automaton;
    private boolean error = false;

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
        String[] descriptor;
        while(line != null){
            descriptor = line.split(" ");
            literalTokens.put(descriptor[0], descriptor[1]);
            do line = reader.readLine();
                while(line != null && line.length() == 0);
        }
    }

    public boolean hasNext(){
        return buffer != null && !error;
    }

    private void readLine() throws IOException{
        buffer = reader.readLine();
        row++;
        column = 0;
    }

    //Posiciona el marcador de columna en la siguiente posicion a leer
    private void nextPosition() throws IOException{
        //Si termino el buffer encuentra la siguiente fila no vacia
        while(buffer.length() - column == 0){
            readLine();
            if(buffer == null) return;
        }

        //Ignora los espacios y tabulaciones que hay frente al marcador
        while(column < buffer.length() && (buffer.charAt(column) == ' ' || buffer.charAt(column) == '\t'))
            column++;

        //Ignora los comentarios de linea
        while(column + 1 < buffer.length() && buffer.substring(column,column+2).equals("//")){
            readLine();
            if(buffer == null) return;
            nextPosition(); //fix
            if(buffer == null) return;
        }

        //Ignora los comentarios de multiple linea
        while(column + 1 < buffer.length() && buffer.substring(column,column+2).equals("/*")){
            while(!buffer.contains("*/")){
                readLine();
                if(buffer == null) return;
            }
            column = buffer.indexOf("*/") + 2;

            //Debe realizarse denuevo la comprobacion de comentarios y espacios
            nextPosition();
            if(buffer == null) return;
        }
    }

    public Token nextToken() throws IOException{
        if(!hasNext()) return new ErrorToken(row, column);

        nextPosition();
        if(buffer == null) return new Token(Token.EOF, "", row, column, true);

        int i = column, acceptation;
        int lastAccepted = column;
        boolean rejected = false;
        StringBuilder builder = new StringBuilder();

        while(i < buffer.length() && !rejected){
            builder.append(buffer.charAt(i));
            if(literalTokens.containsKey(builder.toString())) lastAccepted = ++i;
            else{
                acceptation = automaton.process(builder.toString());
                switch (acceptation){
                    case Automaton.ACCEPTED:
                        lastAccepted = ++i;
                        break;

                    case Automaton.POSIBLE:
                        i++;
                        break;

                    case Automaton.REJECTED:
                        rejected = true;
                        break;
                }
            }
        }

        if(i == column){
            error = true;
            return new ErrorToken(row, column);
        }

        Token t = makeToken(builder.substring(0, lastAccepted-column));
        column = lastAccepted;
        return t;
    }

    public Token makeToken(String lexem){

        if(lexem.length() == 0){
            error = true;
            return new ErrorToken(row, column);
        }

        if(literalTokens.containsKey(lexem))
            return new Token(literalTokens.get(lexem), lexem, row, column, true);

        if(Character.isDigit(lexem.charAt(0)))
            return new Token(Token.Numeric, lexem, row, column);

        if(lexem.charAt(0) == '"' || lexem.charAt(0) == '\'')
            return new Token(Token.String, lexem, row, column);

        return new Token(Token.Identifier, lexem, row, column);
    }

    public static void main(String[] args) throws IOException{
        Analyzer Analyzer = new Analyzer("Input/code.txt", "Input/description.txt");
        while(Analyzer.hasNext()) {
            System.out.println(Analyzer.nextToken().toString());
        }
    }
}
package SyntacticAnalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

public class Analyzer {

    HashMap<String, LinkedList<ProductionRule>> rules;

    Analyzer(String grammarPath)throws IOException {
        this.rules = new HashMap<>();
        makePrediction(grammarPath);
    }

    private void makePrediction(String grammarPath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(grammarPath));
        String line = br.readLine();
        while (line != null && line.length() > 0){
            for(String s : line.split(","))
                rules.put(s, new LinkedList<>());
            line = br.readLine();
        }

        if(line != null) line = br.readLine();

        String[] rulePart;
        while (line != null){
            rulePart = line.split(" := ");
            for(String s : rulePart[1].split(",")){
                rules.get(rulePart[0]).add(new ProductionRule(rulePart[0].trim(), s));
            }

            line = br.readLine();
        }
    }

    public static void main(String[] args) throws IOException{
        Analyzer a = new Analyzer("Input/grammar.txt");
        for(String h : a.rules.keySet()){
            for(ProductionRule r : a.rules.get(h)) System.out.println(r);
        }
    }
}

package SyntacticAnalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Analyzer {



    private HashMap<String, LinkedList<ProductionRule>> rules;

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

        /* Aca inicia la construccion de el conjunto de prediccion */

        HashMap<String, HashSet<RuleVariable>> first = new HashMap<>();

        for(String key : rules.keySet()) first.put(key, new HashSet<>());

        boolean changes;
        do {
            changes = false;
            for(String key : rules.keySet()){
                int elements = first.get(key).size();
                for(ProductionRule P : rules.get(key)){
                    for(RuleVariable var : P.variables){
                        if(var.isTerminal){
                            first.get(key).add(var);
                            break;
                        }else{
                            //Si NullPointerError, probablemente se este dando una Terminal como No Terminal
                            first.get(key).addAll(first.get(var.value));
                            if(!first.get(var.value).contains(RuleVariable.EPSILON))
                                break;
                        }
                    }
                }
                changes |= first.get(key).size() > elements;
            }
        }while (changes);

        for(String key : first.keySet()){
            System.out.println(key + ":");
            for(RuleVariable v : first.get(key)){
                System.out.print(v.value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException{
        Analyzer a = new Analyzer("Input/grammar.txt");
        for(String h : a.rules.keySet()){
            //for(ProductionRule r : a.rules.get(h)) System.out.println(r);
        }
    }
}

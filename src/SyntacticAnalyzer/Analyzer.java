package SyntacticAnalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Analyzer {



    private HashMap<String, LinkedList<ProductionRule>> rules;
    private String rootVariable;

    Analyzer(String grammarPath)throws IOException {
        this.rules = new HashMap<>();
        makePrediction(grammarPath);
    }

    private void makePrediction(String grammarPath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(grammarPath));
        String line = br.readLine().trim();

        //La variable inicial debe estar sola en la primera linea
        rules.put(line, new LinkedList<>());
        ProductionRule.NoTerminals.add(line);
        rootVariable = line;
        line = br.readLine();

        while (line != null && line.length() > 0){
            for(String s : line.split(",")) {
                rules.put(s, new LinkedList<>());
                ProductionRule.NoTerminals.add(s);
            }
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

        HashMap<String, HashSet<String>> first = new HashMap<>();

        for(String key : rules.keySet()) first.put(key, new HashSet<>());

        boolean changes;
        do {
            changes = false;
            for(String key : rules.keySet()){
                int elements = first.get(key).size();
                for(ProductionRule P : rules.get(key)){
                    Iterator<RuleVariable> iterator = P.variables.iterator();
                    while(iterator.hasNext()){
                        RuleVariable var = iterator.next();
                        if(var.isTerminal){
                            first.get(key).add(var.value);
                            break;
                        }else{
                            //Si NullPointerError, probablemente se este dando una Terminal como No Terminal
                            HashSet<String> copy = new HashSet<>(first.get(var.value));
                            copy.remove(RuleVariable.EPSILON.value);
                            first.get(key).addAll(copy);

                            if(first.get(var.value).contains(RuleVariable.EPSILON.value)
                                    && !iterator.hasNext())
                                first.get(key).add(RuleVariable.EPSILON.value);
                        } //TODO: No es necesario tener las constantes de RuleVariable, solo el valor
                    }
                }
                changes |= first.get(key).size() > elements;
            }
        }while (changes);

        System.out.println("Primeros");
        for(String key : first.keySet()){
            System.out.print(key + ": ");
            for(String v : first.get(key)){
                System.out.print(v + " ");
            }
            System.out.println();
        }

        HashMap<String, HashSet<String>> next = new HashMap<>();
        for(String key : rules.keySet()) next.put(key, new HashSet<>());
        next.get(rootVariable).add(RuleVariable.EOF.value);

        do{
            changes = false;
            for(String key: rules.keySet()){
                int elements = rules.get(key).size();
                for (String head: rules.keySet()){
                    for(ProductionRule P : rules.get(head)){
                        Integer index = P.variablesString.get(key);
                        if(index != null){
                            if(index == P.variables.size()-1){
                                next.get(key).addAll(next.get(P.head));
                            }else{
                                if(P.variables.get(index+1).isTerminal)
                                    next.get(key).add(P.variables.get(index+1).value);
                                else{
                                    int i = 1;
                                    do{
                                        HashSet<String> copy = new HashSet<>(first.get(P.variables.get(index+i).value));
                                        copy.remove(RuleVariable.EPSILON.value);
                                        next.get(key).addAll(copy);
                                        i++;
                                        if(P.variables.get(index+i).isTerminal) {
                                            next.get(key).add(P.variables.get(index + i).value);
                                            break;
                                        }
                                    }while( i < P.variables.size() &&
                                            first.get(P.variables.get(index+i).value).contains(RuleVariable.EPSILON.value));

                                    if(i == P.variables.size())  next.get(key).addAll(next.get(P.head));
                                }
                            }
                        }
                    }
                }
                changes |= elements < rules.get(key).size();
            }
        }while(changes);

        System.out.println("Siguientes");
        for(String key : next.keySet()){
            System.out.print(key + ": ");
            for(String v : next.get(key)){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException{
        Analyzer a = new Analyzer("Input/grammar.txt");
    }
}

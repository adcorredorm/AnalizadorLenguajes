package SyntacticAnalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Analyzer {



    private HashMap<String, LinkedList<ProductionRule>> rules;
    HashMap<String, HashSet<String>> first, next;
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

        first = new HashMap<>();

        for(String key : rules.keySet()) first.put(key, new HashSet<>());

        boolean changes;
        do {
            changes = false;
            for(String key : rules.keySet()){
                int elements = first.get(key).size();
                for(ProductionRule P : rules.get(key)){
                    Primeros(first.get(key), P.variables);
                    //TODO: No es necesario tener las constantes de RuleVariable, solo el valor
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

        next = new HashMap<>();
        for(String key : rules.keySet()) next.put(key, new HashSet<>());
        next.get(rootVariable).add(RuleVariable.EOF.value);

        do{
            changes = false;
            for(String key: rules.keySet()){
                int elements = next.get(key).size();
                for (String head: rules.keySet()){
                    for(ProductionRule P : rules.get(head)){
                        Siguientes(P, key);
                    }
                }
                changes |= elements < next.get(key).size();
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

        for(String key : rules.keySet()){
            for(ProductionRule P : rules.get(key)){
                int i = 0;
                do{
                    if(P.variables.get(i).isTerminal){
                        if(P.variables.get(i).value.equals(RuleVariable.EPSILON.value))
                            P.prediction.addAll(next.get(P.head));
                        else P.prediction.add(P.variables.get(i).value);
                        break;
                    }else{
                        HashSet<String> copy = new HashSet<>(first.get(P.variables.get(i).value));
                        copy.remove(RuleVariable.EPSILON.value);
                        P.prediction.addAll(copy);
                        i++;
                    }
                }while(i < P.variables.size() && first.get(P.variables.get(i-1).value).contains(RuleVariable.EPSILON.value));

                if(i == P.variables.size()){
                    P.prediction.addAll(next.get(P.head));
                    P.prediction.remove(RuleVariable.EPSILON.value);
                }
            }
        }

        System.out.println("Prediccion");
        for(String key : rules.keySet()){
            for(ProductionRule P : rules.get(key)){
                System.out.print(P + "\t");
                for(String pred : P.prediction){
                    System.out.print(pred + ",");
                }
                System.out.println();
            }
        }
    }

    public void Primeros(HashSet set, List<RuleVariable> variables){
        if(variables.size() == 0){
            set.add(RuleVariable.EPSILON.value);
            return;
        }

        RuleVariable head = variables.get(0);
        if(head.equals(RuleVariable.EPSILON)){
            set.add(RuleVariable.EPSILON.value);
            return;
        }
        if(head.isTerminal)
            set.add(head.value);
        else{
            HashSet<String> copy = new HashSet<>(first.get(head.value));
            copy.remove(RuleVariable.EPSILON.value);
            set.addAll(copy);
            if(first.get(head.value).contains(RuleVariable.EPSILON.value)){
                if(variables.size() > 1)
                    Primeros(set, variables.subList(1, variables.size()));
                else
                    set.add(RuleVariable.EPSILON.value);
            }
        }

    }

    public void Siguientes(ProductionRule rule, String target){
        Integer index = rule.variablesString.get(target);
        if(index != null){
            HashSet<String> copy = new HashSet<>();
            Primeros(copy, rule.variables.subList(index+1, rule.variables.size()));
            next.get(target).addAll(copy);
            next.get(target).remove(RuleVariable.EPSILON.value);

            if(copy.contains(RuleVariable.EPSILON.value)){
                next.get(target).addAll(next.get(rule.head));
            }
        }
    }

    public static void main(String[] args) throws IOException{
        Analyzer a = new Analyzer("Input/grammar.txt");
    }
}

/*
* Primeros de S no va dos
* Siguientes de B va $
* Siguientes de C va uno
* Siguientes de D va fin de cadena y dos
*
* */
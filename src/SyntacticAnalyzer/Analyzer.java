package SyntacticAnalyzer;

import LexicalAnalizer.Token;

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
        //verify();
        analize();
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

        /*System.out.println("Primeros");
        for(String key : first.keySet()){
            System.out.print(key + ": ");
            for(String v : first.get(key)){
                System.out.print(v + " ");
            }
            System.out.println();
        }
        System.out.println("\n\n\n");*/

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

        /*System.out.println("Siguientes");
        for(String key : next.keySet()){
            System.out.print(key + ": ");
            for(String v : next.get(key)){
                System.out.print(v + " ");
            }
            System.out.println();
        }
        System.out.println("\n\n\n");*/

        for(String key : rules.keySet()){
            for(ProductionRule P : rules.get(key)){
                prediction(P);
            }
        }

        /*System.out.println("Prediccion");
        for(String key : rules.keySet()){
            for(ProductionRule P : rules.get(key)){
                System.out.print(P + "\t");
                for(String pred : P.prediction){
                    System.out.print(pred + ",");
                }
                System.out.println();
            }
        }
        System.out.println("\n\n\n");*/
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

    public void analize() throws IOException{
        LexicalAnalizer.Analyzer lexer =
                new LexicalAnalizer.Analyzer("Input/code.txt", "Input/description.txt");

        Stack<String> stack = new Stack<>();
        stack.add(rootVariable);

        Token actualToken = lexer.nextToken();
        String variable = rootVariable;

        while (lexer.hasNext() && !stack.empty()){
            variable = stack.pop();
            System.out.println(variable);
            if(variable.equals(RuleVariable.EPSILON.value))
                continue;
            if(rules.containsKey(variable)){
                //No Terminal
                for(ProductionRule P : rules.get(variable)){
                    if(P.getPrediction().contains(actualToken.tokenType)){
                        for(int i = P.variables.size()-1; i >= 0; i--){
                            stack.add(P.variables.get(i).value);
                        }
                        break;
                    }
                }
            }else{
                //Terminal
                if(!variable.equals(actualToken.tokenType)){

                    break;
                }
                actualToken = lexer.nextToken();
            }
        }

        while(!stack.empty()){ //Vacia la pila de todas la No terminales que no se pueden eliminar
            String variable2 = stack.pop();
            if(rules.containsKey(variable2)){
                boolean flag = false;
                for(ProductionRule P : rules.get(variable2)){
                    if(!P.variables.get(0).value.equals(RuleVariable.EPSILON.value)) flag = true;
                }
                if(!flag) break;
            }else break;
        }

        if(stack.empty() && !lexer.hasNext()){
            System.out.println("El analisis sintactico ha finalizado exitosamente.");
        }else{
            System.out.print("<" + actualToken.row + "," + actualToken.column + ">");
            System.out.println(" Error sintactico: se encontro: " + actualToken.lexeme + " ;");
            System.out.print("Se esperaba: ");

            if(rules.containsKey(variable)){
                HashSet<String> aux = new HashSet<>();
                for(ProductionRule P : rules.get(variable))
                    aux.addAll(P.getPrediction());
                for(String s : aux) System.out.print(s + ",");

            }else System.out.println(variable);

        }
    }

    public void verify(){
        for(String variable : rules.keySet()){
            for(ProductionRule P1 : rules.get(variable)){
                for(ProductionRule P2 : rules.get(variable)){
                    if(P2.equals(P1)) continue;
                    for(String pred : (HashSet<String>)P2.getPrediction()){
                        if(P1.getPrediction().contains(pred)){
                            System.out.print("La regla ");
                            System.out.print(P1);
                            System.out.print(" y la regla ");
                            System.out.print(P2);
                            System.out.print("tienen en comun la prediccion ");
                            System.out.println(pred);
                        }
                    }
                }
            }
        }
    }

    public void prediction(ProductionRule P){
        HashSet<String> aux = new HashSet<>();
        Primeros(aux, P.variables);
        if(aux.contains(RuleVariable.EPSILON.value)){
            aux.remove(RuleVariable.EPSILON.value);
            P.getPrediction().addAll(aux);
            P.getPrediction().addAll(next.get(P.head));
        }else {
            P.getPrediction().addAll(aux);
        }
    }

    public static void main(String[] args) throws IOException{
        Analyzer a = new Analyzer("Input/grammar.txt");
    }
}
package SyntacticAnalyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ProductionRule{

    public static HashSet<String> NoTerminals = new HashSet<>();

    protected String head;
    protected String production;
    protected ArrayList<RuleVariable> variables;
    protected HashMap<String, Integer> variablesString;
    protected HashSet<String> prediction;

    ProductionRule(String head, String production){
        this.head = head;
        this.production = production;
        this.variables = new ArrayList<>();
        this.variablesString = new HashMap<>();
        this.prediction = new HashSet<>();

        String[] variables = production.split(">");

        int i = 0; //Arreglar
        for(String var : variables){
            var = var.substring(1); //Elimina el simbolo <
            if(var.equals(RuleVariable.EPSILON.value)){
                this.variables.add(RuleVariable.EPSILON);
                this.variablesString.put(RuleVariable.EPSILON.value, 0);
                continue;
            }
            boolean status = !NoTerminals.contains(var);
            this.variables.add(new RuleVariable(var, status));
            this.variablesString.put(var, i++);
        }
    }

    public void addPrediction(HashSet<String> prediction){
        this.prediction.addAll(prediction);
    }

    public HashSet getPrediction(){
        return this.prediction;
    }

    @Override
    public String toString(){
        return head + " := " + production;
    }

    public static void main(String[] args) {
        ProductionRule.NoTerminals.add("a");
        for(RuleVariable s : new ProductionRule("S", "<a><hola><hola2><xD>").variables)
            System.out.println(s.value + " " + s.isTerminal);
    }
}

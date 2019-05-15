package SyntacticAnalyzer;

import java.util.ArrayList;
import java.util.HashSet;

public class ProductionRule {

    public static HashSet<String> NoTerminals = new HashSet<>();

    protected String head;
    protected String production;
    protected ArrayList<RuleVariable> variables;
    protected HashSet<RuleVariable> prediction;

    ProductionRule(String head, String production){
        this.head = head;
        this.production = production;
        this.variables = new ArrayList<>();
        this.prediction = new HashSet<>();

        String[] variables = production.split(">");

        for(String var : variables){
            var = var.substring(1); //Elimina el simbolo <
            if(var.equals(RuleVariable.EPSILON.value)){
                this.variables.add(RuleVariable.EPSILON);
                continue;
            }
            boolean status = !NoTerminals.contains(var);
            this.variables.add(new RuleVariable(var, status));
        }
    }

    public void addPrediction(RuleVariable prediction){
        this.prediction.add(prediction);
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

package SyntacticAnalyzer;

import java.util.ArrayList;
import java.util.HashSet;

public class ProductionRule {

    protected String head;
    protected String production;
    protected ArrayList<RuleVariable> variables;
    protected HashSet<RuleVariable> prediction;

    ProductionRule(String head, String production){
        this.head = head;
        this.production = production;
        this.variables = new ArrayList<>();
        this.prediction = new HashSet<>();

        StringBuilder builder = new StringBuilder();
        for(char c : production.toCharArray()){
            switch (c){
                case '<':
                    if(builder.length() > 0)
                        variables.add(new RuleVariable(builder.toString(), false));
                    builder = new StringBuilder();
                    break;

                case '>':
                    if(builder.toString().equals("#")) variables.add(RuleVariable.EPSILON);
                    else variables.add(new RuleVariable(builder.toString(), true));
                    builder = new StringBuilder();
                    break;

                default:
                    builder.append(c);
                    break;
            }
        }
        if(builder.length() > 0)
            variables.add(new RuleVariable(builder.toString(), false));
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
        for(RuleVariable s : new ProductionRule("S", "a<hola><hola2>xD").variables)
            System.out.println(s.value + " " + s.isTerminal);
    }
}

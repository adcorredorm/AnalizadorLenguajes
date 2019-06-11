package SyntacticAnalyzer;

public class RuleVariable {

    public static final RuleVariable EPSILON = new RuleVariable("#", true);
    public static final RuleVariable EOF = new RuleVariable("§", true);

    protected boolean isTerminal;
    protected String value;

    RuleVariable(String value, boolean isTerminal){
        this.value = value;
        this.isTerminal = isTerminal;
    }

    @Override
    public String toString(){
        return value;
    }


    @Override
    public boolean equals(Object obj){
        return value.equals(obj);
    }

}

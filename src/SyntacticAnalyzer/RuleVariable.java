package SyntacticAnalyzer;

public class RuleVariable {

    public static final RuleVariable EPSILON = new RuleVariable("#", true);
    public static final RuleVariable EOF = new RuleVariable("§", true);

    protected boolean isTerminal;
    protected boolean isRoot;
    protected String value;

    RuleVariable(String value, boolean isTerminal, boolean isRoot){
        this.value = value;
        this.isTerminal = isTerminal;
        this.isRoot = isRoot; //TODO: asignar el root
    }

    RuleVariable(String value, boolean isTerminal){
        this(value, isTerminal, false);
    }

    @Override
    public String toString(){
        return value;
    }

}

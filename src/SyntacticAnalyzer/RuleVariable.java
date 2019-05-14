package SyntacticAnalyzer;

public class RuleVariable {

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
}

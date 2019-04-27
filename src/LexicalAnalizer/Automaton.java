package LexicalAnalizer;

import java.util.HashMap;
import java.util.HashSet;

public class Automaton {

    private class State{
        boolean finalState;
        HashMap<Character, State> transitions;

        State(boolean value){
            this.finalState = value;
            this.transitions = new HashMap<>();
        }

        void addTransition(char value, State destination){
            transitions.put(value, destination);
        }

        void addTransition(String value, State destination){
            if(value.length() == 1) addTransition(value.charAt(0), destination);
            else{
                State intern = new State(false);
                transitions.put(value.charAt(0), intern);
                intern.addTransition(value.substring(1), destination);
            }
        }

        State nextState(char value){
            if(transitions.containsKey(value)) return transitions.get(value);
            else return null;
        }
    }

    public static final int ACCEPTED = 1;
    public static final int POSIBLE  = 0;
    public static final int REJECTED = -1;

    private HashMap<Integer, State> states;
    private State initialState;
    private HashSet<Character> validVariables;
    private HashSet<Character> validNumeric;

    public Automaton(){
        this.initialState = new State(false);
        this.validVariables = new HashSet<>();
        construct();
    }

    private void construct(){

        for(int i = 'a'; i <= 'z'; i++) validVariables.add((char)i);
        for(int i = 'A'; i <= 'Z'; i++) validVariables.add((char)i);
        validVariables.add('_');

        State varState = new State(true);
        initialState.addTransition('e', varState);
        varState.addTransition('e', varState);
        varState.addTransition('0', varState);

        State numState = new State(true);
        initialState.addTransition('0', numState);
        numState.addTransition('0', numState);

        State realState = new State(true);
        numState.addTransition(".0", realState);
        realState.addTransition('0', realState);

        State cintfState = new State(true);
        realState.addTransition("e+0", cintfState);
        numState.addTransition("e+0", cintfState);
        cintfState.addTransition('0', cintfState);

    }

    public int process(String target){
        int value = POSIBLE;
        State actualState = initialState;

        for(char c: target.toCharArray()){
            if(validVariables.contains(c)) c = 'e';
            if(Character.isDigit(c)) c = '0';

            actualState = actualState.nextState(c);
            if(actualState == null) return REJECTED;
        }
        if(actualState.finalState) value = ACCEPTED;

        return value;
    }

    public static void main(String[] args) {
        String s = "3.a";
        System.out.println(new Automaton().process(s));

    }
}

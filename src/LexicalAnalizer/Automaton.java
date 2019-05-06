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

    private State initialState;
    private HashSet<Character> validVariables;

    public Automaton(){
        this.initialState = new State(false);
        this.validVariables = new HashSet<>();
        construct();
    }

    private void construct(){

        for(int i = 'a'; i <= 'z'; i++) validVariables.add((char)i);
        for(int i = 'A'; i <= 'Z'; i++) validVariables.add((char)i);
        validVariables.add('_');
        validVariables.add('ñ');
        validVariables.add('Ñ');

        //Identificadores
        State varState = new State(true);
        initialState.addTransition('a', varState);
        varState.addTransition('a', varState);
        varState.addTransition('0', varState);

        //Numeros enteros
        State numState = new State(true);
        initialState.addTransition('0', numState);
        numState.addTransition('0', numState);

        //Numeros reales
        State realState = new State(true);
        numState.addTransition(".0", realState);
        realState.addTransition('0', realState);

        //Numeros en notacion cientifica
        State cintfState = new State(false);
        realState.addTransition('e', cintfState);
        numState.addTransition('e', cintfState);
        realState.addTransition('E', cintfState);
        numState.addTransition('E', cintfState);
        State signState = new State(false);
        cintfState.addTransition('+', signState);
        cintfState.addTransition('-', signState);
        State aprovalState = new State(true);
        cintfState.addTransition('0', aprovalState); //fix
        signState.addTransition('0', aprovalState);
        aprovalState.addTransition('0', aprovalState);

        //Cadenas empezadas con " (comilla doble)
        State strState = new State(false);
        initialState.addTransition('"', strState);
        strState.addTransition('a', strState);
        strState.addTransition('0', strState);
        strState.addTransition('*', strState);
        State scapeState = new State(false);
        strState.addTransition('\\', scapeState);
        scapeState.addTransition('*', strState);
        scapeState.addTransition('0', strState);
        scapeState.addTransition('a', strState);
        strState.addTransition('"', new State(true));

        //Cadenas empezadas con ' (comilla simple)
        State strState2 = new State(false);
        initialState.addTransition('\'', strState2);
        strState2.addTransition('a', strState2);
        strState2.addTransition('0', strState2);
        strState2.addTransition('*', strState2);
        State scapeState2 = new State(false);
        strState2.addTransition('\\', scapeState2);
        scapeState2.addTransition('*', strState2);
        scapeState2.addTransition('0', strState2);
        scapeState2.addTransition('a', strState2);
        strState2.addTransition('\'', new State(true));

    }

    public int process(String target){
        State actualState = initialState;

        for(char c: target.toCharArray()){
            if(actualState.nextState(c) != null) actualState = actualState.nextState(c);
            else{
                if(validVariables.contains(c)) c = 'a';
                else if(Character.isDigit(c)) c = '0';
                else c = '*';
                actualState = actualState.nextState(c);
            }
            if(actualState == null) return REJECTED;
        }
        if(actualState.finalState) return ACCEPTED;

        return POSIBLE;
    }

    public static void main(String[] args) {
        String s = "..";
        System.out.println(new Automaton().process(s));
    }
}

package SyntacticAnalyzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;

public class PredictionSet {

    HashMap<String, LinkedList<String>> set;

    PredictionSet() throws IOException{
        set = new HashMap<>();
        construct();
    }

    private void construct() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while(line != null){
            String[] rules = line.split(" := ");
            set.put(rules[0], new LinkedList<>());

            line = br.readLine();
        }
    }
}

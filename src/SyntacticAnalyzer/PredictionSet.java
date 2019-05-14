package SyntacticAnalyzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class PredictionSet {

    HashMap<String, LinkedList<ProductionRule>> rules;
    HashMap<String, HashSet<RuleVariable>> first, next;


    PredictionSet() throws IOException{

    }

    private void construct() throws IOException {

    }
}

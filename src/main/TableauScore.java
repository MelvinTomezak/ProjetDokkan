package main;

import java.util.ArrayList;
import java.util.Collections;

public class TableauScore {
    private ArrayList<Integer> scoreTableau = new ArrayList<Integer>();

    public void ajoutScore(int score){
        scoreTableau.add(score);
    }

    public int getMeilleurScore(){
        Collections.sort(scoreTableau);
        return scoreTableau.get(scoreTableau.size() - 1);
    }
}
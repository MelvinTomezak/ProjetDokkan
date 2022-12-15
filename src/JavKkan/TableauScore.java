package JavKkan;

import java.util.ArrayList;
import java.util.Collections;

public class TableauScore {
    private ArrayList<Integer> scoreTableau = new ArrayList<Integer>();

    /**
     * La fonction ajoutScore permet d'ajouter un score dans la list scoreTableau.
     * @param score
     */

    public void ajoutScore(int score){
        scoreTableau.add(score);
    }

    /**
     * getMeilleurScore permet de trier la liste pour afficher le meilleur score.
     * @return
     */
    public int getMeilleurScore(){
        Collections.sort(scoreTableau);
        return scoreTableau.get(scoreTableau.size() - 1);
    }
}
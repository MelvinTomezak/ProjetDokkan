package main;

import java.util.Random;

public class Combat {
    private Perso perso;
    private Mechant mechant;
    private String choix;
    private boolean choi;
    private String choixJoueur;

    private String choixMechant;

    public Combat(Perso perso, Mechant mechant) {
        this.perso = perso;
        this.mechant = mechant;
    }

    public void combatAttaqueJoueur() {
        if (choixJoueur == "Attaque"){
           mechant.setVie(mechant.getVie() - perso.getAttaque());
        }
        if (choixJoueur == "Defense"){
           if (choixMechant == "Attaque") {
               perso.setDefense(perso.getDefense() - mechant.getAttaque());
           }
           if (choixMechant == "Defense"){
               System.out.println("Vous défendez tout les deux");
           }
        }
    }
    public void ChoixDuMechant() {
        Random random = new Random();
        choi = random.nextBoolean();
        if (choi == true){
            setChoixMechant("Attaque");
        }
        if (choi == false) {
            setChoixMechant("Defense");
        }
        if (getChoixMechant() == "Attaque"){

        }
    }
    public Perso getPerso() {
        return perso;
    }

    public void setPerso(Perso perso) {
        this.perso = perso;
    }

    public Mechant getMechant() {
        return mechant;
    }

    public void setMechant(Mechant mechant) {
        this.mechant = mechant;
    }

    public String getChoix() {
        return choix;
    }

    public void setChoix(String choix) {
        this.choix = choix;
    }

    public String getChoixJoueur() {
        return choixJoueur;
    }

    public void setChoixJoueur(String choixJoueur) {
        this.choixJoueur = choixJoueur;
    }

    public String getChoixMechant() {
        return choixMechant;
    }

    public void setChoixMechant(String choixMechant) {
    this.choixMechant = choixMechant;
    }
}

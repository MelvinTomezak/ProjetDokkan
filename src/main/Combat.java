package main;

import java.util.Random;

public class Combat {
    private Perso perso;
    private Mechant mechant;
    private String choix;
    private int choi;
    private String choixJoueur;

    private String choixMechant;

    public Combat(Perso perso, Mechant mechant) {
        this.perso = perso;
        this.mechant = mechant;
    }

    public void combatAttaqueJoueur() {
        if (choixJoueur == "Attaque"){
            mechant.setVie(mechant.getVie() - perso.getAttaque());
            if (mechant.getVie() <=0) {
                System.out.println("Ta perdu L");
            }
        }
        if (choixJoueur == "defense"){
            perso.setDefense(perso.getDefense() - mechant.getAttaque());
        }
    }
    public void ChoixDuMechant() {

        if (choi == 0){
            choixMechant = ("Attaque");
            System.out.println("Attaque");
        }
        if (choi > 0) {
            choixMechant = ("Defense");
            System.out.println("Defense");
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

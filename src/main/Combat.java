package main;

import java.util.Random;

public class Combat {
    private Perso perso;
    private Mechant mechant;
    private String choix;
    private boolean choi;
    private String choixJoueur;

    private String choixMechant;
    private boolean combatTerminer = false;

    public Combat(Perso perso, Mechant mechant) {
        this.perso = perso;
        this.mechant = mechant;
    }

    public void combatJoueurMechant() {
        if (choixJoueur == "Attaque" && choixMechant == "Attaque"){
           mechant.setVie(mechant.getVie() - perso.getAttaque());
           System.out.println("Le mechant a maintenant " + mechant.getVie() + " de vie.");
           perso.setVie(perso.getVie() - mechant.getAttaque());
            System.out.println("Le mechant vous a attaquez, vous avez maintenant" + perso.getVie() + " de vie.");
        }
        if (choixJoueur == "Attaque" && choixMechant == "Defense"){
            mechant.setDefense(mechant.getDefense() - perso.getAttaque());
            System.out.println("Le mechant a maintenant " + mechant.getDefense() + " de defense.");
        }
        if (choixJoueur == "Defense" && choixMechant == "Attaque") {
            perso.setDefense(perso.getDefense() - mechant.getAttaque());
            System.out.println("Le mechant vous a diminuez votre defense, vous avez maintenant " + perso.getDefense() + " de defense.");
        }
        if (choixJoueur == "Defense" && choixMechant == "Defense") {
            System.out.println("Vous etes tout les deux en position de defense.");
        }
        if (perso.getDefense() <= 0) {
            System.out.println("vous n'avez plus de defense");
            perso.setVie(perso.getVie() - mechant.getAttaque());
        }
        if (mechant.getDefense() <= 0){
            System.out.println("Le mechant n'a plus de defense");
            mechant.setVie(mechant.getVie() - perso.getAttaque());
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

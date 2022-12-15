package SystèmeDeCombat;

import CreationPersonnage.Perso;

import java.util.Random;
import java.util.Scanner;

public class Combat  {
    private boolean combatTerminer;
    private Perso perso;
    private Mechant mechant;
    private String choix;
    private boolean choi;
    private String choixJoueur;
    private String choixMechant;
    private int MechantVaincue;

    private int RegenAttaque;

    private int RegenVie;

    private int RegenDefense;

    public Combat(Perso perso, Mechant mechant) {
        this.perso = perso;
        this.mechant = mechant;
    }
    public void CombatJoueurMechant () {
        System.out.println("Veuillez saisir soit Attaque soit Defense :");
        Scanner att = new Scanner(System.in);
        String str = att.nextLine().toLowerCase();
        this.choixJoueur = str;
        ChoixDuMechant();
        System.out.println(mechant.getNom() + " a choisi " + choixMechant);
        if (getChoixMechant().equals("defense") && getChoixJoueur().equals("defense")) {
                System.out.println("vous etes tout les deux en position de defense");
            }
        if (getMechant().equals("defense") && getChoixJoueur().equals("attaque")){
            System.out.println("Vous allez attaquez la defense du mechant");
            mechant.setDefense(mechant.getDefense() - perso.getAttaque());
            System.out.println("Il lui reste" + mechant.getDefense() + " de defense");
            if (mechant.getDefense() <= 0){
                System.out.println("La defense du mechant est brisee");
                mechant.setDefense(0);
                mechant.setVie(mechant.getVie() - perso.getAttaque());
            }
        }
        if (getChoixMechant().equals("attaque") && getChoixJoueur().equals("defense")) {
                System.out.println("Le mechant veut briser votre defense");
                perso.setDefense(perso.getDefense() - mechant.getAttaque());
                System.out.println("Il vous reste " + perso.getDefense() + " de defense");
                if (perso.getDefense() <= 0) {
                    System.out.println("Attention le mechant vous a brise votre defense, vous ne pouvez plus défendre");
                    perso.setDefense(0);
                    perso.setVie(perso.getVie() - mechant.getAttaque());
                    System.out.println("Il vous reste" + perso.getVie() + " de vie");
                }
            }
        if (getChoixJoueur().equals("attaque") && getChoixMechant().equals("attaque")) {
                System.out.println("Etant donner que le mechant attaque vous attaquez ces points de vie.");
                mechant.setVie(mechant.getVie() - perso.getAttaque());
                System.out.println("Il reste au mechant " + mechant.getVie() + " de vie");
            }
    }
    public void ChoixDuMechant() {
        Random random = new Random();
        choi = random.nextBoolean();
        if (choi == true){
            setChoixMechant("attaque");
        }
        if (choi == false) {
            setChoixMechant("defense");
        }
        if (mechant.getDefense() <= 0){
            setChoixMechant("attaque");
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

    public int getMechantVaincue() {
        return MechantVaincue;
    }

    public void setMechantVaincue(int mechantVaincue) {
        MechantVaincue = mechantVaincue;
    }

}
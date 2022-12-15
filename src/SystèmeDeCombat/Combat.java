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

    /**
     * Dans le constructeur combat nous definissons des éléments de la classe Perso et de la classe Mechant.
     * @param perso
     * @param mechant
     */
    public Combat(Perso perso, Mechant mechant) {
        this.perso = perso;
        this.mechant = mechant;
    }

    /**
     * Dans la fonction CombatJoueurMechant nous allons demander à l'utilisateur de choisir d'attaquer et de défendre
     * et en fonction de ce choix nous avons défini les actions sur la defense et l'attaque du Mechant.
     * De même pour le mechant nous appelons la fonction ChoixDuMechant pour obtenir le choix de l'action du mechant
     * et nous avons défini les actions en conséquence sur la defense et l'attaque du Perso.
     */
    public void CombatJoueurMechant () {
        System.out.println("Veuillez saisir soit Attaque soit Defense :");
        Scanner att = new Scanner(System.in);
        String str = att.nextLine().toLowerCase();
        this.choixJoueur = str;
        ChoixDuMechant();
        System.out.println("Le mechant a choisi " + choixMechant);
        if (getChoixMechant().equals("defense") && getChoixJoueur().equals("defense")) {
                System.out.println("vous etes tout les deux en position de defense");
            }
        if (getMechant().equals("defense") && getChoixJoueur().equals("attaque")){
            System.out.println("Vous allez attaquez la defense du mechant");
            mechant.setDefense(mechant.getDefense() - perso.getAttaque());
            System.out.println("Il lui reste" + mechant.getDefense() + " de defense");
            if (mechant.getDefense() <= 0){
                System.out.println("La defense du mechant est brisee");
                mechant.setVie(mechant.getVie() - perso.getAttaque());
                System.out.println("Il lui reste" + mechant.getVie() + " de vie");
            }
        }
        if (getChoixMechant().equals("attaque") && getChoixJoueur().equals("defense")) {
                System.out.println("Le mechant veut briser votre defense");
                perso.setDefense(perso.getDefense() - mechant.getAttaque());
                System.out.println("Il vous reste " + perso.getDefense() + " de defense");
                if (perso.getDefense() <= 0) {
                    System.out.println("Attention le mechant vous a brise votre defense, vous ne pouvez plus défendre");
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

    /**
     * La fonction ChoixDuMechant vas permettre d'effectuer un choix aléatoire pour l'action du mechant entre
     * (attaque et défense) mais elle aussi faire en sorte que s'il a plus de défense il ne puisse plus
     * effectuer ce choix.
     */
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
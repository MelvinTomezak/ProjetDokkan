package main;

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



    public void ChoixDuJoueur(){
        Scanner att = new Scanner(System.in);
        System.out.println("Veuillez saisir soit Attaque soit Defense :");
        String str = att.nextLine().toLowerCase();

        if (str.equals("defense")){
            setChoixJoueur(str);
        }
        if(getChoixJoueur().equals("defense")) {
            mechant.setDefense(mechant.getDefense() - perso.getDefense());
            System.out.println("youhou il lui reste au niveau de la def  : " + mechant.getDefense());
        }
        if (str.equals("attaque")) {
            setChoixJoueur(str);
            if (mechant.getDefense()<=0){
                System.out.println("Le mechant n'a plus de defense");
                mechant.setVie(mechant.getVie() - perso.getAttaque());
                System.out.println("youhou il lui reste : " + mechant.getVie());
            }
            else {
                System.out.println("Il faut diminuer sa défense avant");
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

        if(getChoixMechant().equals("defense")) {
            perso.setDefense(perso.getDefense() - mechant.getDefense());
            System.out.println("Il vous reste au niveau de la def  : " + perso.getDefense());
        }
        if (getChoixMechant().equals("attaque")) {
            if (perso.getDefense()<=0) {
                perso.setVie(perso.getVie() - mechant.getAttaque());
                System.out.println("Il vous reste au niveau de la vie : " + perso.getVie());
            }
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
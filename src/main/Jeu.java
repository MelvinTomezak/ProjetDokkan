package main;

import CreationPersonnage.Perso;
import SystèmeDeCombat.Combat;

import java.util.Scanner;

public class Jeu  {
    private boolean combatTerminer;
    private int MechantVaincue;
    private int RegenAttaque;
    private int RegenVie;
    private int RegenDefense;

    private int RegenAttaqueMechant;

    private int RegenVieMechant;

    private int RegenDefenseMechant;

    Perso perso = new Perso();
    Mechant mechant = new Mechant(5, 5, 5, "Freezer");
    Mechant mechantCell = new Mechant(15,15,15,"Cell");

    Combat combat = new Combat(perso, mechant);

    public Jeu() {

       for(int i = 0; i<2; ++i){
            combatUn();
        }

    }

    public void combatUn() {
        try {
            System.out.println("Attaque de " + perso.getAttaque() + " ,Defense de " + perso.getDefense() + " avec " + perso.getVie() + " hp ");
            System.out.println("Nom du Méchant " + mechant.getNom());
            System.out.println(" Le mechant a " + mechant.getVie() + " de vie " + " il a " + mechant.getDefense() + " de defense" + " et d'attaque" + mechant.getAttaque());

            RegenAttaque = perso.getAttaque();
            RegenDefense = perso.getDefense();
            RegenVie = perso.getVie();

            RegenAttaqueMechant = mechant.getAttaque();
            RegenDefenseMechant = mechant.getDefense();
            RegenVieMechant = mechant.getVie();

            while (perso.getVie() > 0 || mechant.getVie() > 0) {
                combat.ChoixDuMechant();
                System.out.println("Choix du mechant " + combat.getChoixMechant());
                combat.CombatJoueurMechant();

                if (perso.getVie() <= 0) {
                    System.out.println("vous avez perdu ZUHAHAHAHHAHAHA");
                    combatTerminer = false;
                    break;

                }
                if (mechant.getVie() <= 0) {
                    System.out.println("vous avez vaincu le méchant");
                    combatTerminer = true;
                    calculerScore();
                    Bonus();
                    regenMechant();
                    break;
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void calculerScore(){
        int score = perso.getVie() + MechantVaincue;
        System.out.println("Votre score est de : " + score);
    }

    public void Bonus(){
        if (combatTerminer == true) {
            MechantVaincue++;
            System.out.println("Felicitation vous avez vaincus le boss n° " + getMechantVaincue());
            perso.setVie(RegenVie);
            perso.setAttaque(RegenAttaque);
            perso.setDefense(RegenDefense);
            System.out.println("Vous obtenez une régeneration " + perso.getAttaque() +" , " + perso.getVie() +" , " + perso.getDefense());
            Scanner bonusjoueur = new Scanner(System.in);
            System.out.println("Vous pouvez maintenant choisir un bonus ");
            String bonus = bonusjoueur.nextLine();
            if (bonus.equals("Attaque") ){
                perso.setAttaque(perso.getAttaque() + 1);
                System.out.println("Vous avez maintenant " + perso.getAttaque() + " d'attaque");
            }
            if (bonus.equals("Defense")){
                perso.setDefense(perso.getDefense() + 1);
            }
            if (bonus.equals("Vie")){
                perso.setDefense(perso.getDefense() + 1);
            }
        }
    }
    public void regenMechant(){
        if (combatTerminer = true) {
            mechant.setVie(RegenVieMechant +1);
            mechant.setAttaque(RegenAttaqueMechant +1);
            mechant.setDefense(RegenDefenseMechant +1);
            System.out.println("Le mechant a "+ mechant.getVie()+ " , " + mechant.getDefense()+ " , "+ mechant.getAttaque());
        }
    }


    public int getMechantVaincue() {
        return MechantVaincue;
    }

    public void setMechantVaincue(int mechantVaincue) {
        MechantVaincue = mechantVaincue;
    }
}

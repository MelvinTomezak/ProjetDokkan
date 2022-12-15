package JavKkan;

import CreationPersonnage.Perso;
import SystèmeDeCombat.Combat;
import SystèmeDeCombat.Mechant;


import java.util.Scanner;

public class Jeu  {
    private boolean combatTerminer;
    private boolean JoueurPerdu = false;
    private int MechantVaincue;
    private int RegenAttaque;
    private int RegenVie;
    private int RegenDefense;

    private int RegenAttaqueMechant;

    private int RegenVieMechant;

    private int RegenDefenseMechant;


    Perso perso = new Perso();
    Mechant mechant = new Mechant(5, 5, 5, "Tao-Pai-Pai");
    Mechant mechant2 = new Mechant(10,10,10,"Piccolo Daimäo");
    Mechant mechant3 = new Mechant(15,15,15,"Raditz");
    Mechant mechant4 = new Mechant(20, 20, 20, "Nappa");
    Mechant mechant5 = new Mechant(30, 30, 30, "Vegeta");
    Mechant mechant6 = new Mechant(40,40,40,"Commando Ginyu");
    Mechant mechant7 = new Mechant(45,45,45,"Freezer");
    Mechant mechant8 = new Mechant(50,50,50,"C17");
    Mechant mechant9 = new Mechant(50,50,50,"C18");
    Mechant mechant10 = new Mechant(50,50,50,"Cell");
    Mechant mechant11 = new Mechant (55,55,55,"BUU");

    Combat combat = new Combat(perso, mechant);
    TableauScore tableauScore = new TableauScore();

    /**
     * Le constructeur Jeu va permettre de réaliser un certain nombre de combats grâce à la boucle for,
     * aussi de changer de méchant, également attribuer un score et d'afficher le meilleur score.
     */
    public Jeu() {

        for(int i = 0; i<100; ++i){
            combatUn();
        }
    }

    /**
     * La fonction combatUn va permettre de réaliser un combat entre le personnage et le méchant.
     * Si le joueur a 0 de vie alors le jeu prend fin ou si le méchant a 0 de vie appeler d'autres fonctions
     * qui vont permettre de soigner le joueur et d'augmenter les stats du méchant ainsi que possiblement
     * effectuer un changement.
     */
    public void combatUn() {
        try {
            combatTerminer = false;
            System.out.println("Nom du Méchant " + mechant.getNom());
            System.out.println("Le mechant a " + mechant.getVie() + " de vie " + " , " + mechant.getDefense() + " de defense" + " et d'attaque" + mechant.getAttaque());
            RegenAttaque = perso.getAttaque();
            RegenDefense = perso.getDefense();
            RegenVie = perso.getVie();
            RegenAttaqueMechant = mechant.getAttaque();
            RegenDefenseMechant = mechant.getDefense();
            RegenVieMechant = mechant.getVie();
            while (perso.getVie() > 0 || mechant.getVie()>0) {
                combat.CombatJoueurMechant();
                if (perso.getVie() <= 0) {
                    System.out.println("vous avez perdu dommage relancer une partie");
                    JoueurPerdu = true;
                    tableauScore.ajoutScore(calculerScore());
                    System.out.println("Le meilleur score est de : " + tableauScore.getMeilleurScore());
                    System.exit(1);
                }
                if (mechant.getVie() <= 0) {
                    System.out.println("vous avez vaincu le méchant");
                    combatTerminer = true;
                    calculerScore();
                    Bonus();
                    regenMechant();
                    TransformationMechant();
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int calculerScore(){
        int score = perso.getVie() + MechantVaincue;
        return score;
    }

    /**
     * La fonction Bonus va permettre si le combat est fini de rajouter un méchant battu au compteur,
     * regenerer le joueur et lui proposer une amélioration sur une de ces statistiques (attaque, defense, vie).
     */
    public void Bonus(){
        if (combatTerminer == true) {
            MechantVaincue++;
            System.out.println("Felicitation vous avez vaincus le boss n° " + getMechantVaincue());
            perso.setVie(RegenVie);
            perso.setAttaque(RegenAttaque);
            perso.setDefense(RegenDefense);
            System.out.println("Vous obtenez une régeneration de " + perso.getAttaque() +" d'attaque, " + perso.getVie() +" de vie et " + perso.getDefense() + " de defense");
            Scanner bonusjoueur = new Scanner(System.in);
            System.out.println("Vous pouvez maintenant choisir un bonus, Saisisser Attaque pour avoir +1 en attaque, Defense pour avoir +1 en defense et Vie pour avoir +1 de vie");
            String bonus = bonusjoueur.nextLine();
            if (bonus.equals("Attaque") ){
                perso.setAttaque(perso.getAttaque() + 1);
                System.out.println("Vous avez maintenant " + perso.getAttaque() + " d'attaque");
            }
            if (bonus.equals("Defense")){
                perso.setDefense(perso.getDefense() + 1);
                System.out.println("Vous avez maintenant " + perso.getDefense() + " de defense");
            }
            if (bonus.equals("Vie")){
                perso.setVie(perso.getVie() + 1);
                System.out.println("Vous avez maintenant " + perso.getVie() + " de vie");
            }
        }
    }

    /**
     * La fonction regenMechant vas permettre si le combat est fini de soigner le méchant, mais aussi de lui
     * donner +1 dans chaque statistique (attaque, defense, vie)
     */
    public void regenMechant(){
        if (combatTerminer = true) {
            mechant.setVie(RegenVieMechant +1);
            mechant.setAttaque(RegenAttaqueMechant +1);
            mechant.setDefense(RegenDefenseMechant +1);
            System.out.println("Le mechant a "  + mechant.getVie()+ " de Vie, " + mechant.getDefense()+ " de defense , "+ mechant.getAttaque() + "d'attaque");
        }
    }

    /**
     * La fonction TransformationMechant va permettre si le combat est fini d'avoir une chance de changer de méchant.
     */
    public void TransformationMechant() {
        if (combatTerminer == true) {
            if (MechantVaincue == 5) {
                mechant = mechant2;
            }
            if (MechantVaincue == 10) {
                mechant = mechant3;
            }
            if (MechantVaincue == 20) {
                mechant = mechant4;
            }
            if (MechantVaincue == 30) {
                mechant = mechant5;
            }
            if (MechantVaincue == 40) {
                mechant = mechant6;
            }
            if (MechantVaincue == 45) {
                mechant = mechant7;
            }
            if (MechantVaincue == 50) {
                mechant = mechant8;
            }
            if (MechantVaincue == 55) {
                mechant = mechant9;
            }
            if (MechantVaincue == 60) {
                mechant = mechant10;
            }
            if (MechantVaincue == 65) {
                mechant = mechant11;
            }
        }
    }
    public int getMechantVaincue() {
        return MechantVaincue;
    }

    public void setMechantVaincue(int mechantVaincue) {
        MechantVaincue = mechantVaincue;
    }
}

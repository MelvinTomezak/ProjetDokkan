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
                mechant.setNom("Daimao");
            }
            if (MechantVaincue == 10) {
                mechant.setNom("Raditz");
            }
            if (MechantVaincue == 20) {
                mechant.setNom("Nappa");
            }
            if (MechantVaincue == 30) {
                mechant.setNom("Vegeta");
            }
            if (MechantVaincue == 40) {
                mechant.setNom("CommandoGinyu");
            }
            if (MechantVaincue == 45) {
                mechant.setNom("Freezer");
            }
            if (MechantVaincue == 50) {
                mechant.setNom("C17");
            }
            if (MechantVaincue == 55) {
                mechant.setNom("C18");
            }
            if (MechantVaincue == 60) {
                mechant.setNom("Cell");
            }
            if (MechantVaincue == 65) {
                mechant.setNom("Buu");
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

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
    Mechant mechant = new Mechant(5, 5, 5, "Freezer");
    Mechant mechantCell = new Mechant(15,15,15,"Cell");

    Combat combat = new Combat(perso, mechant);
    TableauScore tableauScore = new TableauScore();

    /**
     * Le constructeur Jeu va permettre de réaliser un certain nombre de combats grâce à la boucle for,
     * aussi de changer de méchant, également attribuer un score et d'afficher le meilleur score.
     */
    public Jeu() {

        for(int i = 0; i<100; ++i){
            combatUn();
            TransformationMechant();
        }
        tableauScore.ajoutScore(calculerScore());
        System.out.println("Le meilleur score est de : " + tableauScore.getMeilleurScore());
    }

    /**
     * La fonction combatUn va permettre de réaliser un combat entre le personnage et le méchant.
     * Si le joueur a 0 de vie alors le jeu prend fin ou si le méchant a 0 de vie appeler d'autres fonctions
     * qui vont permettre de soigner le joueur et d'augmenter les stats du méchant ainsi que possiblement
     * effectuer un changement.
     */
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
            while (perso.getVie() > 0 || mechant.getVie()>0) {
                combat.CombatJoueurMechant();
                if (perso.getVie() <= 0) {
                    System.out.println("vous avez perdu ZUHAHAHAHHAHAHA");
                    JoueurPerdu = true;
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

    /**
     * La fonction regenMechant vas permettre si le combat est fini de soigner le méchant, mais aussi de lui
     * donner +1 dans chaque statistique (attaque, defense, vie)
     */
    public void regenMechant(){
        if (combatTerminer = true) {
            mechant.setVie(RegenVieMechant +1);
            mechant.setAttaque(RegenAttaqueMechant +1);
            mechant.setDefense(RegenDefenseMechant +1);
            System.out.println("Le mechant a "+ mechant.getVie()+ " , " + mechant.getDefense()+ " , "+ mechant.getAttaque());
        }
    }

    /**
     * La fonction TransformationMechant va permettre si le combat est fini d'avoir une chance de changer de méchant.
     */
    public void TransformationMechant(){
        if (getMechantVaincue() % 3 == 0){
            if (mechant.getNom().equals("Freezer")){
                mechant = mechantCell;
                System.out.println("Le mechant a changé, c'est maintenant Cell !");
                System.out.println("Attaque de " + mechant.getAttaque() + " ,Defense de " + mechant.getDefense() + " avec " + mechant.getVie() + " hp ");
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

package main;

import org.w3c.dom.ls.LSOutput;

public class Jeu {
    private boolean combatTerminer = false;
    private int MechantVaincue;
    private int RegenAttaque;
    private int RegenVie;
    private int RegenDefense;
    private String bonus;
    Perso perso = new Perso("Son Goku");
    Race race = Race.D;
    Type type = Type.Pui;
    Genre genre = Genre.MAL;
    Mechant mechant = new Mechant(5, 5, 5, "Freezer");
    Combat combat = new Combat(perso, mechant);

    public Jeu() {
        System.out.println("Nom du perso " + perso.getNom() + " de la race " + race.getRace() + " de type " + type.getType() + " et il est " + genre.getGenre());
        System.out.println("Attaque de " + perso.getAttaque() + " ,Defense de " + perso.getDefense() + " avec " + perso.getVie() + " hp ");
        System.out.println("Nom du Méchant " + mechant.getNom());
        System.out.println(" Le mechant a " + mechant.getVie() + " de vie " + " il a " + mechant.getDefense() + " de defense" + " et d'attaque" + mechant.getAttaque());
        RegenAttaque = perso.getAttaque();
        RegenDefense = perso.getDefense();
        RegenVie = perso.getVie();

        while (perso.getVie() > 0 || mechant.getVie() > 0) {
            combat.ChoixDuMechant();
            System.out.println("Choix du mechant " + combat.getChoixMechant());
            combat.setChoixJoueur("Attaque");
            System.out.println("Choix Joueur " + combat.getChoixJoueur());
            combat.combatJoueurMechant();
            if (perso.getVie() <= 0) {
                System.out.println("vous avez perdu ZUHAHAHAHHAHAHA");
                combatTerminer = true;
                break;
            }
            if (mechant.getVie() <= 0) {
                System.out.println("vous avez vaincu le méchant");
                combatTerminer = true;
                break;
            }
        }
        if (combatTerminer = true) {
            MechantVaincue = MechantVaincue +1;
            System.out.println("Felicitation vous avez vaincus le boss n° " + getMechantVaincue());
            perso.setVie(RegenVie);
            System.out.println("p" + perso.getVie());
            perso.setAttaque(RegenAttaque);
            perso.setDefense(RegenDefense);
            System.out.println("Vous obtenez une régeneration de " + perso.getAttaque() + " d'attaque , " + perso.getVie() + " de vie , " + perso.getDefense() + " de defense");
            System.out.println("Vous pouvez maintenant choisir un bonus ");
            bonus = "Attaque";
            if (bonus == "Attaque" ){
                perso.setAttaque(perso.getAttaque() + 1);
                System.out.println("Vous avez maintenant " + perso.getAttaque() + " d'attaque");
            }
            if (bonus == "Defense"){
                perso.setDefense(perso.getDefense() + 1);
                System.out.println("Vous avez maintenant " + perso.getDefense() + " de Defense");
            }
            if (bonus == "Vie"){
                perso.setDefense(perso.getDefense() + 1);
                System.out.println("Vous avez maintenant " + perso.getVie() + " de Vie");
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



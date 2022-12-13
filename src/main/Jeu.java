package main;

import org.w3c.dom.ls.LSOutput;

public class Jeu {
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


        while (perso.getVie() > 0 || mechant.getVie() > 0) {
            combat.ChoixDuMechant();
            System.out.println("Choix du mechant " + combat.getChoixMechant());
            combat.setChoixJoueur("Defense");
            combat.combatJoueurMechant();
            if (perso.getVie() <= 0){
                System.out.println("vous avez perdu ZUHAHAHAHHAHAHA");
                break;
            }
            if (mechant.getVie() <= 0) {
                System.out.println("vous avez vaincu le méchant");
                break;
            }

        }




    }
}



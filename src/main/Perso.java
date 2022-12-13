package main;

import java.util.Scanner;
public class Perso {
    private String nom;
    private int vie = 10;

    private int attaque = 10;

    private int defense = 10;

    public Perso(String nom) {
        this.nom = nom;
    }

    public void Race(Race choice) {
        Race race;
        switch (choice) {
            case A:
                race = Race.A;
            case B:
                race = Race.B;
            case C:
                race = Race.C;
            case D:
                race = Race.D;
            case E:
                race = Race.E;
        }
        System.out.println(choice);
    }
    public void Genre(Genre choix) {
        Genre genre;
        switch (choix){
            case MAL:
                genre = Genre.MAL;
                System.out.println("Vous êtes un personnage de type Masculin");
            case FEMME:
                genre = Genre.FEMME;
                System.out.println("Vous êtes un personnage de type Feminin");
        }
    }
    public void Type(Type choix) {
        Type type;
        switch (choix) {
            case Agi:
                type = Type.Agi;
                vie = 9;
                defense = 9;
                attaque = 12;
            case Pui:
                type = Type.Pui;
                vie = 8;
                defense = 11;
                attaque = 11;
            case Tech:
                type = Type.Tech;
                vie = 10;
                defense = 8;
                attaque = 12;
            case Int:
                type = Type.Int;
                vie = 10;
                defense = 10;
                attaque = 10;
            case End:
                type = Type.End;
                vie = 12;
                defense = 12;
                attaque = 6;
        }
    }

    public String getNom() {
        return nom;
    }
    public int getVie() {
        return this.vie;
    }

    public int getAttaque() {
        return this.attaque;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}

package main;

import java.util.Scanner;
public class Perso {
    private String nom;
    private String Attkspe;
    private String transformation;

    private int vie;

    private int attaque;

    private int defense;


    public Perso(String nom, String attkspe, String transformation, int vie, int attaque, int defense) {
        this.nom = nom;
        Attkspe = attkspe;
        this.transformation = transformation;
        this.vie = vie;
        this.attaque = attaque;
        this.defense = defense;
    }

    public String getNom() {
        return nom;
    }

    public String getAttkspe() {
        return Attkspe;
    }

    public void setAttkspe(String attkspe) {
        Attkspe = attkspe;
    }

    public String getTransformation() {
        return transformation;
    }

    public int getVie() {
        return vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setTransformation(String transformation) {
        this.transformation = transformation;
    }






}

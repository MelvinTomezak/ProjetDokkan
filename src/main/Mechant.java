package main;

public class Mechant {
    private int attaque = 5;
    private int defense = 5;
    private int vie = 5;
    private String nom;
    private String Transformation;
    private String Attkspe;

    public Mechant(int attaque, int defense, int vie, String nom) {
        this.attaque = attaque;
        this.defense = defense;
        this.vie = vie;
        this.nom = nom;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTransformation() {
        return Transformation;
    }

    public void setTransformation(String transformation) {
        Transformation = transformation;
    }

    public String getAttkspe() {
        return Attkspe;
    }

    public void setAttkspe(String attkspe) {
        Attkspe = attkspe;
    }
}

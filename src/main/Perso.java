package main;

import java.util.Scanner;
public class Perso {
    private String nom;
    private String Attkspe;
    private String transformation;

    Scanner saisienom = new Scanner(System.in);
    public Perso(String nom, String attkspe, String transformation) {

        this.nom = nom;
        this.Attkspe = attkspe;
        this.transformation = transformation;
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

    public void setTransformation(String transformation) {
        this.transformation = transformation;
    }
}

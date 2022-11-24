import java.util.Scanner;
public class Perso {
    private Scanner nom;
    private String Attkspe;
    private String transformation;
    Scanner saisienom = new Scanner(System.in);
    public Perso(String nom, String attkspe, String transformation) {
        System.out.println("Entrez un blaze");
        this.nom = saisienom;
        Attkspe = attkspe;
        this.transformation = transformation;
    }

    public Scanner getNom() {
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

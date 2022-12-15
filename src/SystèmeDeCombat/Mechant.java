package SystèmeDeCombat;

public class Mechant {
    private int attaque ;
    private int defense ;
    private int vie ;
    private String nom;

    /**
     * Le constructeur Mechant vas prendre en parametre une attaque, defense, vie et un nom qui vas nous permettre
     * de creer les différents mechants du jeu.
     * @param attaque
     * @param defense
     * @param vie
     * @param nom
     */
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
}

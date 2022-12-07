package main;

public class Combat extends Mechant {
    private int tour = 0;
    private int bossVaincue;
    private String choix;

    public Combat(int attaque, int defense, int vie, String nom, String transformation, String attkspe, int tour, int bossVaincue) {
        super(attaque, defense, vie, nom, transformation, attkspe);
        this.tour = tour;
        this.bossVaincue = bossVaincue;
    }
    public void combatTest() {
        if (choix == "Defense"){

        }
        if (choix == "Attaque"){

        }
        if (choix == "Vie"){

        }
    }
}

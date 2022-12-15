package CreationPersonnage;

import java.util.Scanner;
public class Perso {

    private int vie ;

    private int attaque ;

    private int defense ;

    public Perso() {
        Scanner sc= new Scanner(System.in);

        System.out.println("Choisissez un nom pour votre personnage : ");
        String nom = sc.nextLine();

        System.out.println("Choisissez votre race (A,B,C,D ou E) : ");
        Race raceChoisie = Race.valueOf(sc.nextLine());

        System.out.println("Choisissez votre genre (Masculin ou Feminin) : ");
        Genre genreChoisi = Genre.valueOf(sc.nextLine());

        System.out.println("Choisissez votre type (Agi, Pui, Tech, Int ou End) : ");
        Type typeChoisi = Type.valueOf(sc.nextLine());
        TypeChoix(typeChoisi);
        System.out.println(nom + " , " + raceChoisie.getRace()+ " , " + genreChoisi.getGenre()+ " , " + typeChoisi );
        System.out.println(getVie()+" , " +getDefense()+" , " +getAttaque());

    }

    public void Race(Race choice) {
        Race race;
        switch (choice) {
            case A -> race = Race.A;
            case B -> race = Race.B;
            case C -> race = Race.C;
            case D-> race = Race.D;
            case E-> race = Race.E;

        }
        System.out.println(choice);
    }
    public void Genre(Genre choi) {
        Genre genre;
        switch (choi){
            case M -> genre = Genre.M;
            case F -> genre = Genre.F;
        }
    }
    public void initializeType() {

    }
    public void TypeChoix(Type choix) {
        Type type;
        switch (choix) {
            case Agi:
                type = Type.Agi;
                vie=9;
                defense=9;
                attaque=9;
                break;
            case Pui:
                type = Type.Pui;
                vie = 8;
                defense = 11;
                attaque = 11;
                break;
            case Tech:
                type = Type.Tech;
                vie = 10;
                defense = 8;
                attaque = 12;
                break;
            case Int:
                type = Type.Int;
                vie = 10;
                defense = 10;
                attaque = 10;
                break;
            case End:
                type = Type.End;
                vie = 12;
                defense = 12;
                attaque = 6;
                break;
        }
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

package CreationPersonnage;

import java.util.Scanner;
public class Perso {

    private int vie ;

    private int attaque ;

    private int defense ;

    /**
     * Le constructeur perso va permettre à l'utilisateur de commencer le jeu en creeant son personnage
     * en choisissant un nom, une race de personnage, un genre ainsi qu'un type qui va lui procurer une
     * amélioration sur ses statistiques.
     */

    public Perso() {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Bienvenue dans JavKhan un jeu inspiré de l'univers de DragonBall");
        System.out.println("------------------------------------------------------------------------------");
        Scanner sc= new Scanner(System.in);

        System.out.println("Choisissez un nom pour votre personnage : ");
        String nom = sc.nextLine();

        System.out.println("Choisissez une race parmi Cyborg (Saisisser A), Majin (Saisisser B), Namek (Saisisser C), Saiyan (Saisisser D), Terrien(Saisisser E)");
        Race raceChoisie = Race.valueOf(sc.nextLine());
        System.out.println("Vous êtes désormais un " + raceChoisie.getRace());

        System.out.println("Choisissez votre genre (M pour Masculin et F pour Feminin) : ");
        Genre genreChoisi = Genre.valueOf(sc.nextLine());
        System.out.println("Vous êtes desormais du genre : " + genreChoisi.getGenre());
        System.out.println("Choisissez votre type (Agi, Pui, Tech, Int ou End) : ");
        Type typeChoisi = Type.valueOf(sc.nextLine());
        TypeChoix(typeChoisi);
        System.out.println("Vous avez choisi le type : " + typeChoisi.getType());
        System.out.println("Vous êtes " + nom + " , un " + raceChoisie.getRace()+ " , de genre " + genreChoisi.getGenre()+ " , et du type " + typeChoisi );
        System.out.println("Vous avez " + getAttaque() + " d'attaque, " + getDefense() + " de defense, " + getVie() + "de vie" );

    }

    /**
     * La fonction Race va prendre choice en paramètre, cette fonction vas permettre d'associer aux différentes
     * cases du switch des éléments de l'enum Race.
     * @param choice
     */
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

    /**
     * La fonction Genre va prendre choi en paramètre, cette fonction vas permettre d'associer aux
     * différentes cases du switch des éléments de l'enum Genre.
     * @param choi
     */
    public void Genre(Genre choi) {
        Genre genre;
        switch (choi){
            case M -> genre = Genre.M;
            case F -> genre = Genre.F;
        }
    }

    /**
     * La fonction TypeChoix va prendre choix en paramètre, cette fonction vas permettre d'associer aux différentes
     * cases du switch des éléments de l'enum Type et modifier les statistiques du personnage selon le choix du type.
     * @param choix
     */
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

package test;

import main.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.net.MalformedURLException;

public class TestPerso {
    Perso perso = new Perso();
    Mechant mechant = new Mechant(5, 5, 5, "Djib");
    Combat combat = new Combat(perso, mechant);
    Race race = Race.A;
    Type type = Type.Agi;

    @Test
    void onCreeUnPerso (){
        System.out.println("Votre nom est : " );
        System.out.println("Votre niveau de vie est de : " + perso.getVie());
        System.out.println("Vous avez un niveau d'attaque de : " + perso.getAttaque());
        System.out.println("Votre niveau de défense est de : " + perso.getDefense());
        System.out.println("Vous avez un niveau d'attaque de : " + perso.getAttaque());
        perso.Type(Type.Agi);
        System.out.println("Nouvelle valeur d'attaque : " + perso.getAttaque());
        System.out.println("Nouvelle valeur de défense :" + perso.getDefense());
        System.out.println("Nouvelle valeur de vie :" + perso.getVie());
    }
    @Test
    void ChoisirRace () {
        System.out.println("Race choisi : " + race.getRace());
    }
    @Test
    void ChoisirType () {
        perso.Type(Type.Agi);
        System.out.println("Type choisi : " + type.getType());
        System.out.println("ATTAQUE" + perso.getAttaque());
        System.out.println("defense" + perso.getVie());
        System.out.println("vie" + perso.getDefense());
    }
    @Test
    void TestChoixMechant(){
        System.out.println(combat.getChoixMechant());
    }
    @Test
    void TestCombatChoixJoueur() {
        combat.setChoixJoueur("Attaque");

    }
    @Test
    void TestChoixDuMechant() {
        combat.ChoixDuMechant();
        System.out.println(combat.getChoixMechant());
    }
}

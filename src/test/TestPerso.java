package test;

import main.Perso;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.net.MalformedURLException;

public class TestPerso {
    @Test
    void onCreeUnPerso (){
        Perso perso = new Perso("Moha", "KAMEHAMEHA", "SSJ1",100,50,76);
        System.out.println("Votre nom est : " + perso.getNom());
        System.out.println("Votre attaque speciale :" + perso.getAttkspe());
        System.out.println("Vous pouvez atteindre comme maximum : " + perso.getTransformation());
        System.out.println("Votre niveau de vie est de : " + perso.getVie());
        System.out.println("Vous avez un niveau d'attaque de : " + perso.getAttaque());
        System.out.println("Votre niveau de défense est de : " + perso.getDefense());
    }

}

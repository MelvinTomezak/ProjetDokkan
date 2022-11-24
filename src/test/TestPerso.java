package test;

import main.Perso;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.net.MalformedURLException;

public class TestPerso {
    @Test
    void oncreerunperso (){
        Perso perso = new Perso("Moha", "KAMEHAMEHA", "SSJ1");
        System.out.println("Votre nom est : " + perso.getNom());
        System.out.println("Votre attaque speciale :" + perso.getAttkspe());
        System.out.println("Vous pouvez atteindre comme maximum " + perso.getTransformation());
    }

}

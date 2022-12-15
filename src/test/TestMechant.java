package test;
import static org.junit.jupiter.api.Assertions.*;

import SystèmeDeCombat.Mechant;
import org.junit.jupiter.api.Test;

class TestMechant {

    /**
     * La fonction testGetAttaque permet de vérifier si l'attaque lors de la création du personnage est bien
     * initialisé
     */
    @Test
    void testGetAttaque() {
        Mechant mechant = new Mechant(50, 40, 100, "Nappa");
        assertEquals(50, mechant.getAttaque());
    }

    /**
     * La fonction testSetAttaque permet de vérifier si l'attaque qu'on a incrémenté est bien celle-ci
     */

    @Test
    void testSetAttaque() {
        Mechant mechant = new Mechant(50, 40, 100, "Nappa");
        mechant.setAttaque(60);
        assertEquals(60, mechant.getAttaque());
    }



    @Test
    void testGetDefense() {
        Mechant mechant = new Mechant(50, 40, 100, "Nappa");
        assertEquals(40, mechant.getDefense());
    }

    @Test
    void testSetDefense() {
        Mechant mechant = new Mechant(50, 40, 100, "Nappa");
        mechant.setDefense(60);
        assertEquals(60, mechant.getDefense());
    }

    @Test
    void testGetVie() {
        Mechant mechant = new Mechant(50, 40, 100, "Nappa");
        assertEquals(100, mechant.getVie());
    }

    @Test
    void testSetVie() {
        Mechant mechant = new Mechant(50, 40, 100, "Nappa");
        mechant.setVie(80);
        assertEquals(80, mechant.getVie());
    }

    @Test
    void testGetNom() {
        Mechant mechant = new Mechant(50, 40, 100, "Freezer");
        assertEquals("Goku", mechant.getNom());
    }

    @Test
    void testSetNom() {
        Mechant mechant = new Mechant(50, 40, 100, "Freezer");
        mechant.setNom("Vegeta");
        assertEquals("Vegeta", mechant.getNom());
    }



}
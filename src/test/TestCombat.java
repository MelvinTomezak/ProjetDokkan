package test;

import static org.junit.jupiter.api.Assertions.*;

import CreationPersonnage.Perso;
import SystèmeDeCombat.Combat;
import SystèmeDeCombat.Mechant;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;


class TestCombat {
    /**
     * La fonction testCombatJoueurMechant permet de bien vérifier le systeme du combat avec la creation du perso
     * et celle de l'ennemi ainsi que le déroulé de la confrontation
     */
    @Test
    void testCombatJoueurMechant() {
        String input = "Mohammed\nA\nM\nPui\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Perso perso = new Perso();
        Mechant mechant = new Mechant(5,5,5,"Buu");
        String inputAtt = "Attaque";
        ByteArrayInputStream inAtt = new ByteArrayInputStream(input.getBytes());
        System.setIn(inAtt);
        Combat combat = new Combat(perso,mechant);
        combat.CombatJoueurMechant();
        assertNotNull(combat.getChoixJoueur());
        assertNotNull(combat.getChoixMechant());

    }
    /**
     * La fonction testCombattestChoixDuMechant permet de tester le choix que fait l'ennemi lors du combat
     */
    @Test
    void testChoixDuMechant() {
        String input = "Mohammed\nC\nF\nAgi\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Perso perso = new Perso();
        Mechant mechant = new Mechant(10,5,5,"Super C17");
        Combat combat = new Combat(perso,mechant);

        combat.ChoixDuMechant();
        assertNotNull(combat.getChoixMechant());

    }


}
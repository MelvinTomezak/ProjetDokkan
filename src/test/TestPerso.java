package test;



import org.junit.jupiter.api.Test;
import CreationPersonnage.Perso;
import CreationPersonnage.Race;
import CreationPersonnage.Genre;
import CreationPersonnage.Type;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPerso {

    @Test
    public void testPerso(){
        String input = "Mohammed\nA\nM\nAgi\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Perso perso = new Perso();
        assertEquals(9, perso.getVie());
        assertEquals(9, perso.getAttaque());
        assertEquals(9, perso.getDefense());
    }


}








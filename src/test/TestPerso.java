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
    public void testPersoAgi(){
        String input = "Mohammed\nA\nM\nAgi\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Perso perso = new Perso();
        assertEquals(9, perso.getVie());
        assertEquals(9, perso.getAttaque());
        assertEquals(9, perso.getDefense());
    }
    @Test
    public void testPersoPui(){
        String input = "Mohammed\nA\nM\nPui\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Perso perso = new Perso();
        assertEquals(8, perso.getVie());
        assertEquals(11, perso.getAttaque());
        assertEquals(11, perso.getDefense());
    }

    @Test
    public void testPersoTech(){
        String input = "Mohammed\nA\nM\nTech\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Perso perso = new Perso();
        assertEquals(10, perso.getVie());
        assertEquals(12, perso.getAttaque());
        assertEquals(8, perso.getDefense());
    }

    @Test
    public void testPersoInt(){
        String input = "Mohammed\nA\nM\nInt\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Perso perso = new Perso();
        assertEquals(10, perso.getVie());
        assertEquals(10, perso.getAttaque());
        assertEquals(10, perso.getDefense());
    }

    @Test
    public void testPersoEnd(){
        String input = "Mohammed\nA\nM\nEnd\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Perso perso = new Perso();
        assertEquals(12, perso.getVie());
        assertEquals(6, perso.getAttaque());
        assertEquals(12, perso.getDefense());
    }
}








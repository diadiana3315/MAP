import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPb1 {

    private Pb1 pb1 = new Pb1();

    @Test
    public void testNichtAusreichend(){
        int[] notenListe = {54, 31, 63, 98, 92, 70, 65, 23, 34};
        int[] expected = {31, 23, 34};


        int[] resultArray = pb1.nichtAusreichend(notenListe);

        assertEquals(expected.length, resultArray.length);
        assertArrayEquals(expected, resultArray);
    }

    @Test
    public void testNichtAusreichendException(){
        int[] notenListe = {};
        assertThrows(IllegalArgumentException.class, () -> pb1.nichtAusreichend(notenListe));
    }

    @Test
    public void testDurchschnitt(){
        int[] notenList = {30, 50, 100};
        int expected = 60;

        int result = pb1.durchschnitt(notenList);
        assertEquals(expected, result);
    }

    @Test
    public void testDurchschnittException(){
        int[] notenListe = {};
        assertThrows(IllegalArgumentException.class, () -> pb1.durchschnitt(notenListe));
    }

    @Test
    public void testAbgerundet(){
        int[] notenListe = {54, 31, 63, 73, 98, 92, 70, 65, 23, 34};
        int[] expected = {55, 31, 65, 75, 100, 92, 70, 65, 23, 34};

        int[] result = pb1.abgerundet(notenListe);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testAbgerundetException(){
        int[] notenListe = {};
        assertThrows(IllegalArgumentException.class, () -> pb1.abgerundet(notenListe));
    }

    @Test
    public void testMaxAbgerundet(){
        int[] notenListe = {54, 31, 63, 73, 98, 92, 70, 65, 23, 34};
        int expected = 100;

        int result = pb1.maxAbgerundet(notenListe);

        assertEquals(expected, result);
    }

    @Test
    public void testMaxAbgerundetException(){
        int[] notenListe = {};
        assertThrows(IllegalArgumentException.class, () -> pb1.maxAbgerundet(notenListe));
    }

}


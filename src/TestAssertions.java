import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAssertions {

    public Pb1 note = new Pb1();

    @Test
    public void testNichtAusreichend(){
        int[] notenListe = {54, 31, 63, 98, 92, 70, 65, 23, 34};
        int[] expected = {31, 23, 34};


        int[] resultArray = note.nichtAusreichend(notenListe);

        assertEquals(expected.length, resultArray.length);
        assertArrayEquals(expected, resultArray);
    }

    @Test
    public void testDurchschnitt(){
        int[] notenList = {30, 50, 100};
        int expected = 60;

        int result = note.durchschnitt(notenList);
        assertEquals(expected, result);
    }

    @Test
    public void testAbgerundet(){
        int[] notenListe = {54, 31, 63, 73, 98, 92, 70, 65, 23, 34};
        int[] expected = {55, 31, 65, 75, 100, 92, 70, 65, 23, 34};

        int[] result = note.abgerundet(notenListe);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxAbgerundet(){
        int[] notenListe = {54, 31, 63, 73, 98, 92, 70, 65, 23, 34};
        int expected = 100;

        int result = note.maxAbgerundet(notenListe);

        assertEquals(expected, result);
    }

}

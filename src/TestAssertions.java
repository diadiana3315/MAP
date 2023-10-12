import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAssertions {

    @Test
    public void testNichtAusreichend(){
        int[] notenListe = {54, 31, 63, 98, 92, 70, 65, 23, 34};
        int[] expected = {31, 23, 34};

        Pb1 note = new Pb1();
        int[] resultArray = note.nichtAusreichend(notenListe);

        assertEquals(expected.length, resultArray.length);
        assertArrayEquals(expected, resultArray);


    }

}

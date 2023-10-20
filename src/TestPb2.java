import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPb2 {
    private Pb2 pb2 = new Pb2();

    @Test
    public void testMaxZahl(){
        int[] arr = {4, 8, 3, 10, 17};
        int expected = 17;
        int result = pb2.maxZahl(arr);

        assertEquals(expected, result);
    }

    @Test
    public void testMaxZahlException(){
        int[] notenListe = {};
        assertThrows(IllegalArgumentException.class, () -> pb2.maxZahl(notenListe));
    }

    @Test
    public void testMinZahl(){
        int[] arr = {4, 8, 3, 10, 17};
        int expected = 3;
        int result = pb2.minZahl(arr);

        assertEquals(expected, result);
    }

    @Test
    public void testMinZahlException(){
        int[] notenListe = {};
        assertThrows(IllegalArgumentException.class, () -> pb2.minZahl(notenListe));
    }

    @Test
    public void testMaxSumme(){
        int[] arr = {4, 8, 3, 10, 17};
        int expected = 39;
        int result = pb2.maxSumme(arr);

        assertEquals(expected, result);
    }

    @Test
    public void testMaxSummeException(){
        int[] notenListe = {};
        assertThrows(IllegalArgumentException.class, () -> pb2.maxSumme(notenListe));
    }

    @Test
    public void testMinSumme(){
        int[] arr = {4, 8, 3, 10, 17};
        int expected = 25;
        int result = pb2.minSumme(arr);

        assertEquals(expected, result);
    }

    @Test
    public void testMinSummeException(){
        int[] notenListe = {};
        assertThrows(IllegalArgumentException.class, () -> pb2.minSumme(notenListe));
    }

}

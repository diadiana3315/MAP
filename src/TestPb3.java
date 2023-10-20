import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPb3 {
    private Pb3 pb3 = new Pb3();
    @Test
    public void testSumme(){
        int[] arr1 = {5, 4, 0, 0, 0};
        int[] arr2 = {8, 7, 0, 0, 0};

        int [] expected = {1, 4, 1, 0, 0, 0};
        int [] result = pb3.summe(arr1, arr2);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testSummeException(){
        int[] arr1 = {};
        int[] arr2 = {};
        assertThrows(IllegalArgumentException.class, () -> pb3.summe(arr1, arr2));
    }



    @Test
    public void testDifferenz(){
        int[] arr1 = {8, 3, 0, 0, 0};
        int[] arr2 = {5, 4, 0, 0, 0};

        int [] expected = {2, 9, 0, 0, 0};
        int [] result = pb3.differenz(arr1, arr2);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testDifferenzException(){
        int[] arr1 = {};
        int[] arr2 = {};
        assertThrows(IllegalArgumentException.class, () -> pb3.differenz(arr1, arr2));
    }


    @Test
    public void testMultiplikation(){
        int[] arr1 = {2,3,6,0,0};
        int nr = 2;

        int [] expected = {4, 7, 2, 0, 0};
        int[] result = pb3.multiplikation(arr1, nr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testMultiplikationException(){
        int[] arr1 = {};
        int nr = 2;
        assertThrows(IllegalArgumentException.class, () -> pb3.multiplikation(arr1, nr));
    }

    @Test
    public void testDivision(){
        int[] arr1 = {2,3,6,0,0};
        int nr = 2;

        int [] expected = {1, 1, 8, 0, 0};
        int [] result = pb3.division(arr1, nr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testDivisionException(){
        int[] arr1 = {};
        int nr = 0;
        assertThrows(IllegalArgumentException.class, () -> pb3.division(arr1, nr));
    }

}

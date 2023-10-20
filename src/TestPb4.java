import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPb4 {
    private Pb4 pb4 = new Pb4();

    @Test
    public void testBilligste(){
        int[] arr1 = {40, 35, 70, 15, 45};

        int expected = 15;
        int result = pb4.billigste(arr1);
        assertEquals(expected, result);

    }
    @Test
    public void testBilligsteException(){
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> pb4.billigste(arr));
    }

    @Test
    public void testTeuersteGegenstand(){
        int[] arr1 = {40, 35, 70, 15, 45};
        int[] arr2 = {20, 15, 40, 15};

        int expected = 70;
        int result = pb4.teursteGegenstand(arr1, arr2);
        assertEquals(expected, result);

    }
    @Test
    public void testTeuersteGegenstandException(){
        int[] arr1 = {};
        int[] arr2 = {};
        assertThrows(IllegalArgumentException.class, () -> pb4.teursteGegenstand(arr1,arr2));
    }
    @Test
    public void testTeuersteUSB(){
        int[] arr1 = {40, 35, 70, 15, 45};
        int budget = 30;

        int expected = 15;
        int result = pb4.teuersteUSB(arr1, budget);
        assertEquals(expected, result);

    }

    @Test
    public void testTeuersteUSBException(){
        int[] arr1 = {};
        int budget = 30;
        assertThrows(IllegalArgumentException.class, () -> pb4.teuersteUSB(arr1, budget));
    }

    @Test
    public void testGeldbetrag(){
        int[] arr1 = {40, 35, 70, 15, 45};
        int[] arr2 = {8,12};
        int budget = 60;

        int expected = 57;
        int result = pb4.geldbetrag(arr1, arr2, budget);
        assertEquals(expected, result);

    }

    @Test
    public void testGeldbetragException(){
        int[] arr1 = {};
        int[] arr2 = {};
        int budget = 50;
        assertThrows(IllegalArgumentException.class, () -> pb4.geldbetrag(arr1, arr2, budget));
    }
}

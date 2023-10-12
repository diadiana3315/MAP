import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAssertions {

    public Pb1 pb1 = new Pb1();
    public Pb2 pb2 = new Pb2();
    public Pb3 pb3 = new Pb3();
    public Pb4 pb4 = new Pb4();

    @Test
    public void testNichtAusreichend(){
        int[] notenListe = {54, 31, 63, 98, 92, 70, 65, 23, 34};
        int[] expected = {31, 23, 34};


        int[] resultArray = pb1.nichtAusreichend(notenListe);

        assertEquals(expected.length, resultArray.length);
        assertArrayEquals(expected, resultArray);
    }

    @Test
    public void testDurchschnitt(){
        int[] notenList = {30, 50, 100};
        int expected = 60;

        int result = pb1.durchschnitt(notenList);
        assertEquals(expected, result);
    }

    @Test
    public void testAbgerundet(){
        int[] notenListe = {54, 31, 63, 73, 98, 92, 70, 65, 23, 34};
        int[] expected = {55, 31, 65, 75, 100, 92, 70, 65, 23, 34};

        int[] result = pb1.abgerundet(notenListe);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxAbgerundet(){
        int[] notenListe = {54, 31, 63, 73, 98, 92, 70, 65, 23, 34};
        int expected = 100;

        int result = pb1.maxAbgerundet(notenListe);

        assertEquals(expected, result);
    }

    @Test
    public void testMaxZahl(){
        int[] arr = {4, 8, 3, 10, 17};
        int expected = 17;
        int result = pb2.maxZahl(arr);

        assertEquals(expected, result);
    }

    @Test
    public void testMinZahl(){
        int[] arr = {4, 8, 3, 10, 17};
        int expected = 3;
        int result = pb2.minZahl(arr);

        assertEquals(expected, result);
    }

    @Test
    public void testMaxSumme(){
        int[] arr = {4, 8, 3, 10, 17};
        int expected = 39;
        int result = pb2.maxSumme(arr);

        assertEquals(expected, result);
    }

    @Test
    public void testMinSumme(){
        int[] arr = {4, 8, 3, 10, 17};
        int expected = 25;
        int result = pb2.minSumme(arr);

        assertEquals(expected, result);
    }

    @Test
    public void testSumme(){
        int[] arr1 = {5, 4, 0, 0, 0};
        int[] arr2 = {8, 7, 0, 0, 0};

        int [] expected = {1, 4, 1, 0, 0, 0};
        int [] result = pb3.summe(arr1, arr2);

        assertArrayEquals(expected, result);
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
    public void testMultiplikation(){
        int[] arr1 = {2,3,6,0,0};
        int nr = 2;

        int [] expected = {4, 7, 2, 0, 0};
        int[] result = pb3.multiplikation(arr1, nr);

        assertArrayEquals(expected, result);
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
    public void testBilligste(){
        int[] arr1 = {40, 35, 70, 15, 45};

        int expected = 15;
        int result = pb4.billigste(arr1);
        assertEquals(expected, result);

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
    public void testTeuersteUSB(){
        int[] arr1 = {40, 35, 70, 15, 45};
        int budget = 30;

        int expected = 15;
        int result = pb4.teuersteUSB(arr1, budget);
        assertEquals(expected, result);

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


}

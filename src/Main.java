
public class Main {


    public static void main(String[] args) {
        int[] notenListe = {54, 31, 63, 73, 98, 92, 70, 65, 23, 34};
        int[] noten = {5, 6, 10};

        Pb1 note = new Pb1();
        int[] resultArray = note.nichtAusreichend(notenListe);

        for (int j : resultArray) {
            if (j != 0)
                System.out.println(j);
        }

        System.out.println(note.durchschnitt(noten));



        int[] roundedGrades = note.abgerundet(notenListe);

        System.out.print("Rounded Grades: ");
        for (int roundedGrade : roundedGrades) {
            System.out.print(roundedGrade + " ");
        }

        int maxAbgerundeteNote = note.maxAbgerundet(notenListe);

        if (maxAbgerundeteNote >= 38) {
            System.out.println("Maximale abgerundete Note: " + maxAbgerundeteNote);
        } else {
            System.out.println("Keine ausreichende Note gefunden.");
        }

        int[] arr = {4, 8, 3, 10, 17};
        Pb2 number = new Pb2();
        System.out.println(number.maxZahl(arr));
        System.out.println(number.minZahl(arr));
        System.out.println(number.maxSumme(arr));
        System.out.println(number.minSumme(arr));

        int[] arr1 = {5, 4, 0, 0, 0};
        int[] arr2 = {8, 7, 0, 0, 0};

        Pb3 nr = new Pb3();
        int[] result = nr.summe(arr1, arr2);

        System.out.print("[");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
            if(i < result.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

        int[] arr3 = {8,3,0,0,0};
        int[] arr4 = {5,4,0,0,0};

        int[] resultDiff = nr.differenz(arr3, arr4);
        System.out.print("[");
        for(int i = 0; i < resultDiff.length; i++){
            System.out.print(resultDiff[i]);
            if(i < resultDiff.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

        int[] arr5 = {2,3,6,0,0};

        int[] resultMul = nr.multiplikation(arr5, 2);

        System.out.print("[");
        for(int i = 0; i < resultMul.length; i++){
            System.out.print(resultMul[i]);
            if(i < resultMul.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

        int[] arr6 = {2,3,6,0,0};

        int[] resultDiv = nr.division(arr6, 2);

        System.out.print("[");
        for(int i = 0; i < resultDiv.length; i++){
            System.out.print(resultDiv[i]);
            if(i < resultDiv.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

        System.out.println();

        Pb4 object = new Pb4();
        int[] arr7 = {40, 35, 70, 15, 45};
        int[] arr8 = {8,12};
        int[] arr9 = {20, 15, 40, 15};
        System.out.println(object.billigste(arr7));
        System.out.println(object.teursteGegenstand(arr7, arr9));
        System.out.println(object.teuersteUSB(arr7, 30));
        System.out.println(object.geldbetrag(arr7, arr8, 60));

    }
}

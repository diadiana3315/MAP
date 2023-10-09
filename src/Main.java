
public class Main {


    public static void main(String[] args) {
        int[] notenListe = {54, 31, 63, 73, 98, 92, 70, 65, 23, 34};
        int[] noten = {5, 6, 10};

        NichtAusreichend note = new NichtAusreichend();
        int[] resultArray = note.nichtAusreichend();

        for (int i = 0; i < note.newList.length; i++) {
            if (resultArray[i] != 0)
                System.out.println(resultArray[i]);
        }

        Durchschnittswert durchschnitt = new Durchschnittswert();
        System.out.println(durchschnitt.durchschnitt(noten));


        Abgerundet abgerundet = new Abgerundet();
        int[] roundedGrades = abgerundet.abgerundet(notenListe);

        // Print the rounded grades
        System.out.print("Rounded Grades: ");
        for (int i = 0; i < roundedGrades.length; i++) {
            System.out.print(roundedGrades[i] + " ");
        }

        int maxAbgerundeteNote = abgerundet.maxAbgerundet(notenListe);

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

    }
}

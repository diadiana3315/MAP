public class Pb1 {
    public int[] nichtAusreichend(int[] notenListe){
        if (notenListe.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }

        int[] newList = new int[notenListe.length];
        int j = 0;


        for (int k : notenListe) {
            if (k < 40) {
                newList[j] = k;
                j++;
            }
        }
        int[] resultList = new int[j];


        System.arraycopy(newList, 0, resultList, 0, j);
        return resultList;
    }

    public int durchschnitt(int[] notenListe){
        if (notenListe.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }

        int sum = 0;
        for (int j : notenListe) {
            sum = sum + j;
        }
        return sum/notenListe.length;
    }

    public int[] abgerundet(int[] notenListe) {
        if (notenListe.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }

        for (int i = 0; i < notenListe.length; i++) {
            if (notenListe[i] >= 38) {
                int remainder = notenListe[i] % 5;
                if (remainder < 3) {
                    notenListe[i] = notenListe[i];
                } else {
                    notenListe[i] = notenListe[i] + (5 - remainder);
                }
            }
        }
        return notenListe;
    }


    public int maxAbgerundet(int[] notenListe) {
        if (notenListe.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }

        int maxAbgerundeteNote = Integer.MIN_VALUE;
        for (int j : notenListe) {
            if (j >= 38) {
                int remainder = j % 5;
                int abgerundeteNote;
                if (remainder < 3) {
                    abgerundeteNote = j;
                } else {
                    abgerundeteNote = j + (5 - remainder);
                }

                if (abgerundeteNote > maxAbgerundeteNote) {
                    maxAbgerundeteNote = abgerundeteNote;
                }
            }

        }

        return maxAbgerundeteNote;
    }
}

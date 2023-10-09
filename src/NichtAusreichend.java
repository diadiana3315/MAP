public class NichtAusreichend {
    private int[] notenListe = {50,31,62,73,100,92,70,65, 23,34};
    public int[] newList = new int[notenListe.length];
    public int[] nichtAusreichend(){

        int j = 0;

        for (int k : notenListe) {
            if (k < 40) {
                newList[j] = k;
                j++;
            }
        }

        return newList;
    }
}


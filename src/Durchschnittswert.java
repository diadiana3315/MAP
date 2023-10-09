public class Durchschnittswert {


    public int durchschnitt(int[] notenListe){
        int sum = 0;
        for (int j : notenListe) {
            sum = sum + j;
        }
        return sum/notenListe.length;
    }

}

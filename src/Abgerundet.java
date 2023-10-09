public class Abgerundet {

    public int[] abgerundet(int[] notenListe) {
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
        int maxAbgerundeteNote = Integer.MIN_VALUE;
        for (int j : notenListe) {
            if (j >= 38) {
                int remainder = j % 5;
                int abgerundeteNote;
                if (remainder < 3) {
                    // Kein Runden erforderlich
                    abgerundeteNote = j;
                } else {
                    // Auf die nächste multiple von 5 aufrunden
                    abgerundeteNote = j + (5 - remainder);
                }

                // Maximale abgerundete Note aktualisieren, falls größer als die bisherige maximale Note
                if (abgerundeteNote > maxAbgerundeteNote) {
                    maxAbgerundeteNote = abgerundeteNote;
                }
            }
            // Für Noten kleiner als 38 ist kein Runden erforderlich
        }

        // Wenn alle Noten kleiner als 38 sind, wird Integer.MIN_VALUE zurückgegeben
        return maxAbgerundeteNote;
    }

}
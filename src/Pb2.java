import java.util.Arrays;
public class Pb2 {
    public int maxZahl(int[] arr) {
        int maxNr = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > maxNr) {
                maxNr = j;
            }
        }
        return maxNr;
    }

    public int minZahl(int[] arr){
        int minNr = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < minNr) {
                minNr = j;
            }
        }
        return minNr;
    }

    public int maxSumme(int[] arr){
        int sum = 0;

        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public int minSumme(int[] arr){
        int sum = 0;

        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++){
            sum = sum + arr[i];
        }
        return sum;

    }

}

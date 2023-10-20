public class Pb4 {
    public int billigste(int[] arr){
        if (arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }

        int minPrice = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < minPrice) {
                minPrice = j;
            }
        }
        return minPrice;
    }

    public int teursteGegenstand(int[] arr1, int[] arr2){
        if (arr1.length == 0 && arr2.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }
        int maxPrice1 = Integer.MIN_VALUE;
        int maxPrice2 = Integer.MIN_VALUE;
        for (int k : arr1) {
            if (k > maxPrice1) {
                maxPrice1 = k;
            }
        }
        for (int i : arr2) {
            if (i > maxPrice2) {
                maxPrice2 = i;
            }
        }
        if(maxPrice1 > maxPrice2){
            return maxPrice1;
        }
        else{
            return maxPrice2;
        }
    }

    public int teuersteUSB(int[] arr, int budget){
        if (arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }

        int maxPrice = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > maxPrice && j < budget) {
                maxPrice = j;
            }
        }
        return maxPrice;
    }

    public int geldbetrag(int[] arr1, int[] arr2, int budget){
        if (arr1.length == 0 && arr2.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }
        int maxPrice = Integer.MIN_VALUE;
        for (int k : arr1) {
            for (int i : arr2) {
                if (k + i > maxPrice && k + i < budget) {
                    maxPrice = k + i;
                }
            }
        }
        return maxPrice;
    }
}

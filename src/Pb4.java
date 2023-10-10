public class Pb4 {
    public int billigste(int[] arr){
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }
        }
        return minPrice;
    }

    public int teursteGegenstand(int[] arr1, int[] arr2){
        int maxPrice1 = Integer.MIN_VALUE;
        int maxPrice2 = Integer.MIN_VALUE;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] > maxPrice1){
                maxPrice1 = arr1[i];
            }
        }
        for(int j = 0; j < arr2.length; j++){
            if(arr2[j] > maxPrice2){
                maxPrice2 = arr2[j];
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
        int maxPrice = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxPrice && arr[i] < budget){
                maxPrice = arr[i];
            }
        }
        return maxPrice;
    }

    public int geldbetrag(int[] arr1, int[] arr2, int budget){
        int maxPrice = Integer.MIN_VALUE;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] + arr2[j] > maxPrice && arr1[i] + arr2[j] < budget){
                    maxPrice = arr1[i] + arr2[j];
                }
            }
        }
        return maxPrice;
    }
}

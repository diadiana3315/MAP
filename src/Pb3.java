public class Pb3 {
     public int[] summe(int[] arr1, int[] arr2){

          int[] sum = new int[arr1.length + 1];
          int carry = 0;

          for(int i = arr1.length - 1; i >= 0; i--){
               int digitSum = arr1[i] + arr2[i] + carry;
               sum[i+1] = digitSum % 10;
               carry = digitSum / 10;
          }

          sum[0] = carry;
          return sum;
     }

     public int[] differenz(int[] arr1, int[] arr2){
          int[] diff = new int[arr1.length];
          int borrow = 0;

          for(int i = arr1.length - 1; i >= 0; i--){
               int digitDiff = arr1[i] - arr2[i] - borrow;
               if(digitDiff < 0){
                    digitDiff += 10;
                    borrow = 1;
               }
               else{
                    borrow = 0;
               }
               diff[i] = digitDiff;
          }
          return diff;
     }
}

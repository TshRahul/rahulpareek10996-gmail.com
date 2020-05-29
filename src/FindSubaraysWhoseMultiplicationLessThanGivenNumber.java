import java.util.ArrayList;
import java.util.List;

public class FindSubaraysWhoseMultiplicationLessThanGivenNumber {
    public static void main(String[] args) {

        FindSubaraysWhoseMultiplicationLessThanGivenNumber find = new FindSubaraysWhoseMultiplicationLessThanGivenNumber();
        int arr[] = {4, 2, 5, 3, 6};
        int arr1[][] = find.findSubarrays(arr, 45);
        for(int i = 0; i<= arr1.length - 1; i++){
            for(int j = 0; j<= arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }


    private int[][] findSubarrays(int arr[], int val){
        if(arr.length == 0){
            return new int[][] {{0}};
        }


        int start = 0;
        int total_mul_till_now = arr[start];
        int finalArr[][] = new int[10][10];
        int k = 0;
        if(arr[start] < val){
            int new_arr[] = {arr[start]};
            finalArr[k++] = new_arr;
        }
        int end = 1;
        while (end < arr.length){
            total_mul_till_now = total_mul_till_now * arr[end];
            if(total_mul_till_now < val){
                if(arr[end] < val){
                    int new_arr[] = {arr[end]};
                    finalArr[k++] = new_arr;
                }
                int[] new_arr = new int[end - start + 1];
                for(int i = start; i <= end; i++){
                      new_arr[i] = arr[i];
                }
                finalArr[k++] = new_arr;
                end++;
            } else {
                while(total_mul_till_now >= val){
                    total_mul_till_now = total_mul_till_now / arr[start];
                    start++;
                }
                int[] new_arr = new int[end - start + 1];
                for(int i = start; i <= end; i++){
                    new_arr[i - start] = arr[i];
                }
                finalArr[k++] = new_arr;
                end++;
            }
        }

   return finalArr;

    }
}

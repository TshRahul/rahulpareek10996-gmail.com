package MustDos;

public class MaxSumSubArray {

    public static void main(String[] args) {

        MaxSumSubArray sum = new MaxSumSubArray();
        int arr[] = {-1, 1, -2, 2, 5, -11, 3, 10};
        int arr2[] = sum.findMaxSumSubArray(arr);
        for(int i = 0; i< arr2.length; i++){
            System.out.println(arr2[i]);
        }

    }

    private int[] findMaxSumSubArray(int arr[]){
        if(arr.length == 0){
            return new int[] {-1};
        }
        if(arr.length == 1){
            return new int[] {0};
        }

        int current_max = 0;
      //  int max_till_now = 0;
        int start = 0;
        int end = 0;
        for(int i = 0; i< arr.length; i++){
            if(current_max + arr[i] > arr[i]){
                current_max = current_max + arr[i];
                end = i;
            } else {
                current_max = arr[i];
                start = i;
                end = i;
            }

           // max_till_now = Math.max(current_max, max_till_now);
        }
     return new int[] {start, end};
    }
}

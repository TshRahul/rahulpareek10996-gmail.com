package MustDos;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {

        SubArrayWithGivenSum subarray = new SubArrayWithGivenSum();
        int[] arr = {-1, 5, -2, 4, 6, 8, 1};
        int[] result = subarray.findSubArrayWithGivenSum(arr, 8);
        for (int i = 0; i< result.length; i++){
            System.out.println(result[i]);
        }

    }

    private int[] findSubArrayWithGivenSum(int arr[], int sum){
        if(arr.length == 0){
            return new int[] {0};
        }

        int window_sum = 0;
        int start = 0;
        int end = 0;

        while(end < arr.length && start <= end){
            if(window_sum < sum){
                window_sum+= arr[end];
                end++;
            } else if(window_sum > sum){
                window_sum-= arr[start];
                start++;
            } else if(window_sum == sum){
                return new int[] {start, --end};
            }
        }
        return new int[] {-1};
    }
}

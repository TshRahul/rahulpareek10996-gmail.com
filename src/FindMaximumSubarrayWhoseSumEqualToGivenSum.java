import java.util.HashMap;
import java.util.Map;

public class FindMaximumSubarrayWhoseSumEqualToGivenSum {

    public static void main(String[] args) {
        int arr[] = {3, 2, 5, 5, 3, 2, 15, 1, 2, 3, 2, 2};
        FindMaximumSubarrayWhoseSumEqualToGivenSum findMax = new FindMaximumSubarrayWhoseSumEqualToGivenSum();
        int max_subarray = findMax.findMaxSubarray(arr, 10);
        System.out.println("The max subarray length is : " + max_subarray);


    }

    private int findMaxSubarray(int arr[], int sum){
        if(arr.length == 0){
            return -1;
        }
        int total_sum_till_now = 0;
        int end = 0;
        int max_size = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while(end <= arr.length - 1){

            total_sum_till_now = total_sum_till_now + arr[end];

            int x_sum = total_sum_till_now - sum;
            if(map.containsKey(x_sum)){
                max_size = Math.max(max_size, end - map.get(x_sum));
                map.put(total_sum_till_now, end);
                end++;
                continue;
            }
            if(x_sum == 0){
                max_size = end + 1;
            }
            map.put(total_sum_till_now, end);
            end++;
        }

        return max_size;
    }
}

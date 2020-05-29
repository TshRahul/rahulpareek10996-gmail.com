import java.util.HashMap;
import java.util.Map;

public class FindMinimumSubarrayWhoseSumEqualToGivenSum {

    public static void main(String[] args) {
        int arr[] = {3, 2, 5, 5, 3, 2, 15};

        FindMinimumSubarrayWhoseSumEqualToGivenSum find = new FindMinimumSubarrayWhoseSumEqualToGivenSum();
        int min_size_subarray = find.findMinSubarray(arr, 10);
        System.out.println("Min size is : " + min_size_subarray);

    }

    private int findMinSubarray(int arr[], int sum){
        if(arr.length == 0){
            return -1;
        }
        int total_sum_till_now = 0;
        int end = 0;
        int min_size = 0;
        Map<Integer, Integer> map = new HashMap<>();
         while(end <= arr.length - 1){

             total_sum_till_now = total_sum_till_now + arr[end];

             int x_sum = total_sum_till_now - sum;
             if(map.containsKey(x_sum)){
                 if(min_size > end - map.get(x_sum))
                 min_size = end - map.get(x_sum);

                 map.put(total_sum_till_now, end);
                 end++;
                 continue;
             }
             if(x_sum == 0){
                 min_size = end + 1;
             }
             map.put(total_sum_till_now, end);
             end++;
         }

         return min_size;
    }
}

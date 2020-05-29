import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTripletWhoseSumIsClosestToGivenSum {

    public static void main(String[] args) {

    }

    private List<Integer> findTriplet(int[] arr, int target_sum){
        List<Integer> list = new ArrayList<>();
        if(arr.length < 3){
            return list;
        }
        Arrays.sort(arr);
        int triplet_sum = 0;
        for(int i = 0; i< arr.length - 2; i++){
            int start = i + 1;
            int end = arr.length - 1;
            while (end > start){
                int new_start = start;
                int new_end = end;
                int sum = arr[i] + arr[start] + arr[end];
                if(sum < target_sum){
                    while (new_end > new_start){
                        int new_sum = arr[i] + arr[new_end] + arr[new_start];
                        int diff = target_sum - new_sum;



                    }
                }
            }
        }
        return list;
    }
}

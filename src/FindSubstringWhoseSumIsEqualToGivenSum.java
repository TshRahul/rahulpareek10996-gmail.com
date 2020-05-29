import java.util.HashMap;
import java.util.Map;

public class FindSubstringWhoseSumIsEqualToGivenSum {

    public static void main(String[] args) {
        int arr[] = {4, -2, -1, 5, -3, 8, 7};
        int sum = -1;
        FindSubstringWhoseSumIsEqualToGivenSum substring = new FindSubstringWhoseSumIsEqualToGivenSum();

        int[] sub = substring.findSubarray(arr, sum);
        if(sub.length == 1 && sub[0] == -1){
            System.out.println("There is no substring in the array whose sum is : " + sum);
        } else{
            System.out.println("Following substring has the sum : " + sum);
            for(int i = sub[0]; i <= sub[1]; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }

    private int[] findSubarray(int[] arr, int sum){
        if(arr.length == 0){
            return new int[] {-1};
        }

        int total_sum_till_given_index = 0;
        int start = 0 , end = 0;
        boolean ifSubstringFound = false;
        Map<Integer, Integer> map = new HashMap<>();

        while(end <= arr.length - 1){

            total_sum_till_given_index = total_sum_till_given_index + arr[end];
            int x_sum = total_sum_till_given_index - sum;
            if(map.containsKey(x_sum)){
                start = map.get(x_sum) + 1;
                ifSubstringFound = true;
                break;
            }
            map.put(total_sum_till_given_index, end);
            end++;
        }

        return ifSubstringFound ? new int[] {start, end} : new int[] {-1};
    }
}

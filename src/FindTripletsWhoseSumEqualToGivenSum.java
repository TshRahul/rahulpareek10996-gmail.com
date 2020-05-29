import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTripletsWhoseSumEqualToGivenSum {

    public static void main(String[] args) {

        FindTripletsWhoseSumEqualToGivenSum find = new FindTripletsWhoseSumEqualToGivenSum();
       int[] arr = {1, 2, -3, 4, -2, -1};
         List<List<Integer>> list = find.findTriplets(arr, 1);
        System.out.println("Number of triplets: " + list.size());
        System.out.println(list);
    }

    List<List<Integer>> findTriplets(int[] arr, int target_sum){
        List<List<Integer>> tripletsList = new ArrayList<>();
        if(arr.length < 3){
            return tripletsList;
        }

        Arrays.sort(arr);

        for(int i = 0; i<= arr.length - 3; i++){
            int start = i + 1;
            int end = arr.length - 1;
            int sum = target_sum - arr[i];
            while (end > start){
                List<Integer> list = new ArrayList<>();
                int pairSum = arr[end] + arr[start];
                if(pairSum == sum){
                    list.add(arr[i]);
                    list.add(arr[start]);
                    list.add(arr[end]);
                    tripletsList.add(list);
                    start++;
                    end--;
                } else if(pairSum < sum){

                    start++;
                } else{
                    end--;
                }

            }
        }
        return tripletsList;
    }
}

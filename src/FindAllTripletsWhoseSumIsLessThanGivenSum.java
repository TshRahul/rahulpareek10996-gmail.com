import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllTripletsWhoseSumIsLessThanGivenSum {

    public static void main(String[] args) {

        FindAllTripletsWhoseSumIsLessThanGivenSum find = new FindAllTripletsWhoseSumIsLessThanGivenSum();

        int[] arr = {1, 2, -3, 4, -2};

        System.out.println("Number of triplets: " + find.findAllTriplets(arr, 1).size());
        System.out.println("List of triplets: " + find.findAllTriplets(arr, 1));
    }

    private List<List<Integer>> findAllTriplets(int[] arr, int target_sum){
         List<List<Integer>> list = new ArrayList<>();
         if(arr.length < 3){
             return list;
         }
        Arrays.sort(arr);

         for(int i = 0; i< arr.length - 2; i++){
             int start = i + 1;
             int end = arr.length - 1;

             while (end > start){
                 int t = end;
                 int sum = arr[i] +  arr[start] + arr[end];
                 if(sum < target_sum){
                     while(start < t){
                         List<Integer> list2 = new ArrayList<>();
                         list2.add(arr[i]);
                         list2.add(arr[start]);
                         list2.add(arr[t]);
                         t--;
                         list.add(list2);
                     }
                     start++;
                 } else{
                     end--;
                 }

             }
         }
         return list;
    }
}

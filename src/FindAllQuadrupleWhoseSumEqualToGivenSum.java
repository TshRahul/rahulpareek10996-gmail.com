import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllQuadrupleWhoseSumEqualToGivenSum {

    public static void main(String[] args) {

        FindAllQuadrupleWhoseSumEqualToGivenSum find = new FindAllQuadrupleWhoseSumEqualToGivenSum();
        int arr[] = {1, 2, -3, 4, -2, -1, 3};
        List<List<Integer>> list = find.findAllQudruple(arr, 3);
        System.out.println("Number of quadruples are: " + list.size());
        System.out.println(list);

    }

    private List<List<Integer>> findAllQudruple(int arr[], int target_sum){
        List<List<Integer>> quadrupalList = new ArrayList<>();
        if(arr.length < 4){
            return quadrupalList;
        }
        Arrays.sort(arr);

        for(int i = 0; i<= arr.length - 4; i++){
            int first_sum = target_sum - arr[i];
            for(int j = i + 1; j <= arr.length - 3; j++){
                int start = j + 1;
                int end = arr.length - 1;
                int sum = first_sum - arr[j];
                while (end > start){
                    List<Integer> list = new ArrayList<>();
                    int pairSum = arr[end] + arr[start];
                    if(pairSum == sum){
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[start]);
                        list.add(arr[end]);
                        quadrupalList.add(list);
                        start++;
                        end--;
                    } else if(pairSum < sum){
                        start++;
                    } else{
                        end--;
                    }
                }
            }
        }

        return quadrupalList;
    }
}

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckIfPairExistsWhichMatchesTheSum {

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 1, 9};
        CheckIfPairExistsWhichMatchesTheSum exists = new CheckIfPairExistsWhichMatchesTheSum();
        boolean sumExists = exists.bruteForce(arr, 11);
        if(sumExists){
            System.out.println("There exists the pair in the array which adds to the given sum");
        } else{
            System.out.println("There does not exist the pair in the array which adds to the given sum");
        }

        boolean sumExists2 = exists.sortProperty(arr, 11);
        if(sumExists2){
            System.out.println("There exists the pair in the array which adds to the given sum");
        } else{
            System.out.println("There does not exist the pair in the array which adds to the given sum");
        }

        boolean sumExists3 = exists.hashingTechnique(arr, 11);
        if(sumExists3){
            System.out.println("There exists the pair in the array which adds to the given sum");
        } else{
            System.out.println("There does not exist the pair in the array which adds to the given sum");
        }

    }

    private boolean bruteForce(int[] arr, int sum){

        for(int i = 0; i<= arr.length - 1; i++){
            for(int j = i + 1; j <= arr.length - 1; j++){
                if(arr[i] + arr[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean sortProperty(int arr[], int val){
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length -1;
        while(start != end){
            if(arr[start] + arr[end] == val){
                return true;
            } else if(arr[start] + arr[end] > val){
                end--;
            } else {
                start++;
            }
        }

        return false;
    }

    private boolean hashingTechnique(int[] arr, int sum){
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<= arr.length - 1; i++){
            if(set.contains(sum - arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

}

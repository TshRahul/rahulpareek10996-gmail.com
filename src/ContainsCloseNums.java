import java.util.HashMap;
import java.util.Map;

public class ContainsCloseNums {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 5, 2};
        ContainsCloseNums contains = new ContainsCloseNums();
        /*if(contains.containsCloseNums(arr, 3)){
            System.out.println("The given array contains the close sum");
        } else {
            System.out.println("The given array does not contain the close sum");
        }*/

        if(contains.containsCloseSumEfficient(arr, 3)){
            System.out.println("The given array contains the close sum");
        } else {
            System.out.println("The given array does not contain the close sum");
        }

    }

    // Brute force solution - Worst case complexity = O(n^2)
    // Space complexity = O(1)
    private boolean containsCloseNums(int[] arr, int k){
        if(arr.length == 0 || arr.length == 1){
            return false;
        }

        for(int i = 0; i<= arr.length - 1; i++){
            for(int j = i + 1; j<= i+k; j++) {
                if (j > arr.length - 1) {
                    break;
                }
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // Using hash map -  Worst case complexity = O(n);
    // Space complexity = O(n)

    private boolean containsCloseSumEfficient(int[] arr, int k) {
        if(arr.length == 0 || arr.length == 1){
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<= arr.length - 1; i++){
            if(map.containsKey(arr[i])){
                if(i - map.get(arr[i]) <= k){
                    return true;
                }
            }
            map.put(arr[i], i);
        }
       return false;
    }
}

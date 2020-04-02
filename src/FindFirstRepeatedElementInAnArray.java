import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedElementInAnArray {

    public static void main(String[] args) {
        int arr[] = {2, 7, 4, 2, 3, 1, 7, 8, 10, 2, 44, 5, 7, 8, 9};

        int arr2[] = {2, 4, 5, 10, 11, 3, 1};

        FindFirstRepeatedElementInAnArray firstRepeated = new FindFirstRepeatedElementInAnArray();
        int element = firstRepeated.findFirstRepeatedElement(arr2);
        if(element != -1){
            System.out.println("The first repeating element in array is : " + element);
        } else {
            System.out.println("There is no repeating element in the array");
        }

    }

    private int findFirstRepeatedElement(int arr[]){
        Set<Integer> set = new HashSet<>();
        int firstRepeatedElement = -1;
        for(int i = arr.length - 1; i>= 0; i--){
            if(set.contains(arr[i])) {
                firstRepeatedElement = arr[i];
                continue;
            }
            set.add(arr[i]);
        }
        return firstRepeatedElement;
    }
}

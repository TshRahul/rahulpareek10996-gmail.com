import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoUnsortedArrays {
    private static int COUNT = 0;

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 6, 5, 8, 2, 10, 15, 12};
        int[] arr2 = {5, 6, 8, 9, 19, 10, 15, 9, 19, 10};

        UnionOfTwoUnsortedArrays union = new UnionOfTwoUnsortedArrays();
        int arr[] = union.getUnion(arr1, arr2);
        for(int i = 0; i<= COUNT - 1; i++){
            System.out.print(arr[i] + " ");
        }

    }

    private int[] getUnion(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        Set<Integer> set = new HashSet<>();
         int k = 0;
        for(int i = 0; i<= arr1.length - 1; i++){
            if(set.contains(arr1[i])){
                continue;
            }
            arr[k] = arr1[i];
            COUNT++;
            set.add(arr1[i]);
            k++;
        }
        for(int j = 0; j<= arr2.length - 1; j++){
            if(set.contains(arr2[j])) {
                continue;
            }
            arr[k] = arr2[j];
            COUNT++;
            set.add(arr2[j]);
            k++;
        }
        return arr;
    }
}

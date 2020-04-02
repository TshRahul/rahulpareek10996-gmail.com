import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoUnsortedArrays {
    private static int COUNT = 0;
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 6, 5, 8, 2, 10, 15, 12};
        int[] arr2 = {5, 6, 8, 9, 19, 10, 15, 9, 19, 10};
         IntersectionOfTwoUnsortedArrays intersection = new IntersectionOfTwoUnsortedArrays();
        Set<Integer> set = intersection.getIntersectioOfArrays(arr1, arr2);
        System.out.print(set);
    }

    private Set<Integer> getIntersectioOfArrays(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<= arr1.length - 1; i++){
           set.add(arr1[i]);
        }

        Set<Integer> finalSet = new HashSet<>();
        for(int j = 0; j<= arr2.length - 1; j++){
            if(set.contains(arr2[j])){
                finalSet.add(arr2[j]);
            }
        }
        return finalSet;

    }
}

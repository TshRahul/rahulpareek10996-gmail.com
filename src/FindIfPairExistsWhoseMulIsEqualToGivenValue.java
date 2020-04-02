import java.util.HashSet;
import java.util.Set;

public class FindIfPairExistsWhoseMulIsEqualToGivenValue {

    public static void main(String[] args) {
        int arr[] = {2, 4, 8, 5, 16};
        FindIfPairExistsWhoseMulIsEqualToGivenValue ifExists = new FindIfPairExistsWhoseMulIsEqualToGivenValue();
        boolean exists = ifExists.ifPairExists(arr, 32);
        if(exists){
            System.out.println("There exists the pair whose multiplication is the givenn value");
        } else {
            System.out.println("There does not exist the pair whose multiplication is the givenn value");
        }
     }

     private boolean ifPairExists(int[] arr, int val){
         Set<Integer> set = new HashSet<>();

         for(int i = 0; i <= arr.length - 1; i++){
             if(set.contains(val/arr[i])){
                 return true;
             }
             set.add(arr[i]);
         }

         return false;
     }
}

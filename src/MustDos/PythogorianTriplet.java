package MustDos;

import java.util.HashSet;
import java.util.Set;

public class PythogorianTriplet {

    public static void main(String[] args) {

        PythogorianTriplet triplet = new PythogorianTriplet();
        int arr[] = {3, 1, 15, 2, 5};
        boolean is_pythogorian_triplet_exists = triplet.pythogorianTriplets(arr);
        System.out.println(is_pythogorian_triplet_exists);

    }

    private boolean pythogorianTriplets(int arr[]) {
        if(arr.length < 3){
            return false;
        }

        for(int i = 0; i< arr.length; i++){
            Set<Integer> set = new HashSet<>();
            int c = arr[i] * arr[i];
            for(int j = 0; j< arr.length && j != i; j++){

                 if(set.contains(c - arr[j] * arr[j])){
                     return true;
                 }
                 set.add(arr[j] * arr[j]);
            }
        }

        return false;
    }
}

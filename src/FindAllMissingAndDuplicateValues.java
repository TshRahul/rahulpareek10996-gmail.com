import java.util.ArrayList;
import java.util.List;

public class FindAllMissingAndDuplicateValues {

    public static void main(String[] args) {

        FindAllMissingAndDuplicateValues find = new FindAllMissingAndDuplicateValues();
        int arr[] = {2, 6, 4, 4, 3, 2};
        // List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> list = find.findAllMissingAndDuplicates(arr);
        System.out.println("Missing: " + list.get(0));
        System.out.println("Duplicates: " + list.get(1));
    }

    private List<List<Integer>> findAllMissingAndDuplicates(int arr[]){
        if(arr.length <= 1) {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
         List<Integer> missing = new ArrayList<>();
        List<Integer> duplicates = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
//            if(arr[i] != i + 1){
//                int originalIndex = arr[i] - 1;
//                if(arr[i] == arr[originalIndex]){
//                    i++;
//                    continue;
//                }
//                int x = arr[i];
//                arr[i] = arr[originalIndex];
//                arr[originalIndex] = x;
//            } else {
//                i++;
//            }

            if(arr[i] != arr[arr[i] - 1]){
                int originalIndex = arr[i] - 1;
                int x = arr[i];
                arr[i] = arr[originalIndex];
                arr[originalIndex] = x;
            } else {
                i++;
            }
        }
        for(int j = 0; j< arr.length; j++){
            if(arr[j] != j + 1){
                missing.add(j + 1);
                duplicates.add(arr[j]);
            }
        }
        list.add(missing);
        list.add(duplicates);
     return list;

    }

}

public class FindCorruptPair {
    public static void main(String[] args) {

        FindCorruptPair find = new FindCorruptPair();
        int arr[] = {4, 3, 4, 5, 1};
        int[] arr2 = find.findCorruptPair(arr);
        int missing = arr2[0];
        int duplicate = arr2[1];
        if(missing == -1 && duplicate == -1){
            System.out.println("There is no corruption in the array");
        }
        else
            System.out.println("Missing number: " + missing + "; Duplicate number: " + duplicate);

    }

    private int[] findCorruptPair(int arr[]){
         if(arr.length == 0){
             return new int[] {-1, -1};
         }
         int i = 0;
         int duplicateNumber = -1;
         while(i < arr.length){
             if(arr[i] != i + 1){
                 int originalIndex =  arr[i] - 1;
                 if(arr[originalIndex] == arr[i]){
                     duplicateNumber = arr[i];
                     i++;
                     continue;
                 }
                 int x = arr[i];
                 arr[i] = arr[originalIndex];
                 arr[originalIndex] = x;
             } else{
                 i++;
             }
         }

         int j;
        int missingNumber = -1;
         for(j = 0; j < arr.length; j++){
             if(arr[j] != j + 1){
                 missingNumber = j + 1;
                 return new int[] {missingNumber, duplicateNumber};
             }
         }

        return new int[] {missingNumber, duplicateNumber};
    }
}

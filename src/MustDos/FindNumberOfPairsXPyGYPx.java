package MustDos;

public class FindNumberOfPairsXPyGYPx {

    public static void main(String[] args) {

        FindNumberOfPairsXPyGYPx find = new FindNumberOfPairsXPyGYPx();
        int arr1[] = {2, 1, 6};
        int arr2[] = {1, 5};
        System.out.println("Pair in which x^y > y^x, counts are: " + find.findPairs(arr1, arr2));

    }

    private int findPairs(int arr1[], int arr2[]){
        if(arr1.length == 0 && arr2.length == 0){
            return 0;
        }

        int count = 0;
        for(int i = 0; i< arr1.length; i++){
            for (int j = 0; j< arr2.length; j++){
                if(Math.pow(arr1[i], arr2[j]) > Math.pow(arr2[j], arr1[i])){
                    count++;
                }
                continue;
            }
        }

        return count;
    }
}

package MustDos;

public class FindMissingNumberInArray {

    public static void main(String[] args) {

        FindMissingNumberInArray findMessingNo = new FindMissingNumberInArray();
        int arr[] = {2, 6, 1, 5, 4, 3, 8};
        System.out.println("Missing number is: " + findMessingNo.missingNmber(arr, 8));

    }

    private int missingNmber(int arr[], int n){
        if(arr.length == 0){
            return 0;
        }
    int i = 0;
        while (i < arr.length){
            if(arr[i] != i + 1) {
                int correct_pos = arr[i] - 1;
                if (correct_pos > arr.length - 1) {
                    return i + 1;
                }

                int x = arr[correct_pos];
                arr[correct_pos] = arr[i];
                arr[i] = x;
            }
            else i++;
        }

        return -1;
    }
}

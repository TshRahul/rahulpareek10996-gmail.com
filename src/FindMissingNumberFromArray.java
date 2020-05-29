public class FindMissingNumberFromArray {

    public static void main(String[] args) {

        FindMissingNumberFromArray find = new FindMissingNumberFromArray();
        int arr[] = {3, 2, 4, 6, 1};
        int miss = find.findMissingNumber2(arr);
        if(miss == -1){
            System.out.println("There is no missing number in the array");
        } else{
            System.out.println("Missing number is: " + miss);
        }

    }

    private int findMissingNumber1(int arr[]){
        if(arr.length == 0){
            return -1;
        }

        int sumOfAllElements = ((arr.length + 1) * (arr.length + 2))/2;
        int sum = 0;
        for(int i = 0;i < arr.length; i++){
            sum = sum + arr[i];
        }
        if(sum == sumOfAllElements){
            return -1;
        }
        return sumOfAllElements - sum;

    }

    private int findMissingNumber2(int arr[]){
        if(arr.length == 0){
            return -1;
        }
        int i = 0;
        while(i < arr.length){
           if(arr[i] < arr.length && arr[i] != i + 1){
               int correctIndex = arr[i] - 1;
               int x = arr[i];
               arr[i] = arr[correctIndex];
               arr[correctIndex] = x;
           } else{
                i++;
            }
        }
        int j;
        for(j = 0; j< arr.length; j++ ){
            if(arr[j] != j + 1){
                return j + 1;
            }
        }
        return -1;
    }
}

public class FindMaximumSizesubarrayOfSizeK {

    public static void main(String[] args) {
        int arr[] = {3, 2, 5, 4, 1};
        int window_size = 3;
        FindMaximumSizesubarrayOfSizeK find = new FindMaximumSizesubarrayOfSizeK();

        int max_sum = find.findMaxSum(arr, window_size);
        if(max_sum != -1){
            System.out.println("The maximum sum of size : " + window_size + " is : " + max_sum);
        } else {
            System.out.println("The array is not proper");
        }

    }

    private int findMaxSum(int arr[], int k){
        int sum = 0;
        if(arr.length == 0 || k <= 0 || k > arr.length){
            return -1;
        }
        for(int i = 0; i<= k - 1; i++){
            sum = sum + arr[i];
        }

        int max = sum;
        int start = 0;
        for(int i = k; i< arr.length; i++){
            sum = sum + arr[i] - arr[start];
            if(sum > max){
                max = sum;
            }
            start++;
        }
        return max;
    }
}

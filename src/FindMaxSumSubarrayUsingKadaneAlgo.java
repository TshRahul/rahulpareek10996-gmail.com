public class FindMaxSumSubarrayUsingKadaneAlgo {

    public static void main(String[] args) {
        int arr[] = {3, 4, -1, 2, 8, -6, -5};

        FindMaxSumSubarrayUsingKadaneAlgo maxSum = new FindMaxSumSubarrayUsingKadaneAlgo();
        int max = maxSum.findMaxSumUsingKadaneAlgorithm(arr);
        System.out.println("The maximum sum of the subarray is : " + max);

    }

    private int findMaxSumUsingKadaneAlgorithm(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int sum = 0;
        int max_sum = 0;
        boolean isPositiveExists = false;
        for(int i = 0; i<= arr.length - 1; i++){
            if(arr[i] > 0){
                isPositiveExists = true;
                break;
            }
            max_sum = Math.max(max_sum, arr[i]);
        }

        if(isPositiveExists){
                    for(int i = 0; i<= arr.length - 1; i++){
                        sum = sum + arr[i];
                        if(sum < 0){
                            sum = 0;
                            continue;
                        }
                        max_sum = Math.max(sum, max_sum);

                    }
        }
        return max_sum;
    }
}

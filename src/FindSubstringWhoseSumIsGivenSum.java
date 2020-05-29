public class FindSubstringWhoseSumIsGivenSum {

    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 5, 8, 7, 9};
        int sum = 10;

        FindSubstringWhoseSumIsGivenSum find = new FindSubstringWhoseSumIsGivenSum();
        int[] indexes = find.findSubstring(arr, sum);
        if(indexes.length == 1 && indexes[0] == -1){
            System.out.println("Sum not found in array");
        } else {
            System.out.println("The sum of the substring is sum from index : " + indexes[0] + " to index : " + indexes[1]);

        }

    }

    private int[] findSubstring(int[] arr, int sum){
        int start = 0;
        int end = 0;
        int windowSum = arr[0];
        boolean isSumFound = false;
        while(start <= arr.length - 1 && end <= arr.length - 1){
             if(windowSum == sum){
                 isSumFound = true;
                 break;
             } else if(windowSum < sum){
                 end++;
                 if(end == arr.length)
                     break;
                windowSum = windowSum + arr[end];

            } else if(windowSum > sum){
                  windowSum = windowSum - arr[start];
                  start++;
            }
        }
        if(isSumFound){
            return new int[]{start, end};
        } else {
            return new int[]{-1};
        }
    }
}

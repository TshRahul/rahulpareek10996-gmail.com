package MustDos;

public class FindEquilibriumPoint {

    public static void main(String[] args) {

        FindEquilibriumPoint find = new FindEquilibriumPoint();
        int arr[] = {7, 4, 5, 8, 3};
        System.out.println("Equilibrium Point is: " + find.findEquilib(arr));

    }

    private int finfEquilibriumPoint(int arr[]) {
        if(arr.length == 0 || arr.length == 1 || arr.length == 2){
            return -1;
        }

        int sum_of_array = 0;
        for(int i = 0; i< arr.length; i++){
            sum_of_array = sum_of_array + arr[i];
        }

        int left_sum = 0;

        for(int i = 0; i < arr.length; i++){
                if((sum_of_array - arr[i])/2 == left_sum){
                    return i;
                }
                left_sum = left_sum + arr[i];
        }

        return -1;

    }

    private int findEquilib(int[] arr) {
        if(arr.length == 0 || arr.length == 1 || arr.length == 2){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int left_sum = arr[start];
        int right_sum = arr[end];
        while (start < end){

            if(left_sum > right_sum){
                end--;
                right_sum = right_sum + arr[end];
            } else {
                start++;
                left_sum = left_sum + arr[start];
            }
        }

        if(start == end && left_sum == right_sum){
            return start;
        }
        return -1;
    }
}

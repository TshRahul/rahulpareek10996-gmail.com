public class FindMAxMultiplicationSubArray {

    public static void main(String[] args) {
        int arr[] = {-2, 0, -1};

        FindMAxMultiplicationSubArray find = new FindMAxMultiplicationSubArray();
        System.out.println(find.maxMultiplication(arr));
    }

    private int maxMultiplication(int arr[]){
        if(arr.length == 0){
            return -1;
        }
        if(arr.length == 1){
            return arr[0];
        }
        int current_max = arr[0];
        int max_so_far = arr[0];
        for(int i = 1; i<= arr.length - 1; i++){
            current_max = Math.max(current_max * arr[i], arr[i]);
            max_so_far = Math.max(current_max, max_so_far);
        }
        return max_so_far;
    }
}

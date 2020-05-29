public class SubarrayProductLessThanK {

    public static void main(String[] args) {

        int[] arr = {5, 7, 2, 3, 6, 8};
        SubarrayProductLessThanK product = new SubarrayProductLessThanK();
        System.out.println(product.subArrayProductLessThanK(arr, 100));

    }

    private int subArrayProductLessThanK(int arr[], int k){
        if(arr.length == 0){
            return 0;
        }
        int start = 0;
        int end = 1;
        int mul_so_far = 1;
        int count = 0;
        if(arr[start] < k){
            count++;
        }

        while (start < end){
            if(end ==  arr.length - 1){
                mul_so_far = mul_so_far/arr[start];
                if(mul_so_far < k){
                    count++;
                    start++;
                } else {
                    start++;
                }
                continue;
            }
            if(mul_so_far * arr[end] < k){
                mul_so_far = mul_so_far * arr[end];
                count ++;
                end++;
                if(arr[end] < k){
                    count++;
                }
            } else {
                mul_so_far = mul_so_far/arr[start];
                if(mul_so_far < k){
                    count++;
                    end++;
                    if(arr[end] < k){
                        count++;
                    }
                }
                start++;
            }

        }
    return count;
    }
}

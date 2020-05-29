public class ProductOfArrayExceptSelf {


    public static void main(String[] args) {

        ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();
        int arr[] = product.productOfArrayExceptSelf(new int[]{5, 10, 15, 2});
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] +  " ");
        }

    }

    private int[] productOfArrayExceptSelf(int[] arr){
         if(arr.length == 0){
             return new int[] {-1};
         }

         int finalArray[] = new int[arr.length];
         finalArray[0] = 1;
         int mul_till_now = 1;
         int k = 1;
         for(int i = 1; i< arr.length; i++){
               mul_till_now*=arr[i - 1];
               finalArray[k++] = mul_till_now;
         }

         int rev_mul = arr[arr.length - 1];
         for(int i = finalArray.length - 2; i >=0; i--){
                  finalArray[i] = finalArray[i] * rev_mul;
                  rev_mul*=arr[i];

         }

         return finalArray;
    }
}
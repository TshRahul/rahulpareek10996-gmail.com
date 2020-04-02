public class LargestContigiousSumSubaray {

    public static void main(String args[]){
         int a[] = {-3, -4, 4, -1, -2, 1, 5, -3};

         int current_max = a[0];
         int max_so_far = a[0];
         for(int i = 1; i <= a.length - 1; i++){
             current_max = Math.max(current_max + a[i], a[i]);
             max_so_far = Math.max(current_max, max_so_far);
         }
        System.out.println("The max sum subarray int the given array is : " + max_so_far);

    }

}

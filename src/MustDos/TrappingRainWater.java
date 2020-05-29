package MustDos;

public class TrappingRainWater {

    public static void main(String[] args) {

        TrappingRainWater trap = new TrappingRainWater();
        int arr[] = {1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
       // int arr[] = {1, 2, 3};
        int waterCanBeReserved = trap.findWaterTrapped(arr);
        System.out.println( waterCanBeReserved + " ltrs water can be reserved when rain comes");

    }

    private int trappWater(int arr[]){
        if(arr.length <= 2){
            return 0;
        }

        int max_boundry_till_now = arr[0];
        int trapped_water = 0;
        for(int i = 1; i< arr.length - 1; i++){
            if(arr[i] > max_boundry_till_now){
                max_boundry_till_now = arr[i];
                continue;
            }
            int max_in_right = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] >= max_boundry_till_now){
                    trapped_water = trapped_water + max_boundry_till_now - arr[i];
                    break;
                } else if(max_in_right < arr[j]) {
                      max_in_right = arr[j];
                }
                if(j == arr.length - 1){
                    trapped_water = trapped_water + max_in_right - arr[i];
                }
            }
        }

        return trapped_water;
    }

    private int findWaterTrapped(int[] arr){
        if(arr.length <= 2){
            return 0;
        }

        int max_in_left = 0;
        int left_arr[] = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max_in_left){
                max_in_left = arr[i];
            }
            left_arr[i] = max_in_left;
        }

        int max_in_right = 0;
        int right_arr[] = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] > max_in_right){
                max_in_right = arr[i];
            }
            right_arr[i] = max_in_right;
        }

        int trapped_water = 0;
        for(int i = 0; i< arr.length; i++){
            trapped_water = trapped_water + Math.min(left_arr[i], right_arr[i]) - arr[i];
        }
       return trapped_water;
    }
}

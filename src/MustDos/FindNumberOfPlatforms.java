package MustDos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindNumberOfPlatforms {

    public static void main(String[] args) {

        FindNumberOfPlatforms findPlatforms = new FindNumberOfPlatforms();
        int arr[] = {900, 1800, 940, 950, 1100, 1500, 910, 1200, 1120, 1130, 1900, 2000};
        System.out.println("No of  Platforms: " + findPlatforms.noOfPlatforms(arr));
    }

    private int noOfPlatforms(int arr[]){
        if(arr.length == 0){
            return 0;
        }

        if(arr.length == 1) {
            return 1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int no_of_platforms = 1;
        map.put(arr[0], arr[1]);

        for(int i = 2; i < arr.length; i+=2){

            Set<Map.Entry<Integer,Integer>> s = map.entrySet();
           boolean is_platform_present = false;
            for(Map.Entry<Integer, Integer> entry : s){
                if(!((arr[i] == entry.getKey()) || (arr[i] > entry.getKey() && arr[i] <= entry.getValue()) || (arr[i + 1] == entry.getKey())
                || (arr[i + 1] > entry.getKey() && arr[i + 1] <= entry.getValue()) || ((arr[i] < entry.getKey() && entry.getValue() < arr[i + 1])))){
                    is_platform_present = true;
                    break;
                }
            }
            if(!is_platform_present){
                no_of_platforms++;
            }
            map.put(arr[i], arr[i+1]);
        }
        return no_of_platforms;
    }
}

package MustDos;

import java.util.ArrayList;
import java.util.List;

public class FindLeaderInArray {

    public static void main(String[] args) {

        int[] arr = {16, 17, 5, 4, 3, 5, 2};
        FindLeaderInArray find = new FindLeaderInArray();
        System.out.println("Leaders: " + find.findLeaders(arr));

    }

    private List<Integer> findLeaders(int[] arr){
        List<Integer> list = new ArrayList<>();
        if(arr.length == 0){
            return list;
        }

        if(arr.length == 1){
            list.add(arr[0]);
            return list;
        }

        int max_in_right = 0;

        for(int i = arr.length - 1; i>= 0; i--){
                 if(arr[i] >= max_in_right) {
                     list.add(arr[i]);
                     max_in_right = arr[i];
                 }
        }
        return list;

    }
}

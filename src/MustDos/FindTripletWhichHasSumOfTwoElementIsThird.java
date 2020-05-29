package MustDos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTripletWhichHasSumOfTwoElementIsThird {

    public static void main(String[] args) {

        FindTripletWhichHasSumOfTwoElementIsThird tripletsFinder = new FindTripletWhichHasSumOfTwoElementIsThird();

        int arr[] = {-1, 1, -2, 2, 5, -3, 3};

        List<List<Integer>> triplets = tripletsFinder.findTriplets(arr);
        for(List<Integer> list : triplets){
            System.out.println(list);
        }
    }

    private List<List<Integer>> findTriplets(int arr[]){
        if(arr.length < 3){
            return null;
        }
        List<List<Integer>> triplets = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i< arr.length; i++){
            int currrent_val = arr[i];
            for(int j = 0; j< arr.length; j++){
                if(j == i)
                 continue;

                if(set.contains(currrent_val - arr[j])){
                    List<Integer> list = new ArrayList<>();
                    list.add(currrent_val);
                    list.add(arr[j]);
                    list.add(currrent_val - arr[j]);
                    triplets.add(list);
                } else {
                    set.add(arr[j]);
                }
            }
            set.clear();
        }
     return triplets;
    }
}

package MustDos;

import java.util.ArrayList;
import java.util.List;

public class StockBuyAndSell {

    public static void main(String[] args) {

        StockBuyAndSell buyAndSell = new StockBuyAndSell();
       // int arr[] = {100, 180, 260, 310, 40, 535, 695};
       // int arr[] = {100, 50, 30, 20};
        int arr[] = {23, 13, 25, 29, 33, 19, 34, 45, 65, 0, 1, 2, 3};
                System.out.println("The days on which the stock can be see and buy are: " + buyAndSell.getMaxProfitDays(arr));

    }

    private List<List<Integer>> getMaxProfitDays(int arr[]){
        if(arr.length < 2){
            return new ArrayList<>();
        }

         List<List<Integer>> days = new ArrayList<>();

        int max_profit = 0;
        int start = 0;
        int end = 1;
        while(end < arr.length){
            if(arr[end] - arr[start] > max_profit){
                max_profit = arr[end] - arr[start];
                if(end == arr.length - 1){
                    List<Integer> list = new ArrayList<>();
                    list.add(start);
                    list.add(end);
                    days.add(list);
                }
                end++;
            } else{
                if(end - start != 1) {
                    List<Integer> list = new ArrayList<>();
                    list.add(start);
                    list.add(end - 1);
                    days.add(list);
                }
                max_profit = 0;
                start = end;
                end++;
            }
        }

      return days;
     }
}

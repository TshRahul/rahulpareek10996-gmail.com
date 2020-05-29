import java.util.Queue;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {1, -1, 3, 4, 5, 6};
        QuickSort sort = new QuickSort();
        sort.quickSort(arr, 0, arr.length - 1);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private void quickSort(int[] arr, int start, int end) {
        if(arr.length == 0 || arr.length == 1){
            return;
        }

        if(start >= end || end < 0){
            return;
        }

        int pivot_point = arr[start];
        int i = start;
        int j = end;
        while (i <= j){
            if( arr[i] <= pivot_point){
                i++;
            }  else {
                if(pivot_point <= arr[j]){
                    j--;
                }else {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        arr[start] = arr[j];
        arr[j] = pivot_point;

        quickSort(arr, start, j - 1);
        quickSort(arr, j + 1, end);





    }
}

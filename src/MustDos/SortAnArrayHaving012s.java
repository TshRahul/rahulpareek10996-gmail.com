package MustDos;

public class SortAnArrayHaving012s {

    public static void main(String[] args) {

        SortAnArrayHaving012s sort = new SortAnArrayHaving012s();
        int arr[] = {0, 2, 1, 2, 0};
        int new_arr[] = sort.sort(arr);
        for (int i = 0; i < new_arr.length; i++){
            System.out.print(new_arr[i] + " ");
        }
    }

    private int[] sort(int[] arr) {
        if(arr.length == 0) {
            return new int[] {-1};
        }

        int[] new_arr = new int[arr.length];
        int k = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == 0){
                new_arr[k++] = arr[i];
            }
        }

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == 1){
                new_arr[k++] = arr[i];
            }
        }

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == 2){
                new_arr[k++] = arr[i];
            }
        }
        return new_arr;
    }
}

package MustDos;

public class FindNumberOfInversions {

    static int inversionCount = 0;
    public static void main(String[] args) {

        FindNumberOfInversions find = new FindNumberOfInversions();
        int[] arr = {9, 6, 8, 4, 5, 1, 15, 7};
        find.mergeSort(arr, 0, arr.length - 1);
        for(int i = 0; i<= arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(inversionCount);
    }

    private void mergeSort(int arr[], int start, int end){
        if(start == end){
            return;
        }

        int mid = (start + end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
         merge(arr, start, mid, end);
    }

    private void merge(int[] arr, int start, int mid, int end) {

        int i = start;
        int j = mid + 1;

        int n = end - start + 1;
        int new_arr[] = new int[n];
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                new_arr[k++] = arr[i++];
            } else {
                new_arr[k++] = arr[j++];
                inversionCount = inversionCount + mid - i + 1;
            }
        }
             while (i <= mid){
                 new_arr[k++] = arr[i++];

             }

             while (j <= end){
                 new_arr[k++] = arr[j++];
             }

             for(int l = 0; l < new_arr.length; l ++){
                     arr[start + l] = new_arr[l];
             }


    }

}

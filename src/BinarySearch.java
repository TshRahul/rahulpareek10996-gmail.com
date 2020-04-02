public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 9, 15, 18};

        BinarySearch bs = new BinarySearch();
        int index = bs.search(arr, 150, 0, arr.length-1);

        if(index != -1){
            System.out.println("The element  is found a index : " + index);
        } else{
            System.out.println("The element is not present in the array");
        }

    }

    private int search(int[] arr, int val, int start, int end){

         int mid = (start+end)/2;
         if(start > end){
             return -1;
         }
         if(arr[mid] == val){
             return mid;
         } else if(val > arr[mid]){
             return search(arr, val, mid + 1, end);
         } else{
             return search(arr, val, start, mid - 1);
         }
    }


}

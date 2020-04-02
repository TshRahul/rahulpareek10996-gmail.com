public class FindElementInUnsortedArray {

    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 15, 8};
        FindElementInUnsortedArray obj = new FindElementInUnsortedArray();
        int index = obj.search(arr, 200);
        if(index != -1){
            System.out.println("The element is found at index : " + index);
        } else {
            System.out.println("Element is not present in the array");
        }

    }

    private int search(int arr[], int element){

        for(int i = 0; i<= arr.length - 1; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}

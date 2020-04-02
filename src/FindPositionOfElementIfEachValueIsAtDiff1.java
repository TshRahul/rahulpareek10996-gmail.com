public class FindPositionOfElementIfEachValueIsAtDiff1 {

    public static void main(String[] args) {
        int arr[] = {7, 6, 7, 6, 7, 6, 5, 4, 5, 4, 3, 2, 1, 2, 3};

        FindPositionOfElementIfEachValueIsAtDiff1 obj = new FindPositionOfElementIfEachValueIsAtDiff1();;
        int index = obj.findPosition(arr, 6);

        if(index != -1){
            System.out.println("The given value is present firstly at : " + index);
        } else {
            System.out.println("The value does not present in the array");
        }

    }

    private int findPosition(int arr[], int val){

        int start = 0;
        while(start <= arr.length){
            if(arr[start] == val){
                return start;
            }
            int diff;
            if(val > arr[start]){
                diff = val - arr[start];
            } else {
                diff = arr[start] - val;
            }
            start = start + diff;
        }

        return -1;
    }
}

public class FindPositionOfElementIfEachValueIsAtDiffK {

    public static void main(String[] args) {
        int arr[] = {7, 4, 7, 4, 1, 4};

        FindPositionOfElementIfEachValueIsAtDiffK obj = new FindPositionOfElementIfEachValueIsAtDiffK();
        int index = obj.findPosition(arr, 1);

        if(index != -1){
            System.out.println("The given value is present firstly at : " + index);
        } else {
            System.out.println("The value does not present in the array");
        }

    }

    private int findPosition(int arr[], int val){

        int diffOfElements = arr[0] - arr[1];
        if(diffOfElements < 0){
            diffOfElements = -(diffOfElements);
        }
        int start = 0;
        while(start <= arr.length){
            if(arr[start] == val){
                return start;
            }
            int diffValue;
            if(val > arr[start]) {
                diffValue = (val - arr[start]) / diffOfElements;
            } else {
                diffValue = (arr[start] - val) / diffOfElements;
            }
            start = start + diffValue;
        }

        return -1;

    }
}

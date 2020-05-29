public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {

        int arr[] = {6, 5, 4, 0, 1, 2, 3};

        FindMinimumInRotatedSortedArray find = new FindMinimumInRotatedSortedArray();
        int min = find.findMin(arr);
        System.out.println("The minimum in the array is : "+ min );

    }

    private int findMin(int[] arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        if(arr.length == 1){
            return arr[0];
        }

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start < end){
                mid = (start + end)/2;
            if(arr[mid + 1] < arr[mid] ){
                start = mid + 1;
            } else if(arr[mid - 1] < arr[mid]){
                end = mid - 1;
            } if(arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]){
                return arr[mid];
            }
        }
        return arr[start];
    }
}

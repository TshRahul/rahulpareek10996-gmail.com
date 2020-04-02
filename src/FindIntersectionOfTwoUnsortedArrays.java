public class FindIntersectionOfTwoUnsortedArrays {

    public static void main(String[] args) {
        int arr1[] = {2, 2, 3, 8, 10, 15, 16, 18};
        int arr2[] = {1, 2, 5, 5, 5, 5, 5, 8, 8, 8, 8, 15, 20, 21};

        FindIntersectionOfTwoUnsortedArrays intersection = new FindIntersectionOfTwoUnsortedArrays();
        int[] arr = intersection.findIntersection(arr1, arr2);
        for(int i = 0; i<= arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }

    }

    private int[] findIntersection(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while(i <= arr1.length - 1 && j <= arr2.length - 1){
            if(i>0){
                if(arr1[i] == arr1[i-1]){
                    i++;
                    continue;
                }
            }
            if(j>0){
                if(arr2[j] == arr2[j-1]){
                    j++;
                    continue;
                }
            }
            if(arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            } else if(arr1[i] > arr2[j]){
                arr[k] = arr2[j];
                j++;
                k++;
            } else {
                i++;
                j++;
            }
        }

        if(i == arr1.length && j < arr2.length){
            for(i = j; i<= arr2.length - 1; i++){
                if(i>0){
                    if(arr2[i] == arr2[i-1]){
                        continue;
                    }
                }
                arr[k] = arr2[i];
                k++;
            }
        } else if(i < arr1.length && j == arr2.length){
            for(j = i; j<= arr1.length - 1; j++){
                if(j>0){
                    if(arr1[j] == arr1[j-1]){
                        continue;
                    }
                }
                arr[k] = arr1[j];
                k++;
            }
        }

        return arr;
    }
}

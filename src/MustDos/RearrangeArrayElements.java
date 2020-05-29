package MustDos;

public class RearrangeArrayElements {

    public static void main(String[] args) {

        RearrangeArrayElements rearrange = new RearrangeArrayElements();
        int[] arr = {1, 2, 3, 4, 5};
        int result[] = rearrange.rearrangeElements(arr);
        for(int i = 0; i< result.length; i++){
            System.out.print(result[i] + " ");
        }

    }

    private int[] rearrangeElements(int[] arr){
        if(arr.length == 0){
            return null;
        }

        int resultant_array[] = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;
        int i =0;
        while (start < end){
            resultant_array[i++] = arr[end--];
            resultant_array[i++] = arr[start++];
        }
        if(start == end){
            resultant_array[i] = arr[start];
        }

        return resultant_array;
    }
}

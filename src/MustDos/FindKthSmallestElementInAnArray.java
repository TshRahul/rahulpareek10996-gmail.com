package MustDos;

import java.util.PriorityQueue;

public class FindKthSmallestElementInAnArray {

    public static void main(String[] args) {

        FindKthSmallestElementInAnArray find  = new FindKthSmallestElementInAnArray();

        int arr[] = {4, 5, 1, 2, 8, 15, 9, 12};
        int element = find.findKthSmallestElement(arr, 5);
        System.out.println("The 3rd smallest element is: " + element);

    }

    private int findKthSmallestElement(int arr[], int k){
        if(arr.length < k){
            return -1;
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int  i = 0; i< arr.length; i++){
            heap.add(arr[i]);
        }

        for(int i = 1; i< k; i++){
            heap.poll();
        }

        return heap.peek();
    }
}

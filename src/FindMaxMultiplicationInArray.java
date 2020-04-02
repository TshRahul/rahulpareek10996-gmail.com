public class FindMaxMultiplicationInArray {

    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 3, -18, -4, 7};

        int min, secondMin, max, secondMax;
        min = arr[0];
        secondMin = arr[0];
        max = arr[0];
        secondMax = arr[0];
        for(int i = 1; i<= arr.length - 1; i++){
            if(arr[i] < min){
                min = arr[i];
                continue;
            } else if(arr[i] > min && arr[i] <= secondMin){
                secondMin = arr[i];
                continue;
            } else if(arr[i] > max){
                max = arr[i];
                continue;
            } else if(arr[i] < max && arr[i] >= secondMax){
                secondMax = arr[i];
                continue;
            }
        }
        /*System.out.println(min);
        System.out.println(secondMin);
        System.out.println(max);
        System.out.println(secondMax);*/
        System.out.println("Max multiplication is : " + Math.max((min * secondMin), (max * secondMax)));
    }
}

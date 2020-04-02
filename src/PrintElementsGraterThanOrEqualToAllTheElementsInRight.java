public class PrintElementsGraterThanOrEqualToAllTheElementsInRight
{

    public static void main(String args[]){
        int arr[] = {14, 15, 8, 9, 5, 5, 2};
        PrintElementsGraterThanOrEqualToAllTheElementsInRight print = new PrintElementsGraterThanOrEqualToAllTheElementsInRight();
        print.printElements(arr);
    }

    private void printElements(int arr[]){

        int max = arr[arr.length - 1];
        for(int i = arr.length - 1; i >=0; i--){
            if(arr[i] >= max){
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }

    }
}

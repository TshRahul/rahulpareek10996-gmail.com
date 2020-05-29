public class FindMultiples {

    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 6, 1};
        FindMultiples fin = new FindMultiples();
        int muls[] = fin.findMultiples(arr);

        for(int i = 0; i<= muls.length - 1; i++){
            System.out.print(muls[i] + " ");
        }

    }



    private int[] findMultiples(int[] arr) {
        int muls[] = new int[arr.length];
        int mul = 1;
        muls[0] = 1;

        for (int i = 1; i <= arr.length - 1; i++) {
            mul = mul * arr[i - 1];
            muls[i] = mul;
        }
        mul = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            muls[i] = mul * muls[i];
            mul = mul * arr[i];

        }

        return muls;
    }
}
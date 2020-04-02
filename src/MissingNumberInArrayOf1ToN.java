public class MissingNumberInArrayOf1ToN
{
    public static void main(String args[]) {
        int a[] = {1, 5, 2, 4, 7, 9, 8, 6};
       MissingNumberInArrayOf1ToN obj = new MissingNumberInArrayOf1ToN();
       int missingNo = obj.findMissingNumber(a,9);
       if(missingNo == 0){
           System.out.println("The given array is a complete array from 1 to " + 9);
        return;
       }
        System.out.println("The missing number in the given array is : " + missingNo);



    }

    private int findMissingNumber(int[] a, int n){

        int sum = (n* (n+1))/2;
        int sum2 = 0;
      for(int i = 0; i< a.length; i++){
          sum2 = sum2 + a[i];
      }
      return sum - sum2;
    }
}

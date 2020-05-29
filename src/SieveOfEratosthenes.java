import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        n = scan.nextInt();
        int Primes[] = new int[n + 1];
        Primes[0] = 0;
        Primes[1] = 0;

        for(int i = 2; i<= n; i++){
           Primes[i] = 1;
        }

        for(int i = 2; i<= Math.sqrt(n); i++){

            if(Primes[i] == 1){
                for(int j = 2; j*i <= n; j++){
                    Primes[i*j] = 0;
                }
            }

        }

        for(int i = 0; i<= n; i++){
            if(Primes[i] == 1){
                System.out.print(i + " ");
            }
        }


    }
}

import java.util.Scanner;

public class PrimeNumbers {

    // still progress
    public static void main(String[] args){

        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of prime numbers you want: ");
        n = scanner.nextInt();
        scanner.close();

        int count = 0;
        int num = 2;

        while(count < n){
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(num); j++){
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
                count++;
            }
            num++;
        }


    }
}

import java.util.Scanner;

public class PrimeNumbers {

    // still progress
    public static void main(String[] args){

        int n, status = 1, num = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of prime numbers you want: ");
        n = scanner.nextInt();

        if (int count = 2; count <= n; ){
            for (int j = 2; j <= Math.sqrt(num); j++){
                if((num % j) == 0){
                    status = 0;
                    break;
                }
            }
            if (status != 0){
                System.out.println(num);
                count++;
            }
            status = 1;
            num++;
        }
    }
}

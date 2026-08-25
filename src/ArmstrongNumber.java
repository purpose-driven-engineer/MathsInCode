import java.util.Scanner;

/*
What is an Amstrong Number?

 */

public class ArmstrongNumber {
    public static void main(String [] args){
        int n, temp, remainder;
        int sum = 0;
        int digits = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which number would you like to validate? ");
        n = scanner.nextInt();

        temp = n;

        // ....
        while (temp != 0){
            digits++;
            temp = temp / 10;
        }

        temp = n;

        // ...
        while (temp != 0){
            remainder = temp % 10;
            sum = sum + power(remainder, digits);
            temp = temp / 10;
        }

        // ...
        if (n == sum)
            System.out.println(n + " is an Amstrong number");
        else
            System.out.println(n + " is not an Amstrong number");
    }

    // ...
    static int power(int n, int r){
        int c, p =1;
         for (c= 1; c <= r; c++){
             p = p*r;
         }
         return p;
    }
}

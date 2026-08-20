import java.util.Scanner;

public class MultiplicationTable {

//    public static void main(String[] args){
//        int number, count;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Multiplication Table of (Enter Number): ");
//        number = scanner.nextInt();
//
//        System.out.println("==============");
//        for (count = 1; count <= 12; count++){
//            System.out.println(number + "*" + count + " = " + (number*count));
//        }
//    }

     public static void main(String[] args){

         int a, b, c, d;

         Scanner scanner = new Scanner(System.in);

         System.out.println("Multiplication Table of Numbers (Enter a range): "); // separated by whitespace
         a = scanner.nextInt();
         b = scanner.nextInt();

         for (c = a; c <= b; c++){
             for (d = 1; d <= 12; d++){
                 System.out.println(c + "*" + d + " =" + (c*d));
             }
         }
     }
}

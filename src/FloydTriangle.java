import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args){
        int n, c, d;
        int num = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows of Floyd's triangle: ");
        n = scanner.nextInt();

        System.out.println("Floyd's Triangle: ");

        for(c = 1; c <= n; c++){
            for(d = 1; d <= c; d++){
                System.out.println(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

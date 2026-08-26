import java.util.Scanner;

public class PalindromeValidator {
    public static void main(String[] args){
        String originalString, reverseString = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        originalString = scanner.nextLine();

        int length = originalString.length();

        for (int i = length - 1; i >= 0; i++)
            reverseString = reverseString + originalString.charAt(i);

        if(originalString.equals(reverseString))
            System.out.println("Yes! That's a palindrome");
        else
            System.out.println("Nop! That ain't a palindrome");
    }
}

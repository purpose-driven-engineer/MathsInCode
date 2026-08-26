import java.util.Scanner;
/*
What is a Palindrome Validator?

 */
public class PalindromeValidator {
    public static void main(String[] args){
        String originalString;

        StringBuilder reverseString = new StringBuilder();

        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter a String: ");
            originalString = scanner.nextLine();
        }

        // ...
        for (int i = originalString.length(); i >= 0; i--)
            reverseString.append(originalString.charAt(i));

        if(originalString.contentEquals(reverseString))
            System.out.println("Yes! That's a palindrome");
        else
            System.out.println("Nop! That ain't a palindrome");
    }
}

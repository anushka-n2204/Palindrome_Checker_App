/**
 * =========================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This program reverses a string using a loop and checks
 * whether the original string is equal to the reversed string.
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

    }
}
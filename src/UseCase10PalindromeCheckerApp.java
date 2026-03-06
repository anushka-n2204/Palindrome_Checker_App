/**
 * =========================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This program checks whether a string is a palindrome
 * while ignoring spaces and letter case.
 */

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Madam Im Adam";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        // Reverse the normalized string
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Compare strings
        if (normalized.equals(reversed)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

    }
}
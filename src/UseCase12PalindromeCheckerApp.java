import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

/**
 * =========================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * Demonstrates the Strategy Pattern where different
 * palindrome checking algorithms can be selected dynamically.
 */

/* Strategy Interface */
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

/* Stack Strategy Implementation */
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }
}

/* Deque Strategy Implementation */
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

/* Main Application */
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        // Choose strategy dynamically
        PalindromeStrategy strategy;

        // Example: choose DequeStrategy
        strategy = new DequeStrategy();

        boolean result = strategy.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}
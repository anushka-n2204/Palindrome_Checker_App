import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

/**
 * =========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This program compares the execution time of different
 * palindrome checking algorithms.
 */

public class UseCase13PalindromeCheckerApp {

    // Method 1: String Reverse
    public static boolean checkUsingReverse(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    // Method 2: Stack Based
    public static boolean checkUsingStack(String word) {

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

    // Method 3: Deque Based
    public static boolean checkUsingDeque(String word) {

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

    public static void main(String[] args) {

        String word = "madam";

        // Reverse method timing
        long start1 = System.nanoTime();
        boolean result1 = checkUsingReverse(word);
        long end1 = System.nanoTime();

        // Stack method timing
        long start2 = System.nanoTime();
        boolean result2 = checkUsingStack(word);
        long end2 = System.nanoTime();

        // Deque method timing
        long start3 = System.nanoTime();
        boolean result3 = checkUsingDeque(word);
        long end3 = System.nanoTime();

        System.out.println("Word: " + word);

        System.out.println("Reverse Method Result: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method Result: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Method Result: " + result3 +
                " | Time: " + (end3 - start3) + " ns");
    }
}
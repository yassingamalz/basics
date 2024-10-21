package basics.basics.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * A utility class that provides a method to compute the Collatz sequence for a given number.
 * The Collatz sequence is a sequence of numbers produced from a starting integer, following
 * a set of rules:
 * <ul>
 *     <li>If the number is even, divide it by 2.</li>
 *     <li>If the number is odd, multiply it by 3 and add 1.</li>
 *     <li>Repeat the process until the number becomes 1.</li>
 * </ul>
 * <p>
 * Example usage:
 * <pre>
 *     List<Long> sequence = CollatzSequence.collatzSequence(6); // [6, 3, 10, 5, 16, 8, 4, 2, 1]
 * </pre>
 *
 * @author Yassin Sohim
 */
public class CollatzSequence {
    /**
     * Generates the Collatz sequence starting from a given number n.
     * The sequence is generated by following the Collatz conjecture rules
     * and terminates when the sequence reaches the number 1.
     *
     * @param n the starting number for the Collatz sequence. Must be greater than 0.
     * @return a list containing the Collatz sequence starting from n. Returns an empty list if n is less than 1.
     */
    public static List<Long> collatzSequence(long n) {
        if (n < 1) return new ArrayList<>();
        List<Long> solution = new ArrayList<>(List.of(n));
        while (n != 1) {
            if (n % 2 == 0) n = n / 2;
            else n = n * 3 + 1;
            solution.add(n);
        }
        return solution;
    }
}
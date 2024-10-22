package basics.basics.collections.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * A utility class that provides a method to generate the "Look and Say" sequence.
 * The "Look and Say" sequence is a mathematical sequence where each term is generated
 * by describing the digits of the previous term.
 *
 * For example, starting with 1, the sequence evolves as follows:
 * <ul>
 *     <li>1</li>
 *     <li>11 (one 1)</li>
 *     <li>21 (two 1s)</li>
 *     <li>1211 (one 2, one 1)</li>
 *     <li>111221 (one 1, one 2, two 1s)</li>
 *     <li>and so on...</li>
 * </ul>
 *
 * Example usage:
 * <pre>
 *     List<Long> sequence = LookAndSay.lookAndSay(5); // [1, 11, 21, 1211, 111221]
 * </pre>
 *
 * @author Yassin Sohim
 */
public class LookAndSay {
    /**
     * Generates the "Look and Say" sequence up to the nth term.
     *
     * @param n the number of terms to generate in the sequence. Must be greater than 0.
     * @return a list containing the "Look and Say" sequence up to the nth term. Returns an empty list if n is less than 1.
     */
    public static List<Long> lookAndSay(long n) {
        if (n < 1) return new ArrayList<>();

        List<Long> result = new ArrayList<>(List.of(1L));

        for (int j = 1; j < n; j++) {
            String previous = result.get(result.size() - 1).toString();
            StringBuilder next = new StringBuilder();
            int count = 1;
            char numberToCount = previous.charAt(0);
            for (int i = 1; i < previous.length(); i++) {
                if (previous.charAt(i) == numberToCount) {
                    count++;
                } else {
                    next.append(count).append(numberToCount);
                    count = 1;
                    numberToCount = previous.charAt(i);
                }
            }
            next.append(count).append(numberToCount);
            result.add(Long.valueOf(next.toString()));
        }
        return result;
    }
}

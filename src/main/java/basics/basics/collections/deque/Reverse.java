package basics.basics.collections.deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * The {@code Reverse} class provides a method to reverse the order of elements in a list.
 * This is achieved by utilizing a deque (double-ended queue) to temporarily hold the elements
 * while removing them from the original list.
 * <p>
 * Example usage:
 * <pre>
 *     List<String> sentence = new LinkedList<>(Arrays.asList("Hello", "world", "!"));
 *     Reverse.reverse(sentence);
 *     // Now the sentence contains: ["!", "world", "Hello"]
 * </pre>
 * <p>
 * This class is particularly useful for reversing sentences or sequences of words.
 *
 * @author Yassin Sohim
 */
public class Reverse {

    /**
     * Reverses the order of elements in the provided list.
     *
     * @param sentence the list of strings to be reversed
     */
    public static void reverse(List<String> sentence) {
        Deque<String> stack = new LinkedList<>();

        while (!sentence.isEmpty()) {
            stack.push(sentence.removeFirst());
        }

        while (!stack.isEmpty()) {
            sentence.add(stack.poll());
        }
    }
}

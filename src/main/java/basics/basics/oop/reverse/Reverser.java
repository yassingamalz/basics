package basics.basics.oop.reverse;

/**
 * An interface for reversing strings.
 * Implementing classes must provide their own method for reversing a given string.
 *
 * Example usage:
 * <pre>
 *     Reverser reverser = new ReverserFast();
 *     String reversed = reverser.reverse("hello"); // Output: "olleh"
 * </pre>
 */
public interface Reverser {
    /**
     * Reverses the given input string.
     *
     * @param input the string to be reversed
     * @return the reversed string
     */
    String reverse(String input);
}

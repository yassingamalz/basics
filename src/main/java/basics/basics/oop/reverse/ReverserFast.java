package basics.basics.oop.reverse;

/**
 * A fast implementation of the Reverser interface using StringBuilder.
 * This implementation provides a quick way to reverse a string.
 *
 * Example usage:
 * <pre>
 *     Reverser reverser = new ReverserFast();
 *     String reversed = reverser.reverse("world"); // Output: "dlrow"
 * </pre>
 */
public class ReverserFast implements Reverser {
    @Override
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}

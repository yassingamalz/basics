package basics.basics.oop.reverse;

/**
 * A slow implementation of the Reverser interface.
 * This implementation manually reverses a string by creating a character array.
 *
 * Example usage:
 * <pre>
 *     Reverser reverser = new ReverserSlow();
 *     String reversed = reverser.reverse("example"); // Output: "elpmaxe"
 * </pre>
 */
public class ReverserSlow implements Reverser {
    @Override
    public String reverse(String input) {
        char[] tmp = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            tmp[input.length() - 1 - i] = input.charAt(i);
        }
        return String.valueOf(tmp);
    }
}

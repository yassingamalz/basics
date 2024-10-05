package basics.basics.strings;

/**
 * This class contains methods to reverse a string using different approaches.
 * Author: Yassin Sohim
 */
public class Reverse {

    /**
     * Reverses a string by manually iterating through characters using the charAt() method.
     *
     * @param string The string to be reversed.
     * @return The reversed string.
     */
    public static String reverseCharAt(String string) {
        StringBuilder sb = new StringBuilder();  // StringBuilder to construct the reversed string

        // Loop through the string in reverse order and append each character to the StringBuilder
        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }

        return sb.toString();  // Return the reversed string
    }

    /**
     * Reverses a string using the built-in StringBuilder reverse() method.
     *
     * @param string The string to be reversed.
     * @return The reversed string.
     */
    public static String reverseStringBuilder(String string) {
        // Use StringBuilder's reverse method to reverse the string and return it
        return new StringBuilder(string).reverse().toString();
    }
}
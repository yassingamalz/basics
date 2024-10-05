package basics.basics.strings;

/**
 * This class provides methods to remove the first two characters from a string
 * using different approaches.
 * Author: Yassin Sohim
 */
public class RemoveFirstTwoChars {

    /**
     * Removes the first two characters using substring method.
     * If the string has less than two characters, returns an empty string.
     *
     * @param string The input string.
     * @return The string without the first two characters, or an empty string if length < 2.
     */
    public static String removeFirstTwoChars(String string) {
        return string.length() < 2 ? "" : string.substring(2);
    }

    /**
     * Removes the first two characters manually by iterating over the string
     * using charAt() method.
     *
     * @param string The input string.
     * @return The string without the first two characters.
     */
    public static String removeFirstTwoCharsCharAt(String string) {
        StringBuilder sb = new StringBuilder();

        // Loop through the string starting from the third character (index 2)
        for (int i = 2; i < string.length(); i++) {
            sb.append(string.charAt(i));
        }

        return sb.toString();  // Return the modified string
    }

    /**
     * Removes the first two characters using StringBuilder's delete() method.
     *
     * @param string The input string.
     * @return The string without the first two characters.
     */
    public static String removeFirstTwoCharsStringBuilder(String string) {
        return new StringBuilder(string).delete(0, 2).toString();  // Delete first two characters and return
    }
}

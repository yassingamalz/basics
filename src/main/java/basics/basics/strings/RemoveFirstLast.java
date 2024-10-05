package basics.basics.strings;

/**
 * This class provides a method to remove the first and last characters from a string
 * if they are equal.
 * Author: Yassin Sohim
 */
public class RemoveFirstLast {

    /**
     * Removes the first and last characters of the string if they are equal.
     *
     * @param s The input string.
     * @return The modified string, trimmed of the first and last characters if they are equal;
     *         otherwise, the original string is returned.
     */
    public static String removeFirstLast(String s) {
        // Check if the first and last characters are equal
        return isFirstEqualLast(s) ? s.substring(1, s.length() - 1) : s;
    }

    /**
     * Checks if the first and last characters of the string are equal.
     *
     * @param s The input string.
     * @return true if the first and last characters are equal; false otherwise.
     */
    private static boolean isFirstEqualLast(String s) {
        // If the string length is less than 2, return false
        if (s.length() < 2)
            return false;
        else
            // Compare the first and last characters
            return s.charAt(0) == s.charAt(s.length() - 1);
    }
}

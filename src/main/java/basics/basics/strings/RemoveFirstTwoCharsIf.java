package basics.basics.strings;

/**
 * This class provides methods to conditionally remove the first two characters from a string
 * while keeping certain characters based on specific conditions.
 * Author: Yassin Sohim
 */
public class RemoveFirstTwoCharsIf {

    /**
     * Removes the first two characters based on conditions using charAt() method.
     * Keeps the first character if it is 'H' and the second character if it is 'e'.
     *
     * @param string The input string.
     * @return The modified string based on the specified conditions.
     */
    public static String removeFirstTwoCharsIfCharAt(String string) {
        StringBuilder sb = new StringBuilder();

        // Switch case to handle different lengths of the input string
        switch (string.length()) {
            case 0 -> {
                // Do nothing for empty string
            }
            case 1 -> {
                if (string.charAt(0) == 'H')  // Keep 'H' if it's the only character
                    sb.append(string.charAt(0));
            }
            case 2 -> {
                if (string.charAt(0) == 'H')  // Keep 'H' if it's the first character
                    sb.append(string.charAt(0));
                if (string.charAt(1) == 'e')  // Keep 'e' if it's the second character
                    sb.append(string.charAt(1));
            }
            default -> {
                if (string.charAt(0) == 'H')  // Keep 'H' if it's the first character
                    sb.append(string.charAt(0));
                if (string.charAt(1) == 'e')  // Keep 'e' if it's the second character
                    sb.append(string.charAt(1));
                sb.append(string.substring(2));  // Append the rest of the string
            }
        }
        return sb.toString();  // Return the modified string
    }

    /**
     * Removes the first two characters based on conditions using StringBuilder's deleteCharAt() method.
     * Keeps the first character if it is 'H' and the second character if it is 'e'.
     *
     * @param string The input string.
     * @return The modified string based on the specified conditions.
     */
    public static String removeFirstTwoCharsIfStringBuilder(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);

        // Check and remove first character if it's not 'H'
        if (!string.isEmpty() && string.charAt(0) != 'H')
            stringBuilder.deleteCharAt(0);

        // Check and remove second character if it's not 'e'
        if (string.length() > 1 && string.charAt(1) != 'e')
            stringBuilder.deleteCharAt(1);

        return stringBuilder.toString();  // Return the modified string
    }
}

package basics.basics.strings;

/**
 * This class contains a method to sum all the digits (0-9) found in a given string.
 * It ignores any non-digit characters.
 *
 * Author: Yassin Sohim
 */
public class SumDigits {

    /**
     * Sums the numeric values of all digits in the input string.
     *
     * @param string the input string to check for digits
     * @return the sum of all digits in the string, or 0 if there are no digits
     */
    public static int sumDigits(String string) {
        int sum = 0;

        // Convert the string to a character array and iterate over it
        for (Character c : string.toCharArray()) {

            // Check if the current character is a digit
            if (Character.isDigit(c))
                // Add the numeric value of the digit to the sum
                sum += Character.getNumericValue(c);
        }
        return sum;  // Return the final sum of digits
    }
}

package basics.basics.exceptions;

import java.text.ParseException;

/**
 * The {@code CheckString} class provides a method to validate the format of a string
 * based on alternating character rules: each even index must be a letter, and each odd index must be a digit.
 *
 * @version 1.0
 * @author Yassin Sohim
 */
public class CheckString {

    /**
     * Checks that a given string alternates between letters and digits.
     * Specifically:
     * - Characters at even indices must be letters.
     * - Characters at odd indices must be digits.
     *
     * @param s the string to validate
     * @throws ParseException if the string does not meet the alternating letter-digit format,
     *                        including cases where the string length is less than 2
     */
    public static void checkString(String s) throws ParseException {
        if (s.length() < 2) {
            throw new ParseException("String must have at least 2 characters", 0);
        }
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && !Character.isLetter(s.charAt(i))) {
                throw new ParseException("Expected letter at index " + i + " but found: " + s.charAt(i), i);
            }
            if (i % 2 == 1 && !Character.isDigit(s.charAt(i))) {
                throw new ParseException("Expected digit at index " + i + " but found: " + s.charAt(i), i);
            }
        }
    }
}

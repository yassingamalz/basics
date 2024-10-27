package basics.basics.exceptions;

/**
 * The {@code CheckLicencePlate} class provides methods to validate a license plate
 * based on format requirements: 2 letters, 3 digits, and 2 letters, totaling 7 characters.
 *
 * @version 1.0
 * @autor Yassin Sohim
 */
public class CheckLicencePlate {

    /**
     * Validates the format of a license plate. Expected format is 7 characters long:
     * - First 2 characters are letters.
     * - Next 3 characters are digits.
     * - Last 2 characters are letters.
     *
     * @param licence the license plate string to validate
     * @throws IllegalArgumentException if the format does not match the expected structure
     */
    public static void checkLicencePlate(String licence) {
        if (licence.length() != 7) {
            throw new IllegalArgumentException("License plate length must be 7 characters");
        }
        checkIfMadeOfLetters(licence.substring(0, 2));
        checkIfMadeOfDigits(licence.substring(2, 5));
        checkIfMadeOfLetters(licence.substring(5, 7));
    }

    /**
     * Validates that a given string consists only of letters.
     *
     * @param string the string to check
     * @throws IllegalArgumentException if any character is not a letter
     */
    private static void checkIfMadeOfLetters(String string) {
        for (char c : string.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException("Expected a letter but found: " + c);
            }
        }
    }

    /**
     * Validates that a given string consists only of digits.
     *
     * @param string the string to check
     * @throws IllegalArgumentException if any character is not a digit
     */
    private static void checkIfMadeOfDigits(String string) {
        for (char c : string.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Expected a digit but found: " + c);
            }
        }
    }
}

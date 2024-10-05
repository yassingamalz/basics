package basics.basics.strings;

/**
 * This class provides a method to check if a string is a palindrome.
 * Author: Yassin Sohim
 */
public class Palindrome {

    /**
     * Checks if the given string is a palindrome.
     *
     * @param s The input string to check.
     * @return True if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true; // An empty string is considered a palindrome
        }

        StringBuilder stringBuilder = new StringBuilder(s); // Create a StringBuilder from the input string
        return s.contentEquals(stringBuilder.reverse()); // Compare the original string with its reverse
    }
}

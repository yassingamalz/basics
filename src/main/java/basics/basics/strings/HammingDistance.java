package basics.basics.strings;

/**
 * This class provides a method to calculate the Hamming distance between two strings.
 * Author: Yassin Sohim
 */
public class HammingDistance {

    /**
     * Calculates the Hamming distance between two strings of equal length.
     * If the strings have different lengths, the method returns -1.
     *
     * @param s1 The first input string.
     * @param s2 The second input string.
     * @return The Hamming distance, or -1 if the strings have different lengths.
     */
    public static int hammingDistance(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return -1; // Return -1 if strings have different lengths
        }

        int counter = 0; // Initialize the counter for differing characters
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                counter++; // Increment the counter for each differing character
            }
        }
        return counter; // Return the total count of differing characters
    }
}

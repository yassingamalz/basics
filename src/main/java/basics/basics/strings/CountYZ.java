package basics.basics.strings;

import java.util.StringTokenizer;

/**
 * This class provides a method to count words ending with 'y' or 'z'.
 * Author: Yassin Sohim
 */
public class CountYZ {

    /**
     * Counts the number of words in the given string that end with 'y' or 'z'.
     *
     * @param string The input string to process.
     * @return The count of words ending with 'y' or 'z'.
     */
    public static int countYZ(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string);
        int count = 0;

        while (stringTokenizer.hasMoreTokens()) {
            String toTest = stringTokenizer.nextToken(); // Get the next word
            // Check if the word ends with 'y' or 'z' (case insensitive)
            if (toTest.toLowerCase().endsWith("y") || toTest.toLowerCase().endsWith("z")) {
                count++;
            }
        }
        return count; // Return the final count
    }
}

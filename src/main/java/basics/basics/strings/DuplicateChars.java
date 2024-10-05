package basics.basics.strings;

import java.util.Arrays;

/**
 * This class provides a method to find duplicate characters in a given string.
 * Author: Yassin Sohim
 */
public class DuplicateChars {

    /**
     * Returns an array of recurring characters in the input string, sorted alphabetically.
     *
     * @param input The input string.
     * @return A sorted array of recurring characters.
     */
    public static char[] duplicateChars(String input) {
        StringBuilder seen = new StringBuilder();      // To track seen characters
        StringBuilder recurring = new StringBuilder(); // To collect recurring characters

        for (int i = 0; i < input.length(); i++) {
            String tmp = String.valueOf(input.charAt(i));

            // Check if the character has been seen before
            if (!seen.toString().contains(tmp)) {
                seen.append(tmp); // Add to seen characters
            } else if (!recurring.toString().contains(tmp)) {
                recurring.append(tmp); // Add to recurring characters
            }
        }

        // Convert recurring StringBuilder to char array and sort it
        char[] charArray = recurring.toString().toCharArray();
        Arrays.sort(charArray);

        return charArray; // Return the sorted array of recurring characters
    }
}

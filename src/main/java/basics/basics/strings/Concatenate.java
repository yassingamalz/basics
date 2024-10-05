package basics.basics.strings;

/**
 * This class contains methods to concatenate strings from an array.
 * Author: Yassin Sohim
 */
public class Concatenate {

    /**
     * Concatenates strings in the array using a slower method (String concatenation with +=).
     * This method can be inefficient as it creates a new string for every concatenation.
     *
     * @param strings The array of strings to concatenate.
     * @return The concatenated result as a single string.
     */
    public static String concatenateSlow(String[] strings) {
        String concatenededString = "";  // Start with an empty string

        // Loop through each string in the array and concatenate it
        for (String string : strings) concatenededString += string;
        return concatenededString;  // Return the concatenated result
    }

    /**
     * Concatenates strings in the array using StringBuilder for faster performance.
     * This method is more efficient as it avoids creating new strings in each iteration.
     *
     * @param strings The array of strings to concatenate.
     * @return The concatenated result as a single string.
     */
    public static String concatenateFast(String[] strings) {
        StringBuilder concatenatedString = new StringBuilder();  // StringBuilder is faster

        // Append each string in the array to the StringBuilder
        for (String string : strings) concatenatedString.append(string);
        return concatenatedString.toString();  // Convert the StringBuilder to a single string and return
    }
}

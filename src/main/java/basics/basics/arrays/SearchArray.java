package basics.basics.arrays;

import java.util.Arrays;

/**
 * Utility class to search for a string within an array using two methods: brute-force and binary search.
 * Author: Yassin Sohim
 */
public class SearchArray {

    /**
     * Performs a brute-force search to check if the string is in the array.
     *
     * @param strings The array of strings.
     * @param searched The string to be searched for.
     * @return true if the string is found, false otherwise.
     */
    public static boolean containsBruteForce(String[] strings, String searched) {
        for (String string : strings) {
            if (searched.equals(string)) {  // Compare each string with the searched value
                return true;
            }
        }
        return false;
    }

    /**
     * Performs a binary search to check if the string is in the array.
     *
     * @param strings The array of strings.
     * @param searched The string to be searched for.
     * @return true if the string is found, false otherwise.
     */
    public static boolean containsBinary(String[] strings, String searched) {
        String[] sortedArray = strings.clone();  // Clone the array to avoid modifying the original
        Arrays.sort(sortedArray);  // Sort the cloned array
        return Arrays.binarySearch(sortedArray, searched) >= 0;  // Use binary search to find the string
    }
}

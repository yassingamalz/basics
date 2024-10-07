package basics.basics.arrays;

/**
 * Utility class to count the number of elements in two arrays that differ by 2 or less but are not equal.
 * Author: Yassin Sohim
 */
public class MatchUp {

    /**
     * Compares two arrays element by element and returns the count of how many elements differ by 2 or less but are not equal.
     *
     * @param v1 The first int array.
     * @param v2 The second int array.
     * @return The count of elements that differ by 2 or less but are not equal.
     */
    public static int matchUp(int[] v1, int[] v2) {
        int counter = 0; // Initialize the counter for matched elements

        // Iterate over the arrays to compare corresponding elements
        for (int i = 0; i < v1.length; i++) {
            // Check if elements are not equal and their absolute difference is 2 or less
            if (v1[i] != v2[i] && Math.abs(v1[i] - v2[i]) <= 2)
                counter++; // Increment the counter if condition is met
        }

        return counter; // Return the final count
    }
}

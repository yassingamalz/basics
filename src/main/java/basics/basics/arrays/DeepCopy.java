package basics.basics.arrays;

import java.util.Arrays;

public class DeepCopy {

    /**
     * Creates a deep copy of a 2D integer array.
     *
     * @param original The original 2D int array.
     * @return A deep copy of the original 2D array.
     */
    public static int[][] deepCopy(int[][] original) {
        // Create a new array with the same number of rows
        int[][] deepCopy = new int[original.length][];

        // Loop through each row of the original array
        for (int i = 0; i < original.length; i++) {
            // Copy each row (nested array) to the new array
            deepCopy[i] = Arrays.copyOf(original[i], original[i].length);
        }

        // Return the deep copied array
        return deepCopy;
    }
}

package basics.basics.arrays;

public class CanBalance {

    /**
     * Helper method to calculate the sum of elements in the array within a specific range.
     *
     * @param v the array
     * @param start the start index (inclusive)
     * @param end the end index (exclusive)
     * @return the sum of the elements between start and end
     */
    public static int sum(int[] v, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++)
            sum += v[i];
        return sum;
    }

    /**
     * Determines if there is a place in the array where it can be split so that
     * the sum of the numbers on one side is equal to the sum on the other side.
     *
     * @param v the array to evaluate
     * @return true if the array can be balanced, false otherwise
     */
    public static boolean canBalance(int[] v) {
        // Edge case: if the array has less than 2 elements, it cannot be split
        if (v.length < 2)
            return false;

        // Initial sums: first element on the left, the rest on the right
        int sumBegin = v[0];
        int sumEnd = sum(v, 1, v.length);

        // Iterate from the second element to the last element
        for (int i = 1; i < v.length; i++) {
            // Check if the two sums are equal
            if (sumEnd == sumBegin)
                return true;

            // Move the current element from the right to the left
            sumBegin += v[i];
            sumEnd -= v[i];
        }

        // If no balance point is found, return false
        return false;
    }
}

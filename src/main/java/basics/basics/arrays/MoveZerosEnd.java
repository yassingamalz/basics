package basics.basics.arrays;

/**
 * Utility class for moving zeros to the end of an array.
 * Author: Yassin Sohim
 */
public class MoveZerosEnd {

    /**
     * Moves all zeros in the given int[] array to the end while maintaining the relative order
     * of the non-zero elements. The array is modified in-place.
     *
     * @param v The array to be processed.
     * @return The same array with zeros moved to the end.
     */
    public static int[] moveZerosEnd(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 0) {
                for (int j = i + 1; j < v.length; j++) {
                    if (v[j] != 0) {
                        int tmp = v[j];
                        v[j] = v[i];
                        v[i] = tmp;
                        break;
                    }
                }
            }
        }
        return v;
    }

    /**
     * Optimized version of moveZerosEnd, creating a new array where all zeros
     * are moved to the end while maintaining the relative order of the non-zero elements.
     *
     * @param v The array to be processed.
     * @return A new int[] with zeros moved to the end.
     */
    public static int[] moveZerosEndFaster(int[] v) {
        int[] result = new int[v.length];
        int j = 0;
        for (int value : v) {
            if (value != 0) {
                result[j++] = value;
            }
        }
        return result;
    }
}

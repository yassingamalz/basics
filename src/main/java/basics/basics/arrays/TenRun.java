package basics.basics.arrays;

/**
 * Utility class for processing an array based on multiples of 10.
 * For each multiple of 10 in the array, change all subsequent values to that multiple
 * until encountering another multiple of 10.
 * Author: Yassin Sohim
 */
public class TenRun {

    /**
     * Modifies the array such that all values following a multiple of 10 are changed
     * to that multiple, until another multiple of 10 is encountered.
     *
     * @param v The int[] array to process.
     * @return The modified array.
     */
    public static int[] tenRun(int[] v) {
        int multiple = 0; // Holds the current multiple of 10.
        for (int i = 0; i < v.length; i++) {
            if (v[i] != 0 && v[i] % 10 == 0) {
                multiple = v[i]; // Set the new multiple when found.
            } else if (multiple != 0) {
                v[i] = multiple; // Set to the current multiple.
            }
        }
        return v;
    }
}

package basics.basics.arrays;

/**
 * Utility class for checking if a value is "everywhere" in an array.
 * A value is considered "everywhere" if for every pair of adjacent elements,
 * at least one of the pair is that value.
 * Author: Yassin Sohim
 */
public class IsEveryWhere {

    /**
     * Checks if the given value is "everywhere" in the array.
     *
     * @param v The int[] array to check.
     * @param value The value to verify.
     * @return true if the value is "everywhere", false otherwise.
     */
    public static boolean isEveryWhere(int[] v, int value) {
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] != value && (v[i + 1] != value)) {
                return false;
            }
        }
        return true;
    }
}

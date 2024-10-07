package basics.basics.arrays;

/**
 * Utility class for splitting an integer into an array of its digits.
 * Author: Yassin Sohim
 */
public class Splitter {

    /**
     * Splits the given integer into an array of its digits.
     *
     * @param input The integer to be split.
     * @return An int[] where each element represents a digit of the input.
     */
    public static int[] splitter(int input) {
        String s = String.valueOf(input);
        int[] result = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            result[i] = Character.getNumericValue(s.charAt(i));
        }
        return result;
    }
}

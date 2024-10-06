package basics.basics.arrays;

/**
 * Utility class to generate the Fibonacci sequence.
 * Author: Yassin Sohim
 */
public class Fibonacci {

    /**
     * Generates the first n numbers of the Fibonacci series.
     *
     * @param n The number of Fibonacci numbers to generate.
     * @return A long array containing the first n Fibonacci numbers.
     *         Returns an empty array if n is 0, and special cases for n = 1 and n = 2.
     */
    public static long[] fibonacci(int n) {
        if (n == 0)
            return new long[]{};
        else if (n == 1)
            return new long[]{0};
        else if (n == 2)
            return new long[]{0, 1};

        long[] result = new long[n];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n; i++)
            result[i] = result[i - 1] + result[i - 2];
        return result;
    }
}

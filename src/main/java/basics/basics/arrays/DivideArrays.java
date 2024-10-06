package basics.basics.arrays;

/**
 * Utility class to divide corresponding elements of two double arrays.
 * Author: Yassin Sohim
 */
public class DivideArrays {

    /**
     * Divides each element of the first array by the corresponding element of the second array.
     *
     * @param v1 The array containing the dividends.
     * @param v2 The array containing the divisors.
     * @return A new double array with the result of dividing corresponding elements of v1 by v2.
     *         Returns an empty array if the two input arrays have different lengths.
     */
    public static double[] divideArrays(double[] v1, double[] v2) {
        if (v1.length != v2.length)
            return new double[]{};
        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++)
            result[i] = v1[i] / v2[i];
        return result;
    }
}

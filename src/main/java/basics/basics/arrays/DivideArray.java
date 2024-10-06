package basics.basics.arrays;

/**
 * Utility class to divide elements of a double array by a given factor.
 * Author: Yassin Sohim
 */
public class DivideArray {

    /**
     * Divides each element of the input double array by the specified factor.
     *
     * @param v      The double array to be divided.
     * @param factor The divisor used to divide each element in the array.
     * @return A new double array with elements divided by the given factor, or null if the input array is null.
     */
    public static double[] divideArray(double[] v, double factor) {
        if (v == null)
            return null;
        else {
            for (int i = 0; i < v.length; i++)
                v[i] = v[i] / factor;
        }
        return v;
    }
}

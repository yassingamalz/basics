package basics.basics.arrays;

/**
 * This class provides a method to copy the contents of a double array.
 * Author: Yassin Sohim
 */
public class CopyArray {

    /**
     * Copies the input array into a new array.
     * If the input array is null, the method returns null.
     *
     * @param v The input double array to be copied.
     * @return A new double array that is a copy of the input array.
     */
    public static double[] copyArray(double[] v) {
        if (v == null)
            return null; // Return null if the input array is null

        // Create a new array and copy elements from the input array using System.arraycopy
        double[] copiedArray = new double[v.length];
        System.arraycopy(v, 0, copiedArray, 0, v.length);
        return copiedArray; // Return the copied array
    }

}

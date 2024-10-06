package basics.basics.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

/**
 * Utility class to fill an array with a specified value and optionally add noise.
 */
public class FillArray {

    /**
     * Fills a new double array with a specified value. Optionally, adds noise to each element
     * within a 5% range of the specified value.
     *
     * @param size     The size of the array to create.
     * @param value    The value to assign to all elements in the array.
     * @param addNoise If true, each element will be randomly adjusted within 5% of the value.
     * @return A double array of the specified size, filled with the given value, with optional noise.
     */
    public static double[] fillArray(int size, double value, boolean addNoise) {
        double[] result = new double[size];
        Arrays.fill(result, value);
        if (addNoise) {
            RandomGenerator randomGenerator = RandomGenerator.getDefault();
            for (int i = 0; i < result.length; i++) {
                result[i] += randomGenerator.nextDouble(-value, value) * 0.05;
            }
        }

        return result;
    }
}

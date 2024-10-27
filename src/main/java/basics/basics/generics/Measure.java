package basics.basics.generics;

/**
 * The {@code Measure} class provides utility methods to find the maximum
 * and minimum elements in an array based on a custom measurement criteria.
 *
 * @param <T> the type of elements to measure
 * @author Yassin Sohim
 */
public class Measure {

    /**
     * Finds the maximum element in an array based on a custom measurement.
     *
     * @param array the array to search
     * @param measurer the measurer to determine the value of elements
     * @param <T> the type of elements in the array
     * @return the maximum element according to the measurer
     */
    public static <T> T max(T[] array, Measurer<T> measurer) {
        T max = array[0];
        for (T item : array) {
            if (measurer.measure(item) > measurer.measure(max)) {
                max = item;
            }
        }
        return max;
    }

    /**
     * Finds the minimum element in an array based on a custom measurement.
     *
     * @param array the array to search
     * @param measurer the measurer to determine the value of elements
     * @param <T> the type of elements in the array
     * @return the minimum element according to the measurer
     */
    public static <T> T min(T[] array, Measurer<T> measurer) {
        T min = array[0];
        for (T item : array) {
            if (measurer.measure(item) < measurer.measure(min)) {
                min = item;
            }
        }
        return min;
    }

    /**
     * The {@code Measurer} interface defines a method for measuring the
     * value of an object of type {@code T}.
     *
     * @param <T> the type of objects to measure
     */
    public interface Measurer<T> {
        double measure(T obj);
    }
}

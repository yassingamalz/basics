package basics.basics.generics;

import java.util.Comparator;
import java.util.List;

/**
 * The {@code MinMax} class provides utility methods to find the maximum
 * and minimum elements in a list based on a specified comparator.
 *
 * @param <T> the type of elements in the list
 * @author Yassin Sohim
 */
public class MinMax {

    /**
     * Finds the maximum element in a list based on a specified comparator.
     *
     * @param list the list to search
     * @param cmp the comparator to determine the ordering of elements
     * @param <T> the type of elements in the list
     * @return the maximum element according to the comparator
     */
    public static <T> T max(List<T> list, Comparator<? super T> cmp) {
        T max = list.get(0); // Corrected to get the first element
        for (T element : list) {
            if (cmp.compare(element, max) > 0) {
                max = element;
            }
        }
        return max;
    }

    /**
     * Finds the minimum element in a list based on a specified comparator.
     *
     * @param list the list to search
     * @param cmp the comparator to determine the ordering of elements
     * @param <T> the type of elements in the list
     * @return the minimum element according to the comparator
     */
    public static <T> T min(List<T> list, Comparator<? super T> cmp) {
        T min = list.get(0); // Corrected to get the first element
        for (T element : list) {
            if (cmp.compare(element, min) < 0) {
                min = element;
            }
        }
        return min;
    }
}

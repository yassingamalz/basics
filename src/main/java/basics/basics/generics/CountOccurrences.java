package basics.basics.generics;

import java.util.Objects;

/**
 * The {@code CountOccurrences} class provides utility methods to count the occurrences
 * of a specified item in an array.
 *
 * Example usage:
 * <pre>
 *     String[] array = {"apple", "banana", "apple", null, "banana"};
 *     int count = CountOccurrences.countOccurrencesPlain(array, "apple"); // count is 2
 * </pre>
 *
 * @param <T> the type of elements in the array
 *
 * @author Yassin Sohim
 */
public class CountOccurrences {

    /**
     * Counts the occurrences of the specified item in the given array.
     *
     * @param src  the source array to search
     * @param item the item to count occurrences of
     * @return the count of occurrences
     */
    public static <T> int countOccurrencesPlain(T[] src, T item) {
        int count = 0;
        if (item == null) {
            for (T listItem : src) {
                if (listItem == null) count++;
            }
        } else {
            for (T listItem : src) {
                if (item.equals(listItem)) count++;
            }
        }
        return count;
    }

    /**
     * Counts the occurrences of the specified item in the given array
     * using {@link Objects#equals(Object, Object)} for null-safe comparison.
     *
     * @param src  the source array to search
     * @param item the item to count occurrences of
     * @return the count of occurrences
     */
    public static <T> int countOccurrencesObjects(T[] src, T item) {
        int count = 0;
        for (T t : src)
            if (Objects.equals(item, t)) count++;
        return count;
    }
}

package basics.basics.collections.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * The {@code RemoveDuplicates} class provides a utility method to remove duplicate
 * elements from a list of integers.
 * <p>
 * The method internally uses a {@link HashSet} to filter out duplicates, and then
 * returns a new list containing only unique elements.
 * <p>
 * Example usage:
 * <pre>
 *     List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
 *     List<Integer> uniqueNumbers = RemoveDuplicates.removeDuplicates(numbers);
 *     // uniqueNumbers will contain [1, 2, 3, 4, 5]
 * </pre>
 * <p>
 * This class is useful for simplifying lists by eliminating repeated values.
 *
 * @author Yassin Sohim
 */
public class RemoveDuplicates {

    /**
     * Removes duplicate integers from the given list and returns a new list with only unique values.
     *
     * @param list the input list containing integers, possibly with duplicates
     * @return a list containing only unique integers from the input list
     */
    public static List<Integer> removeDuplicates(List<Integer> list) {
        return new ArrayList<>(new HashSet<>(list));
    }
}

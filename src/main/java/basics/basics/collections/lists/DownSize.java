package basics.basics.collections.lists;

import java.util.Iterator;
import java.util.List;

/**
 * A utility class that provides a method to downsize a list by removing every nth element.
 * The class operates on a list of strings and removes elements in-place using an iterator.
 *
 * Example usage:
 * <pre>
 *     List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "David", "Eve"));
 *     DownSize.downsize(names, 2); // Removes every 2nd element, result: ["Alice", "Charlie", "Eve"]
 * </pre>
 *
 * @author Yassin Sohim
 */
public class DownSize {
    /**
     * Downsizes the provided list by removing every nth element.
     *
     * @param list the list of strings to downsize
     * @param n the step at which to remove elements (every nth element is removed)
     * @throws IllegalArgumentException if n is less than 1
     */
    public static void downsize(List<String> list, int n) {
        if (n < 1) throw new IllegalArgumentException("n must be greater than 0");

        int counter = 1;
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            iterator.next();
            if (counter++ % n == 0) iterator.remove();
        }
    }
}

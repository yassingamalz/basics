package basics.basics.collections.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * The {@code Union} class provides methods for calculating the union of two sets.
 * It demonstrates two approaches: one using an {@code Iterator} and another using the
 * {@code addAll} method.
 *
 * Example usage:
 * <pre>
 *     Set<Integer> set1 = Set.of(1, 2, 3);
 *     Set<Integer> set2 = Set.of(3, 4, 5);
 *     Set<Integer> result = Union.union(set1, set2);
 *     // result will contain [1, 2, 3, 4, 5]
 * </pre>
 *
 * This class is useful for combining two sets where all unique elements need to be retained.
 *
 * @author Yassin Sohim
 */
public class Union {

    /**
     * Returns the union of two sets using an {@code Iterator}.
     *
     * @param first  the first set
     * @param second the second set
     * @return a new set containing the union of the two input sets
     */
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        Iterator<Integer> iterator = second.iterator();
        while (iterator.hasNext()) result.add(iterator.next());
        return result;
    }

    /**
     * Returns the union of two sets using the {@code addAll} method.
     *
     * @param first  the first set
     * @param second the second set
     * @return a new set containing the union of the two input sets
     */
    public static Set<Integer> unionAddAll(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }
}

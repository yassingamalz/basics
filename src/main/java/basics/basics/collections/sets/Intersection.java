package basics.basics.collections.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * The {@code Intersection} class provides methods for calculating the intersection of two sets.
 * It demonstrates two approaches: one using the {@code removeIf} method and another using the
 * {@code retainAll} method.
 *
 * Example usage:
 * <pre>
 *     Set<Integer> set1 = Set.of(1, 2, 3, 4);
 *     Set<Integer> set2 = Set.of(3, 4, 5, 6);
 *     Set<Integer> result = Intersection.intersection(set1, set2);
 *     // result will contain [3, 4]
 * </pre>
 *
 * This class is useful for operations where common elements between two sets need to be extracted.
 *
 * @author Yassin Sohim
 */
public class Intersection {

    /**
     * Returns the intersection of two sets using the {@code removeIf} method.
     *
     * @param first  the first set
     * @param second the second set
     * @return a new set containing the elements present in both input sets
     */
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.removeIf(integer -> !second.contains(integer));
        return result;
    }

    /**
     * Returns the intersection of two sets using the {@code retainAll} method.
     *
     * @param first  the first set
     * @param second the second set
     * @return a new set containing the elements present in both input sets
     */
    public static Set<Integer> intersectionRetainAll(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }
}

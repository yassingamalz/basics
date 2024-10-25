package basics.basics.collections.maps;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * The {@code ValuesKeys} class provides methods to check if a {@link Map} contains
 * any of its values as keys.
 *
 * This functionality is helpful in scenarios where relationships between keys and values
 * within a map need to be validated or cross-referenced.
 *
 * Example usage:
 * <pre>
 *     Map&lt;String, String&gt; map = new HashMap&lt;&gt;();
 *     map.put("A", "B");
 *     map.put("B", "C");
 *     map.put("C", "A");
 *     boolean hasMatchingValueKey = ValuesKeys.valuesKeys(map);
 *     // hasMatchingValueKey will be true
 * </pre>
 *
 * Both {@code valuesKeys} and {@code valuesKeysTwo} methods provide the same functionality,
 * with the latter using a {@link Set} to find intersections.
 *
 * @version 1.0
 * @author Yassin Sohim
 */
public class ValuesKeys {

    /**
     * Checks if any value in the map also exists as a key.
     *
     * @param map the map to check
     * @return {@code true} if there is a value that is also a key in the map, {@code false} otherwise
     */
    public static boolean valuesKeys(Map<String, String> map) {
        for (String value : map.values())
            if (map.containsKey(value)) return true;
        return false;
    }

    /**
     * Alternative method that checks if any value in the map also exists as a key,
     * using a set intersection approach.
     *
     * @param map the map to check
     * @return {@code true} if there is a value that is also a key in the map, {@code false} otherwise
     */
    public static boolean valuesKeysTwo(Map<String, String> map) {
        Set<String> intersection = new HashSet<>(map.keySet());
        intersection.retainAll(new HashSet<>(map.values()));
        return !intersection.isEmpty();
    }
}

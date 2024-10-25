package basics.basics.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * The {@code InvertMap} class provides a utility method for inverting a given map,
 * where the keys and values are swapped. Specifically, it inverts a {@code Map<Integer, String>}
 * into a {@code Map<String, Integer>}.
 *
 * Example usage:
 * <pre>
 *     Map<Integer, String> originalMap = Map.of(1, "A", 2, "B");
 *     Map<String, Integer> invertedMap = InvertMap.invertMap(originalMap);
 *     // invertedMap will contain {"A" -> 1, "B" -> 2}
 * </pre>
 *
 * This class is useful when reverse lookup functionality is needed in map structures.
 * Note: If there are duplicate values in the original map, the resulting inverted map
 * will retain only the last key mapped to that value.
 *
 * @author Yassin Sohim
 * @see java.util.Map
 * @see java.util.HashMap
 *
 */
public class InvertMap {

    /**
     * Inverts the given map by swapping its keys and values.
     *
     * @param src the source map to be inverted
     * @return a new map where keys are values from the source map, and values are keys from the source map
     */
    public static Map<String, Integer> invertMap(Map<Integer, String> src) {
        Set<Integer> integers = src.keySet();
        Map<String, Integer> inverted = new HashMap<>();
        for (Integer value : integers)
            inverted.put(src.get(value), value);

        return inverted;
    }
}

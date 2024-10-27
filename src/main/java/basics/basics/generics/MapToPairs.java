package basics.basics.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * The {@code MapToPairs} class provides a utility method to convert
 * a map into a list of pairs.
 *
 * @author Yassin Sohim
 */
public class MapToPairs {

    /**
     * Converts a map into a list of pairs.
     *
     * @param src the map to convert
     * @param <K> the type of keys in the map
     * @param <V> the type of values in the map
     * @return a list of pairs containing the key-value mappings from the map
     */
    public static <K, V> List<Pair<K, V>> mapToPairs(Map<K, V> src) {
        List<Pair<K, V>> mapped = new ArrayList<>();
        for (Map.Entry<K, V> entry : src.entrySet())
            mapped.add(new Pair<>(entry.getKey(), entry.getValue()));
        return mapped;
    }
}

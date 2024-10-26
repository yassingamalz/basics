package basics.basics.collections.maps;

import java.util.*;

/**
 * The {@code WordFrequencySorted} class provides methods to sort and limit the number of
 * word-frequency entries in a given map, allowing extraction of the most or least frequent words.
 * This class is designed to be used in applications where word frequency sorting and selection
 * are required.
 *
 * Example usage:
 * <pre>
 *     Map<String, Integer> wordCounts = WordFrequency.wordFrequency("file.txt");
 *     Map<String, Integer> topWords = WordFrequencySorted.mostFrequent(wordCounts, 10);
 * </pre>
 *
 * @author Yassin Sohim
 * @see java.util.Map
 * @see java.util.Comparator
 */
public class WordFrequencySorted {

    /**
     * Sorts and limits the number of entries in the specified map based on a comparator.
     *
     * @param map         the map containing word-frequency pairs to sort and limit
     * @param comparator  the comparator used for sorting the entries
     * @param limit       the maximum number of entries to include in the result
     * @return a sorted and limited map with word-frequency pairs
     */
    public static Map<String, Integer> sortAndCut(Map<String, Integer> map, Comparator<Map.Entry<String, Integer>> comparator, int limit) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(comparator);
        entries = new ArrayList<>(entries.subList(0, limit));

        Map<String, Integer> dst = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            dst.put(entry.getKey(), entry.getValue());
        }
        return dst;
    }

    /**
     * Retrieves the most frequent words, sorted by frequency in descending order, and limited to a specified number.
     *
     * @param map   the map containing word-frequency pairs
     * @param limit the maximum number of entries to include in the result
     * @return a map of the most frequent words with their counts
     */
    public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit) {
        return sortAndCut(map, (o1, o2) -> o2.getValue() - o1.getValue(), limit);
    }

    /**
     * Retrieves the least frequent words, sorted by frequency in ascending order, and limited to a specified number.
     *
     * @param map   the map containing word-frequency pairs
     * @param limit the maximum number of entries to include in the result
     * @return a map of the least frequent words with their counts
     */
    public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit) {
        return sortAndCut(map, (o1, o2) -> o1.getValue() - o2.getValue(), limit);
    }
}

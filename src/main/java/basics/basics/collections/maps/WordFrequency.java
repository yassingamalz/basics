package basics.basics.collections.maps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The {@code WordFrequency} class provides a utility method to calculate the frequency
 * of each word in a text file. Words are considered case-insensitive, and punctuation
 * is ignored to ensure accurate counting.
 *
 * Example usage:
 * <pre>
 *     Map<String, Integer> wordCounts = WordFrequency.wordFrequency("file.txt");
 *     // wordCounts will contain a mapping of each word to its frequency in the file
 * </pre>
 *
 * This class is useful for applications in text analysis, indexing, and other contexts where
 * word frequency statistics are needed.
 *
 * Note: Only alphabetic characters are considered in words, and the method filters out other symbols.
 *
 * @author Yassin Sohim
 * @see java.util.Map
 * @see java.nio.file.Files
 *
 */
public class WordFrequency {

    /**
     * Counts the frequency of each word in the specified file.
     *
     * @param filename the name of the file to analyze
     * @return a map containing words and their corresponding frequencies
     * @throws IOException if an I/O error occurs reading from the file
     */
    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        Map<String, Integer> countingMap = new HashMap<>();
        for (String line : getLines(filename)) {
            for (String word : lineToWords(line)) {
                if (countingMap.containsKey(word.toLowerCase()))
                    countingMap.put(word.toLowerCase(), countingMap.get(word) + 1);
                else
                    countingMap.put(word.toLowerCase(), 1);
            }
        }
        return countingMap;
    }

    /**
     * Reads all lines from the specified file.
     *
     * @param filename the name of the file to read
     * @return a list of strings, each representing a line from the file
     * @throws IOException if an I/O error occurs reading from the file
     */
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    /**
     * Converts a line of text into a list of words, removing punctuation and making words lowercase.
     *
     * @param line the line of text to convert
     * @return a list of words in the line
     */
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
}

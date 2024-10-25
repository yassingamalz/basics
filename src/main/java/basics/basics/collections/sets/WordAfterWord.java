package basics.basics.collections.sets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * The {@code WordAfterWord} class provides a utility method for finding the next word
 * in alphabetical order following a specified word within a text file.
 *
 * <p>The {@code wordAfterWord} method accepts a filename and a target word, reads
 * the file line by line, extracts individual words, and returns the first word
 * in lexicographical order that comes after the specified word.
 *
 * <p>This class is particularly useful in scenarios where a sorted lexicographical
 * order of words is needed, or to quickly find the next word after a given one.
 *
 * <p>Example usage:
 * <pre>
 *     String nextWord = WordAfterWord.wordAfterWord("sample.txt", "hello");
 *     // nextWord will be the first word alphabetically after "hello"
 * </pre>
 *
 * <p>Note: The class uses a {@link TreeSet} to store words, providing automatic
 * sorting and efficient lookup.
 *
 * @author Yassin Sohim
 */
public class WordAfterWord {

    /**
     * Finds the first word lexicographically after the specified word within a file.
     *
     * @param filename the name of the file to read
     * @param word the word to find the successor of
     * @return the word that follows the specified word in lexicographical order
     * @throws IOException if an I/O error occurs reading from the file
     */
    public static String wordAfterWord(String filename, String word) throws IOException {
        TreeSet<String> words = new TreeSet<>();
        List<String> lines = getLines(filename);
        for (String line : lines)
            words.addAll(lineToWords(line));

        return words.tailSet(word, false).first();
    }

    /**
     * Reads all lines from a file.
     *
     * @param filename the name of the file to read
     * @return a list of strings, each representing a line in the file
     * @throws IOException if an I/O error occurs reading from the file
     */
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    /**
     * Converts a line of text into a list of lowercase words, removing punctuation.
     *
     * @param line the line of text to convert
     * @return a list of words from the line
     */
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
}

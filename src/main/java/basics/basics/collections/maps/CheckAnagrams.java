package basics.basics.collections.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@code CheckAnagrams} class provides a utility method to determine if two strings
 * are anagrams of each other.
 *
 * An anagram is defined as a rearrangement of the characters of one word to form another word.
 * This class compares the frequency of each character in both strings to check if they are anagrams.
 *
 * Example usage:
 * <pre>
 *     boolean result = CheckAnagrams.areAnagrams("listen", "silent");
 *     // result will be true since "listen" and "silent" are anagrams
 * </pre>
 *
 * This class can be used in applications that require text analysis or character comparison.
 *
 * @see java.util.Map
 * @see java.util.HashMap
 * @author Yassin Sohim
 */
public class CheckAnagrams {

    /**
     * Determines if two strings are anagrams of each other by comparing the frequency of each character.
     *
     * @param first  the first string
     * @param second the second string
     * @return {@code true} if both strings are anagrams, {@code false} otherwise
     */
    public static boolean areAnagrams(String first, String second) {
        if (first.length() != second.length()) return false;
        Map<Character, Integer> secondMapper = new HashMap<>();

        Map<Character, Integer> firstMapper = new HashMap<>();
        for (Character character : first.toCharArray())
            firstMapper.put(character, firstMapper.get(character) == null ? 1 : firstMapper.get(character) + 1);

        for (Character character : second.toCharArray())
            secondMapper.put(character, secondMapper.get(character) == null ? 1 : secondMapper.get(character) + 1);

        return firstMapper.equals(secondMapper);
    }
}

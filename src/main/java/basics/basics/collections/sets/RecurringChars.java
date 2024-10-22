package basics.basics.collections.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * The {@code RecurringChars} class provides a method to find recurring characters in a string.
 * It uses two sets: one to track characters that have been seen and another to store duplicates.
 *
 * Example usage:
 * <pre>
 *     Set<Character> duplicates = RecurringChars.recurringChars("programming");
 *     // duplicates will contain ['r', 'g', 'm']
 * </pre>
 *
 * This class is useful for identifying characters that appear more than once in a string.
 *
 * @author Yassin Sohim
 */
public class RecurringChars {

    /**
     * Finds and returns the set of recurring characters in the given string.
     *
     * @param string the input string
     * @return a set containing the recurring characters in the input string
     */
    public static Set<Character> recurringChars(String string) {
        Set<Character> seen = new HashSet<>();
        Set<Character> duplication = new HashSet<>();
        for (Character characterToCheck : string.toCharArray())
            if (!seen.contains(characterToCheck))
                seen.add(characterToCheck);
            else
                duplication.add(characterToCheck);
        return duplication;
    }
}

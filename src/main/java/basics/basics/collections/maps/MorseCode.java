package basics.basics.collections.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@code MorseCode} class provides a method to convert a given string
 * into its equivalent Morse code representation.
 *
 * The class uses a mapping of characters to their Morse code equivalents,
 * supporting both lowercase letters and digits. If the input contains any
 * unsupported characters, an {@link IllegalArgumentException} is thrown.
 *
 * Example usage:
 * <pre>
 *     String morse = MorseCode.morseCode("hello 123");
 *     // morse will be ".... . .-.. .-.. --- .____ ..___ ...__"
 * </pre>
 *
 * This class is useful for applications that require Morse code encoding.
 *
 * @author Yassin Sohim
 */
public class MorseCode {

    /**
     * Converts the given string into Morse code.
     *
     * @param string the input string to be converted, which may contain lowercase letters and digits
     * @return a string representing the Morse code equivalent of the input string
     * @throws IllegalArgumentException if the input string contains unsupported characters
     */
    public static String morseCode(String string) {
        Map<Character, String> morseCodeMap = getMorseCodeMap();

        for (Character c : string.toLowerCase().toCharArray())
            if (!morseCodeMap.containsKey(c)) throw new IllegalArgumentException("not supported");

        StringBuilder result = new StringBuilder();
        for (Character c : string.toLowerCase().toCharArray())
            result.append(morseCodeMap.get(c)).append(" ");

        return result.toString().trim();
    }

    /**
     * Creates a map that associates characters with their corresponding Morse code.
     *
     * @return a map containing characters as keys and their Morse code representations as values
     */
    private static Map<Character, String> getMorseCodeMap() {
        Map<Character, String> morseCodeMap = new HashMap<>();

        // Adding Morse codes for lowercase letters
        morseCodeMap.put('a', "._");
        morseCodeMap.put('b', "_...");
        morseCodeMap.put('c', "_._.");
        morseCodeMap.put('d', "_..");
        morseCodeMap.put('e', ".");
        morseCodeMap.put('f', ".._.");
        morseCodeMap.put('g', "__.");
        morseCodeMap.put('h', "....");
        morseCodeMap.put('i', "..");
        morseCodeMap.put('j', ".___");
        morseCodeMap.put('k', "_._");
        morseCodeMap.put('l', "._..");
        morseCodeMap.put('m', "__");
        morseCodeMap.put('n', "_.");
        morseCodeMap.put('o', "___");
        morseCodeMap.put('p', ".__.");
        morseCodeMap.put('q', "__._");
        morseCodeMap.put('r', "._.");
        morseCodeMap.put('s', "...");
        morseCodeMap.put('t', "_");
        morseCodeMap.put('u', ".._");
        morseCodeMap.put('v', "..._");
        morseCodeMap.put('w', ".__");
        morseCodeMap.put('x', "_.._");
        morseCodeMap.put('y', "_.__");
        morseCodeMap.put('z', "__..");

        // Adding Morse codes for numbers
        morseCodeMap.put('0', "_____");
        morseCodeMap.put('1', ".____");
        morseCodeMap.put('2', "..___");
        morseCodeMap.put('3', "...__");
        morseCodeMap.put('4', "...._");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "_....");
        morseCodeMap.put('7', "__...");
        morseCodeMap.put('8', "___..");
        morseCodeMap.put('9', "____.");
        return morseCodeMap;
    }
}

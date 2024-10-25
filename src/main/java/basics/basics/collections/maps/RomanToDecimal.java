package basics.basics.collections.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@code RomanToDecimal} class provides a method for converting a given Roman numeral string
 * to its equivalent decimal integer.
 *
 * This class supports Roman numerals up to a length of 15 characters. An {@link IllegalArgumentException}
 * is thrown if the input string exceeds this length or is empty.
 *
 * Example usage:
 * <pre>
 *     int decimalValue = RomanToDecimal.romanToDecimal("XIV");
 *     // decimalValue will be 14
 * </pre>
 *
 * This class is useful for applications that require Roman numeral processing.
 *
 * @author Yassin Sohim
 */
public class RomanToDecimal {

    /**
     * Converts a Roman numeral string to its decimal equivalent.
     *
     * @param s the Roman numeral string to be converted
     * @return an integer representing the decimal value of the Roman numeral
     * @throws IllegalArgumentException if the input string is empty or exceeds 15 characters
     */
    public static int romanToDecimal(String s) {
        Map<Character, Integer> romanNumbers = getRomanNumbers();
        if (s.length() > 15 || s.isEmpty()) throw new IllegalArgumentException("out of range");

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i < s.length() - 1) && (romanNumbers.get(s.charAt(i)) < romanNumbers.get(s.charAt(i + 1))))
                result -= romanNumbers.get(s.charAt(i));
            else
                result += romanNumbers.get(s.charAt(i));
        }
        return result;
    }

    /**
     * Creates a map that associates Roman numeral characters with their decimal values.
     *
     * @return a map containing Roman numeral characters as keys and their corresponding decimal values as values
     */
    private static Map<Character, Integer> getRomanNumbers() {
        Map<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        return romanNumbers;
    }
}

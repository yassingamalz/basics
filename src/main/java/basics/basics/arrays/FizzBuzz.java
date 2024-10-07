package basics.basics.arrays;

/**
 * Utility class to generate the FizzBuzz series for a given range of numbers.
 * Returns "Fizz" for multiples of 3, "Buzz" for multiples of 5, and "FizzBuzz" for multiples of both.
 * For all other numbers, it returns the number itself as a String.
 * Author: Yassin Sohim
 */
public class FizzBuzz {

    /**
     * Generates a FizzBuzz series starting from 'start' (inclusive) to 'end' (exclusive).
     *
     * @param start The starting number of the series (inclusive).
     * @param end   The ending number of the series (exclusive).
     * @return A String array containing "Fizz", "Buzz", "FizzBuzz", or the number as a String.
     */
    public static String[] fizzBuzz(int start, int end) {
        // Check if start is greater than or equal to end, or if start is negative.
        if (start >= end || start < 0)
            return new String[]{}; // Return empty array for invalid input.

        String[] result = new String[end - start]; // Create result array of appropriate size.
        int i = 0; // Initialize index for result array.

        // Iterate through the range [start, end)
        while (start < end) {
            // Check if the current number is divisible by 3 or 5
            if (start % 3 == 0 || start % 5 == 0) {
                if (start % 3 == 0)
                    result[i] = "Fizz"; // Assign "Fizz" for multiples of 3.
                if (start % 5 == 0)
                    result[i] = result[i] == null ? "Buzz" : "FizzBuzz"; // Combine Fizz and Buzz for multiples of both.
            } else {
                result[i] = Integer.toString(start); // Assign the number as a String for all other cases.
            }
            i++; // Move to the next index.
            start++; // Move to the next number.
        }
        return result; // Return the final FizzBuzz array.
    }
}

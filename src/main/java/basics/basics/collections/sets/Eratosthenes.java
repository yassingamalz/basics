package basics.basics.collections.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * The {@code Eratosthenes} class provides a utility method to compute prime numbers up to a given limit
 * using the Sieve of Eratosthenes algorithm.
 *
 * The {@code eratosthenes} method generates a set of prime numbers up to the specified integer limit,
 * while the {@code multiples} helper method calculates all multiples of a given integer within a
 * specified range to aid in removing non-prime numbers from the prime set.
 *
 * Example usage:
 * <pre>
 *     Set<Integer> primesUpTo100 = Eratosthenes.eratosthenes(100);
 *     // primesUpTo100 will contain prime numbers up to 100
 * </pre>
 *
 * This class efficiently computes prime numbers and is useful for applications needing prime sets.
 *
 * @author Yassin Sohim
 */
public class Eratosthenes {

    /**
     * Calculates a set of prime numbers up to the specified limit using the Sieve of Eratosthenes algorithm.
     *
     * @param n the upper limit up to which prime numbers are calculated
     * @return a set containing all prime numbers up to {@code n}
     */
    public static Set<Integer> eratosthenes(int n) {
        if (n < 2) return new HashSet<>();
        Set<Integer> series = new HashSet<>();
        for (int i = 2; i <= n; i++)
            series.add(i);

        for (int i = 2; i <= Math.sqrt(n); i++)
            series.removeAll(multiples(i, n));

        return series;
    }

    /**
     * Calculates all multiples of the given integer {@code i} up to the specified limit.
     *
     * @param i the integer whose multiples are to be calculated
     * @param limit the maximum value for multiples
     * @return a set containing all multiples of {@code i} up to {@code limit}
     */
    public static Set<Integer> multiples(int i, int limit) {
        Set<Integer> multiples = new HashSet<>();
        for (int j = 2; i * j <= limit; j++) {
            multiples.add(i * j);
        }
        return multiples;
    }
}

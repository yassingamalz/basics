package basics.basics.oop.basics;

/**
 * A class representing a rational number (a fraction) with a numerator and denominator.
 * It includes methods for adding, multiplying, and simplifying rational numbers.
 * It also provides utilities to calculate the greatest common divisor (GCD) and least common multiple (LCM).
 *
 * This class is immutable, meaning once an instance is created, its state cannot be changed.
 * It automatically reduces fractions to their simplest form.
 *
 * Example usage:
 * <pre>
 *     RationalNumber r1 = new RationalNumber(2, 3);
 *     RationalNumber r2 = new RationalNumber(3, 4);
 *     RationalNumber sum = r1.add(r2);
 *     RationalNumber product = r1.multiply(r2);
 * </pre>
 *
 * @author Yassin Sohim
 */
public record RationalNumber(int numerator, int denominator) {

    /**
     * Constructs a new RationalNumber and simplifies it to its lowest terms.
     *
     * @param numerator the numerator of the rational number
     * @param denominator the denominator of the rational number
     * @throws IllegalArgumentException if the denominator is 0 (as division by zero is undefined)
     */
    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        int greatestCommonDivisor = greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator / greatestCommonDivisor;
        this.denominator = denominator / greatestCommonDivisor;
    }

    /**
     * Adds two rational numbers and returns the result as a new RationalNumber.
     *
     * @param o the other RationalNumber to add
     * @return a new RationalNumber representing the sum
     */
    public RationalNumber add(RationalNumber o) {
        int leastCommonMultiple = leastCommonMultiple(denominator, o.denominator());
        return new RationalNumber((numerator * leastCommonMultiple / denominator) +
                (o.numerator() * leastCommonMultiple / o.denominator()),
                leastCommonMultiple);
    }

    /**
     * Multiplies two rational numbers and returns the result as a new RationalNumber.
     *
     * @param o the other RationalNumber to multiply
     * @return a new RationalNumber representing the product
     */
    public RationalNumber multiply(RationalNumber o) {
        return new RationalNumber(numerator * o.numerator(), denominator * o.denominator());
    }

    /**
     * Calculates the greatest common divisor (GCD) of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the greatest common divisor of a and b
     */
    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);
    }

    /**
     * Calculates the least common multiple (LCM) of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the least common multiple of a and b, or 0 if either a or b is zero
     */
    public static int leastCommonMultiple(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    /**
     * Returns a string representation of this RationalNumber in the form of a fraction.
     *
     * @return a string representation of this RationalNumber
     */
    @Override
    public String toString() {
        return "RationalNumber{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }
}

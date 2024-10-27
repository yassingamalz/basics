package basics.basics.exceptions;

/**
 * The {@code DivisionSquared} class provides a method for performing a division,
 * squaring the result, and handling division-by-zero errors.
 *
 * @version 1.0
 * @author Yassin Sohim
 */
public class DivisionSquared {

    /**
     * Divides the given dividend by the divisor, squares the result,
     * and returns zero if a division-by-zero error occurs.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the square of the division result, or zero if an arithmetic exception occurs
     */
    public static int divisionSquared(int a, int b) {
        try {
            return (a / b) * (a / b);
        } catch (ArithmeticException arithmeticException) {
            return 0;
        }
    }
}

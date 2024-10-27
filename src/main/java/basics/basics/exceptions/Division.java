package basics.basics.exceptions;

/**
 * The {@code Division} class provides a method for performing division
 * with error handling for division by zero.
 *
 * @version 1.0
 * @author Yassin Sohim
 */
public class Division {

    /**
     * Divides the given dividend by the divisor.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the result of the division
     * @throws IllegalArgumentException if the divisor is zero
     */
    public static double division(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Divisor cannot be zero");
        return a / b;
    }
}

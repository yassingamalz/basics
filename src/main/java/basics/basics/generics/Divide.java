package basics.basics.generics;

/**
 * The {@code Divide} class provides a generic method to divide two {@code Number} objects,
 * converting them to {@code Double} for precise decimal division.
 *
 * Example usage:
 * <pre>
 *     Double result = Divide.divide(10, 3); // returns 3.3333...
 * </pre>
 *
 * @param <T> the type of the numbers, which extends {@code Number}
 * @return the division result as a {@code Double}
 * @throws ArithmeticException if {@code t2} is zero
 *
 * @author Yassin Sohim
 */
public class Divide {
    public static <T extends Number> Double divide(T t1, T t2) {
        if (t2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return t1.doubleValue() / t2.doubleValue();
    }
}

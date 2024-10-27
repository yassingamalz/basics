package basics.basics.exceptions;

import java.time.LocalDate;

/**
 * The {@code CheckIntervalBetweenDates} class provides a method to check if
 * one date is before another.
 *
 * @version 1.0
 * @since 2024-10-27
 * @author Yassin Sohim
 */
public class CheckIntervalBetweenDates {

    /**
     * Checks if the begin date is before the end date.
     *
     * @param begin the start date in "yyyy-MM-dd" format
     * @param end the end date in "yyyy-MM-dd" format
     * @return true if begin is before end, false otherwise
     */
    public static boolean checkIntervalBetweenDates(String begin, String end) {
        LocalDate firstDate = LocalDate.parse(begin);
        LocalDate secondDate = LocalDate.parse(end);
        return firstDate.isBefore(secondDate);
    }
}

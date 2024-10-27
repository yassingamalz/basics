package basics.basics.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * The {@code CheckIntervalBetweenDatesAlt} class provides a method to check
 * if one date is before another with exception handling for invalid date formats.
 *
 * @version 1.0
 * @author Yassin Sohim
 */
public class CheckIntervalBetweenDatesAlt {

    /**
     * Checks if the start date is before the end date, with validation for date format.
     *
     * @param begin the start date in ISO-8601 format (e.g., "YYYY-MM-DD")
     * @param end   the end date in ISO-8601 format (e.g., "YYYY-MM-DD")
     * @return {@code true} if the start date is before the end date and both dates are valid;
     *         {@code false} if the dates are invalid or not in the correct format
     */
    public static boolean checkIntervalBetweenDatesAlt(String begin, String end) {
        try {
            LocalDate firstDate = LocalDate.parse(begin);
            LocalDate secondDate = LocalDate.parse(end);
            return firstDate.isBefore(secondDate);
        } catch (DateTimeParseException exception) {
            return false;
        }
    }
}

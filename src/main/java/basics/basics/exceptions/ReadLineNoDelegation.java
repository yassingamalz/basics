package basics.basics.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The {@code ReadLineNoDelegation} class provides a method to read the first line
 * of a specified file without delegating checked exceptions, returning {@code null}
 * if an I/O error occurs during reading.
 *
 * @version 1.0
 * author Yassin Sohim
 */
public class ReadLineNoDelegation {

    /**
     * Reads the first line of the specified file.
     *
     * @param filename the path to the file to read
     * @return the first line of the file as a {@code String}, or {@code null} if an
     *         I/O error occurs or the file is empty
     */
    public static String readLineNoDelegation(String filename) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            return bufferedReader.readLine();
        } catch (IOException e) {
            return null; // No delegation of exception; returns null on error
        }
    }
}

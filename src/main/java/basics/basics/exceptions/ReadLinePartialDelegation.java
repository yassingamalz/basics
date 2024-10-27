package basics.basics.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;

/**
 * The {@code ReadLinePartialDelegation} class provides a method to read the first line
 * of a file using partial exception delegation, converting checked {@link IOException}
 * into an unchecked {@link UncheckedIOException}.
 *
 * @version 1.0
 * author Yassin Sohim
 */
public class ReadLinePartialDelegation {

    /**
     * Reads the first line of the specified file.
     *
     * @param filename the path to the file to read
     * @return the first line of the file as a {@code String}, or {@code null} if the file is empty
     * @throws UncheckedIOException if an I/O error occurs while reading the file
     */
    public static String readLinePartialDelegation(String filename) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

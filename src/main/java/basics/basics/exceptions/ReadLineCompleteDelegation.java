package basics.basics.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The {@code ReadLineCompleteDelegation} class provides a method to read the first line
 * of a file using complete exception delegation, allowing {@link IOException} to be
 * propagated to the caller.
 *
 * @version 1.0
 * author Yassin Sohim
 */
public class ReadLineCompleteDelegation {

    /**
     * Reads the first line of the specified file.
     *
     * @param filename the path to the file to read
     * @return the first line of the file as a {@code String}, or {@code null} if the file is empty
     * @throws IOException if an I/O error occurs while reading the file
     */
    public static String readLineCompleteDelegation(String filename) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            return bufferedReader.readLine();
        }
    }
}

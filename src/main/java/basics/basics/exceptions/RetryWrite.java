package basics.basics.exceptions;

import java.io.IOException;
import java.util.random.RandomGenerator;

/**
 * The {@code RetryWrite} class provides a method to simulate a write operation
 * that may fail and will retry the operation a specified number of times
 * before giving up and throwing a runtime exception.
 *
 * @version 1.0
 * author Yassin
 */
public class RetryWrite {
    private static final RandomGenerator RND = RandomGenerator.getDefault();

    public static void main(String[] args) {
        try {
            writeWithTries(3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Attempts to call the write() method. If it fails due to an IOException,
     * it retries the call up to maxTries times.
     *
     * @param maxTries the maximum number of retry attempts
     * @throws RuntimeException if the write operation fails after the maximum number of retries
     */
    public static void writeWithTries(int maxTries) {
        int count = 0;
        while (true) {
            try {
                write("Hello world!");
                break;
            } catch (IOException e) {
                System.out.println("write() failed. Retry #" + ++count);
                if (count == maxTries) {
                    throw new RuntimeException("write() failed after " + count + " retries");
                }
            }
        }
    }

    /**
     * Simulates a write operation that has a 66% chance of failing.
     *
     * @param message the message to be written
     * @throws IOException if the simulated write operation fails
     */
    public static void write(String message) throws IOException {
        if (RND.nextDouble() < 0.66) {
            throw new IOException("Unable to send: " + message);
        }
    }
}

package basics.basics.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Words {
    public static long howManyLines(String filename, String subString) throws IOException {
        return getLines(filename)
                .stream()
                .filter(line -> line.contains(subString))
                .count();

    }

    public static long howManyTimes(String filename, String word) throws IOException {
        List<String> lines = getLines(filename);

        return lines.stream()
                .flatMap(line -> Arrays.stream(line.replaceAll("[^a-zA-Z ]", "")
                        .toLowerCase().split("\\s+")))
                .filter(s -> s.equals(word))
                .count();
    }


    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }
}

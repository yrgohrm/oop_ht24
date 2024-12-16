import java.io.*;
import java.nio.file.*;

public class Ex5 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("You must give ONE filename.");
            return;
        }

        Path file = Path.of(args[0]);
        try (var lines = Files.lines(file)) {

            int totalLength = lines.filter(l -> l.contains("and"))
                    .mapToInt(String::length)
                    .sum();

            System.out.println(totalLength);

        } catch (IOException ex) {
            System.err.println("Det gick fel: " + ex.getMessage());
        }
    }
}

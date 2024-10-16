import java.io.*;
import java.nio.file.*;

public class AppendToFile {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("bepa.txt"), StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            writer.write("hejsan hejsan");
        }
    }
}

import java.io.*;
import java.nio.file.*;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = Files.newBufferedReader(Path.of("xx.txt"));
        String line = r.readLine();
        System.out.println(line);

        BufferedWriter w = Files.newBufferedWriter(Path.of("yy.txt"));
        w.write("Hello, world!");
    }
}

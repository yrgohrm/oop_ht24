import java.io.*;
import java.nio.file.*;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader f1 = Files.newBufferedReader(Path.of("xx.txt"));
                BufferedReader f2 = Files.newBufferedReader(Path.of("yy.txt"))) {
            String line1, line2;
            while (true) {
                line1 = f1.readLine();
                line2 = f2.readLine();
                if (line1 == null && line2 == null) {
                    // both files end at the same time
                    break;
                }
                else if (line1 == null || line2 == null || !line1.equals(line2)) {
                    System.out.println("Not a match");
                    break;
                }
            }
        }

    }
}

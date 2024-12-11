import java.io.*;
import java.nio.file.*;

public class App {
    public static void main(String[] args) {
        // läs in en fil från kommandoraden
        // konvertera alla p i den filen till uppercase
        // skriv till en ny fil "out.txt"

        if (args.length != 1) {
            System.err.println("saknar fil!");
            return;
        }

        try {
            String allData = Files.readString(Path.of(args[0]));
            String newData = allData.replaceAll("p", "P");

            // try (BufferedWriter out = Files.newBufferedWriter(Path.of("out.txt"))) {
            //     out.write(newData);
            // }

            Files.writeString(Path.of("out.txt"), newData);
        }
        catch (IOException ex) {
            System.out.println("Det blev fel: " + ex.getMessage());
        }
    }
}
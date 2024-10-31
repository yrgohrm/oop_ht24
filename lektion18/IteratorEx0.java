import java.io.*;
import java.nio.file.*;
import java.util.*;

public class IteratorEx0 {
    public static void main(String[] args) throws IOException {
        List<String> streets = readStreets();
        
        Iterator<String> it = streets.iterator();
        while (it.hasNext()) {
            String street = it.next();

            if (it.hasNext())
                it.next();
                
            if (it.hasNext())
                it.next();

            System.out.println(street);
        }
    }

    private static List<String> readStreets() throws IOException {
        List<String> streets = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Path.of("people.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(";");
                if (split.length != 2) {
                    System.err.println("bad input line, skipping");
                    continue;
                }

                String address = split[1];
                String[] addressParts = address.split("\\s");
                if (split.length == 0) {
                    System.err.println("bad input line, skipping");
                    continue;
                }

                streets.add(addressParts[0]);
            } 
        }

        return streets;
    }
}

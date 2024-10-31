import java.io.*;
import java.nio.file.*;
import java.util.*;

public class StreetCounter {
    public static void main(String[] args) throws IOException {
        List<String> streets = readStreets();
        
        Map<String, Integer> peopleCounter = new TreeMap<>();

        for (String street : streets) {
            // if (peopleCounter.containsKey(street)) {
            //     int count = peopleCounter.get(street);
            //     peopleCounter.put(street, count + 1);
            // }
            // else {
            //     peopleCounter.put(street, 1);
            // }
            
            peopleCounter.merge(street, 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> entry : peopleCounter.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
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

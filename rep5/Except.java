import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Except {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Path.of("second.txt"));
            int countCorrect = countCorrect(lines);
            System.out.println(countCorrect);
        } catch (IOException ex) {
            System.out.println("Fel uppstod med filen: " + ex.getMessage());
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("The file is corrupt: " + ex.getMessage());
        }
    }

    private static int countCorrect(List<String> lines) {
        int count = 0;
        for (String line : lines) {
            String[] parts = line.split(" ");

            if (parts.length != 2) {
                continue;
            }

            try {
                if (isSecond(parts[0], parts[1])) {
                    count++;
                }
            }
            catch (IllegalArgumentException ex) {
                // do nothing
            }
        }

        return count;
    }

    /**
     * Is a needle found as the second character (and forward) in the haystack.
     * 
     * isSecond("afooaaaa", "foo") will return true.
     * 
     * Neither haystack nor needle can be null and haystack must be longer than
     * needle.
     * If this isn't the case, IllegalArgumentException will be thrown.
     * 
     * @param haystack string to search in
     * @param needle   string to search for
     * @return true if the needle is found in the second character and forward
     * @throws IllegalArgumentException if arguments are null or haystack is shorter
     *                                  than needle
     */
    private static boolean isSecond(String haystack, String needle) {
        if (haystack == null) {
            throw new IllegalArgumentException("hackstack must not be null");
        }
        
        if (needle == null) {
            throw new IllegalArgumentException("needle must not be null");
        }

        if (haystack.length() < needle.length()) {
            throw new IllegalArgumentException("haystack is shorter than needle");
        }

        return haystack.substring(1, haystack.length()).startsWith(needle);
    }
}

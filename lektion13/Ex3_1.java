import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Ex3_1 {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter w = Files.newBufferedWriter(Path.of("apa.txt"))) {
            w.write("Hejsan hoppsan");
        }



        try (Scanner input = new Scanner(System.in)) {
            String text = input.nextLine();
            System.out.println(text);
        }   
    }
}

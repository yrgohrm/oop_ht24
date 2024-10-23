import java.util.*;

public class App {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Skriv in en rad text:");
            String text = input.nextLine();
            SpeechSound.countSounds(text);
        }
    }
}
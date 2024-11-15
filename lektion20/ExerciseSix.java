import java.util.*;
import java.util.stream.*;

public class ExerciseSix {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            List<String> names = readNames(input);
            var data = names.stream()
                    .map(String::trim)
                    .filter(s -> s.length() >= 2)
                    .filter(s -> s.charAt(1) != 'a' && s.charAt(1) != 'A')
                    .map(String::toLowerCase)
                    .collect(Collectors.toList());

            System.out.println(data);
        }
    }

    private static List<String> readNames(Scanner input) {
        List<String> names = new ArrayList<>();

        while (true) {
            String name = input.nextLine();
            if (name.isBlank()) {
                return names;
            }

            names.add(name);
        }
    }
}

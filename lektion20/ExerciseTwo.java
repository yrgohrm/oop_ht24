import java.util.*;

public class ExerciseTwo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            List<String> names = readNames(input);
            names.stream()
                    .map(String::trim)
                    .filter(s -> s.length() >= 2)
                    .map(String::toLowerCase)
                    .forEach(System.out::println);
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

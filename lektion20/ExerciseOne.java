import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            List<String> names = readNames(input);
            for (String name : names) {
                System.out.println(name);
            }
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

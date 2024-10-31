import java.util.*;
import java.util.concurrent.*;

public class Exercise1 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("Skriv in ett namn:");
                String name = input.nextLine();

                if (name.isBlank()) {
                    break;
                }

                names.add(name);
            }
        }

        int winner = ThreadLocalRandom.current().nextInt(names.size());
        System.out.println(get(names, winner));
    }

    private static String get(Set<String> names, int winner) {
        // List<String> namesAsList = new ArrayList<>(names);
        // return namesAsList.get(winner);

        Iterator<String> it = names.iterator();
        String result = null;
        for (int i = 0; it.hasNext() && i < winner; i++) {
            result = it.next();
        }
        return result;
    }
}

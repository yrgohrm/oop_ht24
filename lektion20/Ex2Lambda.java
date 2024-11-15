import java.util.*;

public class Ex2Lambda {
    // this is just too much to write for something so easy
    private static boolean endsWithS(String s) {
        return s.endsWith("s");
    }

    public static void main(String[] args) {
        List<String> names = List.of("Hampus", "   ", "Nahid", "Anders", "Eva");

        // method reference, requires writing the whole method (see above)
        names.stream()
            .filter(Ex2Lambda::endsWithS)
            .forEach(System.out::println);

        // using a lambda, writing the method "in place"
        names.stream()
            .filter(s -> s.endsWith("s"))
            .forEach(System.out::println);
    }
}

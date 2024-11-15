import java.util.*;

public class Ex5Closure {
    public static void main(String[] args) {
        List<String> names = List.of("Hampus", "Nahid", "Anders", "Eva");

        final String prefix = "Name: ";
        
        names.stream().map(s -> prefix + s).forEach(System.out::println);
    }
}

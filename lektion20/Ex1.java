import java.util.*;
import java.util.function.*;

public class Ex1 {
    public static void main(String[] args) {
        List<String> names = List.of("Hampus", "   ", "Nahid", "Anders", "Eva");

        var list = names.stream()
                .filter(Predicate.not(String::isBlank))
                .sorted()
                .limit(3)
                .map(String::length)
                .toList();

        // .map(String::toUpperCase)
        // .reduce(0, Integer::sum);
        // .forEach(System.out::println);
        
        System.out.println(list);
    }
}

import java.util.*;

public class ListEx {
    public static void main(String[] args) {
        
        List<String> foo = new ArrayList<>();
        foo.add("Hello");
        foo.add("World");

        System.out.println(foo);

        List<String> bar = List.of("Hello", "World");
        System.out.println(bar);


    }
}

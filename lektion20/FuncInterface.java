import java.util.*;

public class FuncInterface {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>(List.of("Hej", "hopp", "alla", "glada"));

        data.sort((a, b) -> b.compareTo(a));

        System.out.println(data);
    }
}

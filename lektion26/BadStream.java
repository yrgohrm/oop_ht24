import java.util.*;

public class BadStream {
    private static int i = 0;
    public static void main(String[] args) {
        List<String> list = List.of("apa", "bepa", "cepa", "depa");

        list.stream()
            .parallel()
            .map(BadStream::convert)
            .forEach(System.out::println);
    }

    private static String convert(String s) {
        return s + i++;
    }
}

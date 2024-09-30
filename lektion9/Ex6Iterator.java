import java.util.*;

public class Ex6Iterator {
    public static void main(String[] args) {
        List<String> list = List.of("apa", "bepa", "cepa", "depa");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String nextValue = it.next();
            System.out.println(nextValue);
        }

        System.out.println("\n\nNext iteration:");
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            // jump one ahead without looking at it
            it2.next();

            String nextValue = it2.next();
            System.out.println(nextValue);
        }
    }
}

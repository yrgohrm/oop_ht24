import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("foo");
        data.add("bar");
        data.add("baz");
        data.add("boo");
        data.add("xyzzy");
        data.add("apa");

        Iterator<String> it = data.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        System.out.println("\n-------\n");

        it = data.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);

            // skip over the next item if there is one
            if (it.hasNext()) {
                it.next();
            }
        }
    }
}

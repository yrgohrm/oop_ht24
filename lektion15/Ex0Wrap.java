import java.util.*;

public class Ex0Wrap {
    public static void main(String[] args) {
        Integer i = 100;
        int j = i;
        System.out.println(i);
        System.out.println(j);

        List<Integer> foo = new ArrayList<>();
        foo.add(j);
    }
}

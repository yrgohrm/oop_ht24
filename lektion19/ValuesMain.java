import java.util.*;

public class ValuesMain {
    public static void main(String[] args) {
        var values = new Values<String>("foo", "bar");
        System.out.println(values.getValue1());

        var foo = new Values<Integer>(null, null);
        System.out.println(foo.getValue1());
    }
}

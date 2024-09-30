import java.util.*;

public class StringConcat {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add(i);
        }

        String res = "";
        for (Integer i : data) {
            res = res + " - " + i;
        }
        System.out.println(res);

        StringBuilder builder = new StringBuilder();
        for (Integer i : data) {
            builder.append(" - ");
            builder.append(i);
        }
        System.out.println(builder.toString());
    }
}

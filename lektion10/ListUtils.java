import java.util.*;

public class ListUtils {
    public static boolean notEmpty(List<String> strings) {
        for (String string : strings) {
            if (string.length() == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> testData = List.of("Hej", "Hopp", "", "alla");
        System.out.println(notEmpty(testData));
    }
}

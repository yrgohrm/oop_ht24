import java.util.*;

public class NonGenericClassWithGenericMethod {
    public static <T> boolean allSame(List<T> values, Comparator<T> comp) {
        if (values.isEmpty()) {
            return true;
        }

        T first = values.get(0);
        for (T val : values) {
            if (comp.compare(first, val) != 0) {
                return false;
            }
        }

        return true;
    }

    public static void saveExceptions(List<? super RuntimeException> exceptions) {
        exceptions.add(new RuntimeException("error"));
    }

    public static void doStuff() {
        List<Exception> exeptions = new ArrayList<>();
        saveExceptions(exeptions);
    }
}

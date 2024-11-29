import java.text.*;
import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Locale[] generalLocales = Locale.getAvailableLocales();
        System.out.println(Arrays.toString(generalLocales));

        Locale[] numberLocales = NumberFormat.getAvailableLocales();
        System.out.println(Arrays.toString(numberLocales));

        Locale[] dateLocales = DateFormat.getAvailableLocales();
        System.out.println(Arrays.toString(dateLocales));

        System.out.println(generalLocales.length);
        System.out.println(numberLocales.length);
        System.out.println(dateLocales.length);
    }
}

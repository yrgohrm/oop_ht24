import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("sr-Latn-RS"); //new Locale("sv", "SE");

        NumberFormat nf = NumberFormat.getInstance(locale);
        String pi = nf.format(StrictMath.PI);
        System.out.println(pi);

        DateTimeFormatter df = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.SHORT).withLocale(locale);
        LocalDateTime dt = LocalDateTime.now();
        String date = dt.format(df);
        System.out.println(date);

        System.out.printf(locale, "%d %.5f%n", Integer.MAX_VALUE, StrictMath.PI);;
    }
}

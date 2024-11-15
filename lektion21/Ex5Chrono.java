import java.time.*;
import java.time.chrono.*;

public class Ex5Chrono {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        ChronoLocalDate hd = HijrahChronology.INSTANCE.date(now);
        System.out.println(hd);
    }
}

import java.time.*;
import java.time.temporal.*;

public class Ex3Christmas {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime christmas = LocalDateTime.of(today.getYear(), 12, 24, 0, 0);

        Duration toChristmas = Duration.between(today, christmas);
        System.out.println(toChristmas.toMinutes() + " minutes 'til Christmas");

        Period periodToChristmas = Period.between(today.toLocalDate(), christmas.toLocalDate());
        System.out.printf("%d months and %d days 'til Christmas.%n", periodToChristmas.getMonths(),
                periodToChristmas.getDays());

        long days = ChronoUnit.DAYS.between(today, christmas);
        System.out.println(days + " days 'til Christmas.");
    }
}

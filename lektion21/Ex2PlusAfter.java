import java.time.*;
import java.time.temporal.*;

public class Ex2PlusAfter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime yesterdayNow = now.minusDays(1);
        LocalDateTime yesterday = yesterdayNow.truncatedTo(ChronoUnit.DAYS);

        LocalDateTime tomorrow = LocalDateTime.now()
                                    .plusDays(1)
                                    .truncatedTo(ChronoUnit.DAYS);

        System.out.println(now);
        System.out.println(yesterdayNow);

        System.out.println(yesterday);
        System.out.println(tomorrow);

        if (yesterday.isBefore(tomorrow)) {
            System.out.println("Yay! Time works!");
        }

        if (tomorrow.isBefore(yesterday)) {
            System.out.println("Great Scott!");
        }
    }
}

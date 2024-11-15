import java.time.*;

public class Ex1 {
    public static void main(String[] args) {
        Instant i = Instant.now();
        LocalDate d = LocalDate.of(2007, 10, 26);
        LocalDateTime dt = LocalDateTime.now();

        // ZoneId eur = ZoneId.of("Europe/Stockholm");
        ZoneId eur = ZoneId.of("America/New_York");
        ZonedDateTime zdt = ZonedDateTime.now(eur);

        System.out.println(i);
        System.out.println(d);
        System.out.println(dt);
        System.out.println(zdt);
    }
}

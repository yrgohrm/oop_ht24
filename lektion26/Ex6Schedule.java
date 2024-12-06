import java.time.*;
import java.util.concurrent.*;

public class Ex6Schedule {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(0);

        var thing = service.schedule(() -> {
            System.out.println("Now's the time!");
        }, 10, TimeUnit.SECONDS);

        service.scheduleAtFixedRate(() -> {
            System.out.println(Instant.now());
        }, 0, 2, TimeUnit.SECONDS);

        // wait for it to execute
        thing.get();
        
        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);
    }
}

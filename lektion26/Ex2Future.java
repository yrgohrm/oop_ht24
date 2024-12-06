import java.util.concurrent.*;

public class Ex2Future {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<String> f1 = service.submit(() -> {
            sleep(4000);
            return "Hello";
        });

        Future<String> f2 = service.submit(() -> {
            sleep(1000);
            return "World";
        });

        while (!f1.isDone() || !f2.isDone()) {
            sleep(500);
            System.out.printf("Not done yet. f1: %b, f2: %b%n", f1.isDone(), f2.isDone());
        }

        System.out.println(f1.get() + " " + f2.get());

        service.shutdown();
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}

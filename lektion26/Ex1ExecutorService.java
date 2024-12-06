import java.util.concurrent.*;

public class Ex1ExecutorService {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        // ExecutorService service = Executors.newCachedThreadPool();
        // ExecutorService service = Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 0; i < 5; ++i) {
            service.submit(() -> {
                for (int j = 0; j < 5; ++j) {
                    sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        
        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("Nu är alla klara!");
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

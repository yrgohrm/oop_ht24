import java.util.concurrent.*;

public class Ex3Future2 {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            System.out.println("Doing big task!");
            return "hello";
        }).thenApply(s -> {
            System.out.println("Another big task!");
            return s + " world";
        }).thenAccept(s -> {
            System.out.println(s);
        }).exceptionally(ex -> {
            System.out.println("Exception: " + ex.getMessage());
            return null;
        });

        for (int i = 0; i < 10; i++) {
            System.out.println("!!!!!");
        }
    }
}

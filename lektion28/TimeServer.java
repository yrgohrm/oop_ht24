import java.io.*;
import java.net.*;
import java.time.*;
import java.util.concurrent.*;

public class TimeServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        final ExecutorService service = Executors.newCachedThreadPool();

        Runtime.getRuntime().addShutdownHook(
            new Thread(() -> {
                System.err.println("Stäng ner skiten nuuuuu!");
                service.shutdownNow();
            })
        );

        try (ServerSocket ssock = new ServerSocket(34567)) {

            while (true) {
                Socket client = ssock.accept();

                service.submit(() -> handleClient(client));
            }
        }
    }

    private static void handleClient(Socket client) {
        try (var os = client.getOutputStream();
             var bw = new BufferedWriter(new OutputStreamWriter(os))) {

            while (!Thread.currentThread().isInterrupted()) {
                Instant time = Instant.now();
                bw.write(time.toString());
                bw.write("\n");
                bw.flush();

                Thread.sleep(1000);
            }
        }
        catch (IOException ex) {
            System.err.println("I/O Error occurred: " + ex.getMessage());
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        finally {
            try {
                client.close();
            } catch (IOException e) {
                // ignore
            }
        }
    }
}

import java.io.*;
import java.net.*;

public class TimeClient {
    public static void main(String[] args) throws IOException {
        try (Socket sock = new Socket("localhost", 34567);
             var br = new BufferedReader(new InputStreamReader(sock.getInputStream()))) {
            
            while (true) {
                String time = br.readLine();
                System.out.println(time);
            }
        }
    }
}

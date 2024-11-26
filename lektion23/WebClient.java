import java.io.*;
import java.net.*;

public class WebClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("bandersnatch.se", 80);
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os))) {

            writer.write("GET / HTTP/1.1\nHost: bandersnatch.se\nConnection: close\n\n");
            writer.flush();
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

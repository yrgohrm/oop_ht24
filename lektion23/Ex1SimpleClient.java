import java.io.*;
import java.net.*;

public class Ex1SimpleClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 12345);
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os))) {

            for (int i = 0; i < 10; i++) {
                writer.write("hello ");
            }
            writer.write("Ping\n");
            writer.flush();
            
            String answer = reader.readLine();
            System.out.println("Response: " + answer);
        }
    }
}

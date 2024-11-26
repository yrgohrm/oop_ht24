import java.io.*;
import java.net.*;

public class Ex1SimpleServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(12345)) {

            while (true) {
                System.out.println("waiting for connection...");
    
                // the program will wait here until someone connects
                try (Socket connectionToClient = server.accept()) {
    
                    System.out.println("accepted");
            
                    InputStream is = connectionToClient.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            
                    OutputStream os = connectionToClient.getOutputStream();
                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
            
                    System.out.println(reader.readLine());
                    writer.write("Pong\n");
                    writer.flush();
                }
            }
        }

    }
}
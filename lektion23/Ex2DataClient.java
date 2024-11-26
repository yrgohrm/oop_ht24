import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class Ex2DataClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 12345);
             InputStream is = socket.getInputStream();
             OutputStream os = socket.getOutputStream();
             DataInputStream dataIn = new DataInputStream(is);
             DataOutputStream dataOut = new DataOutputStream(os)) {

            int randomOut;
            do {
                randomOut = ThreadLocalRandom.current().nextInt(20);
                dataOut.writeInt(randomOut);
                dataOut.flush();
                int randomIn = dataIn.readInt();
                System.out.println("Response: " + randomIn);
            } while (randomOut != 0);
        }
    }
}

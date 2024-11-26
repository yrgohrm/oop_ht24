import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class Ex3DatagramClient {
    public static void main(String[] args) throws IOException {
        try (DatagramSocket socket = new DatagramSocket()) {
            byte[] buf = new byte[16];
            InetAddress recipient = InetAddress.getByName("localhost");
            DatagramPacket packet = new DatagramPacket(buf, buf.length, recipient, 23456);

            for (int i = 0; i < 4; ++i) {
                ThreadLocalRandom.current().nextBytes(buf);
                socket.send(packet);
            }

            buf[0] = 0;
            socket.send(packet);
        }
    }
}

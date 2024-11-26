import java.io.*;
import java.net.*;

public class Ex3DatagramServer {
    public static void main(String[] args) throws IOException {
        try (DatagramSocket socket = new DatagramSocket(23456)) {
            byte[] buf = new byte[16];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);

            do {
                socket.receive(packet);
                System.out.println("\nRecieved from: " + packet.getAddress());
                for (int i = 0; i < packet.getLength(); ++i) {
                    System.out.print(buf[i] + " ");
                }
            } while (buf[0] != 0);
        }
    }
}

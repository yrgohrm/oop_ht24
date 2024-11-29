import java.io.*;
import java.net.*;
import java.nio.charset.*;
import java.nio.file.*;

public class FileSender {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
        Path file = Path.of(filename);
        try (Socket client = new Socket("localhost", 7634);
                var output = client.getOutputStream();
                var input = Files.newInputStream(file)) {

            
            byte[] byteFilename = ("xyz" + filename).getBytes(StandardCharsets.UTF_8);
            byte size = (byte) byteFilename.length;

            output.write(size);
            output.write(byteFilename);

            byte[] buf = new byte[1024];

            while (true) {
                int readCount = input.read(buf);
                if (readCount == -1) {
                    break;
                }

                output.write(buf, 0, readCount);
            }
        }
    }
}

import java.io.*;
import java.net.*;
import java.nio.charset.*;
import java.nio.file.*;

public class FileReciever {
    public static void main(String[] args) throws IOException {
        try (ServerSocket ssock = new ServerSocket(7634)) {
            Socket client = ssock.accept();
            dumpContentsToFile(client);
        }
    }

    private static void dumpContentsToFile(Socket client) throws IOException {
        try (var is = client.getInputStream()) {

            int size = is.read();
            byte[] byteFilename = new byte[size];
            int offset = 0;

            while (true) {
                int readSize = is.read(byteFilename, offset, size - offset);
                if (offset + readSize == size) {
                    break;
                }

                offset += readSize;
            }
            
            String filename = new String(byteFilename, StandardCharsets.UTF_8);

            try (var output = Files.newOutputStream(Path.of(filename))) {
                byte[] buf = new byte[1024];
    
                while (true) {
                    int readCount = is.read(buf);
                    if (readCount == -1) {
                        break;
                    }
    
                    output.write(buf, 0, readCount);
                }
            }
        }
    }
}

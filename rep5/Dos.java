import java.io.*;
import java.util.zip.*;

public class Dos {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("data.bin");
        int data = 5432;

        GZIPOutputStream gos = new GZIPOutputStream(os);

        DataOutputStream dos = new DataOutputStream(gos);

        for (int i = 0; i < 1000; ++i) {
            dos.writeInt(data);
        }

        dos.close();
    }
}

import java.io.*;

public class Ex10 {
    private static void readFile(String name) {
        try {
            InputStream is = new FileInputStream(name);
            is.read();
        }
        catch (IOException ex) {
            throw new IllegalArgumentException("wrong name: " + name, ex);
        }
    }

    public static void main(String[] args) {
        readFile("nofile.txt");
    }
}

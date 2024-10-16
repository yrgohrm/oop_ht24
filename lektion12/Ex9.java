import java.io.*;

public class Ex9 {
    private static void readFile(String name) throws IOException, CloneNotSupportedException {
        InputStream is = new FileInputStream(name);
        is.read();

        throw new CloneNotSupportedException();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        try {
            readFile("nofile.txt");
        }
        catch (IOException ex) {
            System.out.println("ojdå");
            ex.printStackTrace();
        }
    }
}

import java.io.*;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter some text:");
        String line = reader.readLine();
        System.out.println(line);

        // this is composed of:
        
        // an input stream from wich we can read bytes
        // System.in.read();

        // an input stream reader from which we can read a character
        // InputStreamReader isr = new InputStreamReader(System.in);
        // isr.read();

        // a buffered reader that we can read whole lines from
        // BufferedReader br = new BufferedReader(isr);
        // br.readLine();
    }
}
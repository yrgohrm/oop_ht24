import java.util.*;

public class Ex2ArrayCopy {
    public static void main(String[] args) {
        
        int[] source = new int[10];
        int[] destination;

        // not a copy! both reference the same data!
        destination = source;

        // change the source array
        source[0] = 99;

        // print the destination array, woops, it has changed!
        System.out.println(Arrays.toString(destination));

        // creates new array
        destination = Arrays.copyOf(source, source.length);

        // change the source
        source[0] = 1;

        // print the destination array, it is the same
        System.out.println("Source: " + Arrays.toString(source));
        System.out.println("Dest: " + Arrays.toString(destination));

        // copies into existing array
        System.arraycopy(source, 0, destination, 0, source.length);

        // change the source
        source[0] = 55;

        // print the destination array, it is the same
        System.out.println("Source: " + Arrays.toString(source));
        System.out.println("Dest: " + Arrays.toString(destination));
    }    
}

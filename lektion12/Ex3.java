import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2};
            System.out.printf("%d", array[2]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Oops, det gick illa: " + ex.getMessage());
        }
    }
}

import java.util.*;

public class IfApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv ett tal:");
        int num = input.nextInt();

        if (num > 1000) {
            System.out.println("Det var stort!");
        }
        else if (num > 100) {
            System.out.println("Det var ganska stort.");
        }
        else if (num < 10) {
            System.out.println("Det var litet");
        }
        else {
            System.out.println("Ett ganska vanligt tal.");
        }

        if (num % 2 == 0) {
            System.out.println("och jämnt och fint är det också!");
        }

    }
}

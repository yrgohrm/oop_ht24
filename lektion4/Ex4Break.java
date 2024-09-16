import java.util.*;

public class Ex4Break {
    
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // En oändlig loop!?
            System.out.println("Vilken gångertabell " + "vill du se? (0 = avsluta)");
            int tabell = scanner.nextInt();

            if (tabell == 0) {
                break;
            }

            for (int i = 1; i <= 10; ++i) {
                int produkt = i * tabell;
                System.out.printf("%2d x %2d = %3d\n", tabell, i, produkt);
            }
        }

        System.out.println("Hejdå!");
    }
}

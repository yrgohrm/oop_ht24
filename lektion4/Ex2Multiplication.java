import java.util.Scanner;

public class Ex2Multiplication {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Vilken gångertabell vill du se?");
        int tabell = scanner.nextInt();

        for (int i = 1; i <= 10; ++i) {
            int produkt = i * tabell;
            System.out.printf("%2d x %2d = %3d%n", tabell, i, produkt);
        }

    }
}

import java.util.Scanner;

public class Ex3AllMultiplication {
    public static void main(String[] args) {
        for (int tabell = 2; tabell <= 10; ++tabell) {
            for (int i = 1; i <= 10; ++i) {
                int produkt = i * tabell;
                System.out.printf("%2d x %2d = %3d%n", tabell, i, produkt);
            }
            System.out.println("");
        }
    }
}

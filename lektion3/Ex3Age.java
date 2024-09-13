import java.util.Scanner;

public class Ex3Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Du är myndig.");
        } else {
            System.out.println("Du är inte myndig ännu.");
        }

        System.out.println("Nu är det slut.");
    }
}

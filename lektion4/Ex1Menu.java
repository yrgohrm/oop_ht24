import java.util.Scanner;

public class Ex1Menu {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("[1] Val 1");
            System.out.println("[2] Val 2");
            System.out.println("[3] Val 3");
            System.out.println("[4] Avsluta");
            System.out.println("Ange ett val");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Du valde alternativ 1");
                    break;
                case 2:
                    System.out.println("Du valde alternativ 2");
                    break;
                case 3:
                    System.out.println("Du valde alternativ 3");
                    break;
                case 4:
                    System.out.println("Programmet avslutas");
                    break;
                default:
                    System.out.println("Ogiltigt val");
            }
        } while (choice != 4);
    }
}

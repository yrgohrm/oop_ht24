import java.util.*;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vad heter du?");
        String name = scanner.nextLine();

        System.out.println("Hej på dig " + name);
    }
}

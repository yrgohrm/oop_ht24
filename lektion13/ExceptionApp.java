import java.util.*;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int num = readNumber(input);

            if (num == 0) {
                break;
            }

            sum += num;
        }

        System.out.println("Summan blir: " + sum);
    }

    private static int readNumber(Scanner input) {
        while (true) {
            try {
                System.out.println("Skriv in ett nummer, 0 avslutar:");
                return input.nextInt();
            } catch (InputMismatchException ex) {
                input.nextLine();
                System.out.println("Snälla, skriv in ett tal, det är inte svårt!");
            } catch (IllegalStateException | NoSuchElementException ex) {
                return 0;
            }
        }
    }
}

import java.util.Scanner;

public class Ex2Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vad heter du?");
        String name = scanner.nextLine();

        System.out.println("Hur gammal är du?");
        int age = scanner.nextInt();

        System.out.println("När vill du gå i pension?");
        int pension = scanner.nextInt();

        int time_to_p = pension - age;

        System.out.printf("Hej %s, du är %d år gammal. Det är %d år kvar till pension.", name, age, time_to_p);
    }
}

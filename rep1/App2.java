import java.util.*;

public class App2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        int age = input.nextInt();

        System.out.println("Hur många klubbor har du ätit i ditt liv?");
        int numberOfLolipops = input.nextInt();

        double averageLolipopsPerYear = numberOfLolipops / (double) age;

        System.out.printf("Du har i medel ätit %.2f klubbor om året.%n",
                averageLolipopsPerYear);

    }
}
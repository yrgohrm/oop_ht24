import java.util.*;

public class App1 {
    // This is not the best way to declare local variables
    public static void main(String[] args) {
        Scanner input;
        int age, numberOfLolipops;
        double averageLolipopsPerYear;

        input = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        age = input.nextInt();

        System.out.println("Hur många klubbor har du ätit i ditt liv?");
        numberOfLolipops = input.nextInt();

        averageLolipopsPerYear = numberOfLolipops / (double)age;

        System.out.printf("Du har i medel ätit %.2f klubbor om året.%n",
                averageLolipopsPerYear);
    }
}
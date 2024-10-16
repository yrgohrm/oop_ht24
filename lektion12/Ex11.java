import java.util.*;

public class Ex11 {
    public static void bookSpa() {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("How old are you?");
            int n = input.nextInt();
            if (n < 18) {
                throw new IllegalArgumentException();
            }

            doSpaBooking(n);
        }
        catch (IllegalArgumentException ex) {
            System.err.println("You must be over 18 years old to book a spa");
        }
    }

    private static void doSpaBooking(int age) {
        System.out.println("Spa is booked for age " + age);
    }

    public static void main(String[] args) {
        bookSpa();
    }
}


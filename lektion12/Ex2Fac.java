import java.util.*;

public class Ex2Fac {
    // calculates the facutly 1*2*...*n
    public static int fac(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("the number must be positive");
        }

        if (n > 50) {
            throw new IllegalArgumentException("too big to be calculated properly");
        }

        if (n == 0) {
            return 1;
        }
        else {
            return n * fac(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a number:");
            int n = input.nextInt();
            int res = fac(n);
            System.out.printf("The factulty of %d is %d.%n", n, res);
        }
        catch (IllegalArgumentException ex) {
            System.err.println("Something went wrong: " + ex.getMessage());
        }

        System.out.println("Goodbye!");
    }

}

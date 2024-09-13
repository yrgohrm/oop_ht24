import java.util.*;

public class ExerciseTwoWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in radien: ");
        double radius = scanner.nextDouble();
        
        double circumference = 2 * radius * StrictMath.PI;
        double area = radius * radius * StrictMath.PI; 

        System.out.printf("Omkretsen på cirkeln är %.4f.\n", circumference);
        System.out.printf("Arean på cirkeln är %.6f.\n", area);
        System.out.println("Arean på cirkeln är " + area + ".");

        scanner.close();
    }
}
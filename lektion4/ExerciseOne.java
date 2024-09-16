import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Mata in en bredd på en rektangel: ");
        double width = input.nextDouble();

        System.out.println("Mata in en höjd på en rektangel: ");
        double height = input.nextDouble();

        double circumference = width * 2 + height * 2;
        double area = width * height;

        System.out.printf("Omkretsen är %.2f%n", circumference);
        System.out.printf("Arean är %.2f%n", area);

        if (area > 1000) {
            System.out.println("Rektangeln är jättestor!");
        }
        else if (area < 1) {
            System.out.println("Rektangeln är pytteliten!");
        }
        else {
            System.out.println("Det är en normalstor rektangel.");
        }

        input.close();
    }
}

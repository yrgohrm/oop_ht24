public class ExerciseTwo {
    public static void main(String[] args) {
        double radius = 12.3;
        
        double circumference = 2 * radius * StrictMath.PI;
        double area = radius * radius * StrictMath.PI; 

        System.out.printf("Omkretsen på cirkeln är %.4f.\n", circumference);
        System.out.printf("Arean på cirkeln är %.6f.\n", area);
        System.out.println("Arean på cirkeln är " + area + ".");
    }
}
import java.util.*;

public class LoopExercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vilken storlek på din enhetsmatris?");
        int size = input.nextInt();

        for (int j = 0; j < size; ++j) {
            for (int i = 0; i < size; ++i) {
                if (i == j) {
                    System.out.print("0 ");
                }
                else {
                    System.out.print("1 ");
                }
            }
            
            System.out.println();
        }

        input.close();
    }
}

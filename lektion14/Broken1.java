import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Broken1 {
    private static int min(List<Integer> values) {
        int minValue = values.get(1);

        for (int i = 2; i <= values.size(); ++i) {
            int value = values.get(i);
            if (minValue > value) {
                minValue = value;
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();
        int i;
        while ((i = scanner.nextInt()) != 0) {
            values.add(i);
        }        
        System.out.println("Min value: " + min(values));
    }
}

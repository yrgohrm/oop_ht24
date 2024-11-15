import java.util.*;

public class Ex4MultiLineLambda {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 8);
        
        int val = numbers.stream().reduce(0, (a, b) -> {
            if (a % 2 == 0) {
                return a + b;
            }
            else {
                return a * b;
            }
        });

        System.out.println(val);
    }
}

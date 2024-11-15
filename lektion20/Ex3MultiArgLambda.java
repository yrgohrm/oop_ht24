import java.util.*;

public class Ex3MultiArgLambda {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 8);

        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        
        System.out.println(sum);
    }
}

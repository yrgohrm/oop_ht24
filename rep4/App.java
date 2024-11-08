import java.util.*;

public class App {
    public static void main(String[] args) {
        var apples = new ArrayList<>(List.of(new Apple("red", 200),
                new Apple("green", 300), 
                new Apple("red", 300), 
                new Apple("green", 300), 
                new Apple("red", 100)));

        Collections.sort(apples);

        System.out.println(apples);
    }
}
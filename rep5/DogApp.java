import java.util.*;

public class DogApp {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>(List.of(
                new Dog("Fido", "Schäfer", 43),
                new Dog("Hugo", "Tanthund", 3),
                new Dog("Pluto", "Tax", 4),
                new Dog("Patrick", "Tax", 5),
                new Dog("Ronja", "Rottweiler", 54)));

        Comparator<Dog> breedComparator = Comparator
                .comparing(Dog::breed)
                .thenComparing(Dog::name);

        Collections.sort(dogs, breedComparator);
        // dogs.sort(null);

        var data = dogs.stream()
            .filter(d -> d.weight() < 6)
            .map(Dog::name)
            .filter((String n) -> n.startsWith("H"))
            .sorted()
            .map(String::toUpperCase)
            .toList();

        System.out.println(data);
    }
}

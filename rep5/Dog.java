public record Dog(String name, String breed, int weight) implements Comparable<Dog> {

    @Override
    public int compareTo(Dog o) {
        return name.compareTo(o.name);
    }
    
}

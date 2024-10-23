import java.util.*;

public class Pokemon {
    private String name;
    private int number;
    private List<PokemonType> types;
    private List<PokemonType> weaknesses;
    
    public Pokemon(String name, int number, List<PokemonType> types, List<PokemonType> weaknesses) {
        this.name = name;
        this.number = number;
        this.types = List.copyOf(types);
        this.weaknesses = List.copyOf(weaknesses);
    }

    public List<PokemonType> getWeaknesses() {
        return Collections.unmodifiableList(weaknesses);
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public List<PokemonType> getTypes() {
        return Collections.unmodifiableList(types);
    }   

    @Override
    public String toString() {
        return "Pokemon [name=" + name + ", number=" + number + ", types=" + types + ", weaknesses=" + weaknesses + "]";
    }
}

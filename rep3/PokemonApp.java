import java.util.*;

public class PokemonApp {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            List<Pokemon> pokemons = new ArrayList<>();


            System.out.println("Vad heter din pokemon?");
            String name = input.nextLine();
    
            System.out.println("Vilket nummer har den?");
            int number = input.nextInt();
            input.nextLine();

            System.out.println("Vilka typer har den?");
            List<PokemonType> types = nextPokemonTypes(input);

            System.out.println("Vilka svagheter har den?");
            List<PokemonType> weaknesses = nextPokemonTypes(input);

            // skapa pokemon här
            Pokemon p = new Pokemon(name, number, types, weaknesses);
            pokemons.add(p);


            System.out.println(pokemons);
        }
    }

    private static List<PokemonType> nextPokemonTypes(Scanner input) {
        String line = input.nextLine();
        String[] typeStrings = line.split(",");

        List<PokemonType> types = new ArrayList<>();
        
        for (String typeString : typeStrings) {
            try {
                PokemonType type = PokemonType.parsePokemonType(typeString);
                types.add(type);
            }
            catch (InputMismatchException ex) {
                System.err.println(typeString + " is not a valid type.");
            }
        }

        return types;
    }
}

import java.util.*;

public enum PokemonType {
    NORMAL,
    FIRE,
    WATER,
    ELECTRIC,
    GRASS,
    ICE,
    FIGHTING,
    POISON,
    GROUND,
    FLYING,
    PSYCHIC,
    BUG,
    ROCK,
    GHOST,
    DRAGON,
    DARK,
    STEEL,
    FAIRY;

    public static PokemonType parsePokemonType(String name) {
        String niceName = name.trim().toUpperCase();

        for (PokemonType type : values()) {
            if (type.toString().equals(niceName)) {
                return type;
            }
        }

        throw new InputMismatchException("not a valid pokemon type");
    }
}

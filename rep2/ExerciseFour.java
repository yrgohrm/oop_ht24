import java.util.*;

public class ExerciseFour {
    public static void main(String[] args) {
        Player player = new Player("Bosse");
        List<Interactive> items = List.of(new Cactus(),
                new Mirror(), new PepsiBottle(), new Orc());

        for (Interactive interactive : items) {
            interactive.interact(player);
            System.out.printf("%s now has %d life left.%n",
                    player.getName(),
                    player.getLife());
        }
    }
}

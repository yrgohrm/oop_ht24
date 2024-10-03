import java.util.*;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();

        Player player = new Player(name);
        List<Interactive> items = List.of(new Cactus(),
                new Mirror(), new PepsiBottle(), new Orc(),
                new WaterGun());

        // så länge användaren lever gör ...
        while (player.getLife() > 0) {
            System.out.print("You can see: ");
            for (Interactive interactive : items) {
                System.out.println("\t" + interactive.getName());
            }
            System.out.println("What do you want to play with?");
            String answer = input.nextLine();

            Interactive thing = getThingByName(items, answer);
            thing.interact(player);

            System.out.printf("%s now has %d life left.%n",
                    player.getName(),
                    player.getLife());
        }

        System.out.println("Game over!");
    }

    private static Interactive getThingByName(List<Interactive> items, String answer) {
        for (Interactive interactive : items) {
            if (interactive.getName().equals(answer)) {
                return interactive;
            }
        }

        Interactive thing = items.get(0);
        System.out.println("You fumbled and got hold of " + thing.getName());
        return thing;
    }
}

public class ExerciseThree {
    public static void main(String[] args) {
        Player player = new Player("Bosse");
        Interactive thing = new Cactus();
        thing.interact(player);
        System.out.printf("The player %s now has %d life left.",
                player.getName(),
                player.getLife());
    }
}
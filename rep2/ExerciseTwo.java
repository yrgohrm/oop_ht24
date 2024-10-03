public class ExerciseTwo {
    public static void main(String[] args) {
        Player player = new Player("Bosse");

        player.wound();
        player.wound();

        player.heal();
        player.heal();

        System.out.println(player.getName());
        System.out.println(player.getLife());
    }
}

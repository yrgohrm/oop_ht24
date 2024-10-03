public class Cactus implements Interactive {

    @Override
    public void interact(Player player) {
        System.out.println("Ow! It hurts!");
        player.wound();
    }

    @Override
    public String getName() {
        return "a cactus";
    }
}
